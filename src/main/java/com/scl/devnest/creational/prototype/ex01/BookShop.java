package com.scl.devnest.creational.prototype.ex01;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private Integer id;
    private String name;
    private List<Book> books = new ArrayList<>();

    public BookShop() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    /* This operation to simulate the database data fetching */
    public void loadBooks() {
        for(int i = 1; i <= 10; i++) {
            books.add(new Book(i, "Book" + i));
        }
    }

    /* Using shallow cloning */
    /* @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    /* Using deep cloning */
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop();

        for(Book book : this.getBooks()) {
            bs.getBooks().add(book);
        }

        return bs;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
