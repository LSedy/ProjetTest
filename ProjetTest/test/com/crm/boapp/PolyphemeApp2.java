/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Polypheme;

public class PolyphemeApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polypheme poly = new Polypheme();
		Scanner scan = new Scanner(System.in);
		
		//insertion du prenom
		System.out.println("quel est votre prénom?");
		poly.setPrenom(scan.nextLine());
		System.out.println(poly.getPrenom());
		
		//insertion du nom
		System.out.println("Quel est votre nom?");
		poly.setNom(scan.nextLine());
		System.out.println(poly.getNom());
		
		//insertion du surnom
		System.out.println("Quel est votre surnom?");
		poly.surnom = scan.nextLine();
		System.out.println(poly.surnom);
		
		// insertion du nom + prenom + surnom dans une phrase
		System.out.println("Vous êtes " + poly.getPrenom() + " " + poly.getNom() + " (" + poly.surnom + ")");
		scan.close();
	}

}
