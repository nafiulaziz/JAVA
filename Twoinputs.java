package com.mycompany.twoinputs;

import java.util.Scanner;

public class Twoinputs 
{
    public static void main(String[] args) 
    {
        double x, y, sum, sub, pro, qo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter First number");
        x = sc.nextDouble();
        
        System.out.println(" Enter Second number");
        y = sc.nextDouble();
        
        sum = x + y;
        System.out.println("The Sum of two number is: " + sum);
        
        sub = x - y;
        System.out.println("The Difference of two number is: " + sub);
        
        pro = x * y;
        System.out.println("The Product of two number is: " + pro);
         
        qo =  qo(x,y);
        System.out.println(" The Quotient of two nuber is " + qo);        
        
    }
    
    
    static double qo(double a, double b)
    {
        double c = 0;
       
        if (b == 0)
        {
            System.out.println("The Quotient is not possible.");
        }
        else
        {
           c = a / b;
        }
        
        return c;
        
    }
    
}
