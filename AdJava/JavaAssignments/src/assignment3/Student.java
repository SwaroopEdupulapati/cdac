package assignment3;
import java.util.Scanner;
public class Student {
    int sid;
    String name;
    int marks;
    Student(int sid,String name,int marks){
        this.name=name;
        this.sid=sid;
        this.marks=marks;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student[] als= new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details for student "+(i+1));
            Student s=new Student(sc.nextInt(),sc.next(),sc.nextInt());
            als[i]=s;
        }
        System.out.println("");
        int max=0;
        // for(Student s:als){
        //     if (s.marks >max){
        //         max=s.marks;
        //     }
        // }
        Student ms=null;
        for(Student s:als){
            if (s.marks >max){
                max=s.marks;
                ms=s;
            }
        }
        System.out.println("Max marks are = "+ms.marks);
        System.out.println("Name are = "+ms.name);

        sc.close();
    }
}