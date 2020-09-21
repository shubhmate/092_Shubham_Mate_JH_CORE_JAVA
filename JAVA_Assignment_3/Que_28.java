/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 3-28.Initialize one String type of array and print the
			 elements using for each loop.
===============================================================================
*/

import java.util.Scanner;
class Que_28{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int n = s.nextInt(); 
		String a[] = new String[n];
		System.out.println("Enter array elements : ");
		for(int i=0; i<a.length; i++){
				a[i] = s.next();
		}
                 
		System.out.println("Elements of Array : "); 
		for(String ar: a){
			System.out.println(ar);
		}

	}
}