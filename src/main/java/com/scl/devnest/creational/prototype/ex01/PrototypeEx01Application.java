package com.scl.devnest.creational.prototype.ex01;

public class PrototypeEx01Application {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop1 = new BookShop();
        bookShop1.setId(1);
        bookShop1.setName("Araliya BookShop");
        bookShop1.loadBooks();

        BookShop bookShop2 = (BookShop) bookShop1.clone();
        bookShop2.setId(2);
        bookShop2.setName("New Araliya Bookshop");

        bookShop1.getBooks().remove(1);
        System.out.println(bookShop1);
        System.out.println(bookShop2);
    }
}
