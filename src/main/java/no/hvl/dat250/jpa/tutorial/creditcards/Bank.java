package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany
    private List<CreditCard> ownedCards = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        // TODO: implement method!
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<CreditCard> getOwnedCards() {
        // TODO: implement method!
        return ownedCards;
    }

    public void setOwnedCards(List<CreditCard> ownedCards) {
        this.ownedCards = ownedCards;
    }
}
