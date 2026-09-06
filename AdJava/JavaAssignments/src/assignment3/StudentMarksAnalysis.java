package assignment3;
import java.util.*;

public class StudentMarksAnalysis {
	
	public static void markAnalysis(int[] num) {
		int total = 0;

		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		for(int i = 0; i< num.length; i++) {
			total += num[i];
			if(num[i] > high) {
				high = num[i];
			}
			if(num[i] < low) {
				low = num[i];
			}
		}
		float avg = total / num.length;
		System.out.println("Total Marks : " + total);
		System.out.println("Average Marks : " + avg);
		System.out.println("Maximum Marks : " + high);
		System.out.println("Minimum Marks : " + low);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in array : ");
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		markAnalysis(arr);
		s.close();

	}

}
