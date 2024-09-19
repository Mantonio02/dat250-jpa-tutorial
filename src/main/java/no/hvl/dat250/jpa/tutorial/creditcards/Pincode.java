package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    private int count;

    public Long getId() {
        return id;
    }

    public String getCode() {
        // TODO: implement method!
        return pincode;
    }

    public Integer getCount() {
        // TODO: implement method!
        return count;
    }
}
