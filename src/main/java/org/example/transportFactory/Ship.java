package org.example.transportFactory;

public class Ship implements Transport{
    @Override
    public void startLogistic() {
        System.out.println("Captain on the board!");
    }

    @Override
    public void stopLogistic() {
        System.out.println("Titanic is end");
    }
}
