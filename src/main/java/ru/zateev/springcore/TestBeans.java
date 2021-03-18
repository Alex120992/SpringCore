package ru.zateev.springcore;

public class TestBeans {
    private String name;

    public TestBeans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
