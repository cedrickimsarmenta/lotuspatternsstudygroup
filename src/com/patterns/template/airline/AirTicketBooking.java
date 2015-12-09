package com.patterns.template.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AirTicketBooking {

	List<String> destinations = new ArrayList<String>();
	int ticketSelected = -1;

	public final void bookTicket() throws Exception {
		Scanner sc = new Scanner(System.in);
		loginToWebsite();
		loadDestination();
		displayingAllItenerary();
		chooseItenary(sc);
		selectTheTicket();
		payment(sc);
		sc.close();
	}


	void displayingAllItenerary() {
		System.out.println("Displaying All the Availale Itenerary!!");
		System.out.println("Select Source/Destination/Date");
		for(String x: destinations){
			System.out.println(x);
		}
	}

	void selectTheTicket() {
		System.out.println("You have selected the below Ticket!!");
		System.out.println(destinations.get(ticketSelected));
	}

	void payment(Scanner sc)throws Exception {
		try{
			System.out.println("Amount to pay::"+destinations.get(ticketSelected).split("/")[3]);
			System.out.println("Pleas enter amount");
			int amount = Integer.parseInt(sc.nextLine());
			if(amount < Integer.parseInt(destinations.get(ticketSelected).split("/")[3])){
				throw new Exception("Insufficient amount. System will now close");
			}else{
				System.out.println("Change is"+(amount - Integer.parseInt(destinations.get(ticketSelected).split("/")[3])));
			}
			
			System.out.println("Payment Recieved !! Ticket Confimed.");	
		}catch(Exception e){
			throw new Exception("Invalid input. System will now close");
		}
		
	}

	abstract void loginToWebsite();

	abstract void loadDestination();

	void chooseItenary(Scanner sc) throws Exception {
		try{
			int chose = Integer.parseInt(sc.nextLine());
			if (chose > 0 && destinations.size() >= chose) {
				ticketSelected = chose - 1;
			}else{
				throw new Exception("Invalid ticket selection. System will now close");
			}
		}catch(Exception e){
			throw new Exception("Invalid input. System will now close");
		}
		
	}
}
