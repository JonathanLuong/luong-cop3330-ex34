package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        String[] workers = new String[]{"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        int arrLen = workers.length;
        int counter = 0;

        System.out.printf("There are 5 employees:\n");
        for (int i = 0; i < arrLen; i++) {
            System.out.printf("%s\n", workers[i]);
        }

        System.out.printf("\nEnter an employee name to remove: ");
        String remove = reader.nextLine();

        String[] workersNew = new String[(workers.length)-1];

        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == remove) // Gets the removing element index
                counter = i;
        }

        for (int i = 0, k = 0; i < arrLen; i++) {
            if(i != counter) {  // Checks if the removing element is the current element
                workersNew[k]=workers[i]; // If not then it will copy the old into the new
                k++;
            }
        }

        System.out.printf("There are %d employees:\n", workersNew.length);
        for (int i = 0; i < workersNew.length; i++) {
            System.out.printf("%s\n", workersNew[i]);
        }

    }
}