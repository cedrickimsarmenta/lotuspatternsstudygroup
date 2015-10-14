package com.patterns.factories.dogs;

public class LotusLabs {
	public static void main(String[] args) {
		DogRacingFactory dogRacingFactory = DogRacingFactory.getByCountry(args[0]);
		
		new DogRacingFeedProcessor(dogRacingFactory);
	}
	
	private static class DogRacingFeedProcessor {
		DogRacingFactory factory;
		
		private DogRacingFeedProcessor(DogRacingFactory factory) {
			this.factory = factory;
		}
		
		public void start() {
			System.out.println(factory.getRaces());
			System.out.println(factory.getPrices());
			System.out.println(factory.getResults());
		}
	}
}
