package org.nstern.demos.dto;

public class Book {

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private BookType bookType;
    private String title;
    private String author;
    private String isbn;
    private float price;

    public static class BookBuilder {

        private Book book = new Book();

        public BookBuilder withType(BookType t) {
            book.setBookType(t);
            return this;
        }

        public BookBuilder withAuthor(String s) {
            book.setAuthor(s);
            return this;
        }

        public BookBuilder withTitle(String s) {
            book.setTitle(s);
            return this;
        }

        public BookBuilder withIsbn(String s) {
            book.setIsbn(s);
            return this;
        }

        public BookBuilder withPrice(float i) {
            book.setPrice(i);
            return this;
        }

        public Book build() {
            return book;
        }
    }


}
