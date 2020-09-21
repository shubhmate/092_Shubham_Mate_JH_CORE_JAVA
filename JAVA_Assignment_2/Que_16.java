/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-16.Write a program to print table of any entered number 
			 using loop.
===============================================================================
*/

import java.util.Scanner;
class Que_16{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int x = s.nextInt();
		System.out.println("Table of "+x+" is : ");
		/*
		for(int i=1; i<=10; i++){
			int temp;
			//temp=x*i;
			//System.out.println(temp);
			System.out.println(x*i);			
		}
		*/
		int i=1;
		while(i<=10){
			System.out.println(x*i);
			i++;			
		};
	}
}

		