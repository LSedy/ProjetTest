/**
 * 
 */
package com.crm.bo;


/**
 * @author 5Y2
 *
 */
public class RectangleCalc {

		//Attributs
		private float lon;
		private float lar;
		
		// Constructeur par défault
		public RectangleCalc() {
			lon = 0F;
			lar = 0F;
		}
		
		// Constructeur avec parametres (pour initialiser souvent, on donne des valeurs aux attributs. ont les valorise)
		public RectangleCalc(float lon , float lar) {
			this.lon = lon;
			this.lar = lar;
		}
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
		
		// Surcharger les méthodes calculPerimetre() et calculSurface() pour qu'elles retournent une chaîne de caractères et possèdent un argument 
					// "unité de mesure" de type String
					// Ex : appel méthode calculPerimetre surchargée
		
		
		//(P = ( L + l) x 2 ) calcul du périmetre
		public float calculPeri() {
			return (lon + lar ) *2;
		}
		
		public String calculPeri(String mesure) {
			return (lon + lar ) *2 + mesure;
		}
		

		//S = ( L * l ) calcul de la surface
		public float calculSurf() {
			return lon * lar;
		}
		
		public String calculSurf(String mesure) {
			return lon * lar + mesure;
		}
		
		
		
}
