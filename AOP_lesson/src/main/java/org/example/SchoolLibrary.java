package org.example;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library{
    @Override
    public void getBook() {
        System.out.println("We get a book from school library");
    }
}
