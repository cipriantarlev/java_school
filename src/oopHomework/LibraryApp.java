package oopHomework;

public class LibraryApp {

	public static void main(String[] args) {
		
		LibraryCatalog catalog = new LibraryCatalog();
		
		Book newBook = new Book("Bucuresti", 280);
		
		catalog.addBook(newBook);
		catalog.addBook(new Book ("Constanta", 385));
		
		catalog.printAllBooks();
		
		if (catalog.deleteBookByName("Bucuresti") == true) {
			System.out.println("A fost stearsa cartea Bucuresti");
		}else {
			System.out.println("Ne pare rau nu am gasit aceasta carte");
		}
		
		catalog.printAllBooks();
		
		if (catalog.deleteBookByName("Bucuresti") == true) {
			System.out.println("A fost stearsa cartea Bucuresti");
		}else {
			System.out.println("Ne pare rau nu am gasit aceasta carte");
		}
		
//		Book newBook = new Book("Bucuresti",360);
//		System.out.println(newBook.showBook()); 
//		
//		newBook.setBookName("Constanta");
//		System.out.println(newBook.showBook());
//		
//		System.out.println(newBook.getPageNumber());
	}
}
