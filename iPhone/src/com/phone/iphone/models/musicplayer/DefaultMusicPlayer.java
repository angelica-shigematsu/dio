package com.phone.iphone.models.musicplayer;

import com.phone.iphone.models.iPhone;
public class DefaultMusicPlayer implements MusicPlayer {

    private Music music;
    private iPhone phone;
    private boolean isPlaying;

    public DefaultMusicPlayer(iPhone phone) {
        this.phone = phone;
        this.isPlaying = false;
    }

    @Override
    public boolean play() {
        System.out.println("Music " + music.getNameMusic() + " is playing on " + phone.getModel());
        return this.isPlaying = true;
    }

    @Override
    public boolean selectionMusic(Music music) {
        this.music = music;
        return music != null;
    }

    @Override
    public void pause() {
        if (isPlaying && phone.displayPhone()) {
            System.out.println("Music paused");
        }
        else{
            System.out.println("Music is not playing");
        }
    }
}
