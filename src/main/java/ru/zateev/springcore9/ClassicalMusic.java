package ru.zateev.springcore9;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * указывает что данный класс singleton
 */
@Component


public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("destroy");
    }

    @Override
    public void play() {
        System.out.println("Classical Music");
    }
}
