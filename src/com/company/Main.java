package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
start();

    }


    public static void start() {
        Scanner sc = new Scanner(System.in);

        FirstCoffeeMachine firstCoffeeMachine = new FirstCoffeeMachine(5, 8);
        SecondCoffeeMachine secondCoffeeMachine = new SecondCoffeeMachine(6, 7);
        ThirdCoffeeMachine thirdCoffeeMachine = new ThirdCoffeeMachine(4, 7);
        System.out.println("choose a coffeeMachine");


            String str = sc.next();

            if (str.equals("first")) {
                firstCoffeeMachine.menu();
            } else if (str.equals("second")) {
                secondCoffeeMachine.menu();
            } else if (str.equals("third")) {
                thirdCoffeeMachine.menu();

            }
        }
    }
