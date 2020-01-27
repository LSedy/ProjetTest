/**
 * 
 */
package com.crm.api;

/**
 * @author 5Y2
 *
 */
public class SplitChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//chaine de caractère a splitter
		String strToSplit = "riri,fifi,loulou";
		
		//le resultat du split est stocké dans le tableau
		String[] tabSplit = strToSplit.split(",");
	
		//parcours du tableau avec le séparateur
		for (String str : tabSplit) {
			System.out.println(str);
		}
	}

}
