/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 3-31.Create a class Student with 2 data members rno and
			 name. Create one method setData() that takes roll 
			 number and student name as parameter and stores them 
			 in data members rno and name. Create one more method
			 showData() to print the data member values. 
			 Create another class ( main class) StudentDemo that
			 creates Student class object and calls setData() and
			 showData() methods.
===============================================================================
*/

import java.util.Scanner;
class Student{
		int rno;
		String name;
		void setData(int rno, String name){
			this.rno=rno;
			this.name=name;
		}
		void showData(){
			System.out.println("Roll No : "+rno);
			System.out.println("Name : "+name);
		}
}
class StudentDemo{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter roll no: ");
		int rno = s.nextInt();
		System.out.println("Enter Name: ");
		String name = s.next();

                Student s1 = new Student();
		s1.setData(rno,name);
		s1.showData();
		
	}
}