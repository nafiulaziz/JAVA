package com.mycompany.vowel;

import java.util.Scanner;

public class Vowel 
{
    
    public static void main(String[] args) 
    {
        
        int vol = 0;
        int con = 0;
        
        String s = new String();
        
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println(" Enter the string :" );
        
        s = sc.nextLine().toUpperCase();
//        s = s.toUpperCase();
        
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if( c != ' ')
            {
                if(c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U')
                {
                    vol++;
                }
                else
                {
                    con++;
                }
            }
            
        }
        
        System.out.println(" The number of vowel is: " + vol);
        
        System.out.println(" The number of consonant is: " + con);
        
    }
    
}
