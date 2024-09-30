package com.mycompany.temperature;

import java.util.Scanner;


public class Temperature 
{
    public static void main(String[] args) 
    {
        double C, F;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter the temperature in Farenhite: ");
        F = sc.nextDouble();
        
        C = ((F-32)*(0.56));
        System.out.println(" Temperature in Celcius is: " + C);
               
    }
    
}
