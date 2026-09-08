package assignment7;

public class Book {
	public int id;
	public String title;
	public String author;
	public int price;
	public Book(int i,String t,String a,int p){
		id=i;
		title=t;
		author=a;
		price=p;
	}
	public void displayBook() {
        System.out.println("-------------------------");
        System.out.println("Book ID : " + id);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
        System.out.println("-------------------------");
    }
}