package ru.zateev.springcore6;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    /**
 * IoC - Внедрение различных объектов извне
 * в данный метод playMusic
 */

    public void playMusic(){
        music.play();
    }
}
