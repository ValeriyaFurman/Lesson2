package com.company;

public class Ball {

    protected int size;
    protected String color;

    Ball (int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void throwBall() {

    }

   @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }


}