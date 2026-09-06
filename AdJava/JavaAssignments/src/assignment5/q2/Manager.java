package assignment5.q2;

import java.util.*;
class Person{
	static Scanner sc=new Scanner(System.in);
	
	String name;
	int age;
	static String organization="CDAC";
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Employee extends Person{
	int empId;
	float salary;
	
	Employee(int empId,float salary){
		super(sc.next(),sc.nextInt());
		this.empId=empId;
		this.salary=salary;
	}	
}

public class Manager extends Employee{
	String department;
	int teamsize;
	Manager(String department,int teamsize){
		super(sc.nextInt(),sc.nextFloat());
		this.department=department;
		this.teamsize=teamsize;
	}

	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Manager Id:"+empId);
		System.out.println("Salary:"+salary);
		System.out.println("Department:"+department);
		System.out.println("Teamsize:"+teamsize);
		System.out.println("Organization:"+organization);
		System.out.println("Annual salary:"+salary*12);
	}
	
	public static void main(String[] args) {
		Manager m1= new Manager("AC",5);
		m1.display();
		
		Manager m2= new Manager("BDA",3);
		m2.display();
	}
	
	
}
