package com.vcexchange.entity;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    @NotNull
    private String isbn;

    private String title;

    public Book() {
    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

//getter of ISBN
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
//    delete

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
