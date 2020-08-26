package oop7.vehicles;

import oop7.details.Engine;
import oop7.professions.Driver;

public class Lorry extends Car{
    private Integer liftingCapaciti;
    public Lorry(String marka, String carClass, Driver driver, Engine engine, int weight) {
        super(marka, carClass, driver, engine, weight);
    }
}
