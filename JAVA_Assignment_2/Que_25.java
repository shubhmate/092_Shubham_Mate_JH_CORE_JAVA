/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-25.Write the program to find the sum of even elements and
			 sum of odd elements present in the array of integer type.
===============================================================================
*/

import java.util.Scanner;
class Que_25{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = s.nextInt();  
		int a[] = new int[n];

		System.out.println("Enter "+n+" array elements : ");  
		for(int i=0; i<a.length; i++){
			a[i] = s.nextInt();
		}
		
		int sum_e=0, sum_o=0;
		for(int i=0; i<a.length; i++){
			if(a[i]%2==0){
				sum_e=sum_e+a[i];
			}
			else{
				sum_o=sum_o+a[i];
			}
		}
		System.out.println("Sum of EVEN : "+sum_e);
		System.out.println("Sum of ODD : "+sum_o);
	}
}