package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {//тут мы прменим инверсию управления
    //public Music music;
    private List<Music> musicList = new ArrayList<>();
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    private String name;
    private int volume;
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    /*public void setMusic(Music music) {
        this.music = music;
    }
    public MusicPlayer(){}
    public MusicPlayer(Music music) {//IoC
        this.music = music;
    }*/
    public void playMusic(){
        for(Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
