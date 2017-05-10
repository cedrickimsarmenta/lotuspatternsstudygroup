package com.visitor.pau;

/**
 * Created by edgardopaulocunanan on 10/05/2017.
 */
public interface Visitable {

    boolean accept(AirlineVisitor visitor);
}
