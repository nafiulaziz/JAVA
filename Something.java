

package com.mycompany.something;

import java.util.Scanner;


public class Something 
{

    static long funCal(long a, long b)
{
while (b > 0)
{
long temp = b;
b = a % b;
a = temp;
}
return a;
}
    
public static void main(String arg[ ])
{
long n1, n2;
    Scanner sc = new Scanner(System.in);
n1 = sc.nextLong( );
n2 = sc.nextLong( );
if(n1 > 0 && n2 > 0)
{
long result = funCal(n1, n2);
System.out.println(result);
}
else
System.out.println("Please enter numbers greater than zero");

}
}
