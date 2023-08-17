import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Author {
    private String name;
    private String designation;
    private String organization;
    private String country;

    public Author(String name, String designation, String organization, String country) {
        this.name = name;
        this.designation = designation;
        this.organization = organization;
        this.country = country;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private String ISBN;
    private String publisher;
    private int publicationYear;
    private List<Author> authors;

    public Book(String title, String ISBN, String publisher, int publicationYear, List<Author> authors) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> foundBooks = new ArrayList<>();

        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getName().equalsIgnoreCase(authorName)) {
                    foundBooks.add(book);
                    break;
                }
            }
        }

        return foundBooks;
    }
}

public class Practical10 {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding books to the library
        Book book1 = new Book("Book 1", "ISBN1", "Publisher 1", 2021, List.of(
                new Author("Author 1", "Designation 1", "Organization 1", "Country 1"),
                new Author("Author 2", "Designation 2", "Organization 2", "Country 2")
        ));
        library.addBook(book1);

        Book book2 = new Book("Book 2", "ISBN2", "Publisher 2", 2022, List.of(
                new Author("Author 3", "Designation 3", "Organization 3", "Country 3"),
                new Author("Author 4", "Designation 4", "Organization 4", "Country 4")
        ));
        library.addBook(book2);

        // Searching books by author name
        System.out.print("Enter author name to search for books: ");
        String authorName = scanner.nextLine();

        List<Book> foundBooks = library.searchBooksByAuthor(authorName);

        if (foundBooks.isEmpty()) {
            System.out.println("No books found for the given author name.");
        } else {
            System.out.println("Books found for the author " + authorName + ":");
            for (Book book : foundBooks) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Publisher: " + book.getPublisher());
                System.out.println("Publication Year: " + book.getPublicationYear());
                System.out.println("Authors:");

                for (Author author : book.getAuthors()) {
                    System.out.println("- Name: " + author.getName());
                    System.out.println("  Designation: " + author.getDesignation());
                    System.out.println("  Organization: " + author.getOrganization());
                    System.out.println("  Country: " + author.getCountry());
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}
