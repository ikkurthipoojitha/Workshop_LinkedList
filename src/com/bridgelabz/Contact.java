package com.bridgelabz.AddressBook;

public class Contact {
    String name;
    String city;
    Contact(){

    }
    Contact(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String toString(){
        return "name = " + name + "City=" + city;
    }

}
