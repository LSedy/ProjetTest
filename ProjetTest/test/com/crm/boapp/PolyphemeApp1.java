/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Polypheme;

/**
 * @author 5Y2
 *
 */
public class PolyphemeApp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polypheme poly = new Polypheme();
		poly.surnom = "Julius";
		poly.setNom("Caesar");
		
		System.out.println("ainsi arriva " + poly.getNom() + " (" + poly.surnom + ")");
		
		Polypheme poly2 = new Polypheme();
		poly2.afficherDetails();
		
		Polypheme poly3 = new Polypheme("bob" , "dylan");
		poly3.afficherDetails();

	}

}
