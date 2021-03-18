package ru.zateev.springcore6;

import org.springframework.stereotype.Component;

@Component("musicBean2")
public class RockMusic implements Music {

    @Override
    public void play() {
        System.out.println("Rock Music");
    }
}
