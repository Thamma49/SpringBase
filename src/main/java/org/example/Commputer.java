package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Commputer {
    private int id;
    private MusicPlayer musicPlayer;
    public Commputer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 0;
    }

    @Override
    public String toString() {
        return "Commputer{" +
                "id=" + id +
                " " + musicPlayer.playMusic() +
                '}';
    }
}
