/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-09.Write a program to read the days (eg. 670 days)
			 as integer value using Scanner class. Now convert the
			 entered days into complete years, months and days and
			 print them.
===============================================================================
*/

import java.util.Scanner;
class Que_9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days : ");
		int days = sc.nextInt();
		int y = days / 365;
		days  = days % 365;
		int m = days / 31;
		days  = days % 31;
		int w = days / 7;
		days  = days % 7;
		int d = days;
		System.out.println("No. of Years : "+y+"\n"+"No. of Months : "+m+"\n"+"No.of Weeks : "+w+"\n"+"No. of Days : "+d);
	}
}








