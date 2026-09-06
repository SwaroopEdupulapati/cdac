package assignment3;
import java.util.Scanner;
public class MultiplicationTable {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    mot(n);
    sc.close();
   } 
   public static void mot(int n){
    int r=0;
    for(int i=1;;i++){
        r=i*n;
        System.out.println(r);
    }
   }
}
