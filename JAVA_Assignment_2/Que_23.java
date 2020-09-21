/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-23.Write a program to reverse the array elements.
===============================================================================
*/

import java.util.Scanner;
class Que_23{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = s.nextInt();  
		float a[] = new float[n];
		int x=0,e=a.length-1;
		System.out.println("Enter "+n+" array elements : ");  
		for(int i=0; i<a.length; i++){
			a[i] = s.nextFloat();
		}
		for(int j=1; j<=a.length/2; j++){
			a[x]=a[e]+a[x];
			a[e]=a[x]-a[e];
			a[x]=a[x]-a[e];
			x+=1;
			e-=1;
		}
		System.out.println("Array in reverse order: ");
		for(float i:a)
		{
			System.out.println(i);
		}
	}
}