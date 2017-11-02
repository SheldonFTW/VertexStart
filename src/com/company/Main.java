package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

//        System.out.println("Your age is?");
//
//        int number = scaner.nextInt();
//        if (number >= 18) {
//            System.out.println("OK");
//        } else {
//            System.out.println("NO");
//        }
       /* System.out.println("Choise the number of your country: 1,2,3,4,5 ");
        int number = scaner.nextInt();
        if (number == 1) {
            System.out.println("UA");
        } else if (number == 2) {
            System.out.println("US");
        } else if (number == 3) {
            System.out.println("DE");
        } else if (number == 4) {
            System.out.println("MD");
        } else if (number == 5) {
            System.out.println("HU");*/

        System.out.println("Enter your distance!");
                int value = scaner.nextInt();

             /*   switch (value) {
                    case 17:
                        System.out.println("17");
                        break;
                    case 18:
                        System.out.println("18");
                        break;
                    default:
                        System.out.println("else");
                        break;

                }
                */
                   switch (value) {
                    case 21:
                        System.out.println("Distabce 21 km");
                        break;
                    case 30:
                        System.out.println("Distance 30 km");
                        break;
                       case 40:
                           System.out.println("Distance 40 km");
                           break;
                       default:
                           System.out.println("Fail");
                }

    }
}