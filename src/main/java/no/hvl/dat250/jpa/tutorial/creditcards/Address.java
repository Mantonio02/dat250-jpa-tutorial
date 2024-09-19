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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        // TODO: implement method!
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Collection<Customer> getOwners() {
        // TODO: implement method!
        return owners;
    }

    public void setOwners(List<Customer> owners) {
        this.owners = owners;
    }
}
