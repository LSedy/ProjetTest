/**
 * 
 */
package com.crm.bo;

import java.util.Date;


/**
 * @author 5Y2
 *
 */
public class Polypheme {

	// Attributs
	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

	// Constructeurs
	public Polypheme() {
		nom = "";
		prenom = "";
		surnom = "";
		System.out.println("Construction d'un objet Polypheme(sans param)");
	}
	
	public Polypheme(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	//Créee la Date et l'heure
	
	
	// Methodes & Getter/Setter
	
	public void modifierPolypheme(Polypheme poly) {
		poly.nom = poly.nom.toUpperCase();
		poly.prenom = poly.prenom.toUpperCase();
	}
	
	public int incrementeNombre(int nb) {
		return nb++;
	}
	
	public boolean isEquals(Polypheme poly) {
		if(this.prenom.equals(poly.prenom) && this.nom.equals(poly.nom)) {
			return true;
		}
	
	return false;
}
	
	/**
	 * Cette methode renvoie la valeur de l'atttribut nom
	 * @return nom
	 */
	
	public String getNom() {
		return nom;
	}
	
	/**
	 * Cette methode renvoie la valeur de l'atttribut prenom
	 * @return prenom
	 */
	
	public String getPrenom() {
		return prenom;
	}
	
	
	/**
	 * Methode qui modifie la valeur de l'attribut nom
	 * 
	 * @param n nouveau nom
	 */
	public void setNom(String n) {
		nom = n;
		}

	/**
	 *  Methode qui modifie la valeur de l'attribut prenom
	 * @param p
	 */
	public void setPrenom(String p) {
		prenom = p;
	}
	
	/**
	 *  Methode qui affiche un message
	 */
	public void afficherDetails() {
		System.out.println("Vous êtes " + prenom + " "+ nom + " " + surnom);
	}
}