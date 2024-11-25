package com.bridgelabz.libraryproject;

public class Librarian {
    private  String librarianId;
    private String name;
    private String email;
    private String contactNumber;

    public Librarian(String librarianId, String name, String email, String contactNumber) {
        this.librarianId = librarianId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "librarianId='" + librarianId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }


    public void issueBook(Book book, Member member){
       if(book.isAvailable()){
           member.borrowBook(book);
           System.out.println("Librarian " +name+ " issued the book " +book.getTitle()+ "to"+member.getName());

       }else {
           System.out.println("The book \"" + book.getTitle() + "\" is not available for issuing ");

       }
    }
}
