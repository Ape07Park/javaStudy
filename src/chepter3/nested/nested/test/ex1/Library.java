package chepter3.nested.nested.test.ex1;

public class Library {

	private int max;

	private Book[] books;

	private int count = 0;

	public Library(int max) {
		books = new Book[max];
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

		for (Book book : books) {
			if (book != null) {
				System.out.println(book.title + " " + book.author);
			}
		}


	}

	// 외부로 노출되면 안되기에 그리고 Library에 속한 것을 사용 X
	// 따라서 private static 달음
	// 만일 Library의 것을 사용 O -> 내부 클래스로
	private static class Book {

		private String title;

		private String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
	}
}
