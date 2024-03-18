package com.lcwd.hotel.service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.service.entities.Hotel;
import com.lcwd.hotel.service.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.service.repositories.HotelRepo;

@Service
public class HotelServiceImpl implements HotelService {
	
	
	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public Hotel saveUser(Hotel hotel) {
		
		String randomhotelId=UUID.randomUUID().toString();
		hotel.setId(randomhotelId);
		return this.hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepo.findAll();
		
	}

	@Override
	public Hotel getHotel(String id) {
		return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel with given id is not found on server!!"+id) );
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Hotel hotel) {
		// TODO Auto-generated method stub
		
	}

}
