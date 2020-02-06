/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Calculs;



/**
 * @author 5Y2
 *
 */
public class CalculRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculs calc = new Calculs();
		Scanner scan = new Scanner(System.in);
		
		// Demande de la longueur a l'utilisateur
		System.out.println("Veuillez indiquer la longueur du rectangle");
		calc.setLon(scan.nextFloat());
		System.out.println(calc.getLon());
		
		// Demande de la largeur a l'utilisateur
		System.out.println("Veuilez indiquer la largeur du rectangle");
		calc.setLar(scan.nextFloat());
		System.out.println(calc.getLar());
		
		//L'autre rectangle pour la comparaison
		// Demande de la longueur a l'utilisateur
		System.out.println("Veuillez indiquer la longueur de l'autre rectangle");
		calc.setLonb(scan.nextFloat());
		System.out.println(calc.getLonb());
		
		// Demande de la largeur a l'utilisateur
		System.out.println("Veuilez indiquer la largeur de l'autre rectangle");
		calc.setLarb(scan.nextFloat());
		System.out.println(calc.getLarb());
		
		
		// Affichage de la surface du premier rectangle et de son perimetre
		calc.afficherCalPerSur();
		calc.afficherCalPerSurBis();
		//fermeture du scanner
		scan.close();
		
		//Comparaison de deux rectangle
		calc.afficherRectangleComp();
		
			
		
	}

}