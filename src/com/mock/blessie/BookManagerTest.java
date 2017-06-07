package com.mock.blessie;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by blessie on 07/06/2017.
 */
public class BookManagerTest {
    @Test
    public void displayBookDetails() throws Exception {
        BookManager manager = new BookManager();

        long id = 1;
        String details = "Mockbook details";
        Book mockBook = mock(Book.class);
        when(mockBook.toString()).thenReturn(details);

        BookStore mockBookStore = mock(BookStore.class);
        when(mockBookStore.getBook(id)).thenReturn(mockBook);
        manager.setBookStore(mockBookStore);

        assertEquals(details, manager.displayBookDetails(id));
    }

    @Test(expected=Exception.class)
    public void displayBookDetailsWithException() {
        BookManager manager = new BookManager();

        long id = 1;
        BookStore mockBookStore = mock(BookStore.class);
        Exception e = new ArrayIndexOutOfBoundsException();
        doThrow(e).when(mockBookStore.getBook(id));
//        when(mockBookStore.getBook(id)).thenReturn(new Book());

        manager.setBookStore(mockBookStore);
        manager.displayBookDetails(id);
    }

}