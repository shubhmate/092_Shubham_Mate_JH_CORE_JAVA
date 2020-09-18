/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 1-03.Find the result of following expressions. You need to 
			 determine the primitive data type of the variable by 
			 looking carefully the given expression and initialize
			 variables by any random value.
				A. y = x2 + 3x - 7 (print value of y) 
				B. y = x++ + ++x (print value of x and y) 
				C. z = x++ - --y - --x  +  x++ 
				   (print value of x ,y and z)
				D. z = x && y || !(x || y)  (print value of z)
				   [ x, y, z are boolean variables ]
===============================================================================
*/

class Que_3{
	public static void main(String args[]){
		
		/*A
		int x = 10;
		int y = ((x*x) + (3*x) -7);
		System.out.println("Value of y : "+y);
		*/

		/*B
		int x = 10;
		int y = x++ + ++x;
		System.out.println("Value of x and y : "+x+" "+y);
		*/

		/*C
		int x = 10;
		int y = 11;
		int z =	x++ - --y - --x + x++;
		System.out.println("Value of x, y, z : "+x+" "+y+" "+z);		
		*/

                //D
		boolean x = false;
		boolean y = false;
		boolean	z = (x && y) || !(x || y);
		System.out.println(z);
		
	}
}

			











