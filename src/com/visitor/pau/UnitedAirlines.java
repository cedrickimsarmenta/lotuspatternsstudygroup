package com.visitor.pau;

/**
 * Created by edgardopaulocunanan on 10/05/2017.
 */
public class UnitedAirlines implements AirlineVisitor {

    private static final int MAX_NUMBER_OF_CARRY_ONS = 3;
    private static final float MAX_LUGGAGE_WEIGHT_IN_KG = 7;

    @Override
    public boolean visitElement(Passenger passenger) {
        if(!passenger.isHasPassport()) {
            System.out.println("You need a passport");
            return false;
        }

        if(passenger.getCarryOns().size() > MAX_NUMBER_OF_CARRY_ONS) {
            System.out.println("You have more than the allowed number of carry ons");
            return false;
        }
        if(!passenger.getLuggage().accept(this)) {
            return false;
        }
        String ticketNumber = String.valueOf(passenger.hashCode());
        passenger.setTicketNumber(ticketNumber);
        System.out.println("Thank you for flying United Airlines. Your ticket number is " + ticketNumber);
        System.out.println("Expect some selective violence during your flight");
        return true;
    }

    @Override
    public boolean visitElement(Luggage luggage) {
        if(luggage.getWeight() > MAX_LUGGAGE_WEIGHT_IN_KG) {
            System.out.println("Your luggage is too heavy");
            return false;
        }
        System.out.println("Your luggage will now be checked in");
        return true;
    }
}
