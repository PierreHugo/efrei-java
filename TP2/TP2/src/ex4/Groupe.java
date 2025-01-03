/**
 * Groupe
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-12-23
 */

package ex4;

import java.util.ArrayList;
import java.util.Comparator;

public class Groupe {
    private ArrayList<Etudiant> etudiants;

    // Constructeur
    public Groupe() {
        this.etudiants = new ArrayList<>();
    }

    // Ajouter un étudiant
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        System.out.println("Étudiant ajouté : " + etudiant.getNom());
    }

    // Affichage des étudiants
    public void afficherEtudiants() {
        System.out.println("Liste des étudiants :");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    // Trier par âge
    public void trierParAge() {
        etudiants.sort(Comparator.comparingInt(Etudiant::getAge));
        System.out.println("Étudiants triés par âge.");
    }

    // Rechercher par numéro d'étudiant
    public String rechercherSpecialite(int numEtudiant) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNumEtudiant() == numEtudiant) {
                return "Spécialité de l'étudiant : " + etudiant.getSpecialite();
            }
        }
        return "Étudiant introuvable.";
    }

    // Afficher les prénoms par âge
    public ArrayList<String> afficherPrenomsParAge(int age) {
        ArrayList<String> prenoms = new ArrayList<>();
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getAge() == age) {
                prenoms.add(etudiant.getPrenom());
            }
        }
        return prenoms;
    }
}

