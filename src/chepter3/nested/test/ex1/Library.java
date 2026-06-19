package chepter3.nested.test.ex1;

public class Library {


    private Book[] books;

    private int capacity;

    private int bookCount;


    public Library(Book[] books) {
        this.books = books;
    }

    public Library(int capacity) {

        books = new Book[capacity];
        this.capacity = capacity;
    }

    public void addBook(String title, String author) {

        // 개수 체크 로직
        if (bookCount== capacity) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

       Book book = new Book(title, author);

        //
        books[bookCount] = book;

        bookCount++;

    }

    public void showBooks() {
        System.out.println("책 목록 출력");

        for (Book book : books) {
            System.out.println(book.title + " " + book.author);
        }
    }



    private static class Book {

        public String title;
        public String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }
}
