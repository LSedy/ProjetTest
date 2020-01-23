package com.crm.formation;

import java.util.Scanner;

public class RandomTestDice {

	public static void main(String[] args) {
		// Jet de 3 des de deux personnes differentes. elle rentre d'abord leurs nom, puis jette 3 dés trois fois en trois manches. celui qui a fait le plus grand nombre de point est déclaré vainqueur 
		Scanner scan = new Scanner(System.in);
		String player1, player2;
		System.out.println("Enter a name for player one");
		player1 = scan.nextLine();
		System.out.println("Enter a name for player two");
		player2 = scan.nextLine();
		
		//forcer un int pour Math avec les parenthese
		int des1 = (int)(Math.random() * (6) + 1);
		int des2 = (int)(Math.random() * (6) + 1);
		System.out.println(player1 + " attack with the dice! " + des1);
		System.out.println(player2 + " attack with the dice! " + des2);
		scan.close();	
	}
	

}

	

