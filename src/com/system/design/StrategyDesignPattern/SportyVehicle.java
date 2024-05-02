package com.system.design.StrategyDesignPattern;

import com.system.design.StrategyDesignPattern.Stratergy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle{

     SportyVehicle() {
        super(new SpecialDriveStrategy());
    }
}
