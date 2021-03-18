package ru.zateev.springcore7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "musiccontext6.xml"
            );
//            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//            musicPlayer.playMusic();
            Computer computer = context.getBean("computer", Computer.class);
            System.out.println(computer);
            context.close();// закрываем контекст
        } catch (Exception e) {
            e.getStackTrace() ;
        }
    }
}
