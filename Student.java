package com.mycompany.gettersetter;

public class Student 
{
    private int id;
    private String na;
    private double cg;
    private String pa;
    private int ba;
    
//    Parameter constructor
    public Student(int id, String na, Double cg)
    {
        this.id = id;
        this.cg = cg;
    }
    
//    Parameter constructor 2
    public Student (int id, String na)
    {
        this.id = id;
        this.na = na;
    }
    
//    Empty constructor
    public Student ()
    {
        this.cg = 3.56;
        this.na = " Unknown ";
    }
    
    
    public void setId(int id)
    {
        if(id == 1)
        {
            System.out.println(" Id is: 1");
        }
        
       this.id = id;   
    }
    
    
    public int getId()
    {
        return this.id;
    }
    
    
    public void setNa(String na)
    {        
       this.na = na;   
    }
    
    
    public String getNa()
    {
        return this.na;
    }
    
    
    public void setCg(double cg)
    {
        this.cg = cg;
    }
    
    
    public double getCg()
    {
        return this.cg;
    }
    
    
    public void setPa(String pa)
    {
        this.pa = pa;
    }
    
    
    public boolean matchPa(String userpa)
    {
        return this.pa.equals(userpa);
    }
    
    
    public void setBa(int ba)
    {
       this.ba = ba;
    }
    
    
    public int getBa()
    {
        return this.ba;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
