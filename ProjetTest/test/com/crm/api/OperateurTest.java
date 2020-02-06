package com.crm.api;
/**
 * 
 */

/**
 * @author MOI
 *
 */
public class OperateurTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maVariableInt1;
		maVariableInt1 = 256;
		System.out.println(maVariableInt1);
		
		int maVariableInt2;
		maVariableInt2 = maVariableInt1;
		// System.out.println(maVariableInt2);
		
		int maVariableInt3;
		maVariableInt3 = maVariableInt1 + maVariableInt2;
		System.out.println(maVariableInt3);
		
		
		// TODO cela est un commentaire?
		
		// Test des opérateurs
		int addition ;
		addition = 5 + 6 ;
		System.out.println(addition);
		
		int soustraction;
		soustraction = addition - 7 ;
		System.out.println(soustraction);
		
		int multiplication ;
		multiplication = addition * soustraction;
		System.out.println(multiplication);
		
		float division ;
		division = addition * multiplication / 9.666F;
		System.out.println(division);
		
		float modulo ;
		modulo = ( multiplication / division ) % 13;
		System.out.println(modulo);

	// opérateur d'assignements peuvent être combinés avec d'autres opérateurs
	
		double total=0, num = 1;
		double pourcentage = 0.50;
		
		total = total + num;
		System.out.println(total);
		total += num;
		System.out.println(total);
		total -= num;
		System.out.println(total);
		total *= pourcentage;
		System.out.println(total);
		total /= 2;
		System.out.println(total);
		total %= pourcentage;
		System.out.println(total);
		
		
	}

}
