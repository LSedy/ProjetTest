/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author 5Y2
 *
 */
public class TableauTraductionFrEn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration des variables
		String lang = "";
		String day = "";
		Scanner scan = new Scanner(System.in);
		final String LANGFR = "Francais";
		final String LANGEN = "English";

		// création du tableau contenant les mots a traduire en deux dimension
		String[][] tabTrad2d = { { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" },
				{ "Monday", "Thursday", "Wenesday", "Tuesday", "Friday", "Saturday", "Sunday" } };
		// Demander des informations a l'utilisateur
		System.out.println("Quel est la langue source? ");
		lang = scan.nextLine();
		if (lang.equalsIgnoreCase(LANGFR)) {
			System.out.println("la langue choisi est le Français");
			System.out.println("à present, quel jour de la semaine souhaitez-vous traduire?");
			day = scan.nextLine();
			// Le mot existe dans la table de traduction
			// je peut utiliser l'indice "i" pour trouver le mot en anglais
			for (int i = 0; i < tabTrad2d[0].length; i++) {
				if (day.equalsIgnoreCase(tabTrad2d[0][i]))
					System.out.println(
							"le jour choisi est " + day + " qui se traduit " + tabTrad2d[1][i] + " en anglais.");
				continue;
			}
		} else if (lang.equalsIgnoreCase(LANGEN)) {
			System.out.println("You're one of us! You have choose English, congrats!");
			System.out.println("So, now what's the day do you want to translate in french?");
			day = scan.nextLine();
			// Le mot existe dans la table de traduction
			// je peut utiliser l'indice "i" pour trouver le mot en français
			for (int i = 0; i < tabTrad2d[1].length; i++) {
				if (day.equalsIgnoreCase(tabTrad2d[1][i]))
					System.out.println(
							"the choosen day is " + day + " who's translate in " + tabTrad2d[0][i] + " in french.");
				continue;
			}
		} else 
			System.out.println("les termes saisis sont incorrects");
		
			scan.close();
		}
	
}
