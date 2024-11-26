package com.bridgelabz.libraryproject;

import java.util.Date;

public class Transaction {

    private String transactionId;
    private Member member;
    private Book book;
    private Date issueDate;
    private Date returnDate;
    private boolean isReturned;

    public Transaction(String transactionId, Member member, Book book, Date issueDate) {
        this.transactionId = transactionId;
        this.member = member;
        this.book = book;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.isReturned = isReturned;
    }

    public void markAsReturned() {
        this.returnDate = new Date();
        this.isReturned = true;
        System.out.println("Transaction " + transactionId + ": Book \"" + book.getTitle() +
                "\" has been marked as returned by " + member.getName() +
                " on " + returnDate);

    }



    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId +
                ", Book: " + book.getTitle() +
                ", Member: " + member.getName() +
                ", Issue Date: " + issueDate +
                ", Return Date: " + (isReturned ? returnDate : "Not Returned") +
                ", Is Returned: " + isReturned;

    }
    }


