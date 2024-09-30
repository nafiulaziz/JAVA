
package com.mycompany.distance;

import static java.lang.Math.pow;
import java.util.Scanner;


public class Distance 
{

    public static void main(String[] args)
    {
        double x1, x2, y1, y2, D;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter the coordinate of A: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        
        System.out.println(" Enter the coordinate of B: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        D = pow((pow((x2 - x1),2) + pow((y2 - y1),2)),0.5);
        System.out.println(" Distance between A and B is: " + D);
        
    }
}
