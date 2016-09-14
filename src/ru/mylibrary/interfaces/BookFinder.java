package ru.mylibrary.interfaces;

import ru.mylibrary.obj.Author;
import ru.mylibrary.obj.Book;

import java.util.List;

/**
 * Created by Vladimir on 14.09.16.
 */
public interface BookFinder {

    List<Book> getBook();
    List<Book> getBook(Author author);
    List<Book> getBook(String bookname);


}
