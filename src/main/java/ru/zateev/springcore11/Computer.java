package ru.zateev.springcore11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class Computer {
    private int id =1;

    private MusicPlayer musicPlayer;


    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }


}
