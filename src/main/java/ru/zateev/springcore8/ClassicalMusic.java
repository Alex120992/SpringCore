package ru.zateev.springcore8;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Component помечает bean
 * Если не поставить id, то в id getBean передаем classicakMusic*/
@Component
public class ClassicalMusic implements Music {
    String [] songs = new String[]{"songClassical1","songClassical2","songClassical3"};
    @Override
    public void play() {

        System.out.println(songs[new Random().nextInt(3)]);
    }
}
