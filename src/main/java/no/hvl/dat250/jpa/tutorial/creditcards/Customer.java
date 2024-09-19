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

    @ManyToMany
    private List<Address> addresses = new ArrayList<>();

    @ManyToMany
    private List<CreditCard> creditCards = new ArrayList<>();

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
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Collection<CreditCard> getCreditCards() {
        // TODO: implement method!
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
