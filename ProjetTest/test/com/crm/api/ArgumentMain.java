/**
 * 
 */
package com.crm.api;

/**
 * @author 5Y2
 *
 */
public class ArgumentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Run/Run Configurations
		if (args != null) {
			System.out.println("la taille du tableau args est " + args.length);
			
			for (String str : args) {
				System.out.println(str);
				
			}
			
		}
	}

}
