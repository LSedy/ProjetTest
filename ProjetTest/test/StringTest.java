

import java.util.Scanner;

/**
 *
 */

/**
 * *
 * *@Author CRM
 * */
public class StringTest {

	public static void main(String[] args) {
		String text = "Bonjour";
		System.out.println(text);
		
		text = "Non, au revoir";
		System.out.println(text);
		
			//Test de la concaténation
		text = text + " Khalil";
		System.out.println(text);
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("vous avez saisi : " + str);
		sc.close();
		
//		Math.addExact(1, 2)
		
		//longueur d'une chaine
		String str1 = " java c'est pas génial? -_- ";
		System.out.println(str1.length());
		
		//mettre en majuscule
		String str2 = str1.toUpperCase();
		System.out.println(str2);
		
		//Suppression des blancs
		String str3 = str1.trim();
		System.out.println(str3);
		
		//Remplacer des caractères
		String str4 = str1.replace('a', 'e');
		System.out.println(str4);
		
		//Extraction d'une sous chaine
		String str5 = str1.substring(0,4);
		System.out.println(str5);
		
		//Comparaison de chaines
		String chaine1 = "test";
		String chaine2 = "test";
		System.out.println(chaine1.contentEquals(chaine2));
		System.out.println(chaine1.equals(chaine2));
		System.out.println(chaine1.equalsIgnoreCase(chaine2));
		}

}
