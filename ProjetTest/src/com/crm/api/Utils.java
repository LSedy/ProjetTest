/**
 *
 */
package com.crm.api;

/**
 * @author CRM
 *
 */
public class Utils {
	public static final String COULEUR_ROUGE = "Lycoris";
// Declaration, d'une constante, PI! public static final float PI = 3.14F;
	public static final float PI = 3.14F;

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

	public static int somme(int c, int d) {
		int solu = c + d;
		return solu;
	}

	public static int difference(int e, int f) {
		int sol = e - f;
		return sol;
	}

	public static float faceCercl(int ray) {
		final float PI = 3.14F;

		float air = (ray * ray) * 3.14159265359F;
		return air;
	}

	public static String myMethod(String smin) {
		return smin + " il semblerais, oui !!";
	}

}
