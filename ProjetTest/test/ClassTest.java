/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Au revoir");
		System.out.println("Mais non, attendez!");
		System.out.println("Enfin pourquoi?");
		System.out.println("Pour tester les raccourci clavier allons!");
		System.out.println("Alors évitez au moins les fôtes d'orthogriff");
		System.out.println("Bein sûr.");
		System.out.println("...");
		
		int maVariableInt;
		maVariableInt = 2;
//		commentaire avec Ctrl 7!!
		
		System.out.println(maVariableInt);
		
		maVariableInt = 10;
		System.out.println(maVariableInt);

		maVariableInt = 314;
		System.out.println(maVariableInt);
		
		byte maVariableByte = 25;
		short maVariableShort = 2568;
		int laVariableInt = 2055;
		long maVariableLong = 999999999L;
		System.out.println(maVariableInt);
		
		//		Opérateur d'assignement, d'affectation
		float maVariableFloat = 3.14F;
		double maVariableDouble = 0.123456789;
		
		char maVariableChar1 = 'E';
		char maVariableChar2 = '\u0256';
		System.out.println(maVariableChar2);
		
		boolean maVariableBool = true;
		
		String maChaine1 = "je suis autrefois, j'ai été avant";
		String maChaine2 = " désormais, je serais jadis.";
		String maChaine3 = maChaine1 + maChaine2;
		System.out.println(maChaine3);
		System.out.println(maVariableByte / maVariableFloat + maVariableDouble );
		
		System.out.println();
		
	}
	
}
