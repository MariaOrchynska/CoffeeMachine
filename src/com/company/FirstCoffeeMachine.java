package com.company;

import java.util.Scanner;

public class FirstCoffeeMachine extends CoffeeMachine {
    Scanner sc = new Scanner(System.in);


    public FirstCoffeeMachine(int coffeeTrunk, int waterTrunk) {
        super(coffeeTrunk, waterTrunk);
    }


    @Override
    public void menu() {
        System.out.println("Enter your choice: \n1. show \n2. americano \n3. espresso \n4. doubleEspresso \n5. fill trunk with water");
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
            case ("5"):
                fillWithWater();
                case("6")
        }
    }

    @Override
    public void show() {
        System.out.println("The value of coffee in that FirstCoffeeMachine: " + this.getCoffeeTrunk() + "grm");
        System.out.println("The value of water in that FirstCoffeeMachine: " + this.getWaterTrunk() + "ml");

    }

    @Override
    public void americano() {
        System.out.println("Do you want to add sugar:  \n 1) Yes \n 2) No");
        String str2 = sc.next();
        if (str2.equals("1")) {
            int americano = (getWaterTrunk() - 2) + (getCoffeeTrunk() - 6) + 3;
            System.out.println("Your americano is done with amount of liquid : " + americano+ "ml");

        } else if (str2.equals("2")) {
            int americano = (getWaterTrunk() - 2) + (getCoffeeTrunk() - 6);
            System.out.println("Your americano is done with amount of liquid : " + americano+ "ml");

        }

    }

    @Override
    public void espresso() {
        System.out.println("Do you want to add sugar:  \n 1) Yes \n 2) No");
        String str2 = sc.next();
        if (str2.equals("1")) {
            int espresso = (getWaterTrunk() - 6) + (getCoffeeTrunk() - 4) + 3;
            System.out.println("Your americano is done with amount of liquid : " + espresso+ "ml");

        } else if (str2.equals("2")) {
            int espresso = (getWaterTrunk() - 6) + (getCoffeeTrunk() - 4);
            System.out.println("Your americano is done with amount of liquid : " + espresso + "ml");

        }
    }

    @Override
    public void doubleEspresso() {
        System.out.println("Do you want to add sugar:  \n 1) Yes \n 2) No");
        String str2 = sc.next();
        if (str2.equals("1")) {
            int doubleEspresso = (getWaterTrunk() - 6) + (getCoffeeTrunk() - 8) + 3;
            System.out.println("Your americano is done with amount of liquid : " +  doubleEspresso + "ml");

        } else if (str2.equals("2")) {
            int doubleEspresso = (getWaterTrunk() - 6) + (getCoffeeTrunk() - 8);
            System.out.println("Your americano is done with amount of liquid : " + doubleEspresso + "ml");

        }
    }

    @Override
    public void fillWithWater() {
       if (getWaterTrunk()==8){
           System.out.println("trunk is full : " + getWaterTrunk() + "ml");
       }else if(getWaterTrunk()<8) {
           System.out.println("Adding the water :");

           for (int i = 8; i > getWaterTrunk(); i++) {
               System.out.println("Adding the water :" + i +" ml");

           }
       }
        }

    @Override
    public void fillWithCoffee() {
        if (getCoffeeTrunk()==5){
            System.out.println("trunk is full : " + getCoffeeTrunk() + "grm");
        }else if(getWaterTrunk()<5) {
            System.out.println("Adding the coffee :");

            for (int i = 5; i > getCoffeeTrunk(); i++) {
                System.out.println("Adding the coffee :" + i + " grm");
            }
            }
    }

    @Override
    public void info() {

    }

    @Override
    public void switchOff() {

    }
}
