package com.mycompany.array;

import java.util.Scanner;


public class Array 
{
    
    int max_size;
    int x[] = new int[max_size];
    
    void UserInput(int max_size)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<max_size;i++)
        {
           x[i]=sc.nextInt();
        }
    }
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
         Array ar = new Array();
         
         System.out.println("Enter Max size:");
         ar.max_size =sc.nextInt();
         
         System.out.println("Enter the numbers: ");
         ar.UserInput(ar.max_size);
         
    }
}
