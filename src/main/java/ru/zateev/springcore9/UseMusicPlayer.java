package ru.zateev.springcore9;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "musiccontext8.xml"
            );
//            Music music = context.getBean("musicBean", Music.class);
//            MusicPlayer musicPlayer = new MusicPlayer(music);
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(musicPlayer.getName());
            System.out.println(musicPlayer.getVolume());

            musicPlayer.playMusic();

            ClassicalMusic classicakMusic = context.getBean("classicalMusic",ClassicalMusic.class);
            ClassicalMusic classicakMusic2 = context.getBean("classicalMusic",ClassicalMusic.class);
            /** Проверка что используется синглтон */
            System.out.println(classicakMusic == classicakMusic2);
            RockMusic rockMusic = context.getBean("rockMusic",RockMusic.class);
            RockMusic rockMusic2 = context.getBean("rockMusic",RockMusic.class);
            System.out.println(rockMusic2 == rockMusic);

            context.close();// закрываем контекст
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
