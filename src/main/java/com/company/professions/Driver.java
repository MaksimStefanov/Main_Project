package com.company.professions;

import java.util.Objects;

public class Driver extends Person {


    private int experience;

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return  " "+ fullName +", " + experience ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience);
    }


    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    public Driver(int age, String fullName) {
        super(age, fullName);
    }
}
