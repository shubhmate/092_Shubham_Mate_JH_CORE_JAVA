/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-10.Write a program to convert temperature from  
			 Fahrenheit to Celsius. Take Fahrenheit as input using
			 Scanner class. [ formula : C= 5*(f-32)/9 ]
===============================================================================
*/


import java.util.Scanner;
class Que_10{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit : ");
		float f = s.nextFloat();
		float c = (5*(f-32)/9);
		System.out.println("Temprature in Celcius : "+c);
	}
} 