package ru.zateev.springcore8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "musiccontext7.xml"
            );
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusic(KindOfMusic.Classical);
            context.close();// закрываем контекст

        } catch (Exception e) {
            e.getStackTrace() ;
        }
    }
}
