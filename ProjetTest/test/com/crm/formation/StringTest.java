package com.crm.formation;

import java.util.Scanner;

/**
 *
 */

/**
 * *
 * *@Author CRM
 * */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String text = "Bonjour";
		System.out.println(text);
		text = "Non, au revoir";
		System.out.println(text);
		
			//Test de la concaténation
		text = text + " Khalil";
		System.out.println(text);
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("vous avez saisi : " + str);
		
		
	}

}
