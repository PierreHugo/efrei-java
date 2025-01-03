/**
 * Bibliotheque
 *
 * <p>Création de la classe Bibliotheque.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-12-23
 */

package ex2;

import java.util.ArrayList;
import java.util.Collections;

public class Bibliotheque {
    public static void main(String[] args) {
        // Déclaration de l'ArrayList et ajout des nombres de pages
        ArrayList<Integer> pages = new ArrayList<>();
        pages.add(120);
        pages.add(350);
        pages.add(200);
        pages.add(500);
        pages.add(175);
        pages.add(90);
        pages.add(300);

        // 1. Affichage du contenu de la liste
        System.out.println("Nombre de pages des livres : " + pages);

        // 2. Calcul et affichage de la somme totale des pages
        int somme = 0;
        for (int page : pages) {
            somme += page;
        }
        System.out.println("Somme totale des pages : " + somme);

        // 3. Trouver et afficher le nombre de pages minimum
        int minPages = Collections.min(pages);
        System.out.println("Nombre de pages minimum : " + minPages);

        // 4. Trier et afficher la liste
        Collections.sort(pages);
        System.out.println("Liste triée des nombres de pages : " + pages);
    }
}
