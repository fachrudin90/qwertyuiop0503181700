package com.piramidsoft.polisiku.Model;


public class ModelVideo {
    int Video;
    String Title, Reporter, Berita, Waktu, Viewers;

    public ModelVideo() {
    }

    public ModelVideo(int video, String title, String reporter, String berita, String waktu, String viewers) {
        Video = video;
        Title = title;
        Reporter = reporter;
        Berita = berita;
        Waktu = waktu;
        Viewers = viewers;
    }

    public int getVideo() {
        return Video;
    }

    public void setVideo(int video) {
        Video = video;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getReporter() {
        return Reporter;
    }

    public void setReporter(String reporter) {
        Reporter = reporter;
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

    public String getViewers() {
        return Viewers;
    }

    public void setViewers(String viewers) {
        Viewers = viewers;
    }
}
