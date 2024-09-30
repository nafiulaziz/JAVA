

package com.mycompany.standarddeviation;

import java.util.Scanner;


public class Standarddeviation 
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
    
    
    public double deviation()
    {
        
        double mean,sdev,sum=0.0,X=0.0;
        int i;
        for(i=0;i<max_size;i++)
        {
            sum=sum+x[i];
        }
       mean=sum/max_size; 
        for(i=0; i<max_size; i++)
        {
            X=X+(x[i]-mean)*(x[i]-mean);
        }
        sdev= Math.sqrt((X/max_size));
        return sdev;
    }

    
    public static void main(String[] args) 
    {
        double standardDev; 
        
        Standarddeviation abc = new Standarddeviation();
        
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Enter Max size:");
         abc.max_size =sc.nextInt();
         
         System.out.println("Enter the numbers: ");
         abc.UserInput(abc.max_size);
         
         standardDev = abc.deviation();
         System.out.println("The Standard Deviation : "+standardDev);
         
 }


}
