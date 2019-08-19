package com.jenson.data.patternsduty.gof.iterator.book;

public class IteratorMain {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Baddy-Long-Legs"));

        Iterator iter = bookShelf.iterator();
        System.out.println("iter = " + iter);
        while (iter.hasNext()) {
            Book book = (Book) iter.next();
            System.out.println("book = " + book.getName());
        }
    }
}
