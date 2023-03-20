package com.wavemaker.model;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID")
    private int bookId;
    @Column(name = "BOOK_NAME")
    private String bookName;
    @Column(name = "BOOK_GENRE")
    private String bookGenre;
    @ManyToOne(fetch = FetchType.EAGER)
    private AuthorDetails authorDetails;
    @Column(name = "BOOK_DESC")
    private String bookDesc;
    @Column(name = "PRICE")
    private float price;
    @Column(name = "STOCK")
    private int Stock;

    public Book(String bookName, String bookGenre, String bookDesc, float price, int Stock) {
        this.bookName = bookName;
        this.bookGenre = bookGenre;
        this.bookDesc = bookDesc;
        this.price = price;
        this.Stock = Stock;
    }

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public AuthorDetails getAuthorDetails() {
        return authorDetails;
    }

    public void setAuthorDetails(AuthorDetails authorDetails) {
        this.authorDetails = authorDetails;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }


    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                ", authorDetails='" + authorDetails + '\'' +
                ", bookDesc='" + bookDesc + '\'' +
                ", price=" + price +
                ", noOfCopies=" + Stock +
                '}';
    }
}
