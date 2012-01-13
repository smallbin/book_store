package org.bookstore.tutorial;

import junit.framework.TestCase;

public class BookStoreTest extends TestCase {

	public void testBookStore() {
		BookStore bs = new BookStore();
		assertEquals(0, bs.getBookCount());
		assertEquals(true, bs.bookInventory.isEmpty());
	}

	public void testGetBookCount() {
		BookStore bs = new BookStore();
		Book b = new Book();
		b.setBookTitle("Programming Ruby: The Pragmatic Programmers' Guide");
		b.setBookPrice(9.99);
		bs.addBook(b);
		
		assertEquals(1, bs.getBookCount());
	}

	public void testInventory() {
		BookStore bs = new BookStore();
		Book b = new Book();
		b.setBookTitle("Programming Ruby: The Pragmatic Programmers' Guide");
		b.setBookPrice(9.99);
		bs.addBook(b);
		Book a = new Book();
		
		assertEquals(true, bs.bookInventory.contains(b));
		assertEquals(false, bs.bookInventory.contains(a));
		
		bs.removeBook(b);
		assertEquals(false, bs.bookInventory.contains(b));
	}

}
