
package com.mycompany.methodoverriding;

import java.util.Scanner;

public class MethodOverriding
{

    public static void main(String[] args)
    {
        System.out.println(" The list of Teacher. ");
        System.out.println(" 1. Mathematics  ");
        Scanner sc = new Scanner(System.in);
        
        Teacher t1 = new Teacher();
        t1.na = sc.next();
        t1.age = sc.nextInt();
        t1.qu = " B.Sc in CSE ";
         
        t1.disInfo();
        
        System.out.println(" The list of Student. ");
        Person p1 = new Person();
        p1.na = " Nafiul Aziz ";
        p1.age = sc.nextInt();
        
        p1.disInfo();
        
    }
}
