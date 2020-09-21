/*  	Name: Shubham Mate
	Rollno:200240520092
	Subject:JAVA
	Assignment: 3-32.Modify the above program (no. 31) to count the no of 
			 Student objects created. [ In this program static 
			 variable is required ]
===============================================================================
*/

import java.util.Scanner;
class Student{
		int rno;
		String name;
		static int count=0;
		
		Student()
		{
			count++;
		}
		
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
		
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
	        Student s6=new Student();
			
		System.out.println("Total objects: "+s1.count);
	}
}