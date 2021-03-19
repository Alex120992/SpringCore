package ru.zateev.springcore8;

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


}
