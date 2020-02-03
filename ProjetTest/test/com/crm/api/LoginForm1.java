package com.crm.api;

import java.util.Scanner;

/**
 * @author 5Y2
 *
 */
public class LoginForm1 {

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
		if (logid.equals(LOGID)) {
			System.out.println("Bien! c'est le bon identifiant.");
			System.out.println(
					" Maintenant, veuillez entrer le mot de passe, sinon, des conséquences terrible adviendrons.");
			logmdp = log.nextLine();

			if (logmdp.equals(LOGPWD)) {
				System.out.println("Bienvenue! Toi qui entre ici, abandonne tout espoir");
			} else {
				System.out.println("Vous ne passerez pas!! Jamais plus!! il est trop tard...");

			}
		} else {
			System.out.println("ERROR. veuillez reessayez.");
		}
		log.close();
	}
}
// Scanner logmdp; new Scanner(System.in);
// String lecto = mdp.nextline();

// test reda comparatif a faire
//				Scanner sc = new Scanner(System.in);
//				String login;
//				String pwd;
//				System.out.println("Entrez le login");
//				login = sc.nextLine();		
//				if (login.equals("CRM")) {			
//					System.out.println("login accepté");			
//					System.out.println("Taper le mot de passe");
//					pwd = sc.nextLine();
//					if (pwd.equals("CDI1234")) {
//						System.out.println("BIENVENUE");
//					} else {
//						System.out.println("si tu me donnes des sous je te laisse rentrer ");
//					}		} else {
//					System.out.println("login incorrect ,Entrez le login à nouveau");
//				}	}
//
// }
