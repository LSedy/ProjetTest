package com.crm.formation;

public class TableauTest {

	public static void main(String[] args) {
//		int[] tabInt;			int tableau[] = new int[50];
//		tabInt = new int[5];
		
//		int[] tabInt1 = new int[5];
//		System.out.println(tabInt1);
		
//		tabInt1[0] = 5
//		System.out.println(tabInt1[0]);
		
//		System.out.println(tabInt1[1]);
		
//		int tabInt2[] = {1,2,3,4,5};
//		System.out.println(tabInt2[4]);
		
		//Déclaration de tableau
//		int[] tabInt1 = new int[5];
//		int tabInt2[] = new int[5];
		
		//Initaliser un tableau
		int[] tabInt3 = { 1, 2, 3 };
		
		//Accéder à un élément du tableau
		int premierElement = tabInt3[0];
		System.out.println("le premier element (indice 0) du tableau est : " + premierElement);
		
		int deuxiemeElement = tabInt3[1];
		System.out.println("le premier element (indice 1) du tableau est : " + deuxiemeElement);
		
		int troisiemeElement = tabInt3[2];
		System.out.println("le premier element (indice 2) du tableau est : " + troisiemeElement);
		
		//indice depasse la taille du tableau
//		int quatriemeElement = tabInt3[3];
//		System.out.println(quatriemeElement);
		
		//Modifier la valeur d'un élément du tableau
		tabInt3[0] = 10;
		premierElement = tabInt3[0];
		System.out.println("si je remplace par dix le premier element du tableau, cela donne " + premierElement);
		
		//Afficher la taille du tableau
		System.out.println("la taille du tableau est : " + tabInt3.length);
		
		//Parcours du tableau (1ère version)
//		System.out.println(tabInt3[0]);
//		System.out.println(tabInt3[1]);
//		System.out.println(tabInt3[2]);
		
		System.out.println("Parcours du tableau (1ere version)");
		for (int i = 0; i < tabInt3.length; i++) {
			System.out.println(".. " + tabInt3[i]);
			}
		
		//Parcours du tableau (2ème version)
		System.out.println("Parcours du tableau (2ème version)");
		for (int nb : tabInt3) {
			System.out.println("|" + nb + "|");
			
		}
	}

}
