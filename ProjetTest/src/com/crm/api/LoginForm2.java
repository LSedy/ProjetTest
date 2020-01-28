package com.crm.api;

import java.util.Scanner;

/**
 * @author 5Y2
 *
 */
public class LoginForm2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// test login/mdp simple
		// (logid.equals"CRM"
		// (logmdp.equals"CDI1234"
		final String LOGID = "CRM";
		final String LOGPWD = "CDI1234";

		Scanner log = new Scanner(System.in);
		String logid;
		String logmdp;
		System.out.println("Veuillez entrer votre Identifiant. vous n'avez qu'une seule chance.");
		logid = log.nextLine();
		System.out
				.println(" Maintenant, veuillez entrer le mot de passe, sinon, des conséquences terrible adviendrons.");
		logmdp = log.nextLine();
		if (logid.equals(LOGID) && logmdp.equals(LOGPWD)) {
			System.out.println("Bienvenue! Toi qui entre ici, abandonne tout espoir.");
		} else {
			System.out.println("Vous ne passerez pas!!");
		}

		log.close();
	}
}