package assignment1;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the price = ");
	    int p=sc.nextInt();
	    System.out.print("Enter intrest rate = ");
	    int r=sc.nextInt();
	    System.out.print("Enter time = ");
	    int t=sc.nextInt();
	    double si=(p*t*r)/100;
	    int a=(int)si+p;
	    System.out.print("Simple interest is = "+a);
	    sc.close();
	}
}
