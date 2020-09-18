/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-14.Program to check that entered year is a leap year or 
			 not.
===============================================================================
*/

import java.util.Scanner;
class Que_14{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int yr;
		System.out.println("Enter year : ");
		yr = s.nextInt();

		/*
		//A}
		if( yr%4 == 0 )
		{
			if( yr%100 == 0)
			{
				if( yr%400 == 0)
				{
					System.out.println(yr+" is Leap Year");
				}
				else
				{
					System.out.println(yr+" is NOT Leap Year");
		 		}
			}
			else
			{
				System.out.println(yr+" is Leap Year");
			}
		}
		else
		{
			System.out.println(yr+" is NOT Leap Year");
		}
		*/

                /*
		//B}
		if((yr%4==0 && yr%100 !=0) || (yr%400 == 0))
		{
			System.out.println(yr+" is Leap Year");
		}
		else
		{
			System.out.println(yr+" is NOT Leap Year");
		}
		*/
		
		//C}
		String st = ((yr%4==0 && yr%100!=0) || (yr%400==0)) ? yr+" LEAP YEAR" : yr+" NOT LEAP YEAR";
		System.out.println(st); 
	}
}


 