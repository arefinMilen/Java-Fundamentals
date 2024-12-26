/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LIbraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public List<Book> getBorrowedBooks() {
        List<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isBorrowed()) {
                borrowedBooks.add(book);
            }
        }
        return borrowedBooks;
    }
}

public class LibraryManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        System.out.println("Welcome to the Library Management System!");
        int choice;
        do {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Search for a book");
            System.out.println("5. Borrow a book");
            System.out.println("6. Return a book");
            System.out.println("7. Display borrowed books");
            System.out.println("8. Quit");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    displayAllBooks();
                    break;
                case 4:
                    searchBooks();
                    break;
                case 5:
                    borrowBook();
                    break;
                case 6:
                    returnBook();
                    break;
                case 7:
                    displayBorrowedBooks();
                    break;
                case 8:
                    System.out.println("Thank you for using the Library Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }

    private static void addBook() {
        System.out.println("\nAdding a Book");
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author name: ");
        String author = scanner.nextLine();

        Book newBook = new Book(title, author);
        library.addBook(newBook);

        System.out.println("Book added successfully!");
    }

    private static void removeBook() {
    System.out.println("\nRemoving a Book");
    System.out.print("Enter the book title: ");
    String title = scanner.nextLine();
    System.out.print("Enter the author name: ");
    String author = scanner.nextLine();

    List<Book> books = library.getAllBooks();
    Book bookToRemove = null;
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
            bookToRemove = book;
            break;
        }
    }

    if (bookToRemove != null) {
        library.removeBook(bookToRemove);
        System.out.println("Book removed successfully!");
    } else {
        System.out.println("Book not found in the library.");
    }
}

private static void displayAllBooks() {
    System.out.println("\nAll Books in the Library:");
    List<Book> books = library.getAllBooks();
    if (books.isEmpty()) {
        System.out.println("No books available in the library.");
    } else {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor()
                    + ", Status: " + (book.isBorrowed() ? "Borrowed" : "Available"));
        }
    }
}

private static void searchBooks() {
    System.out.print("\nEnter the keyword to search: ");
    String keyword = scanner.nextLine();

    List<Book> searchResults = library.searchBooks(keyword);
    if (searchResults.isEmpty()) {
        System.out.println("No books found matching the keyword.");
    } else {
        System.out.println("\nSearch Results:");
        for (Book book : searchResults) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor()
                    + ", Status: " + (book.isBorrowed() ? "Borrowed" : "Available"));
        }
    }
}

private static void borrowBook() {
    System.out.print("\nEnter the book title: ");
    String title = scanner.nextLine();
    System.out.print("Enter the author name: ");
    String author = scanner.nextLine();

    List<Book> books = library.getAllBooks();
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
            if (book.isBorrowed()) {
                System.out.println("Book is already borrowed.");
            } else {
                book.setBorrowed(true);
                System.out.println("Book borrowed successfully!");
            }
            return;
        }
    }

    System.out.println("Book not found in the library.");
}

private static void returnBook() {
    System.out.print("\nEnter the book title: ");
    String title = scanner.nextLine();
    System.out.print("Enter the author name: ");
    String author = scanner.nextLine();

    List<Book> books = library.getAllBooks();
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
            if (book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Book is not currently borrowed.");
            }
            return;
        }
    }

    System.out.println("Book not found in the library.");
}

private static void displayBorrowedBooks() {
    System.out.println("\nBorrowed Books:");
    List<Book> borrowedBooks = library.getBorrowedBooks();
    if (borrowedBooks.isEmpty()) {
        System.out.println("No books are currently borrowed.");
    } else {
        for (Book book : borrowedBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
}
