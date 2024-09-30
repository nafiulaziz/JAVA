package com.mycompany.oddeven;

import java.util.Scanner;


public class Oddeven
{

    public static void main(String[] args) 
    {
       int num;
        
          Scanner sc = new Scanner(System.in);
          
          System.out.println(" Enter the number : ");
          
          num = sc.nextInt();
        
          if((num%2)==0)
         {
             System.out.println(" The nmber is even " + num);  
         }
          else
         {
           System.out.println(" The number is odd" + num);          
         }    
    }
}