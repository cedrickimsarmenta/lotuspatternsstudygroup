package com.patterns.observer.taxi;

public class TaxiMeter implements Observer{
	
	private float fare;
	private int distance;

	@Override
	public void onUpdate() {
		distance +=1;
		System.out.println("distance travalled now: "+distance+" km");
		if(distance%2==0){
			fare+=2.50;
			System.out.println("Fare updated to: "+fare+" pesos");
		}
		
	}

	@Override
	public void onStart() {
		distance = 0;
		fare=0;
		System.out.println("Flag Down: "+40+" pesos");
		fare+=40.00;
	}

	@Override
	public void onStop() {
		System.out.println("Taxi has stopped. Fare is "+fare+" pesos");
		System.out.println("distance travelled "+distance+" km");
		
	}
	
	public int getDistanceTravelled(){
		return this.distance;
	}
	
	

}
