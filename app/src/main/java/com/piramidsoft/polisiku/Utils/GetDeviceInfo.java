package com.piramidsoft.polisiku.Utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;

import java.util.HashMap;

/**
 * Created by Tambora on 10/02/2017.
 */
public class GetDeviceInfo {

    public static HashMap<String,String> getInfo(Context context) {

        String brandPhone = Build.BRAND;
        String modelPhone = Build.MODEL;
        String osPhone = Build.VERSION.RELEASE;
        String deviceId = "";
        int PROS_ID = 110;
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {

            Activity activity = (Activity) context;
            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.READ_PHONE_STATE},
                    PROS_ID);
        } else {

            deviceId = tm.getDeviceId();
        }

        HashMap<String, String> values = new HashMap<>();
        values.put("brand", brandPhone);
        values.put("model", modelPhone);
        values.put("os",osPhone);
        values.put("device_id",deviceId);




        return values;
    }
}
