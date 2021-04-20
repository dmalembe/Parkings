package com.entreprise.parkings.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {
	
	@JsonProperty(value = "idobj")
	private String idObjet;
	
	@JsonProperty(value = "grp_nom")
	private String grpNom;
	
	@JsonProperty(value = "grp_exploitation")
	private int grpExploitation;
	
	@JsonProperty(value = "grp_disponible")
	private int grpDisponible;
	
	@JsonProperty(value = "grp_statut")
	private String grpStatut;
	
	@JsonProperty(value = "grp_horodatage")
	private String grpHorodatage;

	public String getIdObjet() {
		return idObjet;
	}

	public void setIdObjet(String idObjet) {
		this.idObjet = idObjet;
	}

	public String getGrpNom() {
		return grpNom;
	}

	public void setGrpNom(String grpNom) {
		this.grpNom = grpNom;
	}

	public int getGrpExploitation() {
		return grpExploitation;
	}

	public void setGrpExploitation(int grpExploitation) {
		this.grpExploitation = grpExploitation;
	}

	public int getGrpDisponible() {
		return grpDisponible;
	}

	public void setGrpDisponible(int grpDisponible) {
		this.grpDisponible = grpDisponible;
	}

	public String getGrpStatut() {
		return grpStatut;
	}

	public void setGrpStatut(String grpStatut) {
		this.grpStatut = grpStatut;
	}

	public String getGrpHorodatage() {
		return grpHorodatage;
	}

	public void setGrpHorodatage(String grpHorodatage) {
		this.grpHorodatage = grpHorodatage;
	}
	
	
   
	/*"grp_complet": 10,
    "grp_identifiant": "001",
    "grp_horodatage": "2021-04-20T10:17:45+00:00",
    "grp_disponible": 132,
    "idobj": "4320",
    "location": [
        47.214075295,
        -1.552558781
    ],
    "grp_statut": 5,
    "grp_exploitation": 356,
    "grp_nom": "Feydeau"*/
}
