package com.system.design.StrategyDesignPattern;

import com.system.design.StrategyDesignPattern.SportyVehicle;
import com.system.design.StrategyDesignPattern.Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v = new SportyVehicle();
        Vehicle v1 = new PassengerVehicle();
        v1.drive();
        v.drive();
    }
}
