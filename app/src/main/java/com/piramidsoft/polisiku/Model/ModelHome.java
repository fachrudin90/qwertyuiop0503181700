package com.piramidsoft.polisiku.Model;

/**
 * Created by Ayo Maju on 05/03/2018.
 * Updated by Muhammad Iqbal on 05/03/2018.
 */

public class ModelHome {
    private int ImgHomeList;
    private String Lokasi,JmlSuka,JmlKomenta,Nama,Deskripsi;

    public ModelHome() {
    }

    public ModelHome(int imgHomeList, String lokasi, String jmlSuka, String jmlKomenta, String nama, String deskripsi) {
        ImgHomeList = imgHomeList;
        Lokasi = lokasi;
        JmlSuka = jmlSuka;
        JmlKomenta = jmlKomenta;
        Nama = nama;
        Deskripsi = deskripsi;
    }

    public int getImgHomeList() {
        return ImgHomeList;
    }

    public void setImgHomeList(int imgHomeList) {
        ImgHomeList = imgHomeList;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String lokasi) {
        Lokasi = lokasi;
    }

    public String getJmlSuka() {
        return JmlSuka;
    }

    public void setJmlSuka(String jmlSuka) {
        JmlSuka = jmlSuka;
    }

    public String getJmlKomenta() {
        return JmlKomenta;
    }

    public void setJmlKomenta(String jmlKomenta) {
        JmlKomenta = jmlKomenta;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }
}
