package com.company;

import java.util.Scanner;

public class SecondCoffeeMachine extends CoffeeMachine{
    public SecondCoffeeMachine(int coffeeTrunk, int waterTrunk) {
        super(coffeeTrunk, waterTrunk);
    }

Scanner sc = new Scanner(System.in);


    @Override
    public void menu() {
        System.out.println("Enter your choice: \n1. show \n2. americano \n3. espresso \n4. doubleEspresso \n5. fill trunk with water \n6. fill trunk with coffee \n7. Show info \n8. Switch off the machine");
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
                break;
            case ("5"):
                fillWithWater();
                break;
            case ("6"):
                fillWithCoffee();
                break;
            case ("7"):
                info();
                break;
            case ("8"):
                switchOff();
        }
    }

    @Override
    public void show() {
        System.out.println("The value of coffee in that SecondCoffeeMachine: " + this.getCoffeeTrunk());
        System.out.println("The value of water in that SecondCoffeeMachine: " + this.getWaterTrunk());
    }

    @Override
    public void americano() {
        System.out.println("Do you want to add sugar:  \n 1) Yes \n 2) No");
        String str2 = sc.next();
        int americanoCoffeeAmount = 1;
        int americanoWaterAmount = 4;
        int sugar = 2;
        if (str2.equals("1")) {
            int americano = ((getCoffeeTrunk() - americanoCoffeeAmount) + (getWaterTrunk() - americanoWaterAmount)) + sugar;
            System.out.println("Your americano is done with amount of liquid : " + americano + "ml");

        } else if (str2.equals("2")) {
            int americano = (getCoffeeTrunk() - americanoCoffeeAmount) + (getWaterTrunk() - americanoWaterAmount);
            System.out.println("Your americano is done with amount of liquid : " + americano + "ml");

        } else if (getWaterTrunk() < americanoWaterAmount) {
            System.out.println("You need to fill in the trunk with water. ");
        } else if (getCoffeeTrunk() < americanoCoffeeAmount) {
            System.out.println("You need to fill in the trunk with coffee. ");
        } else if ((getWaterTrunk() < americanoWaterAmount) ^ (getCoffeeTrunk() < americanoCoffeeAmount)) {
            System.out.println("You need to fill in the trunk with water and coffee.");

        }
    }


    @Override
    public void espresso() {
        System.out.println("Do you want to add sugar:  \n 1) Yes \n 2) No");
        String str2 = sc.next();
        int espressoWaterAmount = 2;
        int espressoCoffeeAmount = 4;
        int sugar = 3;

        if (str2.equals("1")) {
            int espresso = (getWaterTrunk() - espressoWaterAmount) + (getCoffeeTrunk() - espressoCoffeeAmount) + sugar;
            System.out.println("Your americano is done with amount of liquid : " + espresso + "ml");

        } else if (str2.equals("2")) {
            int espresso = (getWaterTrunk() - espressoWaterAmount) + (getCoffeeTrunk() - espressoCoffeeAmount);
            System.out.println("Your americano is done with amount of liquid : " + espresso + "ml");

        } else if (getWaterTrunk() < espressoWaterAmount) {
            System.out.println("You need to fill in the trunk with water. ");
        } else if (getCoffeeTrunk() < espressoCoffeeAmount) {
            System.out.println("You need to fill in the trunk with coffee. ");
        } else if ((getWaterTrunk() < espressoWaterAmount) ^ (getCoffeeTrunk() < espressoCoffeeAmount)) {
            System.out.println("You need to fill in the trunk with water and coffee.");
        }
    }


    @Override
    public void doubleEspresso() {
        System.out.println("Do you want to add sugar:  \n 1) Yes \n 2) No");
        String str2 = sc.next();
        int doubleEspressoCoffeeAmount = 4;
        int doubleEspressoWaterAmount = 5;
        int sugar = 3;
        if (str2.equals("1")) {
            int doubleEspresso = (getWaterTrunk() - doubleEspressoWaterAmount) + (getCoffeeTrunk() - doubleEspressoCoffeeAmount) + sugar;
            System.out.println("Your americano is done with amount of liquid : " + doubleEspresso + "ml");

        } else if (str2.equals("2")) {
            int doubleEspresso = (getWaterTrunk() - doubleEspressoWaterAmount) + (getCoffeeTrunk() - doubleEspressoCoffeeAmount);
            System.out.println("Your americano is done with amount of liquid : " + doubleEspresso + "ml");

        } else if (getWaterTrunk() < doubleEspressoWaterAmount) {
            System.out.println("You need to fill in the trunk with water. ");
        } else if (getCoffeeTrunk() < doubleEspressoCoffeeAmount) {
            System.out.println("You need to fill in the trunk with coffee. ");
        } else if ((getWaterTrunk() < doubleEspressoWaterAmount) ^ (getCoffeeTrunk() < doubleEspressoCoffeeAmount)) {
            System.out.println("You need to fill in the trunk with water and coffee.");

        }
    }

    @Override
    public void fillWithWater() {
        if (getWaterTrunk() == 7) {
            System.out.println("trunk is full : " + getWaterTrunk() + " ml of water");
        } else if (getWaterTrunk() < 7) {
            System.out.println("Adding the water :");

            for (int i = 7; i > getWaterTrunk(); i++) {
                System.out.println("Adding the water :" + i + " ml of water");

            }
        }
    }

    @Override
    public void fillWithCoffee() {
        if (getCoffeeTrunk() == 6) {
            System.out.println("trunk is full : " + getCoffeeTrunk() + " grm of coffee");
        } else if (getWaterTrunk() < 6) {
            System.out.println("Adding the coffee :");

            for (int i = 6; i > getCoffeeTrunk(); i++) {
                System.out.println("Adding the coffee :" + i + " grm of coffee");
            }
        }
    }

    @Override
    public void info() {
        System.out.println("The capacity of the waterTrunk is " + getWaterTrunk() + " ml");
        System.out.println("The capacity of the CoffeeTrunk is " + getCoffeeTrunk() + " grm");
    }

    @Override
    public void switchOff() {
        System.out.println("Thank tou for choosing us ");
        System.exit(8);
    }
}
