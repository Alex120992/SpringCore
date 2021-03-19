package ru.zateev.springcore11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class RockMusic implements Music {

    @Override
    public void play() {
        System.out.println("Rock Music");
    }
}
