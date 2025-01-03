/**
 * Etagere
 *
 * <p>Création de la classe Etagere.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-12-23
 */

package ex3;

import java.util.ArrayList;

public class Etagere {
    private int code;
    private String domaine;
    private int capacite;
    private ArrayList<Livre> livres;

    // Constructeur
    public Etagere(int code, String domaine, int capacite) {
        this.code = code;
        this.domaine = domaine;
        this.capacite = capacite;
        this.livres = new ArrayList<>();
    }

    // Méthodes
    public void ajouterLivre(Livre livre) {
        if (livres.size() < capacite) {
            livres.add(livre);
            System.out.println("Livre ajouté : " + livre.getTitre());
        } else {
            System.out.println("Capacité atteinte, impossible d'ajouter le livre.");
        }
    }

    public void supprimerLivre(int code) {
        livres.removeIf(livre -> livre.getCode() == code);
        System.out.println("Livre avec le code " + code + " supprimé.");
    }

    public int sommePages() {
        return livres.stream().mapToInt(Livre::getNbPages).sum();
    }

    public void chercherLivreParTitre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                System.out.println("Livre trouvé : " + livre);
                return;
            }
        }
        System.out.println("Livre avec le titre \"" + titre + "\" introuvable.");
    }

    public void chercherPetitsLivres(int seuil) {
        System.out.println("Livres avec moins de " + seuil + " pages :");
        for (Livre livre : livres) {
            if (livre.getNbPages() < seuil) {
                System.out.println(livre);
            }
        }
    }

    public void afficherNouveauxLivres(int anneeActuelle) {
        System.out.println("Livres édités en " + anneeActuelle + " :");
        for (Livre livre : livres) {
            if (livre.getAnneeEdition() == anneeActuelle) {
                System.out.println("Titre : " + livre.getTitre() + ", Code : " + livre.getCode());
            }
        }
    }

    public void changerNbPages(int code, int nbPages) {
        for (Livre livre : livres) {
            if (livre.getCode() == code) {
                livre.setNbPages(nbPages);
                System.out.println("Nombre de pages modifié pour le livre avec code " + code);
                return;
            }
        }
        System.out.println("Livre avec le code " + code + " introuvable.");
    }

    public void afficherLivres() {
        System.out.println("Liste des livres dans l'étagère \"" + domaine + "\" :");
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }
}

