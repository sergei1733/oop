package oop7.professions;

import oop7.vehicles.Car;

public class Driver {
    public String fio;
    public int experiece;

    public Driver(String fio, int experiece) {
        this.fio = fio;
        this.experiece = experiece;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fio='" + fio + '\'' +
                ", experiece=" + experiece +
                '}';
    }
}
