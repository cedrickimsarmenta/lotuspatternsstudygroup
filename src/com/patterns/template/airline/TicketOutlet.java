package com.patterns.template.airline;

import java.util.Scanner;

public class TicketOutlet {

	
	public static void main(String args[]){
		AirTicketBooking booking =null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Good day! Welcome to my ticket outlet please select Airline");
		System.out.println("1. Cebu Pacific");
		System.out.println("2. Philippine AirLine");
		String choice = sc.nextLine();
		if(choice.equals("1")){
			booking = new CebuPacAirTicketBooking();
		}else if(choice.equals("2")){
			booking = new PALAirTicketBooking();
		}else{
			System.out.println("Sorry entered a incorrect input. System is now stopping");
		}
		try{
			booking.bookTicket();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
