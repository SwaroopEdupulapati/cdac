package assignment4;
class bill{
    int cno;
    String name;
    int units;
    bill(int cno,String name,int units){
        this.cno=cno;
        this.name=name;
        this.units=units;
    }
    public  double elec(){
        double d=0;
        if(units>=0&&units<=100){
            d=2*units;
        }
         else if(units>100&&units<=200){
            d=3*units;
        }
         else if(units>200&&units<=300){
            d=5*units;
        }
         else if(units>300){
            d=7*units;
        }
        return d;
    }
    void display(){
        System.out.println(cno);
        System.out.println(name);
        System.out.println(units);
        System.out.print(elec());
    }   

}
public class ElectricityDemo {
    public static void main(String[] args) {
        bill b1=new bill(1,"pardhu",30);
        bill b2=new bill(2,"swaroop",101);
        bill b3=new bill(3,"cdacsai",201);
        bill b4=new bill(1,"ajaaaya",3001);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }

}
