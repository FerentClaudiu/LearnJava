package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        /*main.inputFromKeyboard();
        main.array();
        main.anotherInput();
        main.anotherArray();*/

        Laptop myLaptop = new Laptop("Toshiba", "C660");
        System.out.println(myLaptop.getModel());
        System.out.println(myLaptop.name + "  " + myLaptop.model);

        myLaptop.getModel();
        myLaptop.runningApps();
        int myLaptopRam = 2048;
        myLaptopRam = myLaptop.speedingUp(myLaptopRam);
        System.out.println(myLaptopRam);


    }

    public void inputFromKeyboard() {
        String userInput = sc.next();
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: " + userInput.contains("Clau".toLowerCase()));
    }

    public void array() {
        int[] numbers = new int[5];

        int[] numbers2 = {12, 19, 99, 87, 57};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        String[] chocolate = {"Mars", "Twix", "Bounty"};
        System.out.println("Index" + chocolate[2]);
        System.out.println("Index:" + chocolate.length);

        System.out.println(Array.get(chocolate, 1));

    }

    public void anotherInput() {
        int number = sc.nextInt();
        System.out.println(number);

    }

    public void anotherArray() {
        int[] listnumbers = new int[6];
        int[] listnumbers2 = {56, 74, 65, 46, 26, 111};
        Arrays.sort(listnumbers2);
        String[] shoppinglist = {"butter", "bread", "oats", "milk", "chia seeds"};
        System.out.println("The numbers are" + Arrays.toString(listnumbers2));
        System.out.println("Shopping list is :" + Arrays.toString(shoppinglist));

    }

}
