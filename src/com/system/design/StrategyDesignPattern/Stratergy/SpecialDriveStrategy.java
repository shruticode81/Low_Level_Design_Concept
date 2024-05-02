package com.system.design.StrategyDesignPattern.Stratergy;

public class SpecialDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special sporty drive capability");
    }
}
