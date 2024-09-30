package com.mycompany.methodoverriding;

public class Teacher extends Person 
{
    String qu;
    
    @Override
    void disInfo()
   {
       System.out.println(" Name is: " + na);
       System.out.println(" Age is: " + age);
       System.out.println(" Qualification is: " + qu);
   }
}
