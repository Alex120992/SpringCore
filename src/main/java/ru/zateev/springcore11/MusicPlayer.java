package ru.zateev.springcore11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


public class MusicPlayer {
    @Value("${name}")
    private String name;
    @Value("${volume}")
    private int volume;
    private List<Music> music;

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


    public MusicPlayer(Genre genre) {
        this.music = genre.getList();
    }

    /**
     * IoC - Внедрение различных объектов извне
     * в данный метод playMusic
     */

    public void playMusic() {
        for (Music x : music)
            x.play();
    }
}
