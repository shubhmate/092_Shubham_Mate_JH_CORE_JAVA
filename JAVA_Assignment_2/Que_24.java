/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-24.Write a program to search an element in the array.
===============================================================================
*/

import java.util.Scanner;
class Que_24{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = s.nextInt();  
		int a[] = new int[n];
		System.out.println("Enter "+n+" array elements : ");  
		for(int i=0; i<a.length; i++){
			a[i] = s.nextInt();
		}
		System.out.println("Enter num to search in array : ");
		int x = s.nextInt();
		for(int i=0; i<a.length; i++){
			if(x==a[i]){
				System.out.println("Num found at "+i);
			}
			else{
				System.out.println("NOT found");
			}
		}
	}
}