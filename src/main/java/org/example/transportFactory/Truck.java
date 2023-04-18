package org.example.transportFactory;

public class Truck implements Transport{

    @Override
    public void startLogistic() {
        System.out.println("start logistic");
    }

    @Override
    public void stopLogistic() {
        System.out.println("end logistic, f**ng road");
    }
}
