/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 2-20.Print all prime numbers between two given numbers.
			 [ break continue ]
===============================================================================
*/

import java.util.Scanner;
class Que_20{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First num : ");
		int n1 = s.nextInt();
		System.out.println("Enter Last num : ");
		int n2 = s.nextInt();
		System.out.println("Prime nos bet "+n1+" and "+n2+" : ");
		for(int i=n1; i<=n2; i++){
			int x = i/2;
			if(i==0 || i==1){
				System.out.println(i);
			}
			else{
				boolean flag = true;
				for(int j=2; j<=x; j++){
					if(i%j==0){
						flag=false;
					}
				}
				if(flag==true){
					System.out.println(i);
				}
			}
		}
	}
}
				