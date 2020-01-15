/**
 * 
 */
package com.crm.formation;

import com.crm.formation.*;

/**
 * @author CRM
 *
 */
public class MethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// java java
		int nb1 = 2;
		int nb2 = 3;
		int s1 = MethodTest.somme(nb1, nb2);
		System.out.println(s1);

		int nb3 = 7;
		int nb4 = 4;
		int s2 = MethodTest.somme(nb3, nb4);
		System.out.println(s2);

	}

	public static int somme(int alpha, int beta) {
		alpha = 11;
		beta = 6;
		int s = alpha + beta;
		return s;

	}

	public static float calculperirect(float delta, float epsilon) {
		delta = 11;
		epsilon = 6;
		float peri = (delta + epsilon) * 2;
		return peri;

	}

}
