package com.bridgelabz.libraryproject;

import java.util.Date;

public class Transaction {

    private String  transactionId;
    private Member member;
    private Book book;
    private Date issueDate;
    private Date returnDate;
    private boolean isReturned;

    public Transaction(String transactionId, Member member, Book book, Date issueDate, Date returnDate, boolean isReturned) {
        this.transactionId = transactionId;
        this.member = member;
        this.book = book;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.isReturned = isReturned;
    }

}
