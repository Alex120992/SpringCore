package ru.zateev.springcore7;

import org.springframework.stereotype.Component;

/**
 * Component помечает bean
 * Если не поставить id, то в id getBean передаем classicakMusic*/
@Component
public class ClassicakMusic implements Music {
    @Override
    public void play() {
        System.out.println("Classical Music");
    }
}
