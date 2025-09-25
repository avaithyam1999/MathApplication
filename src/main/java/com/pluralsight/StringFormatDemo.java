package com.pluralsight;

public class StringFormatDemo {
    public static void main(String[] args) {
        String fullName = "John Cena";
        int netWorth = 80_000_000;
        double taxRate = 38.25455;

        String message1 = "John Cena is worth $80,000,000. Unfortunately, he has to pay 38.25% of that in taxes.";
        String message2 = fullName + " is worth $" + netWorth + ". Unfortunately, he has to pay " + taxRate + "% of that in taxes.";
        String message3 = String.format("%s is worth $%,d. Unfortunately, he has to pay %.2f%% of that in taxes.", fullName,netWorth, taxRate);
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);
    }
}
