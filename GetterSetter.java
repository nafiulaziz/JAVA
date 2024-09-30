package com.mycompany.gettersetter;

import java.util.Scanner;


public class GetterSetter 
{
    public static void main(String[] args) 
    {
        System.out.println(" We will learn to how set and get from it. ");
        
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();
        s1.setId(9);
        s1.setNa( " Nafiul Aziz ");
        s1.setPa("nothing");
        s1.setCg(3.99);
        s1.setBa(56);
        
        System.out.println(" Student " + s1.getId() + ":" + s1.getNa() + "CGPA is: " + s1.getCg() + " Batch is: " + s1.getBa() + " Password " + s1.matchPa("nothing"));
        
        Student s2 = new Student();
        
        s2.setId(7);
        s2.setNa( " Yousuf Khan ");
        s2.setCg(3.99);
        s2.setBa(56);
        
        System.out.println(" Student " + s2.getId() + ":" + s2.getNa() + "CGPA is: " + s2.getCg() + " Batch is: " + s2.getBa());
        
        
    }
}
