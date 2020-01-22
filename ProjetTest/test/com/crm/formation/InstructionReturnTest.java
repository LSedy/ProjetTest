package com.crm.formation;

public class InstructionReturnTest {

	public static void main(String[] args) {
		System.out.println("Début méthode main");
		int nombre = 20;
		afficherListeNombre(nombre);
		System.out.println("Fin méthode main");
	}

	public static void afficherListeNombre(int nb) {
		System.out.println("Début méthode afficherListeNombre");

		for (int i = 0; i < nb; i++ ) {
			if (i == 10) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Fin méthode afficherListeNombre");
	}

}
