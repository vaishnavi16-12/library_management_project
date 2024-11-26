package com.bridgelabz.libraryproject;


import java.util.Calendar;
import java.util.Date;
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

         Librarian librarian =new Librarian("L11", "Messy", "messy@3w56331", "907212665");
         librarian.issueBook(book1, member1);
         librarian.issueBook(book2,member1);


         librarian.receivedReturnBook(book1, member1);
             librarian.issueBook(book1, member1);


             Transaction transaction = new Transaction("T1",member1, book1, new Date());

        System.out.println("\nTransaction Details (Before return):");
        System.out.println(transaction.getTransactionDetails());

        transaction.markAsReturned();

        System.out.println("\nTransaction Details (After return):");
        System.out.println(transaction.getTransactionDetails());


        Date issueDate =new Date();
        Fine fine= new Fine("M1", member1, issueDate);

        Calendar calender = Calendar.getInstance();
        calender.setTime(issueDate);

        calender.add(calender.DATE, 5);
        Date dueDate = calender.getTime();


        calender.add(calender.DATE, 5);
        Date returnDate = calender.getTime();

        fine.calculateFine(dueDate,returnDate);


        System.out.println("\nFine Details(Before payment): ");
        System.out.println(fine.getFineDetails());

        fine.markAsPaid();

        System.out.println("\nFine Details(After payment): ");
        System.out.println(fine.getFineDetails());



    }

}