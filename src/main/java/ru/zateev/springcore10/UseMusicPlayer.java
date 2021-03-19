package ru.zateev.springcore10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Конфигурации без xml с использование java и аннотации @Configuration - который указывает что данный класс
 * конфигурационный
 * @ComponentScan - который раньше был в xml теперь помещаем в java*/
public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//            Music music = context.getBean("musicBean", Music.class);
//            MusicPlayer musicPlayer = new MusicPlayer(music);
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(musicPlayer.getName());
            System.out.println(musicPlayer.getVolume());

            musicPlayer.playMusic();

            ClassicalMusic classicakMusic = context.getBean("classicalMusic", ClassicalMusic.class);
            ClassicalMusic classicakMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
            /** Проверка что используется синглтон */
            System.out.println(classicakMusic == classicakMusic2);
            RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
            RockMusic rockMusic2 = context.getBean("rockMusic", RockMusic.class);
            System.out.println(rockMusic2 == rockMusic);

            context.close();// закрываем контекст
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
