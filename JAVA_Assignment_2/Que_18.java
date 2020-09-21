/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-18.Program to check whether number is prime or not.
===============================================================================
*/

import java.util.Scanner;
class Que_18{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = s.nextInt();
		int x = n/2;
		boolean flag = true;
		if( n==0 || n==1 ){
			System.out.println("NOT prime");
		}
		else{
			for( int i=2; i<n/2; i++ ){
				if( n%i==0 ){
					flag=false;
				}
			}
			if( flag==true ){
				System.out.println("Prime");
			}
			else{
				System.out.println("NOT prime");
			}
		}
	}
}	