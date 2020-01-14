package com.crm.formation;

import java.util.Scanner;

public class ExerciceSwitch1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisissez un chiffre saisissant je vous prie.");
		
		int choix = scan.nextInt();
		switch (choix) {
		case 0:
			System.out.println("Vous avez saisi le chiffre zéro. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 1:
			System.out.println("Vous avez saisi le chiffre un. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 2:
			System.out.println("Vous avez saisi le chiffre deux. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 3:
			System.out.println("Vous avez saisi le chiffre trois. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 4:
			System.out.println("Vous avez saisi le chiffre quatre. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 5:
			System.out.println("Vous avez saisi le chiffre cinq. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 6:
			System.out.println("Vous avez saisi le chiffre six. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 7:
			System.out.println("Vous avez saisi le chiffre sept. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 8:
			System.out.println("Vous avez saisi le chiffre huit. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
		case 9:
			System.out.println("Vous avez saisi le chiffre neuf. Félicitation, vous avez reussi a taper sur un clavier.");
			break;
			
		default:
			System.out.println("Allons, ceci n'est pas un chiffre, c'est un nombre! ou une autre anomalie du genre, par exemple, des lettres! brr, ca me dégoute!");
			break;
		}
		scan.close();
	}
}