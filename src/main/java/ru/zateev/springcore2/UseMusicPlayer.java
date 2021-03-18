package ru.zateev.springcore2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zateev.springcore.TestBeans;

public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "musiccontext.xml"
            );
//            Music music = context.getBean("musicBean", Music.class);
//            MusicPlayer musicPlayer = new MusicPlayer(music);
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


            musicPlayer.playMusic();

            context.close();// закрываем контекст
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
