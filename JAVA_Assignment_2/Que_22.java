/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-22.Sort a ten element array in descending order.
===============================================================================
*/

import java.util.Scanner;
class Que_22{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = s.nextInt();  
		float a[] = new float[n];
		System.out.println("Enter "+n+" array elements : ");  
		for(int i=0; i<a.length; i++){
			a[i] = s.nextFloat();
		}
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]<a[j]){
					float temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array in descending order : ");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}