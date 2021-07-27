package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class SportCar extends Car {
    private int speed;

    public SportCar(String type, String classOfCar, Driver driver, Engine engine, int speed) {
        super(type, classOfCar, driver, engine);
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "SportCar " +
                "speed = " + speed +" km per hour" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return speed == sportCar.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SportCar(String type, String classOfCar, Driver driver, Engine engine) {
        super(type, classOfCar, driver, engine);
    }
}
