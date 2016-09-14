package ru.mylibrary.interfaces;

import ru.mylibrary.obj.Book;

/**
 * Created by Vladimir on 14.09.16.
 */
public interface EditBook {

    boolean saveBook(Book book);
    boolean delete(Book book);
    boolean edit(Book book);
    boolean add(Book book);
}
