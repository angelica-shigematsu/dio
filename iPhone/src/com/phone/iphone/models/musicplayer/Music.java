package com.phone.iphone.models.musicplayer;

public class Music {

    private String nameMusic;

    private String album;

    private String singer;

    private int musicInMinutes;

    public Music(String nameMusic, String album, String singer, int musicInMinutes) {
        this.nameMusic = nameMusic;
        this.album = album;
        this.singer = singer;
        this.musicInMinutes = musicInMinutes;
    }

    public String getNameMusic() {
        return nameMusic;
    }
}
