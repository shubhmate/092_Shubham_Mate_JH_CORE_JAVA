/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-12.In a company an employee is paid as under:
			 If his basic salary is less than Rs. 10000, 
			 then HRA = 10% of basic salary and DA = 90%
			 of basic salary. If his salary is either equal
			 to or above Rs. 10000, then HRA = Rs. 2000 and
			 DA = 98% of basic salary. If the employee's salary
			 is input by the user write a program to find his
			 gross salary. [ formula : GS= Basic + DA + HRA ]
===============================================================================
*/

import java.util.Scanner;
class Que_12{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary : ");
		float sal = s.nextFloat();
		float HRA, DA, GS; 
		if(sal < 10000)
		{
			HRA = (sal*10)/100;
			DA  = (sal*90)/100;
		}
		else
		{
			HRA = 2000;
			DA  = (sal*98)/100;
		}
		GS = sal + DA + HRA ;
		System.out.println("Gross Salary : "+GS);
	}
}			
 









