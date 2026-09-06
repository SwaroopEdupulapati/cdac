package assignment3;
import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		//int n1=sc.nextInt();

		sd(n);
		sc.close();

	}
	public static void sd(int n){
		int r1=0;
		while(n>0){
			int rem=n%10;
			r1=r1+rem;
			n=n/10;
		}
		System.out.print(r1);

	}
}