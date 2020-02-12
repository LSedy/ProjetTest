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
		
		System.out.println("Bonjour, Michae...Utilisateur. Quel est votre nom?");
		runOut.setName(scan.next());
		System.out.println("Bien compris. Bonjour, " + runOut.getName() + ". Je suis votre ordinateur de bord, K-3000. Que voulez-vous faire à présent?");
		while (runOut == true) {
			
		}
		
		
		scan.close();
	}

}
