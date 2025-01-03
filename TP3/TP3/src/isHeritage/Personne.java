/**
 * Personne.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package isHeritage;

/**
 * Classe représentant une personne avec un nom, un prénom et une année de naissance.
 */
public class Personne {

    /** Le nom de la personne. */
    private String nom;

    /** Le prénom de la personne. */
    private String prenom;

    /** L'année de naissance de la personne. */
    private int anNaissance;

    /**
     * Constructeur permettant d'initialiser tous les attributs.
     *
     * @param nom         Le nom de la personne.
     * @param prenom      Le prénom de la personne.
     * @param anNaissance L'année de naissance de la personne.
     */
    public Personne(String nom, String prenom, int anNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
    }

    /**
     * Constructeur par défaut.
     */
    public Personne() {
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.anNaissance = 2000;
    }

    /**
     * Calcule l'âge de la personne à partir de 2024.
     *
     * @return L'âge de la personne.
     */
    public int calculerAge() {
        return 2024 - this.anNaissance;
    }

    /**
     * Affiche les informations de la personne sous le format :
     * "Nom : xxx, Prénom : xxx, Age : xxx".
     */
    public void afficher() {
        System.out.println("Nom : " + this.nom + ", Prénom : " + this.prenom + ", Age : " + calculerAge());
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnNaissance() {
        return anNaissance;
    }

    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }
}

