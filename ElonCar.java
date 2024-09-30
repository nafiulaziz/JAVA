
package com.mycompany.learnobject;


public class ElonCar extends Car
{
  double batAm;
  
  public ElonCar(String modName, String maf, String color, int regYear, double fuAm, double batAm )
    {
        super(modName, maf, color, regYear,fuAm);
        this.batAm = batAm;
    }
  
  public void horn()
    {
        System.out.println(" PeeP PeeP ");
    }
   
    
}
