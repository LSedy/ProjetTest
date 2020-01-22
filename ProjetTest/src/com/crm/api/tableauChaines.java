package com.crm.api;

import java.util.Scanner;

public class tableauChaines {

	public static void main(String[] args) {
		//afficher un tableau en utilisant une boucle "for"
/*		
		int[] taburoInt = { 0, 1, 2, 3, 4, 5, 6};
		System.out.println("Hic terminus Aeret!");
		for (int limbo : taburoInt) {
			System.out.println("§| " + limbo + " |§");
		}
		
		//afficher un tableau avec des strings & en français, puis un second en anglais
		// Monday - Thursday - Wenesday - Tuesday - Friday - Saturday - Sunday
		
		String[] francaisTabString = { "Lundi", "Mardi", "Mercredi", "Jeudi","Vendredi", "Samedi", "Dimanche"};
		System.out.println("Les jours de la semaine en français");
		System.out.println(francaisTabString[2]);
		System.out.println(francaisTabString.length);
		for (int indice = 0 ; indice < francaisTabString.length ; indice++) {
			System.out.println("||" + francaisTabString[indice]);
		}
		
		String[] englishTabString = {"Monday", "Thursday", "Wenesday", "Tuesday", "Friday", "Saturday", "Sorbay"};
		System.out.println("The day of the week in english");
		System.out.println(englishTabString[2]);
		System.out.println(englishTabString.length);
		for (String warp : englishTabString) {
		System.out.println("#|" + warp + "|#");
		}
*/		
		
		// Demander a l'utilisateur de taper un jour de la semaine en français pour que le logiciel le traduise en anglais
		String[] tabFrScan = { "Lundi", "Mardi", "Mercredi", "Jeudi","Vendredi", "Samedi", "Dimanche"};
		String[] tabEnScan = { "Monday", "Thursday", "Wenesday", "Tuesday", "Friday", "Saturday", "Sunday"};	
		
		System.out.println( "Choose a day of the week to change it in french, the marvellous langage!");
		Scanner scan = new Scanner(System.in);
		String textDay = scan.nextLine();
		for (int lang = 0 ; lang<= tabEnScan.length ; lang++) {
			if (textDay.equals(tabFrScan[lang])) {
				System.out.println(tabEnScan[lang]);
				break;

			}
			if ( textDay != tabEnScan[lang] ) { 
					System.out.println("Mhm... ce n'est pas un jour de la semaine, je le crains, même dans l'espace lointain.");
			break;	
		}
		
		System.out.println("Merci, au revoir.");
		scan.close();
		
//		System.out.println("Ce n'est pas un jour de la semaine.");
//		return;
//		String[] engliestTabString = { "Monday", "Thursday", "Wenesday", "Tuesday", "Friday", "Saturday", "Sunday"};
		
		

		
		//final String choix = scan.next();
		//System.out.println("Mirror Mirror on the wall, who's the fairest of them all?");
		}

	}
}
