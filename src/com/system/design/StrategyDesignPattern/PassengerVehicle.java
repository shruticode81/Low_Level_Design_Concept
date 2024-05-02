package com.system.design.StrategyDesignPattern;

import com.system.design.StrategyDesignPattern.Stratergy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
