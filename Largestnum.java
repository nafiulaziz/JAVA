package com.mycompany.largestnum;

import java.util.Scanner;


public class Largestnum
{
    public static void main(String[] args)
    {
        int num1, num2, num3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter 1st number: ");
        num1 = sc.nextInt();
        
        System.out.println(" Enter 2nd number: ");
        num2 = sc.nextInt();
        
        System.out.println(" Enter 3rd number: ");
        num3 = sc.nextInt();
        
        if((num1 > num2) && (num1 > num3))
        {
            System.out.println(num1 + " Number is the largest. ");       
        }
        else if((num2 > num1) &&(num2 > num3))
        {
            System.out.println(num2 + " Number is the largest. ");
        }
        else
        {
            System.out.println(num3 + " Number is the largest. ");
            
        }   
        
    }
    
}
