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
		
		//
		Polypheme poly2 = new Polypheme();
		poly2.afficherDetails();
		System.out.println(poly2);
		
		// Déclencher une exeption suite au déréférencement de l'objet
//		poly2 = null;
//		System.out.println(poly2.getNom());
		
//		Polypheme poly3 = new Polypheme("bob", "dylan");
//		poly3.afficherDetails();
		
		int a = 5;
		int b = 5;
		if(a == b) {
			System.out.println("les deux entiers sont identiques");
		}
		
		Polypheme poly4 = new Polypheme("Julius", "Caesar");
		Polypheme poly5 = new Polypheme("Julius", "Caesar");
		if(poly4 == poly5) {
			System.out.println("les deux objets sont identiques");
		}
		
		if(poly4.isEquals(poly5) == true) {
			System.out.println("Les deux objets sont identiques (méthode isEquals)");
		}
		
		// incrementation d'un nombre
		int nb = 5;
		poly5.incrementeNombre(nb);
		System.out.println(nb);
		
		poly4.modifierPolypheme(poly5);
		poly5.afficherDetails();
	}
	
}
