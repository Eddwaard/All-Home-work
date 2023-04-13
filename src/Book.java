public class Book {
   private String booksName;
   private int yearOfPublicationOfTheBook;
    private String author;

    public Book(String booksName, int yearOfPublicationOfTheBook, String author) {
        this.booksName = booksName;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.author = author;
    }

    public String getBooksName() {
        return this.booksName;
    }

    public int getYearOfPublicationOfTheBook() {
        return this.yearOfPublicationOfTheBook;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }
}
