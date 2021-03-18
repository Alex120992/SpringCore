package ru.zateev.springcore4;

public class MusicPlayer {
    private Music music;
    private int volume;
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
 * IoC - Внедрение различных объектов извне
 * в данный метод playMusic
 */

    public void playMusic(){
        System.out.println(volume);
    }
}
