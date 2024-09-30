

package com.mycompany.something2;

import java.util.Scanner;


public class Something2 
{

    public static void main(String arg[ ])
{
long n,sum;
Scanner sc = new Scanner(System.in);
n = sc.nextLong( );
for(sum = 0; n != 0; n /= 10)
sum += n % 10;
System.out.println(sum);
}
    
}
