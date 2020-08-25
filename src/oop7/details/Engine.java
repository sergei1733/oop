package oop7.details;

import oop7.vehicles.Car;

public class Engine {
    private String company;
    private int power;

    public Engine(String company, int power) {

        this.company = company;
        this.power = power;
    }
    public void start() {
        System.out.println("Поехали");
    }
}
