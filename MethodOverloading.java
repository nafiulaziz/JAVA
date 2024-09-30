package com.mycompany.methodoverloading;

import java.util.Scanner;

public class MethodOverloading 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in);
        
        double a,b,c;
        
        System.out.println(" Enter the first number: ");
        a = sc.nextDouble();
        
        System.out.println(" Enter the first number: ");
        b = sc.nextDouble();
        
        System.out.println(" Enter the first number: ");
        c = sc.nextDouble();
        
        double x = sum(a,b);
        System.out.println(" Sum of first 2 number is: " + x);
        
        double y = sum(a,b,c);
        System.out.println(" Sum of first 3 number is: " + y);
        
    }
    
    
    public static double sum(double a, double b)
    {
        return a+b;
    }
    
    
    public static double sum(double a, double b, double c)
    {
        return a+b+c;
    }
    
}
