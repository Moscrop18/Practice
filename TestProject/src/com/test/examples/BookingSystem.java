package com.test.examples;

public class BookingSystem extends Thread {

	private int seatsAvaialble = 2;
	private int seatsRequired;
	public static void main(String[] args) {
		
		BookingSystem b1 = new BookingSystem(2);
		BookingSystem b2 = new BookingSystem(3);
		
		b1.start();
		b2.start();
	}
	
	BookingSystem(int seatsRequired){
		this.seatsRequired = seatsRequired;
	}
	
	public void run() {
		this.bookTicket(seatsRequired);
	}
	
	public synchronized void bookTicket(int seatsRequired) {
		System.out.println("Current thread:" +Thread.currentThread().getName());
		if(seatsRequired<=seatsAvaialble && seatsRequired>0){
			System.out.println("Seats booked");
			seatsAvaialble = seatsAvaialble-seatsRequired;
		}
		else {
			System.out.println("No seats available");
		}
	}

}
