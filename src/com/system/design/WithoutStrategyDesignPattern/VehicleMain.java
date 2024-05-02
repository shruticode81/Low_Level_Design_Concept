package com.system.design.WithoutStrategyDesignPattern;

public class VehicleMain {

    public static void main(String args[]) {
        Vehicle v = new Vehicle();
        Vehicle v1 = new OffRoadVehicle();
        Vehicle v2 = new SportyVechile();
        v.drive();
        v1.drive();
        v2.drive();
    }
}
