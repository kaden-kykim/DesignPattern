package com.kaden_kim.design_pattern.iterator.impl;

import com.kaden_kim.design_pattern.iterator.impl.interfaces.Aggregate;
import com.kaden_kim.design_pattern.iterator.impl.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

    private final List<Book> books;

    public BookShelf(int initialSize) {
        this.books = new ArrayList<>(initialSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
