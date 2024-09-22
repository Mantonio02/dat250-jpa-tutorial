package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Address> addresses;

    @ManyToMany
    private List<CreditCard> creditCards;

    public Customer() {
        this.addresses = new ArrayList<Address>();
        this.creditCards = new ArrayList<CreditCard>();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        // TODO: implement method!
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Address> getAddresses() {
        // TODO: implement method!
        return this.addresses;
    }

    public void setAddress(Address address) {
        this.addresses.add(address);
    }

    public Collection<CreditCard> getCreditCards() {
        // TODO: implement method!
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
