/**
 * 
 */
package com.crm.bo;

/**
 * @author 5Y2
 *
 */
public class Voiture {
	
	// Attributs Marque=Ferrari Couleur=GrisAnthracite nBPorte=7 BoiteManu/Auto=Auto Prix=60.000
	private String name;
	private String marque = "Ferrari Testarossa";
	private int nbPortes = 7;
	//Attributs affichage
	private String tech;
	private boolean demarrerVoiture;
	private boolean stopVoiture;
	// Attributs voiture
	private String voirVitVoiture;
	private String speedVoiture;
	private String slowVoiture;
	

	// Attribut klaxon
	private String klaxon = "TUUUUUUTUUUUUUTUUUUUT!!!";
	
	// Attributs tableau/vitesse
	String[] vitesseVoit = {"50Km/h", "80Km/h", "130Km/h"};
	
	//Tableau couleur / type de boite
	String[] couleurVoit = {"incolore", "[1]-Gris Anthracite", "[2]-Rouge Pourpre"};
	String[] boiteManuAuto = {"[1]-Manuel", "[2]-Automatique"};
	
	//Constructeur (défault)
	public void CarRun() {
		System.out.println("Voulez-vous démarer la voiture?");
		
		if (demarrerVoiture = true) {
		do { 
			
		} while (stopVoiture = true);
		}
	}
	
	//Get/Set name
	public String getName() {
		return name;
	}
	public void setName(String na) {
		name = na;
	}
	
	//Get/Set Caractéristiques techniques de l'automobile
//	public String set
	
}
