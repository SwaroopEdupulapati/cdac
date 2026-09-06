package assignment3;
import java.util.Scanner;
public class MaximumandMinimum {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int[] res=mm(arr);
    System.out.println("Min element "+res[0]);
    System.out.println("Max element "+res[1]);
    sc.close();
   } 
   public static int[] mm(int[]arr){
      int min=arr[0];
      int max=arr[0];
      for(int i=0;i<arr.length;i++){
         if(min>arr[i]){
            min=arr[i];
         }
         if(max<arr[i]){
            max=arr[i];
         }
      }
      return new int[]{min,max};
   }
}