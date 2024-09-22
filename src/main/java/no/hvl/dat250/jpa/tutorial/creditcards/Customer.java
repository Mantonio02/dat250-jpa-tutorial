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
        return this.addresses;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public Collection<CreditCard> getCreditCards() {
        // TODO: implement method!
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    public String toString() {
//        String addressesAsString = "";
//        String creditCardsAsString = "";
//        if (this.addresses.isEmpty() && this.creditCards.isEmpty()) return "Address {" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", (no Address given) " + '\'' +
//                ", (no CreditCard given) " + '\'' +
//                '}';
//        else if (this.addresses.isEmpty() && !this.creditCards.isEmpty()) {
//            for (CreditCard curr : creditCards) creditCardsAsString += (curr + ", ");
//            return "Address {" +
//                    "id=" + id +
//                    ", name='" + name + '\'' +
//                    ", (no Address given) " + '\'' +
//                    ", " + creditCardsAsString + '\'' +
//                    '}';
//        }
//
//        else if (!this.addresses.isEmpty() && this.creditCards.isEmpty()) {
//            for (Address curr : addresses) addressesAsString += (curr + ", ");
//            return "Address {" +
//                    "id=" + id +
//                    ", name='" + name + '\'' +
//                    ", " + addressesAsString + '\'' +
//                    ", (no CreditCard given) " + '\'' +
//                    '}';
//        }
//
//        for (Address curr : addresses) addressesAsString += (curr + ", ");
//        for (CreditCard curr : creditCards) creditCardsAsString += (curr + ", ");
//        return "Address {" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", " + addressesAsString + '\'' +
//                ", " + creditCardsAsString + '\'' +
//                '}';
//    }
}
