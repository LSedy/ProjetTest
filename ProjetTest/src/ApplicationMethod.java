import com.crm.api.Utils;

public class ApplicationMethod {

	public static void main(String[] args) {
		/*
		 * int nb1 = 13; int nb2 = 7; int s1 = Utils.somme(nb1, nb2) * 2;
		 * System.out.println(s1); //soustraction int difference =
		 * MethodMaths.comtuveu(nb1, nb2); System.out.println(difference); //afficher un
		 * message Utils.affichMess("cogito ergo sum"); //aire d'un cercle int rayon =
		 * 9; float air = Utils.aircercl(rayon); System.out.println(air);
		 * 
		 * float pi = (float) java.lang.Math.PI;
		 * 
		 */
//final (countdown) couleurs
		System.out.println("le ciel est d'une couleur similaire à " + Utils.COULEUR_BLEU
				+ ", le Roi en Jaune. Pâle, cramoisi, malaisante... il n'est pas bleu, helas!");

		int alp = 2;
		int bet = 9;
		int maxNombr = Math.max(alp, bet);
		System.out.println(maxNombr);

		// double rho = Math.PI;

		// final double MON_PI = Math.PI;
		int ray = 666;
		
		System.out.println("l'air du cercle est de " + Utils.cerclus(ray) + "cm");

	}

}
