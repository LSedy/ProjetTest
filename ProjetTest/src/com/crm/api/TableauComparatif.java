/**
 * 
 */
package com.crm.api;

import java.util.Arrays;

/**
 * @author 5Y2
 *
 */
public class TableauComparatif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Rechercher dans les APIs Java une méthode permettant de comparer deux
		// tableaux et la tester

		// int[] tableau = new int[5];
		// int[] tableou = new int[3];

		int[] tableau = { 1, 2, 3 };
		int[] tableou = { 1, 2, 3 };	
		
		// It is consistent: for any non-null reference values x and y, multiple
		// invocations of x.equals(y) consistently return trueor consistently return
		// false,
		// provided noinformation used in equals comparisons on theobjects is modified
		// System.out.println("maybe it's working now? we will see that: " +
		// tableau.equals(tableou));
		// java.util.Arrays.equals(x, y); marche aussi
		
		
		System.out.println("maybe it's working now? we will see that: " + Arrays.equals(tableau, tableou));
//		System.out.println("maybe it's working now? we will see that: " + compareTo(tableau, tableou));
		
	}

//	private static String compareTo(int[] tableau, int[] tableou) {
//		// autre methode de comparaison
//		String return null;
//	}

}

//		compareTo() vs. equals()