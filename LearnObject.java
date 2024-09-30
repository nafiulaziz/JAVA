

package com.mycompany.learnobject;


public class LearnObject 
{
    public static void main(String[] args) 
    {
        System.out.println(" We will learn class and object today ");
        
        student s1 = new student();
        s1.id = 101;
        s1.name = " Nafiul ";
        
        System.out.println(" Student id :" + s1.id + " Name :" + s1.name);
       
        student s2 = new student();
        s2.id = 102;
//        s2.name = " Nafiul ";
//        s2.cgpa = (float) 3.99;
        System.out.println(" Student id :" + s2.id + " Name :" + s2.name + " CGPA " + s2.cgpa);
       
        student s3 = new student(201," Nafiul ", 2.45);
        
        System.out.println(" Student id :" + s3.id + " Name :" + s3.name + " CGPA " + s3.cgpa);
        
        s3.cgpa = 3.99;
        System.out.println(" Student id :" + s3.id + " Name :" + s3.name + " CGPA " + s3.cgpa);
        
        student s4 = new student(106, " Abir ");
        s4.cgpa = 3.69;
        System.out.println(" Student id :" + s4.id + " Name :" + s4.name + " CGPA " + s4.cgpa);
        
        
        Car c1 = new Car();
        
        c1.modName = " Premio ";
        c1.maf = " Toyota ";
        c1.color = " Maroon ";
        c1.regYear = 2011;
        c1.fuAm = 110.00;
       
        System.out.println(" Car Nmae:" + c1.modName + "  Manufacturer:" + c1.maf + "  Reagistration Year: " + c1.regYear + "  Color:" + c1.color + "  Fuel:" + c1.fuAm+"L.");
        c1.horn();
        
        
        
        Car c2 = new Car(" Axio"," Toyota","Black",2012,100);
        
        System.out.println(" Car Nmae:" + c2.modName + "  Manufacturer:" + c2.maf + "  Reagistration Year: " + c2.regYear + "  Color:" + c2.color + "  Fuel:" + c2.fuAm+"L.");
        c1.horn();
        
        
        ElonCar ec1 = new ElonCar("Tesla","Elon Mask","White",2021,10,100); 
        
        System.out.println(" Car Nmae:" + ec1.modName + "  Manufacturer:" + ec1.maf + "  Reagistration Year: " + ec1.regYear + "  Color:" + ec1.color + "  Fuel:" + ec1.fuAm+"L." + "Battery Percentage:" +ec1.batAm);
        ec1.horn();
                                      
    
    }
}
