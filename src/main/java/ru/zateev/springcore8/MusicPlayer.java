package ru.zateev.springcore8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static ru.zateev.springcore8.KindOfMusic.Classical;

@Component
public class MusicPlayer {

    /**
     * Qualifier ("id бина") помогает определить какой бин реализовать
     * из бинов реализующий общий интерфейс
     */
    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    @Autowired
    @Qualifier("rockMusic")
    private Music music2;


    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    public MusicPlayer(Music music, Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public void playMusic(KindOfMusic musicEnum) {
        switch (musicEnum) {
            case Classical:
                music.play();
                break;
            case Rock:
                music2.play();
                break;
        }
    }
}
