package ru.zateev.springcore5;

public class ClassicakMusic implements Music {
    private ClassicakMusic(){}
    public static ClassicakMusic getClassicalMusic(){
        return new ClassicakMusic();
    }

    public void doMyInit (){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy (){
        System.out.println("Doing my destruction");
    }
    @Override
    public void play() {
        System.out.println("Classicals Music");
    }
}
