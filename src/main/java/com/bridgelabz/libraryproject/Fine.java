package com.bridgelabz.libraryproject;

import java.util.Date;

public class Fine {
    private String fineId;
    private Member member;
    private double amount;
    private Date issueDate;
    private boolean isPaid;

    public Fine(String fineId, Member member,Date issueDate ) {
        this.fineId = fineId;
        this.member = member;
        this.amount = amount;
        this.issueDate = issueDate;
        this.isPaid = isPaid;
    }

    public void calculateFine(Date dueDate, Date returnDate) {

        long overdueDays = (returnDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
        if (overdueDays > 0) {
            this.amount = overdueDays * 10; // Example: ₹10 per overdue day
            System.out.println("Fine calculated for " + member.getName() + ": ₹" + this.amount);
        } else {
            this.amount = 0.0;
            System.out.println("No fine for " + member.getName() + ". Book returned on time.");
        }
    }
}
