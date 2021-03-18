package ru.zateev.springcore3;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private List<Music>list;

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



    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        music.play();
    }

    public List<Music> getList() {
        return list;
    }

    public void setList(List<Music> list) {
        this.list = list;
    }

    public void iteratorList (){
        for (int i=0;i<list.size();i++){
            list.get(i).play();
        }
    }
}
