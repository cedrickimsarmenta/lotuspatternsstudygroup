package com.patterns.composite.sporttreeitem;

public class Main {

	public static void main(String[] args) {
		EventPath basketball = new Sport("BasketBall");
		EventPath USA = new EventPath("USA");
		EventPath PHI = new EventPath("PHI");
		EventPath PBA = new EventPath("PBA");
		EventPath PBL = new EventPath("PBL");
		EventPath NBA = new EventPath("NBA");
		SportsTreeItem game1 = new Event("Manila Clasico");
		SportsTreeItem game2 = new Event("talkNtext vs PureFoods");
		SportsTreeItem game3 = new Event("Chicago vs Phil");
		SportsTreeItem game4 = new Event("welcoat vs nlex");
		
		basketball.add(USA);
		basketball.add(PHI);
		PHI.add(PBA);
		PHI.add(PBL);
		USA.add(NBA);
		PBA.add(game1);
		PBA.add(game2);
		NBA.add(game3);
		PBL.add(game4);
		
	
		Event event = new Event("BULLS PISTONS");
//		event.add(new Event("KERBY vs ERNEST"));
		for(SportsTreeItem item : basketball.getChildren()) {
			if(item.getName().equals("USA")) {
				for(SportsTreeItem item2: item.getChildren()) {
					if(item2.getName().equals("NBA")) {
						item2.add(event);
					}
				}
			}
			
		}
		
		basketball.printItems();
		

}

}
