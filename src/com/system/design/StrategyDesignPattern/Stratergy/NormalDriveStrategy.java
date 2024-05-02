package com.system.design.StrategyDesignPattern.Stratergy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
