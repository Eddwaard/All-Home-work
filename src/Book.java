public class Book {
   private String booksName;
   private int yearOfPublicationOfTheBook;

    public Book(String booksName, int yearOfPublicationOfTheBook) {
        this.booksName = booksName;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }

    public String getBooksName() {
        return this.booksName;
    }

    public int getYearOfPublicationOfTheBook() {
        return this.yearOfPublicationOfTheBook;
    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }
}
