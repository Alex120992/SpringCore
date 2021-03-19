package ru.zateev.springcore10;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RockMusic implements Music {

    @Override
    public void play() {
        System.out.println("Rock Music");
    }
}
