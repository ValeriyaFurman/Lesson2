package com.company;

public class Main {

    public static void main(String[] args) {

        CollectBalls collectBalls = new CollectBalls();
        collectBalls.collectBalls(new BasketBall());
        collectBalls.collectBalls(new FootBall());
        collectBalls.printBalls();

    }
}

//add balls to List