package oop7.vehicles;

import oop7.details.Engine;
import oop7.professions.Driver;

public class Car {
    private String marka;
    private String carClass;
    private Driver driver;
    private Engine engine;
    private int weight;

    public Car(String marka, String carClass, Driver driver, Engine engine, int weight) {
        this.marka = marka;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.print("avto: " + this.marka + ", " + this.carClass);
        System.out.println();
        System.out.println("driver: "+this.driver+", "+this.engine+", "+this.weight);
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                ", weight=" + weight +
                '}';
    }
}
