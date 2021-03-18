package ru.zateev.springcore3;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UseMusciPlayer2 {
    public static void main(String[] args) {


        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "musiccontext2.xml"
            );
            MusicPlayer musicPlayer = context.getBean("musicPlayer2", MusicPlayer.class);
            musicPlayer.playMusic();
            System.out.println(musicPlayer.getVolume());
            System.out.println(musicPlayer.getName());
            MusicPlayer musicPlayer2= context.getBean("listMusic", MusicPlayer.class);
            musicPlayer2.iteratorList();
            context.close();// закрываем контекст
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
