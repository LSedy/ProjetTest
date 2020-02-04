/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Polypheme;

public class PolyphemeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polypheme poly = new Polypheme();
		poly.surnom = "Joe";
		poly.setNom("Julius");

		System.out.println("bienvenue " + poly.getNom() + " (" + poly.surnom + ")");

		// ajout du prenom
		poly.setPrenom("Caesar");
		System.out.println(poly.getPrenom() + " " + poly.getNom());
		//afficher message
		poly.afficherDetails();
		
	}

}
