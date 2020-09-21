/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-21.Program to show sum and average of 10 element array.
			 Accept array elements from user
===============================================================================
*/

import java.util.Scanner;
class Que_21{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = s.nextInt();  
		float arr[] = new float[n];
		float sum = 0, avg;
		System.out.println("Enter "+n+" numbers: ");
		for(int i=0; i<arr.length; i++){
			arr[i]= s.nextFloat();
		}
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+(avg=sum/n));
	}
}