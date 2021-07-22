package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.Hotel;

public interface IHotelService {
	public Hotel addHotel(Hotel hotel);
	public Hotel updateHotel(Hotel hotel);
	public Hotel removeHotel(Hotel hotel);
	public List<Hotel> showAllHotels();
	public Hotel showHotel(Hotel id);
	
	// -----
	
	public List<Hotel> getHotelByCity(String cityName);
	// few more business functionalities
}
