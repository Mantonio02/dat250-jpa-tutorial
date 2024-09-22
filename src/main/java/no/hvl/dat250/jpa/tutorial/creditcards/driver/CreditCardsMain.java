package no.hvl.dat250.jpa.tutorial.creditcards.driver;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import no.hvl.dat250.jpa.tutorial.creditcards.*;

public class CreditCardsMain {

  static final String PERSISTENCE_UNIT_NAME = "jpa-tutorial";

  public static void main(String[] args) {
    try (EntityManagerFactory factory = Persistence.createEntityManagerFactory(
        PERSISTENCE_UNIT_NAME); EntityManager em = factory.createEntityManager()) {
      em.getTransaction().begin();
      createObjects(em);
      em.getTransaction().commit();
    }

  }

  private static void createObjects(EntityManager em) {
    // TODO: Create object world as shown in the README.md.
    Address address = new Address();
    address.setStreet("Inndalsveien");
    address.setNumber(28);
    em.persist(address);

    Customer customer = new Customer();
    customer.setName("Max Mustermann");
    em.persist(customer);

    customer.setAddress(address);
    address.setOwner(customer); // Things go awry here!

    em.persist(address);
    em.persist(customer);
    //em.persist(address);

    CreditCard card1 = new CreditCard();
    card1.setBalance(12345);
    card1.setBalance(-5000);
    card1.setCreditLimit(-10000);
    em.persist(card1);

    CreditCard card2 = new CreditCard();
    card2.setNumber(123);
    card2.setBalance(1);
    card2.setCreditLimit(2000);
    em.persist(card2);

    Pincode code = new Pincode();
    code.setCode("123");
    code.setCount(1);
    em.persist(code);

    card1.setPincode(code);
    em.persist(card1);
    em.persist(code);

    card2.setPincode(code);
    em.persist(card2);
    em.persist(code);

    Bank bank = new Bank();
    bank.setName("Pengebank");
    em.persist(bank);

    bank.getOwnedCards().add(card1);
    card1.setOwningBank(bank);

    em.persist(bank);
    em.persist(card1);

    bank.getOwnedCards().add(card2);
    card2.setOwningBank(bank);

    em.persist(bank);
    em.persist(card2);

    customer.getCreditCards().add(card1);

    em.persist(customer);
    em.persist(card1);

    customer.getCreditCards().add(card2);

    em.persist(customer);
    em.persist(card2);
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
