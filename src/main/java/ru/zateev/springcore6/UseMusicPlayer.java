package ru.zateev.springcore6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "musiccontext5.xml"
            );
            Music music = context.getBean("musicBean", Music.class);
            Music music2 = context.getBean("musicBean2", Music.class);
            MusicPlayer musicPlayer = new MusicPlayer(music);
            MusicPlayer musicPlayer2 = new MusicPlayer(music2);



            musicPlayer.playMusic();
            musicPlayer2.playMusic();


            context.close();// закрываем контекст
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
