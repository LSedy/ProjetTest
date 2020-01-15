package com.crm.api;

import java.util.Scanner;

public class ReductionBilletTrain1 {

	public static void main(String[] args) {
		// Reduction billet de train sans if else (imbriqué)

		Scanner old = new Scanner(System.in);
		System.out.println("Halte la! Quel age avez vous, vil manant?");
		int age = old.nextInt();
		if (age >= 25) {
			if (age > 60) {
				System.out.println("déjà" + age
						+ "ans? Le temps s'écoule de plus en plus vite pour vous, alors vous avez une réduction de 50%. après tout, chaque instant qui passe dévore un morceau de nos vies.");
			} else {
				System.out.println("Donc, vous avez " + age
						+ "ans. Vous avez de la chance! Vous n'avez le droit a aucune réduction, contrairement à tous les autres! Mais rassurez vous, vous pouvez encore vous raccrocher a vos larmes. Bonne journée!");
			}
		} else {
			System.out.println(age
					+ "ans, n'est ce pas? Vous êtes encore un enfant. Les enfants peuvent avoir une réduction de 30% sur le billet de train. mais pas y entrer!");
			old.close();
		}

		// obsolete?
//alway here.
	}
}

//		int age;
//		int jeu = 20;
//		int adu = 40;
//		int anc = 60;
//		Scanner scorn = new Scanner(System.in);
//		if (age>20) {
//		System.out.println("VAR + "ans, n'est ce pas? Vous êtes encore un enfant. Les enfants peuvent avoir une réduction de 30% sur le billet de train. mais pas y entrer!");
//		
//		}
//		System.out.println("Donc, vous avez " + VAR + "ans. Vous avez de la chance! Vous n'avez le droit a aucune réduction, contrairement à tous les autres! Mais rassurez vous, vous pouvez encore vous raccrocher a vos larmes. Bonne journée!");
//		
//		System.out.println("déjà" + VAR + "ans? Le temps s'écoule de plus en plus vite pour vous, alors vous avez une réduction de 50%. après tout, chaque instant qui passe dévore un morceau de nos vies.");
//		
//		//15>25
//		//30>60
//		//60>159
