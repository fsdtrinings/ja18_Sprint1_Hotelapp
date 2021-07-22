package com.cg.hbm.entites;

import java.time.LocalDate;
import java.util.Date;

public class BookingDetails {
	private int booking_id;
	private Hotel hotel; // one to one 
	private Room room; // one to one
	private String username; // username
	private LocalDate booked_from;
	private LocalDate booked_to;
	private int no_of_adults;
	private int no_of_children;
	private double amount;
	
	private Payment payment;
}
