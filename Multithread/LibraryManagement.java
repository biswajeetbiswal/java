import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String ISBN;
    private String publisher;
    private int publicationYear;
    private Author author;

    public Book(String title, String ISBN, String publisher, int publicationYear, Author author) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }
}

class Author {
    private String designation;
    private String organization;
    private String country;

    public Author(String designation, String organization, String country) {
        this.designation = designation;
        this.organization = organization;
        this.country = country;
    }

    public String getDesignation() {
        return designation;
    }

    public String getOrganization() {
        return organization;
    }

    public String getCountry() {
        return country;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void searchBooksByAuthor(String authorName) {
        boolean found = false;

        for (Book book : books) {
            if (book.getAuthor().getOrganization().equalsIgnoreCase(authorName)) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Publisher: " + book.getPublisher());
                System.out.println("Publication Year: " + book.getPublicationYear());
                System.out.println("Author Designation: " + book.getAuthor().getDesignation());
                System.out.println("Author Organization: " + book.getAuthor().getOrganization());
                System.out.println("Author Country: " + book.getAuthor().getCountry());
                System.out.println("----------------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found for the given author name.");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding sample books
        Author author1 = new Author("Author1 Designation", "Author1 Organization", "Author1 Country");
        Book book1 = new Book("C", "ISBN1", "R K Sarma", 2021, author1);
        library.addBook(book1);

        Author author2 = new Author("Author2 Designation", "Author2 Organization", "Author2 Country");
        Book book2 = new Book("C++", "ISBN2", "R Purahit", 2022, author2);
        library.addBook(book2);

        Author author3 = new Author("Author3 Designation", "Author3 Organization", "Author3 Country");
        Book book3 = new Book("JAVA", "ISBN3", "S Jena", 2023, author3);
        library.addBook(book3);

        // Searching books by author
        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();
        library.searchBooksByAuthor(authorName);

        scanner.close();
    }
}
