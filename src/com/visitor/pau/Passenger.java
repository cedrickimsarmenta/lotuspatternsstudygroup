package com.visitor.pau;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edgardopaulocunanan on 10/05/2017.
 */
public class Passenger implements Visitable {

    private String name;
    private Luggage luggage;
    private List<Item> carryOns = new ArrayList<>();
    private String ticketNumber;
    private boolean hasPassport;

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    public List<Item> getCarryOns() {
        return carryOns;
    }

    public void setCarryOns(List<Item> carryOns) {
        this.carryOns = carryOns;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasPassport() {
        return hasPassport;
    }

    public void setHasPassport(boolean hasPassport) {
        this.hasPassport = hasPassport;
    }

    @Override
    public boolean accept(AirlineVisitor visitor) {
        return visitor.visitElement(this);
    }
}
