package ru.zateev.springcore4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "musiccontext3.xml"
            );
//            Music music = context.getBean("musicBean", Music.class);
//            MusicPlayer musicPlayer = new MusicPlayer(music);
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.setVolume(60);

            System.out.println( musicPlayer.getVolume());
            System.out.println( musicPlayer2.getVolume());

            context.close();// закрываем контекст
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
