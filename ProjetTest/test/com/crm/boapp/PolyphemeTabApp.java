package com.crm.boapp;

import com.crm.bo.Polypheme;
/**
 * @author 5Y2
 *
 */
public class PolyphemeTabApp {	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Déclaration des variables
		Polypheme[] polyTab = new Polypheme[2];
		Polypheme poly1 = new Polypheme();
		Polypheme poly2 = new Polypheme();		
		
		// Initialisation
		poly1.setPrenom("Stephen");
		poly1.setNom("Hawking");
		poly1.surnom = "Le Boson de Higgs";
		
		poly2.setPrenom("Stephen");
		poly2.setNom("KING");
		poly2.surnom = "CA";		
		
		polyTab[0] = poly1;
		polyTab[1] = poly2;	

		// Parcours du tableau
		for(Polypheme p : polyTab) {
			p.afficherDetails();
		}	
	}
}