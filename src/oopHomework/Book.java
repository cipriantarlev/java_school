package oopHomework;

public class Book {

	private String bookName;
	private int pageNumber;
	
	public Book (String bookName, int newPageNumber) {
		this.bookName = bookName;
		pageNumber = newPageNumber;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	public void setBookName (String bookName) {
		this.bookName = bookName;
	}
	
	public void setPageNumber (int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public String showBook() {
		return "Cartea " + bookName + " are " + pageNumber + " de pagini";
	}
}
