package com.vcexchange.service;

import com.vcexchange.entity.Book;

import java.util.List;

public interface IBookService {

    List<Book> getAll();

    Book getOne(String isbn);

    String removeBooks(String isbn);
}
