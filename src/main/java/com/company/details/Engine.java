package com.company.details;

import java.util.Objects;

public class Engine {
    private String company;
    private double power;

    public Engine(String company, double power) {
        this.company = company;
        this.power = power;
    }

    @Override
    public String toString() {
        return company + ", power=" + power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.power, power) == 0 && Objects.equals(company, engine.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, power);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
