
package com.mycompany.learnobject;


public class Car 
{
    int regYear;
    String modName;
    String maf;
    String color;
    double fuAm; 
    
    public Car(String modName, String maf, String color, int regYear, double fuAm)
    {
        this.modName = modName;
        this.maf = maf;
        this.color = color;
        this.regYear = regYear;
        this.fuAm = fuAm;
    }
    
    public Car(String modName, int regYear, String color)
    {
        this.color = color;
        this.modName = modName;
        this.regYear = regYear;
    }
   
    public Car(String modName, int regYear, double fuAm)
    {
        this.modName = modName;
        this.regYear = regYear;
        this.fuAm = fuAm;
    }
    public Car()
    {
    }
    
    public void horn()
    {
        System.out.println(" Beep Beep");
    }
   
 }
