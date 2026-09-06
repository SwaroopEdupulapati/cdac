package assignment2;

import java.util.Scanner;

public class BusTicketFare {
	public static int calculateFare(int age) {
		if(age < 5) {
			return 0;
		}
		else if(age >= 5 && age <= 12) {
			return 20;
		}
		else if(age >= 13 && age <= 59) {
			return 40;
		}
		else {
			return 25;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = s.nextInt();
		System.out.println("Bus Fare is : " + calculateFare(age));
		s.close();
		
	}
}
