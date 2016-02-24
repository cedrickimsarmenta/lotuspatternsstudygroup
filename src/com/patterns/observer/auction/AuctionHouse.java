package com.patterns.observer.auction;

public class AuctionHouse {

	public static void main(String[] args) {
		Item item = new Item();
		item.setName("Old but gold underwear");
		
		new RichPerson(item, 200000, "Jc");
		new RichPerson(item, 250000, "Kerby");
		new RichPerson(item, 290000, "RM");
		new RichPerson(item, 150000, "Cedric");
		new RichPerson(item, 100000, "Ernest");
		
		System.out.println("Auctioneer set the initial bid to 10000");
		item.setBidAmount(10000);
	}

}
