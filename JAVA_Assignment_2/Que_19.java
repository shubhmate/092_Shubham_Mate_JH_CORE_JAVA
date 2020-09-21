/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-19.Calculate  series : 12+22+32+42+.........+n2.
===============================================================================
*/

import java.util.Scanner;
class Que_19{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = s.nextInt();
		int sum=0, n1=12, n2=12;
		/*
		for( int i=1; i<=n; i++){
			
		}
		*/
		System.out.print(n1);
		for( int i=1; i<=n; i++){	
			sum=n2+sum;
			n2=n2+10;
			
			if(i<n){
				System.out.print("+"+n2);
			}
		}
		System.out.println("\n"+sum);
	}
}