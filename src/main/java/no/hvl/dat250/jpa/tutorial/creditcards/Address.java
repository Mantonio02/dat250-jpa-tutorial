package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private int number;

    @ManyToMany
    private List<Customer> owners = new ArrayList<>();

    public String getStreet() {
        // TODO: implement method!
        return this.street;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return this.number;
    }

    public Collection<Customer> getOwners() {
        // TODO: implement method!
        return owners;
    }
}
