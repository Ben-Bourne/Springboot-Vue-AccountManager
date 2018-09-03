package com.qa.SpringbootVueAccountManager.domain;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column (name = "id")
    private long id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "account_number")
    private String accountNumber;

    public Account(){}

    public Account(String firstName, String lastName, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
