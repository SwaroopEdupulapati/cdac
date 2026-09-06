package assignment4;
class student{
    int rollno;
    String name;
    int marks;
    
    public void display(){
        System.out.println("roll no of the student:"+" "+rollno);
        System.out.println("name of the student:"+" "+name);
        System.out.println("marks of the student:"+" "+marks);

    }
    void grade(){
        if(marks>=90){
            System.out.println(name+ " -> Grade A");
        }
        else if(marks>=75){
            System.out.println(name+" -> Grade B");
        }
        else if(marks>=60){
            System.out.println(name+" -> Grade C");
        }
        else{
            System.out.println(name+" -> GRADE D");
        }

    }

}

public class StudentDemo {
    public static void main(String[]args){
        student s1=new student();
        student s2=new student();
        student s3=new student();
        s1.rollno=101;
        s1.name="pardhu";
        s1.marks=100;
        s2.rollno=420;
        s2.name="Swaroop";
        s2.marks=35;
        s3.rollno=102;
        s3.name="cdacsai";
        s3.marks=100;
        s1.display();
        s2.display();
        s3.display();
        s1.grade();
        s2.grade();
        s3.grade();
        

    }
}
