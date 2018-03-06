package com.piramidsoft.polisiku.Model;

/**
 * Created by Ayo Maju on 06/03/2018.
 * Updated by Muhammad Iqbal on 06/03/2018.
 */

public class ModelItemDiskusi {
    private int Img;
    private String Terakhir, Title, Alamat, Tanggapan;

    public ModelItemDiskusi() {
    }

    public ModelItemDiskusi(int img, String terakhir, String title, String alamat, String tanggapan) {
        Img = img;
        Terakhir = terakhir;
        Title = title;
        Alamat = alamat;
        Tanggapan = tanggapan;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public String getTerakhir() {
        return Terakhir;
    }

    public void setTerakhir(String terakhir) {
        Terakhir = terakhir;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getTanggapan() {
        return Tanggapan;
    }

    public void setTanggapan(String tanggapan) {
        Tanggapan = tanggapan;
    }
}
