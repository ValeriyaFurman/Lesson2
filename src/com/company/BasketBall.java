package com.company;

public class BasketBall extends Ball {

    BasketBall() {

        super(2,"orange");
    }
    @Override
    public void throwBall() {

        System.out.println(super.size +"," + super.color);
    }

}


