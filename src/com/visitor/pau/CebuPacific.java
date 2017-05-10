package com.visitor.pau;


/**
 * Created by edgardopaulocunanan on 10/05/2017.
 */
public class CebuPacific implements AirlineVisitor {

    @Override
    public boolean visitElement(Passenger passenger) {
        String ticketNumber = String.valueOf(passenger.hashCode());
        passenger.setTicketNumber(ticketNumber);
        System.out.println("Thank you for choosing Cebu Pacific. Your ticket number is " + ticketNumber);
        return true;
    }

    @Override
    public boolean visitElement(Luggage luggage) {
        if(luggage.getWeight() > 0) {
            System.out.println("Sorry. We do not allow luggage in our airplanes.");
            return false;
        }
        return true;
    }
}
