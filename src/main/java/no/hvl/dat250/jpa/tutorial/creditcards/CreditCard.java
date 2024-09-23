package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private int creditLimit;
    private int balance;

    @ManyToOne
    private Pincode code;

    @ManyToOne
    private Bank bank;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Integer getBalance() {
        // TODO: implement method!
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Integer getCreditLimit() {
        // TODO: implement method!
        return this.creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Pincode getPincode() {
        // TODO: implement method!
        return this.code;
    }

    public void setPincode(Pincode code) {
        this.code = code;
    }

    public Bank getOwningBank() {
        // TODO: implement method!
        return this.bank;
    }

    public void setOwningBank(Bank bank) {
        this.bank = bank;
    }
}
