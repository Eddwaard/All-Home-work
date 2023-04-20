import java.util.Objects;

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

    @Override
    public String toString() {
        return this.author + " Название книги: " + this.booksName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublicationOfTheBook == book.yearOfPublicationOfTheBook && booksName.equals(book.booksName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booksName, yearOfPublicationOfTheBook, author);
    }
}
