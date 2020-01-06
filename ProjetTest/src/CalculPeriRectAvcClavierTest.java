import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class CalculPeriRectAvcClavierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO le Calcul du périmetre d'un rectangle! P = (L + l) × 2.
		
		Scanner canon = new Scanner (System.in);
		System.out.println ("Veuillez saisir une valeur pour la longueur :");
		int longueur = canon.nextInt();
		System.out.println ("Veuillez saisir une valeur pour la largeur :");
		int largeur = canon.nextInt();
		int perimetre ;
		perimetre = ( longueur + largeur ) * 2 ;
		System.out.println("le périmetre  du rectangle est de " + perimetre);
		canon.close();
		
		
		
		
	}

}
