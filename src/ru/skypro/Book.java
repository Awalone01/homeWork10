package ru.skypro;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String bookName;
    private int releaseOfYear;


    public Book(String bookName, Author author,int releaseOfYear) {
        this.bookName = bookName;
        this.author = author;
        this.releaseOfYear = releaseOfYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getReleaseOfYear() {
        return this.releaseOfYear;
    }

    public void setReleaseOfYear(int releaseOfYear) {
        this.releaseOfYear = releaseOfYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", bookName='" + bookName + '\'' +
                ", releaseOfYear=" + releaseOfYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return releaseOfYear == book.releaseOfYear &&
                Objects.equals(author, book.author) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, releaseOfYear);
    }
}
