package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sound.sampled.Clip;
import java.util.List;
//@Component("musicBean")
//@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("rockMusic")
//    private Music music;
    private Music music1;
    private Music music2;

//@Value("${musicPlayer.name}")
    private String name;

//@Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC

    public MusicPlayer()Music music1, Music  music2) {
       this.music1 = music1;
       this.music2 = music2;
    }

    public MusicPlayer() {}



    public String playMusic() {
        return "Playing: " + music1.getSong()+" "+music2.getSong();

    }
}

