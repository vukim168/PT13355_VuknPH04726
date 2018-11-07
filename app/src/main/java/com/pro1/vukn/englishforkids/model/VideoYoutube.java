package com.pro1.vukn.englishforkids.model;

/**
 * Created by Toan on 29/11/2017.
 */

public class VideoYoutube {
    private String Title;
    private String Thumbnail;
    private String IDVideo;

    public VideoYoutube(String title, String thumbnail, String IDVideo) {
        Title = title;
        Thumbnail = thumbnail;
        this.IDVideo = IDVideo;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }

    public String getIDVideo() {
        return IDVideo;
    }

    public void setIDVideo(String IDVideo) {
        this.IDVideo = IDVideo;
    }
}

