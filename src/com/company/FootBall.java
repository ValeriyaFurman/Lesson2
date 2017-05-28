package com.company;

public class FootBall extends Ball {

    FootBall() {

        super(1, "white");
    }

    public void throwBall() {

        System.out.println(super.size + "," + super.color);
    }


}
