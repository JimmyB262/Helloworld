package org.example;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer  id;

    private String title;
    private String author;
    private boolean stock;

    public Book(Integer id, String author, boolean stock, String title) {
        this.id = id;
        this.author = author;
        this.stock = stock;
        this.title = title;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
