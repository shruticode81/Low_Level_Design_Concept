package com.system.design.StrategyDesignPattern;

import com.system.design.StrategyDesignPattern.Stratergy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    //Vehcile class has a drive strategy

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy=driveStrategy;
    }

    void drive(){
        driveStrategy.drive();
    }
}
