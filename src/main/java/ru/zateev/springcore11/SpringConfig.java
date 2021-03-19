package ru.zateev.springcore11;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:musicPlayerSpringCore9")
public class SpringConfig {
    @Bean
    @Scope("singleton")
    public ClassicalMusic classicalMusic (){
        return new ClassicalMusic();
    }
    @Bean
    @Scope("prototype")
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(genre());
    }
    @Bean
    public Computer computer (){
        return new Computer(musicPlayer());
    }
    @Bean
    public Genre genre (){
        return new Genre(classicalMusic(),rockMusic());
    }
}
