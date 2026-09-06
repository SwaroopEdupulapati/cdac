package assignment1;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number = ");
	    int n=sc.nextInt();
	    if(n%2==0){
	        System.out.println("even");
	    }
	    else{
	        System.err.println("odd");
	    }
	    sc.close();
	}
}
