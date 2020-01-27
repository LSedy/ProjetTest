/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author 5Y2
 *
 */
public class SommeElementTableau {
//demande a l'utilisateur le tableau qu'il veut, quelle taille, etc
	/**
	 * @param args
	 * @apiNote méthode qui calcule la somme des éléments passés en paramètres et
	 *          l'utiliser dans un main
	 */
	public static void main(String[] args) {
		// recuperer la saisie clavier dans invoke
		int[] tableau1;
		System.out.println("quel taille fera votre tableau invoqué?");
		Scanner cast = new Scanner(System.in);
		int invoke = cast.nextInt();
		System.out.println("alors, celui-ci feras " + invoke + "." + " Qu'il en soit ainsi");
		tableau1 = new int[invoke];
		for (int i = 0; i < invoke; i++) {
			System.out.println("veuillez entrer une valeur: ");
			tableau1[i] = cast.nextInt();
		}

		castTab(tableau1); // APPELEZ UNE FONCTION!!! TU DOIS T'EN SOUVENIR!!!!!!!
		System.out.println("La somme finale! vaut " + castTab(tableau1));

		cast.close();

	}

	public static int castTab(int[] tableau) {
		// Methode qui appelle le tableau
		// calculer la somme de toutes les valeurs du tableau
		int somme = 0;
		for (int compteur = 0; compteur < tableau.length; compteur++) {
			somme = somme + tableau[compteur];

		}
		return somme;
	}

}
