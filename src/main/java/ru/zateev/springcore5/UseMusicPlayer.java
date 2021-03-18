package ru.zateev.springcore5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "musiccontext4.xml"
            );
            ClassicakMusic classicakMusic = context.getBean("musicBean", ClassicakMusic.class);
            ClassicakMusic classicakMusic2 = context.getBean("musicBean", ClassicakMusic.class);
            classicakMusic.play();

            context.close();// закрываем контекст
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
