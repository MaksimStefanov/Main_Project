package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class Lorry extends Car {
    private int carring;

    public Lorry(String type, String classOfCar, Driver vova, Engine v16, int carring) {
        super(type, classOfCar, vova, v16);
        this.carring = carring;
    }

    @Override
    public String toString() {
        return "Lorry" +
                " carring = " + carring +" kilo";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return carring == lorry.carring;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carring);
    }

    public int getCarring() {
        return carring;
    }

    public void setCarring(int carring) {
        this.carring = carring;
    }


}
