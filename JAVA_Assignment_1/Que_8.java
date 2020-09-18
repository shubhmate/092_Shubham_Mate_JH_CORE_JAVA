/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-08.Write a program to find the simple interest. 
			 Take the principle amount, rate of interest and time 
			 from user using Scanner class.
===============================================================================
*/

import java.util.Scanner;
class Que_8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount : ");
		float pa = sc.nextFloat();
		System.out.println("Enter rate of interest : ");
		float ri = sc.nextFloat();
		System.out.println("Enter time : ");
		int t = sc.nextInt();
		float si =(pa*ri*t)/100;
		System.out.println("Simple Interest : "+si);
	}
}