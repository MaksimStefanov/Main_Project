package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class Car {
    private String type;
    private String classOfCar;
    private Driver driver;
    private Engine engine;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return type.equals(car.type) && classOfCar.equals(car.classOfCar) && driver.equals(car.driver) && engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, classOfCar, driver, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", classOfCar='" + classOfCar + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

    public void setClassOfCar(String classOfCar) {
        this.classOfCar = classOfCar;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String type, String classOfCar, Driver driver, Engine engine) {
        this.type = type;
        this.classOfCar = classOfCar;
        this.driver = driver;
        this.engine = engine;
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

    public void printInfo() {
        System.out.println("Тип - "+type );
        System.out.println("Класс - "+ classOfCar);
        System.out.println("Имя/опыт - "+ driver);
        System.out.println("Двигатель - "+ engine);
        System.out.println("-------------------");
    }
}
