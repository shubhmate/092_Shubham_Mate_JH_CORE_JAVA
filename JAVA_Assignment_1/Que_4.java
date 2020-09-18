/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-04.Write a program that initializes 2 byte type of
			 variables. Add the values of these variables and store
			 in a byte type of variable. [Note: primitive down 
			 casting is required in this program ]
===============================================================================
*/

class Que_4{
	public static void main(String args[]){
		byte x = (byte)10;
		byte y = (byte)200;
		byte z = (byte)(x+y);
		System.out.println(z);
	}
}