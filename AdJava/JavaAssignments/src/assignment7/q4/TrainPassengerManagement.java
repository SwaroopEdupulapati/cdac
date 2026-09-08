package assignment7.q4;

import java.util.LinkedList;
import java.util.Scanner;

public class TrainPassengerManagement {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			 System.out.println(""" 
			 	1. Add Passenger at Beginning
					2. Add Passenger at End
					3. Remove First Passenger
					4. Remove Last Passenger
					5. Search Passenger
					6. Display Passengers
					7. Exit
					Enter the choise = 
			            """);
			 int ch = sc.nextInt();
			 switch(ch) {
				 case 1:{
					 System.out.println("Add Passenger at Beginning");
					 System.out.println("Enter Name to add = ");
					 String name=sc.next();
					 ll.addFirst(name);
					 System.out.println(name+" Added Successfully");
					break; 
				 }
				 case 2:{
					 System.out.println("2. Add Passenger at End");
					 System.out.println("Enter Name to end = ");
					 String name=sc.next();
					 ll.addLast(name);
					 System.out.println(name+" Added Successfully");
					break; 
				 }
				 case 3:{
					 System.out.println("3. Remove First Passenger");
					 String name=ll.removeFirst();
					 System.out.println(name+"Removed at First");
					 
					break; 
				 }
				 case 4:{
					 System.out.println("4. Remove Last Passenger");
					 String name=ll.removeLast();
					 System.out.println(name+"Removed at last");
					break; 
				 }
				 case 5:{
					 System.out.println("5. Search Passenger");
					 String name=sc.next();
					 System.out.println(" Found at Index"+ll.indexOf(name));
					break; 
				 }
				 case 6:{
					 System.out.println("6. Displaying Passengers");
					 
					 for(String s:ll) {
						 System.out.println(s);
					 }
					break; 
				 }
				 case 7:{
					 System.out.println("7. Exit");
					 System.exit(0);
					 sc.close();
					break; 
				 }
				 default:
					 System.out.println("Invalid");
			 }
		}
	}
}
