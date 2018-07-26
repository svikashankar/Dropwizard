//*********8COLLECTION OF ABSTRACT METHODS
package com.vcexchange.persistence;

import com.vcexchange.entity.Book;

import java.util.List;

public interface IBookRepo {
    List<Book> getAll();

    Book getOne(String isbn);

    String removeBooks(String isbn);

    void addBook(Book book);
    String updateBook(Book book);
}
