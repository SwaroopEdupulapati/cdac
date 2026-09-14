package exam;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
class Book{
	int id;
	String name;
	float price;
	Book(int id,String name,	float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display() {
		System.out.println(id+"\t"+name+"\t"+price);
	}
}*/
public class q4 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fw=new FileOutputStream("hi.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fw);
		
	}
}
