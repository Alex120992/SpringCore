package ru.zateev.springcore7;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public void play() {
        System.out.println("Rock Music");
    }
}
