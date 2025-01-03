/**
 * TestPersonne
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-10-06
 */

package ex3;

public class TestPersonne {
    public static void main(String[] args) {

        Personne personne1 = new Personne("Anna", 2002);

        // Vérification si l'année de naissance est bissextile
        System.out.println("L'année est bissextile ? " + personne1.isBissextile(personne1.getAnNaissance()));

        // Afficher les nombres premiers jusqu'à l'année de naissance
        personne1.afficherNombresPremiers(personne1.getAnNaissance());

        // Vérifier si le prénom ou l'année sont des palindromes
        System.out.println("Le prénom est un palindrome ? " + personne1.isPalindrome(personne1.getPrenom()));
        System.out.println("L'année de naissance est un palindrome ? " + personne1.isPalindrome(personne1.getAnNaissance()));
    }
}

