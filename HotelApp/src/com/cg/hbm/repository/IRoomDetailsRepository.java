package com.cg.hbm.repository;

import java.util.List;

import com.cg.hbm.entites.Room;

public interface IRoomDetailsRepository {
	public Room addRoomDetails(Room roomDetails);
	public Room updateRoomDetails(Room roomDetails);
	public Room removeRoomDetails(Room roomDetails);
	public List<Room> showAllRoomDetails();
	public Room showRoomDetails(int roomDetails_id);
}
