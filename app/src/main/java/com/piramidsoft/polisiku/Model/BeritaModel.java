package com.piramidsoft.polisiku.Model;


public class BeritaModel {
    int Image;
    String Titile, Berita, Waktu, Like, Comment;

    public BeritaModel() {
    }

    public BeritaModel(int image, String titile, String berita, String waktu, String like, String comment) {
        Image = image;
        Titile = titile;
        Berita = berita;
        Waktu = waktu;
        Like = like;
        Comment = comment;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitile() {
        return Titile;
    }

    public void setTitile(String titile) {
        Titile = titile;
    }

    public String getBerita() {
        return Berita;
    }

    public void setBerita(String berita) {
        Berita = berita;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String waktu) {
        Waktu = waktu;
    }

    public String getLike() {
        return Like;
    }

    public void setLike(String like) {
        Like = like;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}
