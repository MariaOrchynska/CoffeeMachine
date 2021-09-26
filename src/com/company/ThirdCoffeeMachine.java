package com.company;

public class ThirdCoffeeMachine extends CoffeeMachine {
    public ThirdCoffeeMachine(int coffeeTrunk, int waterTrunk) {
        super(coffeeTrunk, waterTrunk);
    }


    @Override
    public void menu() {
show();
    }

    @Override
    public void show() {
        System.out.println("The value of coffee in that ThirdCoffeeMachine: " + this.getCoffeeTrunk());
        System.out.println("The value of water in that ThirdCoffeeMachine: " + this.getWaterTrunk());
    }

    @Override
    public void americano() {

    }

    @Override
    public void espresso() {

    }

    @Override
    public void doubleEspresso() {

    }

    @Override
    public void fillWithWater() {

    }

    @Override
    public void fillWithCoffee() {

    }

    @Override
    public void info() {

    }

    @Override
    public void switchOff() {

    }
}
