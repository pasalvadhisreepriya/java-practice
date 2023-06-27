package com.codingexercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the floor = ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the floor = ");
        double width = scanner.nextDouble();

        System.out.print("Enter the cost per square meter of carpet = ");
        double costPerSquareMeter = scanner.nextDouble();

        scanner.close();

        // Creating objects for floor,carpet and calculator
        Floor floor = new Floor(width, length);
        Carpet carpet = new Carpet(costPerSquareMeter);
        Calculator calculator = new Calculator(floor, carpet);

        // Calculate and display total cost
        double totalCost = calculator.getTotalCost();
        System.out.println("Total cost = " + totalCost);
    }
}