package ru.zateev.springcore11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Genre {
    private final List<Music> list = new ArrayList<Music>();

    Genre (Music... music){
        list.addAll(Arrays.asList(music));
    }

    public List<Music> getList() {
        return list;
    }
}
