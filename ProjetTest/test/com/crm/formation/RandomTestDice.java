package com.crm.formation;

import java.util.Scanner;

public class RandomTestDice {

	public static void main(String[] args) {
		// Jet de 3 des de deux personnes differentes. elle rentre d'abord leurs nom, puis jette 3 dés trois fois en trois manches. celui qui a fait le plus grand nombre de point est déclaré vainqueur 
		Scanner dice = new Scanner(System.in);
		String player1;
		System.out.println("Enter a name for player one");
		dice.hasNextInt();				
		
		
		double  des = random(1.6);
		System.out.println("has lauch the dice");
		dice.close();	
	}
	
	private static double random(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
