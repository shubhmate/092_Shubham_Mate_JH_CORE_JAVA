/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-17.Write a program to reverse a given number.
===============================================================================
*/

import java.util.Scanner;
class Que_17{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = s.nextInt();
		int r = 0;
		/*
		for( ; n!=0; ){
			r = r*10 + n%10;   //123%10==>3
			n = n/10;            //123/10==>12
		}
		*/
		while(n!=0){
			r = n%10 + r*10;
			n = n/10;
		}
		System.out.println("Reverse num : "+r);
	}
}	