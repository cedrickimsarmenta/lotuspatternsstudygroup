package com.mock.blessie;

/**
 * Created by blessie on 07/06/2017.
 */
public class BookManager {

    private BookStore bookStore;

    public String displayBookDetails(long bookId){
        try{
            Book b = bookStore.getBook(bookId);
            return b.toString();
        } catch (Exception e){
            System.out.println("An exception occurred: " + e.getMessage());
            throw e;
        }
    }

    public void setBookStore(BookStore bookStore){
        this.bookStore = bookStore;
    }
}
