package ru.zateev.springcore3;

public class ClassicakMusic implements Music {
    @Override
    public void play() {
        System.out.println("Classical Music");
    }
}
