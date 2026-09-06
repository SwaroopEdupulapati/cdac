package assignment4;
class product{
    int productid;
    String name;
    double price;
    int quantity;
    product(int i,String n,double p,int q){
        productid=i;
        name=n;
        price=p;
        quantity=q;
    }
    public void display(){
        System.out.println(productid);
        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);

    }
    public void bill(){
        double dis=0;
        if(price*quantity >10000){
           dis=price*quantity*0.1; 
        }
        else{
            dis=0;
        }
        System.out.println("product id :"+productid);
        System.out.println("name of the product"+name);
        System.out.println("price of the product"+price);
        System.out.println("quantity of the product"+quantity);
        System.out.println("total amount before discount"+(quantity*price));
        System.out.println("discount applied"+dis);
        System.out.println("PRICE AFTER DISCOUNT"+(quantity*price-dis));


        
    }
}

public class ProductDemo {
    public static void main(String[]args){
        product p = new product(101,"laptop",90000.0,4);
        p.display();
        p.bill();
        product p1 = new product(102,"iphone",90000.0,3);
        p1.display();
        p1.bill();
        product p2 = new product(103,"macbook",100000,2);
        p2.display();
        p2.bill();
    }
}
