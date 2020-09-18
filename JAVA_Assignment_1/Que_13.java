/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-13.Program to find greatest in 3 numbers. [ once
			 using if else statement and then using ternary 
			 operator ( logical operator) ].  
===============================================================================
*/


import java.util.Scanner;
public class Que_13 
{
    public static void main(String args[]) 
    {
        float x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextFloat();
        System.out.print("Enter the second number:");
        y = s.nextFloat();
        System.out.print("Enter the third number:");
        z = s.nextFloat();
        
	/*
	//A}
	if(x > y && x > z)
        {
	    System.out.println("Greatest number is:"+x);
	}
        else if(y > z)
        {
            System.out.println("Greatest number is:"+y);
        }
	else if(x==y && x==z)
	{
	    System.out.println("All are equal nos.");
	}
        else
        {
            System.out.println("Greatest number is:"+z);
        }
	*/

	Float t = (x > y && x > z) ? x :( y > z ? y : z );
	System.out.println("Greatest number is:"+t); 
    }
}                                                                                                                                                                        