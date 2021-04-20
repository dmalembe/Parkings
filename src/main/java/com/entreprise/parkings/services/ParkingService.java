package com.entreprise.parkings.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entreprise.parkings.models.Parking;

public interface ParkingService {
	
	public List<Parking> getListParkings();

}
