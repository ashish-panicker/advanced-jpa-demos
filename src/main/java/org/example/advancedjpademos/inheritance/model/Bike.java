package org.example.advancedjpademos.inheritance.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue("BIKE")
public class Bike extends Vehicle{

    private boolean hasCarrier;

    public Bike() {
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
}
