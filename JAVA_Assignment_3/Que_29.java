/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 3-29.Write a program to print the total number of one-D
			 arrays in a two-D array and the number of elements
			 in every one-D array present in the two-D arrays.
===============================================================================
*/

import java.util.Scanner;
class Que_29{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.println("Enter 2D-array size : ");
		int n = s.nextInt(); 
		System.out.println("Enter 1D-array size : ");
		int n1 = s.nextInt(); 

		int a[][] = new int[n][n1];
		System.out.println("Enter array elements : ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = s.nextInt();
			}
		}
                
		System.out.println("No of elements every 1D-array : "+a.length); 
		int count_1=0, count_2=0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				count_2++;
			}
			//count_1++;
		}
		//System.out.println("Total no of 1D-array in 2D-array : "+count_1);
		System.out.println("No of elements every 1D-array : "+count_2);
	}
}