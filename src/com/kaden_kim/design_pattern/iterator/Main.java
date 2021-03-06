package com.kaden_kim.design_pattern.iterator;

import com.kaden_kim.design_pattern.iterator.impl.Book;
import com.kaden_kim.design_pattern.iterator.impl.BookShelf;
import com.kaden_kim.design_pattern.iterator.impl.framework.Iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));


        Iterator it = bookShelf.iterator();
        while (it.hasNext())
            System.out.println(((Book) it.next()).getName());
    }

}
