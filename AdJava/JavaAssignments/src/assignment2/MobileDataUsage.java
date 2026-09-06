package assignment2;

import java.util.Scanner;

public class MobileDataUsage {
	public static int calculateCharge(int data) {
		if(data<=1) {
			return 50;
		}
		else if(data>1 && data<=5) {
			return 100;
		}
		else if(data>5 && data<=10) {
			return 200;
		}
		else {
			return 350;
		}
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter mobile number : ");
		long mobile=s.nextLong();
		System.out.println("Enter data usage : ");
		int data = s.nextInt();
		System.out.println("Your mobile number is "+mobile+" and the data used is "+data+" .So the charge is "+calculateCharge(data));
		s.close();
		
	}
}
