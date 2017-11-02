package fr.netapsys.pepiniere.javase.fondamentaux;

import org.junit.Assert;
import org.junit.Test;

/**
 * Les tests à valider pour l'exercice 1 des fondamentaux JAVA.
 * 
 * @author Jerome
 *
 */
public class Exercice1Test {

	/**
	 * Mettre à jour la méthode roar en ajoutant aux objets roar1 et roar2 3 points
	 * d'exclamations tout en validant les tests.
	 */
	@Test
	public void testRugissement() {
		// Préparation
		final String roar1 = "roar";
		final StringBuilder roar2 = new StringBuilder("roar");
		new Exercice1().rugissement(roar1, roar2);
		// Vérifications
		Assert.assertEquals("Vérification de la valeur de la chaine roar1", "roar", roar1);
		Assert.assertEquals("Vérification de la valeur de la chaine roar2", "roar!!!", String.valueOf(roar2));
	}

	/**
	 * Ecrire la méthode deuxRugissements pour valider le test.
	 */
	@Test
	public void testDeuxRugissements() {
		// Préparation
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		roar1 = new Exercice1().rugissementDeux(roar1, roar2);
		// Vérifications
		Assert.assertEquals("Vérification de la valeur de la chaine roar1", "roar!!!", roar1);
		Assert.assertEquals("Vérification de la valeur de la chaine roar2", "roar!!!", String.valueOf(roar2));
	}

	/**
	 * Valider les assertions.
	 */
	@Test
	public void testReferences() {
		Exercice1 un = new Exercice1();
		un.setNumero(1);
		Exercice1 deux = new Exercice1();
		un = deux;
		Assert.assertTrue("Sans utiliser le setter de deux, vérifier l'égalité", un.getNumero() == deux.getNumero());
		deux = null;
		Assert.assertNull("Vérifier la condition", deux);
		Exercice1 trois = new Exercice1();
		trois = deux;
		Assert.assertNull("Réassigner trois à une référence existante pour vérifier l'égalité", trois);
		Exercice1 quatre = new Exercice1();
		quatre = un;
		quatre.setNumero(4);
		Assert.assertTrue("En manipulant la référence quatre, vérifier la condition", un.getNumero() == 4);
	}
}
