/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class ConversionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// conversion Implicite
		
		int x = 123456;
		long y = x;		//conversion implicite de int vers long
		byte a = (byte) y;

		int b = 65537;
		short c = (short) b;
						// conversion explicite de int vers short => c==1
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//  erreur importante?
		
		long l1 = 123456789;
		long l2 = 123456788;
		
		float f1 = l1;
		float f2 = l2;
		
		f1 = l1;
		f2 = l2;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(l1 - l2);	// 1
		System.out.println(f1 - f2);	// 8 !!
		
		//int nb1 = 2;
		//int nb2 = ++nb1;
		// nb = nb + 1;
		// nb++ pour nombre PUIS incrementation OU ++nb pour d'abord chiffre incrementé PUIS nombre! l'ordre est inversé, 
		// ce qui est très important dans une suite de chiffres;
		
		//System.out.println(nb1);
		//System.out.println(nb2);		
		
		
		int var1 = 7, var2 = 13;
		boolean res = true;
		
		res = (var1 == var2);		// res est faux
		res = (var2 <= var1);		// res est vrai
									// >supérieur >= supérieur ou égal < inférieur <= inferieur ou égal == egal != différent
		System.out.println(res);
		
		
		/** expr_booleenne ? expr1 : expr2 */	//syntaxe raccourci du "si... alors... sinon"
		/*
		boolean bool1 = false;
		boolean bool2 = true;
		boolean bool3 = bool1 | bool2;
		System.out.println(bool3);
		*/
		
		short nb1, nb2, nb3, nb4;
		nb1 = 1;
		nb2 = 2;
		nb3 = 6;
		nb4 = 7;
		boolean bool1 = nb1>nb2;
		boolean bool2 = nb3!=nb4;
		boolean bool3 = bool1 | bool2;
		System.out.println(bool3);
		//	System.out.println(!bool3);
		
		//|||||||||||||||||||||||||||||||||| opérateur d'assignement
		
		double total = 0, num = 1;
		double pourcentage = 0.50;
		/*
		total = total + num;	// total vaut 1
		total += num;		// total vaut 2
		total -= num;		// total vaut 1
		total *= num;		// total vaut 0.5
		total /= 2;			// total vaut 0.25
		num %= pourcentage;	// num vaut 0
		System.out.println("numéro vaut " + num);
		System.out.println("le total vaut " + total);
		*/
		
		
		//|||||||||||||||||||||||||||||||||| Concaténation chaîne de Caractères
		/*
		String nom = "DUPONT";
		String prenom = "Paul";
		String nomComplet;
		nomComplet = prenom + " " + nom;
		
		String nomComplet2 = prenom + "";
		nomComplet2 += nom;
		*/
		
		
		
	}

}
