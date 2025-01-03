/**
 * TestPersonne
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-09-30
 */

package ex1;

public class TestPersonne {
    public static void main(String[] args) {

        //créer un premier objet avec le premier constructeur
        Personne personne1 = new Personne ("Vernes", "Jules", 1950);
        personne1.afficherPersonne();

        //créer un deuxieme objet avec le deuxieme constructeur
        Personne personne2 = new Personne ("Jean",1999);
        personne2.afficherPersonne();

        //créer un troisieme objet avec le troisieme constructeur
        Personne personne3 = new Personne ();
        personne3.afficherPersonne();

        //je veux afficher l'âge de la personne
        System.out.println("Année de naissance : " + personne3.getAnNaissance());

        // je modifie l'année de naissance
        personne3.setAnNaissance(1200);

        //je veux réafficher l'âge de la personne
        System.out.println("Année de naissance : " + personne3.getAnNaissance());

    }
}
