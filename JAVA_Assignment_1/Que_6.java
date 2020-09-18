/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-06.Write a program that takes radius of a circle 
			 as input. Read the entered radius using Scanner class. 
			 Then calculate and print the area and circumference of 
			 the circle.
===============================================================================
*/

import java.util.Scanner;
class Que_6{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle :");
		int r = sc.nextInt();
		float a = (float)(3.14*r*r);
		float c = (float)(2*3.14*r);
		System.out.println("Area of circle : "+a+" and Circumference : "+c);
	}
}