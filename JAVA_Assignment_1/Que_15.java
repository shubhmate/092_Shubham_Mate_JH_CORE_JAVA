/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-15.Accept person’s gender (character m for male 
			 and f for female), age (integer), as input and then
			 check whether person is eligible for marriage or not.
===============================================================================
*/

import java.util.Scanner;
class Que_15{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the gender (Male-M, Female-F):");
		char g = s.next().charAt(0);
		System.out.println("Enter age: ");
		int a = s.nextInt();
		if( g == 'M')
		{
			if( a >= 21 )
			{
				System.out.println("Male is Eligible for marriage.");
		        }
			else
			{
				System.out.println("Male is NOT Eligible for marriage.");
			}
		}
		else if( g== 'F')
		{
			if( a >= 18 )
			{
				System.out.println("Female is Eligible for marriage.");
			}
			else
			{
				System.out.println("Female is NOT Eligible for marriage.");
			}
		}
		else
		{
			System.out.println("Invalid gender");
		}
	}
}