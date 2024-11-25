package com.bridgelabz.libraryproject;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private String address;
    private List<Book> books;
    private List<Member> members;
    private List<Librarian> librarians;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.librarians = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member Registrated : " + member.getName());
    }

    public void removeMember(Member member) {
        members.remove(member);
        System.out.println("Member removed : " + member.getName());
    }

    public List<Book> searchBook(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);

            }
        }
        return result;
    }

    public List<Book> searchBookAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);


            }
        }
        return  result;
    }
}
