package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.BookingDetails;

public interface IBookingDetailsService {
	public BookingDetails addBookingDetails(BookingDetails bookingDetails);
	public BookingDetails updateBookingDetails(BookingDetails bookingDetails);
	public BookingDetails removeBookingDetails(BookingDetails bookingDetails);
	public List<BookingDetails> showAllBookingDetails();
	public BookingDetails showBookingDetails(BookingDetails bookingDetails);
	
	// other business operations
}
