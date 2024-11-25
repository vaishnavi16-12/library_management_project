package com.bridgelabz.libraryproject;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private String address;
    private String contactNumber;
    private List<Book> borrowedBook;

    public Member(String memberId, String name, String address, String contactNumber) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.borrowedBook = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
    public void borrowBook( Book book) {
        if (book.isAvailable()) {
            borrowedBook.add(book);
            book.updateAvailability(false);
            System.out.println(name + "borrowed:" + book.getTitle());

        } else {
            System.out.println("Book is not available");
        }
    }

        public void returnBook(Book book ){
            if ( borrowedBook.remove(book)){
                book.updateAvailability(true);
                System.out.println(name +   "returned :" + book.getTitle());

            }else {
                System.out.println("This book was not borrowed by "+ name);

    }
    }
}
