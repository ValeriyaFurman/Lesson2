package com.company;

import java.util.ArrayList;

public class CollectBalls {

    ArrayList<Ball> balls = new ArrayList <Ball> ();

    public void collectBalls(Ball ball) {

        balls.add(ball);
       // System.out.println(ball.toString());
    }

    public void printBalls() {

        for (Ball itemBall: balls) {
            System.out.println(itemBall);
        }
    }
}
