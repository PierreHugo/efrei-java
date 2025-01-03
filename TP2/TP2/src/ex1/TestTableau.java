/**
 * TestTableau
 *
 * <p>Exercice 1 : création de la classe TestTableau.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-12-23
 */

package ex1;

/**
 * Classe TestTableau pour manipuler un tableau d'entiers représentant les
 * nombres de pages des livres dans une bibliothèque.
 */
public class TestTableau {

    /**
     * Méthode principale qui exécute les manipulations sur le tableau.
     * @param args Arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        // 1. Déclaration du tableau
        int[] pages = {120, 350, 200, 500, 175, 90, 300};

        // 2. Affichage du contenu du tableau
        System.out.println("Affichage des nombres de pages:");
        for (int i = 0; i < pages.length; i++) {
            System.out.println("Livre " + (i + 1) + ": " + pages[i] + " pages");
        }

        // 3. Calcul de la somme totale des pages
        int somme = 0;
        for (int page : pages) {
            somme += page;
        }
        System.out.println("\nSomme totale des pages: " + somme);

        // 4. Trouver et afficher le nombre de pages minimum
        int min = pages[0];
        for (int page : pages) {
            if (page < min) {
                min = page;
            }
        }
        System.out.println("Nombre minimum: " + min);

        // 5. Calculer et afficher le nombre de pages moyen
        double moyenne = (double) somme / pages.length;
        System.out.println("Moyenne: " + (int) moyenne);

        // 6. Trier le tableau en ordre croissant et le réafficher
        java.util.Arrays.sort(pages);
        System.out.println("\nTableau trié par ordre croissant :");
        for (int page : pages) {
            System.out.println(page + " pages");
        }
    }
}
