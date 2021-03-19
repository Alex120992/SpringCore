package ru.zateev.springcore11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Создаем все бины в ручную, тогда убираем аннотации @Component и @Autowired
 */

public class UseMusicPlayer {
    public static void main(String[] args) {
        try {
            // Данный класс обращается к applicationcontext
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(musicPlayer.getName());
            System.out.println(musicPlayer.getVolume());

            musicPlayer.playMusic();



            context.close();// закрываем контекст
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
