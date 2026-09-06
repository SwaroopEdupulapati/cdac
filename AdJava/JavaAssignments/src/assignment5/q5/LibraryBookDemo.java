package assignment5.q5;

class Book {
	int bookId;
	String title;
	String author;
	float price;
	Book(int bookId, String title, String author, float price) {
	
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayBook() {
		System.out.println("Book Id : " + bookId);
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}
}

class Library {
	String libraryName;
	String location;
	Book book;
	Library(String libraryName, String location, Book book) {
		this.libraryName = libraryName;
		this.location = location;
		this.book = book;
	}
	void libraryDisplay() {
		System.out.println("Library Name : " +libraryName);
		System.out.println("Location : " +location);
		book.displayBook();
	}
	
}

public class LibraryBookDemo {
	public static void main(String[] args) {
		Book b = new Book(14, "Naa Saavu nenu sastha niku endhuku", "Keerthan", 999);
		Library l = new Library("CDAC", "Electronic City", b);
		l.libraryDisplay();
		
	}
}
