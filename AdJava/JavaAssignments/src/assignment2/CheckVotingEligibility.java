package assignment2;

import java.util.Scanner;

public class CheckVotingEligibility {
	public static boolean isEligible(byte age) {
		if(age >= 18) {
			return true;

		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte age = s.nextByte();
		if(isEligible(age)) {
			System.out.println("Eligible to vote");
		}
		else
			System.out.println("Not Eligible to vote");
		s.close();
	}
}
