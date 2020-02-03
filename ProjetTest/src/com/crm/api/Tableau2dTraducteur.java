/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author 5Y2
 *
 */
public class Tableau2dTraducteur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Traducteur Anglais/Français
//		String[][] tabTrad2d = new String [3][];
//		tabTrad2d[0] = new String ["Français"];
//		tabTrad2d[1] = new String ["English"];
//		tabTrad2d[2] = new String ["russe qui marche pas en UTF8"];
//		tabTrad2d[0][1] = "Lundi"
		
		//Declaration tableau des jours a traduire
		String[][] tabTrad2d = { 	{"Français","English","inconnu"} ,
									{"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"} ,
									{"Monday","Thursday","Wenesday","Tuesday","Friday","Saturday","Sunday"} ,
									{"un","deux","trois","quatre","cinq","six","sept"}
								};
		String lang;
		String day;
		Scanner scan = new Scanner(System.in);
		//choix de la langue
		System.out.println ("What is the native langage?");
		lang = scan.nextLine();
		System.out.println("you choose " + lang );
			for (int i = 0 ; i<tabTrad2d.length ; i++) {
				//choix de la langue + choix du jour
				if (lang.equals(tabTrad2d[0][1])) {
					
				
				}
				if (lang.equals(tabTrad2d[0][2])) {
					
				
				}
				if (lang.equals(tabTrad2d[0][3])) {
					
				
				
				}		
				else {}	
				//si en choisi	
				 
			}
		
		
		
//			for( i = 0 ; i<tabTrad2d[1].length ; i++) {
//				for (j = 0 ; j<tabTrad2d[2].length ; j++) {
//					System.out.println();
//				}
			scan.close();
			}
		
		
		
		//Modification d'un jour
//		tabTrad2d[2][6] = "Sorbey";
//		System.out.println("le samedi doit changer. Il se nommera désormais " + tabTrad2d[2][6] );
		
//		String sc = ;
//		Scanner scan = new Scanner(System.in);
//		System.out.println ("Quelle est la langue source?");
//		System.out.println ("La langue source est: " + **);
//		scan.next();
//		scan.close();
	

}
