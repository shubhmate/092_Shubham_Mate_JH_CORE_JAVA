/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-07.Write a program to calculate sum of 5 subject’s marks 
			 & find percentage. Take the obtained marks from user 
			 using Scanner class. Output should be in this format 
			 [ percentage marks = 99 % ]. Use concatenation 
			 operator here.
===============================================================================
*/

import java.util.Scanner;
class Que_7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 subjects marks : ");
		float s1 = sc.nextFloat();
		float s2 = sc.nextFloat();
	        float s3 = sc.nextFloat();
	        float s4 = sc.nextFloat();
		float s5 = sc.nextFloat();
		float sum = s1+s2+s3+s4+s5;
		float per = sum/5;
		System.out.println("percentage marks = "+per+"%");
	}
}


