package com.entreprise.parkings.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entreprise.parkings.models.Parking;
import com.entreprise.parkings.services.ParkingService;

@RequestMapping(path = "/api")
@RestController
public class ParkingsController {
	@Autowired
	private ParkingService parkingService;
	
	@GetMapping(path = "/parkings")
	public List<Parking> getListParkings(){
		return parkingService.getListParkings();
	}

}
