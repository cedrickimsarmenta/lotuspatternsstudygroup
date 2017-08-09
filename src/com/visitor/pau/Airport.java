package com.visitor.pau;

/**
 * Created by edgardopaulocunanan on 10/05/2017.
 */
public class Airport {

    public static void main(String[] args) {
        Passenger pau = new Passenger();
        pau.setName("Pau");
        pau.setHasPassport(true);
        Luggage luggage = new Luggage();
        luggage.add(new Item("underwear", 1));
        luggage.add(new Item("shoes", 3));
        pau.setLuggage(luggage);

        AirlineVisitor united = new CebuPacific();
        pau.accept(united);
        if(pau.getTicketNumber() != null) {
            System.out.println("I'm flying!");
        } else {
            System.out.println("I can't fly");
        }
    }
}
