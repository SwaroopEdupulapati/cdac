package assignment1;

import java.util.Scanner;

public class StudentResult {
	 public static void main(String[]args){
	        Scanner sc = new Scanner(System.in);

	        int marks=sc.nextInt();
	        if(marks>=40){
	            System.out.println("he passed in his exam");
	        }
	        else{
	           System.out.println("he not passed in his exam"); 
	        }
	        sc.close();
	    }
}
