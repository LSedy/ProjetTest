/**
 * 
 */
package com.crm.api;

/**
 * @author 5Y2
 *
 */
public class Tableau2dTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration d'un tableau a deux dimensions
		int[][] tab2d = new int[2][3];
		System.out.println("Déclaration of array of two dimension, and i dislike warning so i cast it here: " + tab2d.length);
		
		// Décalaration avec init
		int [][] tab2dim = { {1,3,5} , {0,2,4} };

		//message parfaitement inutile
		System.out.println("Voici les tableau a deux dimension. j'essayerais un tableau a trois dimension.");
		
		// Accès aux éléments
		System.out.println("élément [0][0] :" + tab2dim[0][0]);
		System.out.println("élément [1][2] :" + tab2dim[1][2]);
		
		//Modification d'un élément
		tab2dim[1][2] = 82;
		System.out.println("élément [1][2] après modification : " + tab2dim[1][2]);
		
		// Taille du tableau
		System.out.println("Taille du tableau tab2dim : " + tab2dim.length);
		
		// Nombres de colonnes
		System.out.println("Nombre de colonnes : " + tab2dim[0].length);
		
		// Parcours du tableau
		System.out.println("Parcours du tableau :");
		for (int i = 0 ; i<tab2dim.length ; i++) {
			for (int j = 0 ; j<tab2dim[i].length ; j++) {
				System.out.println("élément [" + i + "][" + j + "] : " + tab2dim[i][j] );
			}
		}
		System.out.println();
	
		// Déclaration d'un trableau a deux dimensions (colonnes variable)
	int[][] tab2dVar1 = new int [3][];
	tab2dVar1[0] = new int [1];
	tab2dVar1[1] = new int [2];
	tab2dVar1[2] = new int [1];
	tab2dVar1[0][0] = 1;
	tab2dVar1[1][0] = 1;
	tab2dVar1[1][1] = 1;
	tab2dVar1[2][0] = 1;
	
	// Parcours du tableau
	System.out.println("Parcours du tableau tab2dVar1 :");
	
	for (int i = 0 ; i < tab2dVar1.length ; i++) {
		for (int j = 0 ; j <tab2dVar1[i].length ; j++) {
			System.out.println(tab2dVar1[i][j]);
		}
		System.out.println(" la maladie du sommeil");
	}
	
	// Déclaration avec init(colonnes variables) \n\n
	int[][] tab2dVar2 = { {1,1,1} , {1,1,1,1,1,1} , {1} , {1,1,1,1,1,1,1} };
	
	// Parcours du tableau
	System.out.println("Parcours du tableau tab2dVar2");
	for (int i = 0 ; i<tab2dVar2.length ; i++) {
		for (int j = 0 ; j<tab2dVar2[i].length ; j++) {
			System.out.println("||" + tab2dVar2[i][j] + "||");
		}
		System.out.println();
	}
	
	// Acceder à un mauvais indice
	tab2dVar1[2][1] = 1;
	
	}
}
