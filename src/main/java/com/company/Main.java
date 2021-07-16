package com.company;

import com.company.details.Engine;
import com.company.professions.*;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driverLorry = new Driver(35, "Ivan");
        driverLorry.setExperience(15);
        Driver driverSport = new Driver(42, "Pasha");
        driverSport.setExperience(21);
        Engine engineLorry = new Engine("Ford", 3.5);
        Engine engineSport = new Engine("Ford", 4.2);
        Lorry lorry = new Lorry("Volvo", "Container-carrier", driverLorry, engineLorry, 24000);
        SportCar sport = new SportCar("Mercedes", "Cabriolet", driverSport, engineSport, 320);
        System.out.println(lorry);
        lorry.printInfo();
        System.out.println(sport);
        sport.printInfo();
        sport.turnLeft();
        lorry.stop();


    }
}
