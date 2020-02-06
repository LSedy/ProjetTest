S/**
 * 
 */
package com.crm.bo;


/**
 * @author 5Y2
 *
 */
public class Calculs {

		//Attributs
		private float lon;
		private float lar;
		public float surface;
		public float perimetre;
		//pour comparaison de la surface de  deux rectangle & perimetre
		private float lonb;
		private float larb;
		public float surfaceBis;
		public float perimetreBis;
		
		// Methodes
		
		/**
		 *  Methode qui permet le calcul du perimetre d'un rectangle (P = ( L + l) x 2 ) en fonction des données fournis par l'utilisateur
		 *  Methode qui permet le calcul de la surface d'un rectangle ( L * l ) en fonction des données fournis par l'utilisateur
		 *  Methode qui permet le calcul d'une racine carré (^8) en fonction des données fournis par l'utilisateur
		 *  
		 */
				
		/**
		 *  Methode qui renvoie puis modifie la valeur de l'attribut lon
		 * @return
		 */
		public float getLon() {
			return lon;
		}
		
		public void setLon(float lo) {
			lon = lo;
		}
				
		/**
		 *  Methode qui renvoie puis modifie la valeur de l'attribut lar
		 * @return
		 */
		
		public float getLar() {
			return lar;
		}
		
		public void setLar(float la) {
			lar = la;
		}
		
		/**
		 *  Methode qui renvoie puis modifie la valeur de l'attribut lonb RECTANGLE COMPARAISON
		 * @return
		 */
		public float getLonb() {
			return lonb;
		}
		
		public void setLonb(float lob) {
			lonb = lob;
		}
				
		/**
		 *  Methode qui renvoie puis modifie la valeur de l'attribut larb RECTANGLE COMPARAISON
		 * @return
		 */
		
		public float getLarb() {
			return larb;
		}
		
		public void setLarb(float lab) {
			larb = lab;
		}
		
		/**
		 * Methodes qui affichent le resultat d'un calcul (surface & perimetre)
		 */
		
		public void afficherCalPerSur() {
			
			//Calcul du perimetre d'un rectangle
			perimetre = ( lon + lar ) * 2;
			System.out.println("le perimetre du rectangle est de " + perimetre);
			
			// Calcul de la surface d'un rectangle
			surface = lon * lar;
			System.out.println("la surface du rectangle est de " + surface);
		}
		
		public void afficherCalPerSurBis() {
			//Calcul du perimetre & de la surface de l'autre rectangle pour comparaison
			perimetreBis = ( lonb + larb ) * 2;
			surfaceBis = lonb * larb;
			// Afficher message
			System.out.println("la surface de l'autre rectangle est de " + surfaceBis + perimetreBis);
		}
		
		public void afficherRectangleComp() {
			if (surface == surfaceBis) {
			System.out.println("Les deux rectangles sont équivalent");
			}
			else {
				System.out.println("les deux rectangles sont différents! quelle surprise!");
			}
		}
	
}
