/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 3-26.Create an array of 17 elements in 5 rows. 
			 And calculate sum of all elements.
===============================================================================
*/

import java.util.Scanner;
class Que_26{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		int a[][] = new int[3][4];
		System.out.println("Enter array elements : ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = s.nextInt();
			}
			System.out.println("");
		}

		int sum = 0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				sum = sum + a[i][j];
			}
		}
		System.out.println("Sum : "+sum);
	}
}