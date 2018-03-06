package com.piramidsoft.polisiku.Model;

/**
 * Created by Ayo Maju on 06/03/2018.
 * Updated by Muhammad Iqbal on 06/03/2018.
 */

public class ModelKomentar {
    int ImgKomentar;
    String Nama, Komentar, Tanggal;

    public ModelKomentar() {
    }

    public ModelKomentar(int imgKomentar, String nama, String komentar, String tanggal) {
        ImgKomentar = imgKomentar;
        Nama = nama;
        Komentar = komentar;
        Tanggal = tanggal;
    }

    public int getImgKomentar() {
        return ImgKomentar;
    }

    public void setImgKomentar(int imgKomentar) {
        ImgKomentar = imgKomentar;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getKomentar() {
        return Komentar;
    }

    public void setKomentar(String komentar) {
        Komentar = komentar;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        Tanggal = tanggal;
    }
}
