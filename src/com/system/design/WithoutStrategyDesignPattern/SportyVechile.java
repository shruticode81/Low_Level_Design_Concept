package com.system.design.WithoutStrategyDesignPattern;

public class SportyVechile extends Vehicle{

    public void drive() {
        //drive method is reducant with the drive method of OffRoad child class
        // to overcome this duplicate code we use strategy design pattern
        System.out.println("Special sporty drive capability");
    }
}
