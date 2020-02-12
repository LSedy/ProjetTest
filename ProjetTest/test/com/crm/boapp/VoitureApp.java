/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Voiture;

/**
 * @author 5Y2
 *
 */
public class VoitureApp {
	public static void main(String[] args) {
		Voiture runOut = new Voiture();
		Scanner scan = new Scanner(System.in);
		// retour caractéristique techniques
		String reponse = " ";

		System.out.println("Bonjour, Michae...Utilisateur. Quel est votre nom?");
		runOut.setName(scan.next());
		System.out.println("Bien compris. Bonjour, " + runOut.getName()
				+ ". Je suis votre ordinateur de bord. Que voulez-vous faire à présent?");
		do {
			System.out.println("Choissisez une marque d'automobile");

			System.out.println("Choissisez une couleur");

			System.out.println("Choisissez le type de boîte a vitesse");

			System.out.println("Afficher les caractéristiques techniques");
			// ces caractéristiques vous conviennent t'elle? oui recommencer

			do {
				System.out.println("Ces caractéristiques vous conviennent elle? (Y/N)");
				scan.hasNextLine();
			} while (reponse.equalsIgnoreCase("Y"));
		} while (reponse.equalsIgnoreCase("Y"));

		scan.close();
	}

}
