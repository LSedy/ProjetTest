package com.crm.formation;

public class BoucleForTest {

	public static void main(String[] args) {
//		// Boucle For
//		int i = 0;
//		for (i = 0; i < 10; i++) {
//			System.out.println("Voila le " + i);
//			// System.out.println();
//		}

		// boucle For instruction Break test
//		for (int x = -10; x <= 5; x++) {
//			if (x == 0) {
//				System.out.println("division par zéro");
//				break;
//			}
//			System.out.println(2.0 / x);
//		}

		// Boucle For instruction continue
		for (int x = -5; x <= 5; x++) {
			if (x == 0) {
				System.out.println("division par zéro");
				continue;
			}
			System.out.println(1.0 / x);
		}

	}

}
