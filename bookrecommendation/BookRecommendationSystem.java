package com.dvora.bookrecommendation;

import java.util.ArrayList;
import java.util.Scanner;

public class BookRecommendationSystem {
    private ArrayList<Book> books;
    private Scanner scanner;

    public BookRecommendationSystem() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Book Recommendation System!");
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a book");
            System.out.println("2. View all books");
            System.out.println("3. Recommend books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> recommendBooks();
                case 4 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter rating (0-5): ");
        double rating = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        books.add(new Book(title, author, genre, rating));
        System.out.println("Book added successfully!");
    }

    private void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books added yet.");
        } else {
            System.out.println("Books in the system:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private void recommendBooks() {
        System.out.print("Enter minimum rating for recommendation: ");
        double minRating = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.println("Recommended books:");
        for (Book book : books) {
            if (book.getRating() >= minRating) {
                System.out.println(book);
            }
        }
    }
}
