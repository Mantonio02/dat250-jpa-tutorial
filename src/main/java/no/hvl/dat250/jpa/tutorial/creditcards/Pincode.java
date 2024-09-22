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

    public void setCode(String pincode) {
        this.pincode = pincode;
    }

    public Integer getCount() {
        // TODO: implement method!
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Address {" +
                "id=" + id +
                ", pincode='" + pincode + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
