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

    public Integer getNumber() {
        // TODO: implement method!
        return this.number;
    }

    public Integer getBalance() {
        // TODO: implement method!
        return this.balance;
    }

    public Integer getCreditLimit() {
        // TODO: implement method!
        return this.creditLimit;
    }

    public Pincode getPincode() {
        // TODO: implement method!
        return this.code;
    }

    public Bank getOwningBank() {
        // TODO: implement method!
        return this.bank;
    }
}
