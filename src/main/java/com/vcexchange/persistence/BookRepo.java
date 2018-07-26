package com.vcexchange.persistence;

import com.vcexchange.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepo implements IBookRepo {

    private List<Book> books = setBooks();

    public List<Book> getAll() {
        return books;
    }

    private List<Book> setBooks(){
        List<Book> sach = new ArrayList();
        sach.add(new Book("1492251275", "The Purloined Letter"));
        sach.add(new Book("1495375749", "The black cat"));
        sach.add(new Book("1467746150", "The Raven"));
        sach.add(new Book("1495375744", "The vikas"));
        sach.add(new Book("1467746155", "The Kien"));
        return sach;
    }

    public Book getOne(String isbn){
        for(Book book: books){
            if(book.getIsbn().equals(isbn))
            return book;
        }
        throw new NullPointerException("Can't find the book");
//return "failure";
    }

    public String removeBooks(String isbn){
//objecttype variable:
//       Enhanced loop
        for(Book book: books){
            if(book.getIsbn().equals(isbn))
                books.remove(book);
                return  "succeed";
        }
        return "failure";
    }
}
