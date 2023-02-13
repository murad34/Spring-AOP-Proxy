package org.example;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends Library{

    @Override
    public void getBook() {
        System.out.println("We get a book from university library");
        System.out.println("---------------------------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We get a magazine from university library");
        System.out.println("---------------------------------------------------------------------");
    }

    public void returnBook() {
        System.out.println("We return a book to university library");
        System.out.println("---------------------------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return a magazine to university library");
        System.out.println("---------------------------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add a book to unibersity library");
        System.out.println("---------------------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add a magazine to unibersity library");
        System.out.println("---------------------------------------------------------------------");
    }

}
