package com.hotel.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.*;
import com.hotel.repository.*;

@Service
@Transactional
public class hotelService{
	@Autowired
	coderepository coderep;
	
	//get all hotel details
	public List<Hotel> getAlldetails()
	{
		List<Hotel> hotel = coderep.findAll();
	
		return hotel;
	}

	//display by id
	public Hotel gethotelbyid(int id)
	{
		return coderep.findById(id);
	}
public void savehotel(Hotel hotel)
{
	coderep.save(hotel);
	
}
}