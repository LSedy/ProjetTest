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
		String name;
		String lastname;
		String nickname;
		poly.setNom(name);
		poly.setPrenom(lastname);
		poly.surnom;
		
		
		System.out.println("quel est votre prénom?");
		scan.nextLine(scanNom);
		System.out.println();
		
		System.out.println("Quel est votre nom?");
		System.out.println(scan);
		
		System.out.println("Quel est votre surnom?");
		System.out.println(scan);
		
		System.out.println("Vous êtes " + poly.getNom() + " " + poly.getPrenom() + " (" + poly.surnom + ")");
		scan.close();
	}

}
