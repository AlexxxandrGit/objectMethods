import java.util.Objects;

public class Book {

    private final String nameOfTheBook;
    private final Author author;
    private int yearOfPublicationOfTheBook;


    public Book(String nameOfBook, Author author, int yearOfPublicationOfTheBook) {
        this.nameOfTheBook = nameOfBook;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.author = author;
    }

    public String getNameOfTheBook() {

        return nameOfTheBook;
    }

    public int getYearOfPublicationOfTheBook() {

        return yearOfPublicationOfTheBook;
    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;

    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", author=" +author.toString()+
                ", yearOfPublicationOfTheBook=" + yearOfPublicationOfTheBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublicationOfTheBook == book.yearOfPublicationOfTheBook && Objects.equals(nameOfTheBook, book.nameOfTheBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, author, yearOfPublicationOfTheBook);
    }
}



