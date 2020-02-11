/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.RectangleCalc;

/**
 * @author 5Y2
 *
 */
	public class RectangleCalculApp {
		
		/**
		 * 
		 * @param args
		 */
		public static void main(String[] args) {
				
			RectangleCalc calc = new RectangleCalc();
			
			//valeurs rectangle par default
			int longueur = 13;
			int largeur = 7;
			
			//calcul de la surface du rectangle par default
			int terrible = longueur * largeur;
			System.out.println("la surface du rectangle par default est " + terrible);
		
			// Demande a l'utilisateur de rentrer une longueur (lon) et une largeur (lar) pour calculer la surface d'un rectangle
			Scanner scan = new Scanner(System.in);
			
			//demande de la longueur
			System.out.println("Veuillez nous indiquer la longueur du rectangle");
			calc.setLon(scan.nextFloat());
			System.out.println("la longueur du rectangle sera de " + calc.getLon());
			
			//demande de la largeur
			System.out.println("Veuillez aussi nous indiquer la largeur du rectangle");
			calc.setLar(scan.nextFloat());
			System.out.println("la largeur du rectangle sera de " + calc.getLar());
			
			//demande de la surface
			System.out.println(" ");
			float terrifiant = calc.getLon() * calc.getLar(); 
			System.out.println("Grace a vos indications, nous pouvons prédire que la surface du rectangle est équivalente à " + terrifiant + " . C'est indécent!" );
			
			//Comparaison entre deux rectangle terrible et terrifiant
			if (terrible == terrifiant) {
				System.out.println("Les deux rectangle sont équivalent! C'est décevant.");
			}
			else {
				System.out.println("Les deux rectangles sont incompatible! C'est incohérent!");
			}
			
			// Surchage methode calcul peri
			calc.calculPeri();
			
			
			
			//fermeture du scanner
			scan.close();
			
		}
}
