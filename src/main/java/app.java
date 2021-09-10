/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        double temp, conversion;
        String output, toType;
        String toTypeFullName = "Celsius";

        System.out.println("Enter \"C\" to convert from Fahrenheit to Celsius, or \"F\" to convert from Celsius to Fahrenheit:");
        scan = new Scanner(System.in);
        toType = scan.next();

        System.out.println("Enter the temperature:");
        scan = new Scanner(System.in);
        temp = Double.parseDouble(scan.next());

        conversion = (temp - 32) * (5 / 9);

        if((toType.toUpperCase()).equals("F"))
        {
            conversion = (temp * (9 / 5) ) + 32;
            toTypeFullName = "Fahrenheit";
        }

        output = String.format("The temperature in %s is %.2f.", toTypeFullName, conversion);

        System.out.println(output);
    }
}