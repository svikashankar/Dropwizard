package com.vcexchange.service;

import com.vcexchange.entity.Book;
import com.vcexchange.persistence.IBookRepo;

import java.util.List;

public class BookService implements IBookService {

    private IBookRepo bookRepo;

    public BookService(IBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.getAll();
    }
//Returns only one title which we give in the path
    @Override
    public Book getOne(String isbn){
        return bookRepo.getOne(isbn);
    }
    @Override
    public String removeBooks(String isbn){
        return bookRepo.removeBooks(isbn);
    }
}
