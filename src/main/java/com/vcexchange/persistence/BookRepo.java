//******** UPDATE DELETE POST PUT
package com.vcexchange.persistence;

import com.vcexchange.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepo implements IBookRepo {

//    TO GET ALL THE BOOK LIST
    private List<Book> books = setBooks(); //BOOK isbn and title WILL BE STORED IN books

    public List<Book> getAll() {
        return books;//ALL THE BOOK NAMES WILL BE RETURNED FROM HERE
    }
//Data WHICH IS STORED
    private List<Book> setBooks(){
        List<Book> sach = new ArrayList();
        sach.add(new Book("1492251275", "The Purloined Letter"));
        sach.add(new Book("1495375749", "The black cat"));
        sach.add(new Book("1467746150", "The Raven"));
        sach.add(new Book("1495375744", "The vikas"));
        sach.add(new Book("1467746155", "The Kien"));
        return sach;
    }


//    TO GET ONE INFORMATION
    public Book getOne(String isbn){
        //ENHANCED LOOP
        for(Book book: books){
            if(book.getIsbn().equals(isbn))// isbn== param isbn then it returns the value
            return book;
        }
        return null;
//return "failure";
    }

//    DELETE
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
//Post wont returns ANYTHING SO IT MUST BE VOID
    public void addBook(Book book){
        books.add(book);
    }

    //PUT
  public String updateBook(Book input){
//        ENHANCED LOOP
        for(Book book:books){
            if(book.getIsbn().equals(input.getIsbn()))//ISBN == Param isbn then it updates the titlde
            {
                book.setTitle(input.getTitle());
                return "succeed";
            }
        }
        return "failure";
  }

}
