package com.example.ejercicio21.Procesos;

public class Video {
    private Integer id;
    private byte[] video;

    public Video(){

    }

    public Video(Integer id, byte[] video) {
        this.id = id;
        this.video = video;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }
}
