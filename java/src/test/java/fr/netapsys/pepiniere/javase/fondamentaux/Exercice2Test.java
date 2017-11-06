package fr.netapsys.pepiniere.javase.fondamentaux;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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

        // TODO: Remplir le résultat
        String result = "";

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

        // TODO: Corriger la suite pour que mon test passe (vous n'avez pas le droit de modifier la classe Exercice2)
        for (Float monFloat : maListe) {
            maListeContient3 = new Exercice2().isEqualsTo3(monFloat);
        }

        // Vérifications
        Assert.assertTrue("Vérification du résultat", maListeContient3);
    }

}