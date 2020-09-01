package exercises7.vehicles;

import exercises7.details.Engine;
import exercises7.professions.Driver;

public class sportCar extends Car{
    private Integer topSpeed;
    public sportCar(String marka, String carClass, Driver driver, Engine engine, int weight) {
        super(marka, carClass, driver, engine, weight);
    }
}
