package org.firststep.tutorial;
import java.util.ArrayList;

public class BookStore {
	
	//fields
	int bookCount;
	ArrayList<Book> bookInventory;
	
	//constructor
	public BookStore()	{
		bookCount = 0;
		bookInventory = new ArrayList<Book>();
	}
	
	//methods
	public int getBookCount() {
		return bookCount;
	}
	
	public void addBook(Book b) {
		bookCount += 1;
		bookInventory.add(b);
	}
	
	public void removeBook(Book b) {
		if(bookInventory.contains(b)) {
			bookCount -= 1;
			
			int index = bookInventory.indexOf(b);
			bookInventory.remove(index);
		}
	}
}
