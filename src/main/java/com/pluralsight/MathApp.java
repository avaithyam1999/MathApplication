package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
//        1. comparing two salaries and returning the higher one
        int bobSalary = 100000;
        int garySalary = 90000;
        int highestSalary = Math.max(bobSalary, garySalary);

//        2. comparing two vehicle prices and returning the lower one
        int carPrice = 50000;
        int truckPrice = 75000;
        int lowestPrice = Math.min(carPrice, truckPrice);

//        3. Using the radius of a circle to find the area.
        double radius = 7.25f;
        double area = Math.round((Math.PI * radius)*2);

//        4. Finding square root of a variable set
        int num = 5;
        double squared = Math.sqrt(num);

//        5. Finding the distance between two points
        int x1 = 5;
        int y1 = 10;

        int x2 = 85;
        int y2 = 50;

        int calcX = x2 - x1;
        int calcY = y2 - y1;
        double pythag = (double)Math.sqrt(Math.pow(calcX, 2) + Math.pow(calcY, 2));

//        6. Finding absolute positive value of variable
        float var = -3.8f;
        float absoluteV = Math.abs(var);

//        7. Display random number between
        double randomNum = Math.random();

//        8. How many minutes are in 24 days
        int minutes = 60;
        int hours = 24;
        int days = 24;
        int calcMinutes = (days * hours) * minutes;

//      Printing out everything
        System.out.println("1. The highest salary is: " + highestSalary);
        System.out.println("2. The lowest price is: " + lowestPrice);
        System.out.println("3. The area for a circle with radius of " + radius + " is approximately: " + area);
        System.out.println("4. The square root of " + num + " is " + squared);
        System.out.println("5. The distance between points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is:" + Math.round(pythag));
        System.out.println("6. " + absoluteV + " is the absolute value of " + var);
        System.out.println("7. Here is a random number between 0 and 1: " + randomNum);
        System.out.println("8. In 24 days, there are " + calcMinutes + " minutes. ");

    }
}
