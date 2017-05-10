package com.visitor.pau;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edgardopaulocunanan on 10/05/2017.
 */
public class Luggage implements Visitable {

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        this.items.add(item);
    }

    public void empty() {
        items.clear();
    }

    public List<Item> extractItems(List<Item> itemsToRemove) {
        List<Item> forExtraction = new ArrayList<>();
        for(Item itemToRemove : itemsToRemove) {
            if(items.stream().anyMatch(i -> i.getName().equals(itemToRemove.getName()))) {
                Item forRemoval = items.stream().filter(i -> i.getName().equals(itemToRemove.getName())).findFirst().get();
                items.remove(forRemoval);
                forExtraction.add(itemToRemove);
            }
        }
        return forExtraction;
    }

    public float getWeight() {
        float weight = 0;
        for(Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    @Override
    public boolean accept(AirlineVisitor visitor) {
        return visitor.visitElement(this);
    }
}
