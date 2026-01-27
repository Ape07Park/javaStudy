package chepter3.nested.nested.test.ex1;

public class Library {

	private int max;

	private Book[] books = new Book[max];

	private int count = 0;


	public Library(int max) {
		this.max = max;
	}


	public void addBook(String title, String author) {

		Book book = new Book(title, author);

		if (count == max) {
			System.out.println("도서관 저장 공간 부족");
			return;
		}

		books[count] = book;

		count++;
	}


	public void showBooks() {


	}

	class Book {

		private String title;

		private String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
	}
}
