package assignment2;

import java.util.Scanner;

public class ProductDiscount {
	static Scanner sc = new Scanner(System.in);
    public static double fp(double cp){
        if(cp>=10000){
            return cp-(cp*0.2);
        }
        else if(cp<10000 && cp>=5000){
            return cp-(cp*0.1);
        }
        else if(cp<5000 && cp>=2000){
            return cp-(cp*0.05);
        }
        return cp;
    }
    public static void main(String[] args) {
        double cp=sc.nextDouble();
        System.out.println(fp(cp));
    }
}
