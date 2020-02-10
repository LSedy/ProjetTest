/**
 * 
 */
package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.Polypheme;

/**
 * @author 5Y2
 *
 */
public class VecteurApp { //page 195 approximativement ds le cours java

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Vector groupe = new Vector();
		Polypheme michael = new Polypheme ("Michael", "Jackson");
		Polypheme vasili = new Polypheme ("Vasili", "Zatseiv");
		
		groupe.addElement(michael);
		groupe.addElement(vasili);
		
		Polypheme unBasquetteur1 = (Polypheme) groupe.get(0);
		System.out.println(unBasquetteur1.getNom());
		
		System.out.println("Mon équipe a: " + groupe.size() + " joueurs");
		
		Polypheme hulk = new Polypheme ("Hulk", "Hogan");
		groupe.addElement(hulk);
		
		System.out.println("Mon equipe a: " + groupe.size() + " joueurs");
		
		System.out.println("Le joueur Vasili Zatseiv est à la " + (groupe.indexOf(vasili) +1) + " position");
			
		vasili.surnom = "the hunter";
		Polypheme vasiliModif = (Polypheme)groupe.get(1);
		System.out.println("Le surnom de Vasili Zatseiv est " + vasiliModif.surnom);
		
		}

	}	
				
				
//		String nom = film.getNextName();
//		films.addElement (nom);
//		
//		// insère une chaîne au début
//		films.insertElementAt(name, 0);
//		
//		// Supprime le premiet élément
//		films.removeElement;
//		
//		//recherche le premier element
//		Film f = (Film)films.fistElement();
//		
//		//recherche un element a une position spécifique
//		Film f = (Film)films.elementAt(2);
//		
//		//recje un objet dans un vecteur
//		int position = films.indexOf(name);
//		