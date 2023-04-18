package org.example.transportFactory;

public class Airplane implements Transport{
    @Override
    public void startLogistic() {
        System.out.println("We gonna fly!");
    }

    @Override
    public void stopLogistic() {
        System.out.println("Oh nooooooo");
    }
}
