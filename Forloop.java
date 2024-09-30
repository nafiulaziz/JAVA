package com.mycompany.forloop;

import java.util.Scanner;

public class Forloop 
{

    public static void main(String[] args) 
    {
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" How many numbers do you want to enter? ");
        n = sc.nextInt();
       
        
        int arr[] = new int[n];
        
            System.out.println(" Enter the values: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
            System.out.println(" The values are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        
        
    }
    
}
