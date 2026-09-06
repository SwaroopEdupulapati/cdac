package assignment4;

class Employee{
    int empId;
    String empName;
    int salary;
    public void read(int empId,String empName, int salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }
    public void display(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(salary);
    }
    public void bonus(){
        if(salary>=50000){
            System.out.println(empName+"-> salary "+salary+ "\n\t -> Bonus "+salary*0.1+"\n\t total ->"+(salary+salary*0.1));
        }        
        else{
            System.out.println(empName+"-> salary "+salary+ "\n\t -> Bonus "+salary*0.05+"\n\ttotal ->"+(salary+salary*0.05));
        }

    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        emp1.read(420,"pardha",100000);
        emp2.read(840,"swaroop",20000);
        emp3.read(120,"CDAC SAI",99999);
        emp1.display();
        emp2.display();
        emp3.display();
        emp1.bonus();
        emp2.bonus();
        emp3.bonus();
        
    }
}
