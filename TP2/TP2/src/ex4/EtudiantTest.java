/**
 * EtudiantTest
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-12-23
 */

package ex4;

public class EtudiantTest {
    public static void main(String[] args) {
        // Création d'un groupe
        Groupe groupe = new Groupe();

        // Ajout d'étudiants
        groupe.ajouterEtudiant(new Etudiant(1, "Dupont", "Jean", 21, "Informatique", 14.5));
        groupe.ajouterEtudiant(new Etudiant(2, "Martin", "Alice", 22, "Biologie", 15.3));
        groupe.ajouterEtudiant(new Etudiant(3, "Nguyen", "Paul", 21, "Chimie", 12.8));
        groupe.ajouterEtudiant(new Etudiant(4, "Durand", "Sophie", 23, "Mathématiques", 16.1));

        // Affichage des étudiants
        groupe.afficherEtudiants();

        // Trier les étudiants par âge
        groupe.trierParAge();
        groupe.afficherEtudiants();

        // Rechercher la spécialité d'un étudiant
        System.out.println(groupe.rechercherSpecialite(3)); // Recherche par numéro d'étudiant

        // Afficher les prénoms des étudiants d'un certain âge
        int ageRecherche = 21;
        System.out.println("Prénoms des étudiants âgés de " + ageRecherche + " ans : "
                + groupe.afficherPrenomsParAge(ageRecherche));
    }
}

