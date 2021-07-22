package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.Room;

public interface IRoomService {
	public Room addRoom(Room roomDetails);
	public Room updateRoom(int id);
	public Room removeRoom(int id);
	public List<Room> showAllRoom();
	public Room showRoom(int roomDetails_id);
}
