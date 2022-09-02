package com.deepak.odstest13;

public class Person {
    String mail,address;

    public Person(String mail, String address) {
        this.mail = mail;
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
