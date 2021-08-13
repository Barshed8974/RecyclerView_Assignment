package com.example.recyclerview;

public class Model {
    String name;
    int type;
    int number;

    public Model(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
