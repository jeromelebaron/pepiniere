package fr.netapsys.pepiniere.javase.fondamentaux;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Netapsys on 06/11/17.
 */
public class Exercice2Test {

    @Test
    public void testConcatEtEquals() {
        // Préparation
        String chaine = "exo2";
        chaine += 1;
        chaine += 2;
        chaine += chaine == "exo212";
        chaine += chaine.equals("exo212");
        String chaine2 = "testChaine2";
        chaine += chaine2 == "testChaine2";
        chaine += chaine2.equals("testChaine2");

        String result = "exo212falsefalsetruetrue";

        // Vérifications
        Assert.assertEquals("Vérification du résultat", result, chaine);
    }

    @Test
    public void testBoxing() {
        // Préparation
        List<Float> maListe = new ArrayList<>(4);
        maListe.add(2f);
        maListe.add(3f);
        maListe.add(4.7f);
        maListe.add(null);

        boolean maListeContient3 = false;

        for (Float monFloat : maListe) {
        		maListe.set(3, 3f);
            maListeContient3 = new Exercice2().isEqualsTo3(monFloat);
        }

        // Vérifications
        Assert.assertTrue("Vérification du résultat", maListeContient3);
    }

}