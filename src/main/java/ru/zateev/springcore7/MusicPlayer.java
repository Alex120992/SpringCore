package ru.zateev.springcore7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private RockMusic rockMusic;
    private ClassicakMusic classicakMusic;
//    @Autowired
//    private Music music;

    /**
     * Autowired позволяет spring самому подбирать бины по классу и интерфейсу и вставлять его
     * если использовать интерфейс вместо самого класса, то может быть ошибка из-за неопределнности
     * из-за нескольких подходящих бинов
     * Внедрять можно в сеттеры, конструкторы, методы, приватные поля из-за рефлексии
     */
//    @Autowired
//    public MusicPlayer(ClassicakMusic classicakMusic) {
//        this.classicakMusic = classicakMusic;
//    }

    /**
     * Здесь будет ошибка, если будут два бина, которые имеют один общий  интерфейс
     */
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicakMusic classicakMusic) {
        this.rockMusic = rockMusic;
        this.classicakMusic = classicakMusic;
    }

    /**
     * IoC - Внедрение различных объектов извне
     * в данный метод playMusic
     */

    public void playMusic() {
        classicakMusic.play();
        rockMusic.play();
    }
}
