package com.piramidsoft.polisiku.Utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tambora on 23/05/2016.
 */
public class SendFile {

    private static HashMap<String, String> params;


    public SendFile(HashMap<String, String> params) {
        this.params = params;
    }

    public static String uploadFile(final String selectedFilePath, String SERVER_URL) {

        int serverResponseCode = 0;
        String stringBuilder = "";

        HttpURLConnection connection;
        DataOutputStream dataOutputStream;
        String lineEnd = "\r\n";
        String twoHyphens = "--";
        String boundary = "*****";


        int bytesRead, bytesAvailable, bufferSize;
        byte[] buffer;
        int maxBufferSize = 1 * 1024 * 1024;
        File selectedFile = new File(selectedFilePath);


        String[] parts = selectedFilePath.split("/");
        final String fileName = parts[parts.length - 1];

        if (!selectedFile.isFile()) {


            AndLog.ShowLog(SendFile.class.getSimpleName(), selectedFile.getAbsolutePath() + " xxx");

            return "fail";

        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(selectedFile);
                URL url = new URL(SERVER_URL);
                connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);//Allow Inputs
                connection.setDoOutput(true);//Allow Outputs
                connection.setUseCaches(false);//Don't use a cached Copy
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Connection", "Keep-Alive");
                connection.setRequestProperty("ENCTYPE", "multipart/form-data");
                connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
                connection.setRequestProperty("userfile", selectedFilePath);


                //creating new dataoutputstream
                dataOutputStream = new DataOutputStream(connection.getOutputStream());

                //writing bytes to data outputstream

                if (params != null) {

//                    StringBuilder postData = new StringBuilder();
                    for (Map.Entry<String, String> param : params.entrySet()) {
//                        if (postData.length() != 0) postData.append('&');
//                        postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
//                        postData.append('=');
//                        postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                        dataOutputStream.writeBytes(twoHyphens + boundary + lineEnd);
                        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\""+URLEncoder.encode(param.getKey(), "UTF-8")+"\""+lineEnd+lineEnd+URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8")+lineEnd);

                    }

                }

                dataOutputStream.writeBytes(twoHyphens + boundary + lineEnd);
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"userfile\";filename=\""
                        + selectedFilePath + "\"" + lineEnd);




                dataOutputStream.writeBytes(lineEnd);

                //returns no. of bytes present in fileInputStream
                bytesAvailable = fileInputStream.available();
                //selecting the buffer size as minimum of available bytes or 1 MB
                bufferSize = Math.min(bytesAvailable, maxBufferSize);
                //setting the buffer as byte array of size of bufferSize
                buffer = new byte[bufferSize];

                //reads bytes from FileInputStream(from 0th index of buffer to buffersize)
                bytesRead = fileInputStream.read(buffer, 0, bufferSize);

                //loop repeats till bytesRead = -1, i.e., no bytes are left to read
                while (bytesRead > 0) {
                    //write the bytes read from inputstream
                    dataOutputStream.write(buffer, 0, bufferSize);
                    bytesAvailable = fileInputStream.available();
                    bufferSize = Math.min(bytesAvailable, maxBufferSize);
                    bytesRead = fileInputStream.read(buffer, 0, bufferSize);
                }

                dataOutputStream.writeBytes(lineEnd);
                dataOutputStream.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);

                serverResponseCode = connection.getResponseCode();
                String serverResponseMessage = connection.getResponseMessage();

                //Log.e("Errornya", "Server Response is: " + serverResponseMessage + ": " + serverResponseCode);

                //response code of 200 indicates the server status OK
                if (serverResponseCode == 200) {

                    //Log.e("Errornya", "File Upload completed");

                }

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));


                String line = "";

                while ((line = reader.readLine()) != null) {
                    stringBuilder += line;
                }

                //Log.e("Errornya",stringBuilder);
                //closing the input and output streams
                fileInputStream.close();
                dataOutputStream.flush();
                dataOutputStream.close();


            } catch (FileNotFoundException e) {
                e.printStackTrace();

                //Log.e("Errornya", "File Not Found");

            } catch (MalformedURLException e) {
                e.printStackTrace();

                //Log.e("Errornya", "URL error!");

            } catch (IOException e) {
                e.printStackTrace();
                //Log.e("Errornya", "Cannot Read/Write File!");
            }

            return stringBuilder;
        }

    }
}
