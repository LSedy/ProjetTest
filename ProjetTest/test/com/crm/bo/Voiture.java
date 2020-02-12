/**
 * 
 */
package com.crm.bo;

/**
 * @author 5Y2
 *
 */
public class Voiture {
	
	// Attributs Marque=Ferrari Couleur=GrisAnthracite nBPorte=7 BoiteManu/Auto=Auto Prix=520.000
	private String name;
	private String tech;
	
	// Attributs klaxon
	private String klaxon = "TUUUUUUTUUUUUUTUUUUUT!!!";
	
	// Attributs tableau/vitesse
	String[] vitesse = {"50Km/h", "80Km/h", "130Km/h"};
	
	//Constructeur (défault)
	public void CarRun() {
		System.out.println("Voulez-vous démarer la voiture?");
		
		while (keyRun == true) {
			return;
		}
		if (keyRun == false) {
			return;
		}
	}
	
	//Get/Set name
	public String getName() {
		return name;
	}
	public void setName(String na) {
		name = na;
	}
	
	//Get/Set 
	
}
