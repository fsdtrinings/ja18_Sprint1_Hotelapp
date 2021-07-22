package com.cg.hbm.entites;

import java.sql.Blob;

public class Room {
	private int room_id;
	
	
	private Hotel hotel; // @ManyToOne
	private String room_no;
	private String room_type;  // Category delux
	private double rate_per_day;
	private boolean isAvailable;  // based on Calculation
	private Blob photo;
	private int noOfRooms;  // 7
}
