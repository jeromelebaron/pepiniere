package fr.netapsys.pepiniere.javase.fondamentaux;

/**
 * La classe pour l'exercice 1.
 * @author Jerome
 *
 */
public class Exercice1 {

	/** Le numéro de l'exercice.*/ 
	private int numero;
	
	/**
	 * Pour rugir.
	 * @param roar1 le premier rugissement.
	 * @param roar2 le second rugissement.
	 */
	public void rugissement(final String roar1, final StringBuilder roar2) {
		roar1.concat("!!!");
		roar2.append("!!!");
	}

	/**
	 * Pour rugir encore plus.
	 * @param roar1 le premier rugissement.
	 * @param roar2 le second rugissement.
	 */
	public String rugissementDeux(String roar1, final StringBuilder roar2) {
		roar2.append("!!!");
		roar1 += "!!!";
		return roar1;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
