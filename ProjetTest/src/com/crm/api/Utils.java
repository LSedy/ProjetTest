/**
 *
 */
package com.crm.api;

/**
 * @author CRM
 *
 */
public class Utils {
	public static final String COULEUR_BLEU = "Hastur";

	public static final float PI = 3.14F;

	float pi = (float) java.lang.Math.PI;

	/*
	 * private static String ;
	 * 
	 * public static int somme(int a, int b) { int s = a + b; return s; }
	 */
//	A d'un cercle = ( r * r ) * π			pi = 3.14159265359

	public static float aircercl(int r) {
		float air = (r * r) * 3.14159265359F;
		return air;
	}

	public static double cerclus(double ray) {
		return Math.PI * (ray * ray);

	}

//	|||||||||||||||||||||||||||||||||||||

	public static void affichMess(String texte) {
		System.out.println(texte);

	}
	/*
	 * //Declaration, d'une constante, PI! public static final float PI = 3.14F;
	 * 
	 * public static int somme(int c, int d); int solu = c + d; return solu; }
	 * public static float faceCercl(int ray) {
	 * 
	 * final float PI = 3.14F;
	 * 
	 * float air = (ray * ray) * 3.14159265359F; return air;
	 */

}
