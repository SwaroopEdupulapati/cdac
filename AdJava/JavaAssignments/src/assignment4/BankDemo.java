package assignment4;

class BankAccount{
    int accountNo;
    String customerName;
    double balance;
    BankAccount(int accountNo,String customerName,double balance){
        this.accountNo=accountNo;
        this.customerName=customerName;
        this.balance=balance;
    }
    void display(){
        System.out.println(accountNo);
        System.out.println(customerName);
        System.out.println(balance);
        intrest();
    }
    void intrest(){
        if(balance>=100000){
            System.out.println(customerName+ " -> Intrest "+balance*0.07+" -> total = "+(balance+balance*0.07));
        }
        else if(balance>=50000){
            System.out.println(customerName+" -> Intrest "+balance*0.06+" -> total = "+(balance+balance*0.06));
        }
        else{
            System.out.println(customerName+" -> Intrest "+balance*0.05+" -> total = "+(balance+balance*0.05));
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount ac1=new BankAccount(1, "pardha", 100000);
        BankAccount ac2=new BankAccount(2, "cdacsai", 60000);
        BankAccount ac3=new BankAccount(3, "swaroop", 49999);
        ac1.display();
        ac2.display();
        ac3.display();
    }
    
}
