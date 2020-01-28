package com.crm.api;

import java.util.Scanner;

/**
 * @author 5Y2
 *
 */
public class NombrePair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// test nombre pair/impair

		Scanner num = new Scanner(System.in);
		System.out.println("un nombre, s'il vous plait ");
		int pair = num.nextInt();
		int reste = pair % 2;
		if (reste == 0) {
			System.out.println("Ce nombre est pair. C'est bien.");
		} else {
			System.out.println("Ce nombre est impair. Bouuuh. C'est mal.");

		}
		num.close();
	}
}
