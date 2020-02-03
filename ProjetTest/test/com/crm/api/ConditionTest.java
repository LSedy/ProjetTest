package com.crm.api;

public class ConditionTest {

	public static void main(String[] args) {
// test condition
		boolean estVrai = true;
		System.out.println("debut du programme");
		if (estVrai == true) {
			System.out.println("YES");
			System.out.println("WE CAN");
		} else {
			System.out.println("NO");
			System.out.println("WE CANNOT");
		}
		System.out.println("fin du programme");
		
		
		
//test truc plus complexe
		
		int nb = 3;
		String chaine = "OKK";
		
		// syntaxe else if
		if (nb>10 && chaine.contentEquals("OK")) {
			System.out.println("Condition remplie");
		} else if (nb > 10 || chaine.equals("OK")) {
			System.out.println("une des deux conditions est remplie"); 
		} else {
			System.out.println("Aucune condition remplie");
		}
		
		// if imbriquée
		if (nb> 10 || chaine.equals("OK")) {
			System.out.println("Condition remplie");
		} else {
			if (nb > 10 || chaine.equals("OK")) {
				System.out.println("Une des deux conditions est remplie");
			 
			}
		}
		
	}
	
}
