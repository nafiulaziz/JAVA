package com.mycompany.add;

import java.util.Scanner;


public class Add 
{

    public static void main(String[] args) 
    {
        int a,b,c;
         
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        
        b = sc.nextInt();
        
        c = a + b;
        
        System.out.println(" The sum is:" + c);
    
    }
}
