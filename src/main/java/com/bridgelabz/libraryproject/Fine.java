package com.bridgelabz.libraryproject;

import java.util.Date;

public class Fine {
    private String fineId;
    private Member member;
    private double amount;
    private Date issueDate;
    private boolean isPaid;

    public Fine(String fineId, Member member, double amount, Date issueDate, boolean isPaid) {
        this.fineId = fineId;
        this.member = member;
        this.amount = amount;
        this.issueDate = issueDate;
        this.isPaid = isPaid;
    }
}
