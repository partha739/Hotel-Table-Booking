package com.hotel.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotel.model.Hotel;
import com.hotel.repository.coderepository;
@Controller
public class hotelcontroller
{
	@Autowired
	coderepository coderep;
	
	//check whether API working correctly 
	@RequestMapping(value="/ping, method=RequestMethod.GET")
	@ResponseBody
	public String healthcheck()
	{
		return " This is working well";
	}
	
	@RequestMapping(value="/hotels", method=RequestMethod.GET)
	@ResponseBody
	public List<Hotel> getAllHotel()
	{
		return coderep.findAll();
	}
	@RequestMapping(value="/hotel", method=RequestMethod.POST)
	@ResponseBody
	public Hotel addHotel( Hotel hotel)
	{
		return coderep.save(hotel);
	}
	
	@RequestMapping(value="/findhotel", method=RequestMethod.GET)
	@ResponseBody
	public Hotel findHotel(@RequestParam("hotelId")int hotelId)
	{
		return coderep.findById(hotelId);
	}
	
	@RequestMapping(value="/updatehotel", method=RequestMethod.GET)
	@ResponseBody
	public Hotel updateHotel(@RequestBody Hotel hotel)
	{
		return coderep.save(hotel);
	}
	/*
	@RequestMapping(value="/deletehotel", method=RequestMethod.GET)
	@ResponseBody
	public Hotel deleteHotel(@RequestParam("hotelId")int hotelId)
	{
		return coderep.deleteById(hotelId);
	}*/
	/*
	public Hotel deleteHotel(@RequestParam("hotelId")int hotelId)
	{
     return coderep.deleteById(hotelId);
	}*/
	
}