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
		String roar = roar1;
		String str = "!!!";
		roar.concat(str);
		StringBuilder roa = roar2.append(str);
		System.out.println(roar);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
