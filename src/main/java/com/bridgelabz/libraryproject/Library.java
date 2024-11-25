package com.bridgelabz.libraryproject;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private  String name;
    private String address;
    private List<Book> books;
    private List<Member> members;
    private List<Librarian> librarians;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.members =new ArrayList<>();
        this.librarians = new ArrayList<>();
    }

    public  void addBook( Book book){
        books.add(book);
        System.out.println("Book added: "+ book.getTitle());
    }
    public  void removeBook( Book book){
        books.remove(book);
        System.out.println("Book removed: "+ book.getTitle());
    }


}
