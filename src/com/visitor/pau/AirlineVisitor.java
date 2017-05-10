package com.visitor.pau;

/**
 * Created by edgardopaulocunanan on 10/05/2017.
 */
public interface AirlineVisitor {
    boolean visitElement(Passenger passenger);
    boolean visitElement(Luggage luggage);
}
