/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class LectureClavierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("vous avez saisi : " + str);
		sc.close();
	}

}
