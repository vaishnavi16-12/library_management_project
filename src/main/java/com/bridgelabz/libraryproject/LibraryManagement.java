package com.bridgelabz.libraryproject;


public class LibraryManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to library management project ");


        Library library = new Library("Read Book", "123 main st");

        Book book1 = new Book("Yayati",  "V. S. Khandekar","134512w6", 1924);
        Book book2 =new Book ("1980", "George orwell", "13435t4er", 1949);
        library.addBook(book1);
        library.addBook(book2);

        library.removeBook(book2);
    }
}