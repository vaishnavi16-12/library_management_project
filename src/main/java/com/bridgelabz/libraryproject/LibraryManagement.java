package com.bridgelabz.libraryproject;


import java.util.List;

public class LibraryManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to library management project ");


        Library library = new Library("Read Book", "123 main st");

        Book book1 = new Book("Yayati",  "V. S. Khandekar","134512w6", 1924);
        Book book2 =new Book ("1980", "George orwell", "13435t4er", 1949);
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("M1","Vaishnavi","edfw35fg st","15465768");
        library.registerMember(member1);
        library.removeMember(member1);

        member1.borrowBook(book1);

        member1.returnBook( book1);


        System.out.println("\nBorrowed Book: ");
        List<Book> borrowedBook = member1.listBorrowedBook();

        for (Book book : borrowedBook){
            System.out.println(book);

        }
        member1.returnBook(book1);

        System.out.println("\nBorrowed Books After return :");
        borrowedBook= member1.listBorrowedBook();
         for (Book book : borrowedBook){
             System.out.println(book);
         }

    }

}