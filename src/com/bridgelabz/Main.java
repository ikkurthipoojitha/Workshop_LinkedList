package com.bridgelabz.AddressBook;

public class Main {
    public static void main(String[] args) {
    Contact c1 = new Contact("Poojitha","Hyderabad");
    Contact c2 = new Contact("teja","Secundrabad");
    Contact c3 = new Contact("Pooja","Mumbai");

    AddressBook addressBook = new AddressBook();
    addressBook.listContact.add(c1);
    addressBook.listContact.add(c2);
    addressBook.listContact.add(c3);
    }    

}
