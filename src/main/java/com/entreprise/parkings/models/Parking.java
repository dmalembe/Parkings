package com.entreprise.parkings.models;

public class Parking {
	
	private String nom;
	private int NbplacesDispo;
	private int NbplacesTotal;
	private String Statut;
	private String HeureMaj;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbplacesDispo() {
		return NbplacesDispo;
	}
	public void setNbplacesDispo(int nbplacesDispo) {
		NbplacesDispo = nbplacesDispo;
	}
	public int getNbplacesTotal() {
		return NbplacesTotal;
	}
	public void setNbplacesTotal(int nbplacesTotal) {
		NbplacesTotal = nbplacesTotal;
	}
	public String getStatut() {
		return Statut;
	}
	public void setStatut(String statut) {
		Statut = statut;
	}
	public String getHeureMaj() {
		return HeureMaj;
	}
	public void setHeureMaj(String heureMaj) {
		HeureMaj = heureMaj;
	}
	
	
}
