package com.crm.api;

import java.util.Scanner;

public class ReductionBilletTrain2 {

	public static void main(String[] args) {
		// Reduction billet de train avec if else (non-imbriqué)
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Halte! Quel age avez-vous, vil manant?");
		int age = scan.nextInt();
		if (age <= 25) {
			System.out.println("Réduction -25ans");
		} else if (age >= 60) {
			System.out.println("Réduction +60ans");
		} else {
			System.out.println("Pas de réduction!");
		}
		scan.close();
		
	}
}