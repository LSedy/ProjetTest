package com.crm.api;

import java.util.Scanner;

/**
 * @author 5Y2
 *
 */
public class ExerciceSwitch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final String C = "Concepteur";
		final String D = "Développeur";
		final String R = "Réorientation";
		final String E = "Reflexion";
		
		System.out.println("Choisissez votre destin; - Concepteur - Développeur - Réorientation - Reflexion -");
		final String choix = scan.next();
		switch (choix) {
		case C:
			System.out.println("Vous avez choisi la formation Concepteur Développeur d'Application. Bienvenue en Enfer!");
			break;
		case D:
			System.out.println("Vous avez choisi la formation Développeur Web et Web Mobile. Les fils du destin ne tissent qu'une toile de mort.");
			break;
		case R:
			System.out.println("Vous aller avez choisir de vous réorienter dans une autre voie. Chacun sa route, chacun son chemin.");
			break;
		case E:
			System.out.println("Vous avez encore besoin de temps. l'horloge tourne, le temps nous dévore a chaque seconde, il faudras faire un choix avant qu'il ne soit trop tard.");
		default:
			System.out.println("Veuillez indiquer un choix correct parmis ceux qui vous sont proposé, je vous prie.");
			break;
		}
		scan.close();
	}
}
// i = i+2