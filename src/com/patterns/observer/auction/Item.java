package com.patterns.observer.auction;

import java.util.ArrayList;
import java.util.List;

public class Item {

	private List<Bidder> bidders = new ArrayList<Bidder>();
	private double bidAmount;
	private double multiplier = 1.2;
	private String name;

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
		notifyAllBidders();
	}

	public double getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}

	public void attach(Bidder bidder) {
		bidders.add(bidder);
	}

	public void notifyAllBidders() {
		for (Bidder bidder : bidders) {
			bidder.update();
		}
	}
	public void updateBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
