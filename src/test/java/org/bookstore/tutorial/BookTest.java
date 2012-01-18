package org.bookstore.tutorial;

import junit.framework.*;

public class BookTest extends TestCase {
	
	public void testBook() {
		Book b = new Book();
		assertEquals("unknown author", b.getBookAuthor());
		assertEquals(0.0, b.getBookPrice());
	}

	public void testSetBookTitle() {
		Book b = new Book();
		b.setBookTitle("Programming Ruby: The Pragmatic Programmers' Guide");
		assertEquals("Programming Ruby: The Pragmatic Programmers' Guide", b.getBookTitle());
	}

	public void testSetBookAuthor() {
		Book b = new Book();
		b.setBookAuthor("Dave Thomas");
		assertEquals("Dave Thomas", b.getBookAuthor());
	}

	public void testSetBookFormat() {
		Book b = new Book();
		b.setBookFormat("E-Book");
		assertEquals("E-Book", b.getBookFormat());
	}	
	
	public void testSetBookPrice() {
    fail("Not yet implemented");
	}

}
