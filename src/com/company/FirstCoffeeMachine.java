package com.company;

import java.util.Scanner;

public class FirstCoffeeMachine extends CoffeeMachine {
    Scanner sc = new Scanner(System.in);


    public FirstCoffeeMachine(int coffeeTrunk, int waterTrunk) {
        super(coffeeTrunk, waterTrunk);
    }


    @Override
    public void menu() {
        System.out.println("Enter your choice: \n1. show \n2. americano \n3. espresso \n4. doubleEspresso");
        String str = sc.next();
        switch (str) {
            case ("1"):
                show();
                break;

            case ("2"):
                americano();
                break;
            case ("3"):
                espresso();
                break;
            case ("4"):
                doubleEspresso();
        }
    }

    @Override
    public void show() {
        System.out.println("The value of coffee in that FirstCoffeeMachine: " + this.getCoffeeTrunk());
        System.out.println("The value of water in that FirstCoffeeMachine: " + this.getWaterTrunk());

    }

    @Override
    public void americano() {
        System.out.println("Do you want to add sugar:  \n 1) Yes \n 2) No");
        String str2 = sc.next();
        if (str2.equals("1")) {
            int americano = (getWaterTrunk() - 2) + (getCoffeeTrunk() - 6) + 3;
            System.out.println("Your americano is done with amount of liquid : " + americano);

        } else if (str2.equals("2")) {
            int americano = (getWaterTrunk() - 2) + (getCoffeeTrunk() - 6);
            System.out.println("Your americano is done with amount of liquid : " + americano);

        }

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
