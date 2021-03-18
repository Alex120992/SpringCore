package ru.zateev.springcore2;

public class ClassicakMusic implements Music {
    @Override
    public void play() {
        System.out.println("Classical Music");
    }
}
