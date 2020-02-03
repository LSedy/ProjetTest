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

	// Methodes
	
	/**
	 * Cette methode renvoie la valeur de l'atttribut nom
	 * @return nom
	 */
	
	public String getNom() {
		return nom;
	}
	
	/**
	 * Methode qui modifie la valeur de l'attribut nom
	 * 
	 * @param n nouveau nom
	 */
	public void setNom(String n) {
		nom = n;
		}
}
