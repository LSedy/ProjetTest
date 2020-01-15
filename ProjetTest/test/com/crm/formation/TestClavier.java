/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class TestClavier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir... quelque chose :");
		String str = sc.nextLine();
		System.out.println("vous avez saisi : " + str);
		sc.close();
	}

}
