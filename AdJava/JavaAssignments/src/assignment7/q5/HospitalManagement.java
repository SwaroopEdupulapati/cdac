package assignment7.q5;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HospitalManagement {

	public static void main(String[] args) {

		PriorityQueue<String> q = new PriorityQueue<String>();

		Scanner s = new Scanner(System.in);
		int choice;

		while (true) {

			System.out.println("\nOperations");
			System.out.println("1. Add Patient");
			System.out.println("2. Treat Patient");
			System.out.println("3. View Next Patient");
			System.out.println("4. Display Waiting Patients");
			System.out.println("5. Exit");

			System.out.print("Enter the choice: ");
			choice = s.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter patient name: ");
				String name = s.next();
				q.offer(name);
				System.out.println("Patient added: " + name);
				break;

			case 2:
				if (q.isEmpty()) {
					System.out.println("No patients waiting.");
				} else {
					System.out.println("Treating patient: " + q.poll());
				}
				break;

			case 3:
				if (q.isEmpty()) {
					System.out.println("No patients waiting.");
				} else {
					System.out.println("Next patient: " + q.peek());
				}
				break;

			case 4:
				if (q.isEmpty()) {
					System.out.println("No patients waiting.");
				} else {
					System.out.println("Waiting Patients:");
					for (String name1 : q) {
						System.out.println(name1);
					}
				}
				break;

			case 5:
				System.out.println("Exiting...");
				s.close();
				System.exit(0);

			default:
				System.out.println("Enter choice between 1 to 5.");
			}
		}
	}
}
