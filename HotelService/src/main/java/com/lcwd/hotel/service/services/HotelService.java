package com.lcwd.hotel.service.services;

import java.util.List;

import com.lcwd.hotel.service.entities.Hotel;

public interface HotelService {
	
Hotel saveUser(Hotel hotel);
	
	List<Hotel>getAllHotel();
	
	Hotel getHotel(String id);
	
	Hotel updateHotel(Hotel hotel);
	
	
	void deleteUser(Hotel hotel);

}
