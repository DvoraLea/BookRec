package com.dvora.bookrecommendation;

public class Book {
    private String title;
    private String author;
    private String genre;
    private double rating;

    // Constructor
    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    // To String
    @Override
    public String toString() {
        return title + " by " + author + " (" + genre + ", Rating: " + rating + ")";
    }
}
