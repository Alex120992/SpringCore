package ru.zateev.springcore7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id =1;
    @Autowired
    private MusicPlayer musicPlayer;

//    @Autowired
//    public Computer(MusicPlayer musicPlayer) {
//        this.id = 1;
//        this.musicPlayer = musicPlayer;
//    }

    @Override
    public String toString() {
        musicPlayer.playMusic();
        return "Computer " + id;
    }
}
