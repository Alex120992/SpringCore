package ru.zateev.springcore8;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {
    String [] songs = new String[]{"songRock1","songRock2","songRock3"};
    @Override
    public void play() {

        System.out.println(songs[new Random().nextInt(3)]);
    }
}
