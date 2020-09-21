/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 3-27.Write a program to fine the smallest and greatest
			 number present in the array of integer type.
===============================================================================
*/

import java.util.Scanner;
class Que_27{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int n = s.nextInt(); 
		int a[] = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0; i<a.length; i++){
				a[i] = s.nextInt();
		}

		int max = a[0];                     // max= 5
		for(int i=0; i<a.length; i++){
			if( max<a[i] ){
				max = max + a[i];   // max= 5 + 6=11   
				a[i]= max - a[i];   // a[i]= 11 - 6= 5
				max = max - a[i];   // max = 11 - 5=6
			}
		}

                int min=a[0];
		for(int i=0; i<a.length; i++){
			if( min>a[i] ){
				min = min + a[i];
				a[i] = min - a[i];
				min = min - a[i];
			}
		}

		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
	}
}