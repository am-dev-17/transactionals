package com.amarmodi.jpa.hibernate.transactional.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;


public class Money {

    private int amount;
    private String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currencyCode, money.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currencyCode);
    }


    //Objects that are equal to each MUST return the same hashcode
    // collisions can occur is non-equal objects have the same object (this is fine)

    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        boolean balanced = income.equals(expenses);
    }
}
