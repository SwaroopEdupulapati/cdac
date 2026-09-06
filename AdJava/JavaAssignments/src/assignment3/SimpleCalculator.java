package assignment3;
import java.util.Scanner;
public class SimpleCalculator {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    char op=sc.next().charAt(0);
    calc(n1,n2,op);
    sc.close();
   }
   public static void calc(int n1,int n2,char op){
      if(op=='+'){
         System.out.println(n1+n2);
      }
      else if (op=='-'){
         System.out.println(n1-n2);
      }
      else if (op=='*'){
         System.out.println(n1*n2);
      }
      else if (op=='/'){
         System.out.println(n1/n2);
      }
      else if (op=='%'){
         System.out.println(n1%n2);
      }
      else{
         System.out.println("Invalif operation");
      }
   }
}