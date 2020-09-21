/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 3-30.Create an integer type 2-D array of size [3X3].
			 Take the elements from the user and then calculate 
			 the sum of the elements present in the diagonal.
===============================================================================
*/

import java.util.Scanner;
class Que_30{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		//System.out.println("Enter 2D-array size : ");
		//int n = s.nextInt(); 
		//System.out.println("Enter 1D-array size : ");
		//int n1 = s.nextInt(); 

		int a[][] = new int[3][3];
		System.out.println("Enter array elements : ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = s.nextInt();
			}
		}
                
		int sum = 0;
		System.out.println("Diagonal : ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				if(i==j){
					System.out.println(a[i][j]);
					sum = sum +a[i][j];
				}
			}
		}
		System.out.println("SUM of diagonal : "+sum);
	}
}