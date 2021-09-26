package com.company;

import java.util.Scanner;

public abstract class CoffeeMachine implements Functions {
    private int coffeeTrunk;
    private int waterTrunk;

    public CoffeeMachine(int coffeeTrunk, int waterTrunk) {
        this.coffeeTrunk = coffeeTrunk;
        this.waterTrunk = waterTrunk;
    }

    public int getCoffeeTrunk() {
        return coffeeTrunk;
    }

    public void setCoffeeTrunk(int coffeeTrunk) {
        this.coffeeTrunk = coffeeTrunk;
    }

    public int getWaterTrunk() {
        return waterTrunk;
    }

    public void setWaterTrunk(int waterTrunk) {
        this.waterTrunk = waterTrunk;
    }
}