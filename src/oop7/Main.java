package oop7;

import oop7.details.Engine;
import oop7.professions.Driver;
import oop7.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Петров и.и.", 10);
        Engine engine1 = new Engine("BMW", 350);
        Car car1 = new Car("bmw", "C", driver1, engine1,1562);

        car1.printInfo();

    }



}
