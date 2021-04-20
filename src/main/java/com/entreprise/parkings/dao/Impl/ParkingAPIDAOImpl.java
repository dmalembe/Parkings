package com.entreprise.parkings.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.entreprise.parkings.dao.ParkingAPIDAO;
import com.entreprise.parkings.dao.entity.ResponseParkingAPIentity;

@Repository
public class ParkingAPIDAOImpl implements ParkingAPIDAO {
	
	
	private static final String URL_API_OPEN_DATA = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ResponseParkingAPIentity getListParkings() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA,ResponseParkingAPIentity.class).getBody();
	}
}
