package lv.homework.lesson5;

import java.util.Objects;

public class Book {

    private String author;
    private String title;
    private int pageCount;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

//lieka rinda
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book that = (Book) obj;
        return Objects.equals(author, that.author) &&
                Objects.equals(title, that.title) &&
                Objects.equals(pageCount, that.pageCount);
//lieka rinda
    }

    @Override
    public String toString() {
        return "Book: {" +
                "author = " + author +
                ", title = " + title +
                ", page count = " + pageCount + "}";
    }
}

