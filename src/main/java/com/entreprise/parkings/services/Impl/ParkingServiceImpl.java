package com.entreprise.parkings.services.Impl;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entreprise.parkings.dao.ParkingAPIDAO;
import com.entreprise.parkings.dao.entity.RecordsEntity;
import com.entreprise.parkings.dao.entity.ResponseParkingAPIentity;
import com.entreprise.parkings.models.Parking;
import com.entreprise.parkings.services.ParkingService;
@Service
public class ParkingServiceImpl implements ParkingService {
	
	@Autowired
	private ParkingAPIDAO parkingAPIDAO;
	
	@Override
	public List<Parking> getListParkings(){
		ResponseParkingAPIentity response = parkingAPIDAO.getListParkings();
		return transformEntityToModel(response);
	}

	private List<Parking> transformEntityToModel(ResponseParkingAPIentity response) {
		List<Parking> resultat = new ArrayList<Parking>();
		for (RecordsEntity record : response.getRecords()) {
			Parking parking = new Parking();
			parking.setNom(record.getFields().getGrpNom());
			parking.setStatut(getLibelleStatut(record));
			parking.setNbplacesDispo(record.getFields().getGrpDisponible());
			parking.setNbplacesTotal(record.getFields().getGrpExploitation());
			parking.setHeureMaj(getHeureMaj(record));
			
			resultat.add(parking);
		}
		return resultat;
	}

	private String getHeureMaj(RecordsEntity record) {
		OffsetDateTime dateMaj = OffsetDateTime.parse(record.getFields().getGrpHorodatage());
		OffsetDateTime dateMajWithOffset = dateMaj.withOffsetSameInstant(ZoneOffset.of("+02:00"));
		return dateMajWithOffset.getHour() + "H" + dateMajWithOffset.getMinute();
	}

	private String getLibelleStatut(RecordsEntity record) {
		switch (record.getFields().getGrpStatut()) {
			case "1":{
				return "FERME";
			}
			case "2":{
				return "ABONNES";
			}
			case "5":{
				return "OUVERT";
			}
		}
		return "Données non disponible";
	}
	
}
