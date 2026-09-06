package assignment2;

import java.util.Scanner;

public class SimpleCalculator {
	public static int calculate(int a,int b,char c) {
		int res = 0;
		if(c == '+') {
			res = a + b;
		}
		else if(c == '-') {
			res = a - b;
		}
		else if(c == '*') {
			res = a * b;
		}
		else if(c == '/') {
			if(b == 0) {
				System.out.println("Enter a non zero value");
			}
			else{
				res = a / b;
			}
		}
		else if(c == '%') {
			res = a % b;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		char c=sc.next().charAt(0);
		
		System.out.println(calculate(a, b, c));
		sc.close();
	}
}
