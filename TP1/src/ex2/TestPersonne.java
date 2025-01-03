/**
 * TestPersonne
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-10-06
 */

package ex2;

public class TestPersonne {
    public static void main(String[] args) {

        // Créer des instances de Personne
        Personne personne1 = new Personne("Dupont", "Jean", 2004);
        Personne personne2 = new Personne("Martin", "Pierre", 1990);
        Personne personne3 = new Personne();

        // Afficher les informations
        personne1.afficherInfos();
        personne2.afficherInfos();
        personne3.afficherInfos();

        // Personne mange
        personne1.mange("Sandwich");
        personne2.mange("Pizza");

        // Afficher le nombre de personnes créées
        Personne.afficherNbPers();
    }
}

