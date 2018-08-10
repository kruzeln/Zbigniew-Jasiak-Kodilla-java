package com.kodilla.testing.library;

import static org.mockito.Mockito.verify;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditiosReturnBook(){
      //  assertTrue(false);
        //G
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultsListOfBook = new ArrayList<>();
        Book book1 = new Book("secrets of Alamo", "John Smith, ", 2008);
        Book book2 = new Book("Secretaries and Direct", "Dilbert Michigan", 2012 );
        Book book3 = new Book("Secret life of ..", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewtch", 2010);
        Book book5 = new Book("Tyrannus", "Cicero", 1);
        resultsListOfBook.add(book1);
        resultsListOfBook.add(book2);
        resultsListOfBook.add(book3);
        resultsListOfBook.add(book4);
        resultsListOfBook.add(book5);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultsListOfBook);

        //w
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //T
        //Assert.assertEquals(4, theListOfBooks.size());

    }

    @Test
    public void testListBooksWithConditionMoreThen20(){
        //G
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("Forty books"))
                .thenReturn(resultListOf40Books);

        //W
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any Title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("Forty books");

        //T
        Assert.assertEquals(0, theListOfBooks0);
        Assert.assertEquals(15, theListOfBooks15);
        Assert.assertEquals(0, theListOfBooks40);
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThen3(){
        //G
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resulltListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resulltListOf10Books);

        //W
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //T
        Assert.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

    }

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author "+ n, 1970 + n );
            resultList.add(theBook);
        }
        return resultList;
    }
}
