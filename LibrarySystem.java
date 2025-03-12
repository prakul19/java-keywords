import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for first book
        System.out.print("Enter ISBN for first book: ");
        String isbn1 = scanner.nextLine();

        System.out.print("Enter Title for first book: ");
        String title1 = scanner.nextLine();

        System.out.print("Enter Author for first book: ");
        String author1 = scanner.nextLine();

        Book book1 = new Book(isbn1, title1, author1);

        // Input details for second book
        System.out.print("Enter ISBN for second book: ");
        String isbn2 = scanner.nextLine();

        System.out.print("Enter Title for second book: ");
        String title2 = scanner.nextLine();

        System.out.print("Enter Author for second book: ");
        String author2 = scanner.nextLine();

        Book book2 = new Book(isbn2, title2, author2);

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();

        Book.displayLibraryName();

        scanner.close();
    }
}

class Book {
    private static String libraryName = "City Library"; // Static variable
    private final String isbn; // Final variable (cannot be changed)
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        if (this instanceof Book) { // Using instanceof
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

/*
Input:
Enter ISBN for first book: 978-3-16-148410-0
Enter Title for first book: Java Programming
Enter Author for first book: RK Singh
Enter ISBN for second book: 978-0-262-13472-9
Enter Title for second book: Data Structures
Enter Author for second book: SP Shukla

Output:
Library: City Library
ISBN: 978-3-16-148410-0
Title: Java Programming
Author: RK Singh
Library: City Library
ISBN: 978-0-262-13472-9
Title: Data Structures
Author: SP Shukla
Library Name: City Library
*/
