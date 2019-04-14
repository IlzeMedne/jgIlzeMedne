package lv.homework.lesson5;

import java.util.Objects;

public class Book {

    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book that = (Book) obj;
        return Objects.equals(author, that.author) &&
                Objects.equals(title, that.title) &&
                Objects.equals(pageCount, that.pageCount);
    }

    @Override
    public String toString() {
        return "Book: {" +
                "author = " + author +
                ", title = " + title +
                ", page count = " + pageCount + "}";
    }
}

