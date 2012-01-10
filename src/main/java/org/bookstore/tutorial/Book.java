package org.firststep.tutorial;
import java.util.Random;

public class Book {
	// fields
	String bookTitle;
	String bookAuthor;
	double bookPrice;
	String bookFormat;
	int bookId;
	
	// constructor
	public Book(){
		bookTitle = "unknown title";
		bookAuthor = "unknown author";
		bookPrice = 0.0;
		bookFormat = "unknown format";
		
		Random rand = new Random();
		bookId = rand.nextInt();
	}
	
	// getters and setters
	public String getBookTitle() {
		return this.bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookFormat() {
		return bookFormat;
	}

	public void setBookFormat(String bookFormat) {
		this.bookFormat = bookFormat;
	}

}
