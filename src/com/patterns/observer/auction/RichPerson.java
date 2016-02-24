/**
 * 
 */
package com.patterns.observer.auction;

/**
 * @author JC
 *
 */
public class RichPerson extends Bidder{

	private String name;
	private double money;

	public RichPerson (Item item, double money, String name) {
		this.money = money;
		this.name = name;
		this.item = item;
		this.item.attach(this);
		
	}

	@Override
	public void update() {
		double requiredBid = this.item.getBidAmount()*this.item.getMultiplier();
		if(requiredBid <= this.money){
			this.money = this.money - requiredBid;
			System.out.println(this.name+" bids: "+requiredBid+ " for "+this.item.getName());
			this.item.updateBidAmount(requiredBid);
		}else{
			System.out.println(this.name+" don't have enough money to bid.");
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	
}
