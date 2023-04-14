public class Book {
   private String booksName;
   private int yearOfPublicationOfTheBook;
   private Author author;

    public Book(String booksName, int yearOfPublicationOfTheBook, Author author) {
        this.booksName = booksName;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.author = author;
    }

    public String getBooksName() {
        return booksName;
    }

    public int getYearOfPublicationOfTheBook() {
        return yearOfPublicationOfTheBook;
    }

     public Author getAuthor() {
        return author;
    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }
}
