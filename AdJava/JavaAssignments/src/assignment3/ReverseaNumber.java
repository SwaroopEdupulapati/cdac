package assignment3;
import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ran(n);
		sc.close();

	}
	public static void ran(int n){
		int r1=0;
		while(n>0){
			int rem=n%10;
			r1=r1*10+rem;
			n=n/10;
		}
		System.out.print(r1);

	}
	

}
