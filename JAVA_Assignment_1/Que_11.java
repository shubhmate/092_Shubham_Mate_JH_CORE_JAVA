/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-11.Write a program to swap two numbers without using
			 third variable
===============================================================================
*/

import java.util.Scanner;
class Que_11{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 num");
		float n1 = s.nextFloat();
		float n2 = s.nextFloat();
		System.out.println("Before swapping : \n"+"n1 = "+n1+"\n"+"n2 = "+n2);
		float temp;
		temp =n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After swapping : \n"+"n1 = "+n1+"\n"+"n2 = "+n2);
	}
}	