package com.cg.hbm.entites;

import java.util.List;

public class Hotel {
	private int hotel_id;
	private String city;
	private String hotel_name;
	private String address;
	private String description;
	private double avg_rate_per_day;// cvalculation based
	private String email;
	private String phone1;
	private String phone2;
	private String website;
	
	private List<Room> rooms; // @OneToMany
}
