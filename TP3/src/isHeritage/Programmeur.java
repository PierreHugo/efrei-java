/**
 * Programmeur.java
 *
 * Description: [Ajoutez une description ici]
 *
 * Created by: ph
 * Date: 02/01/2025
 */

package isHeritage;

import java.util.Scanner;

/**
 * Classe Programmeur qui hérite de la classe Personne.
 * Ajoute des attributs spécifiques aux programmeurs.
 */
public class Programmeur extends Personne {

    /** Le salaire du programmeur. */
    private float salaire;

    /** La prime du programmeur. */
    private float prime;

    /** Le pseudo du programmeur. */
    private String pseudo;

    /**
     * Constructeur par défaut.
     */
    public Programmeur() {
        super(); // Appelle le constructeur par défaut de Personne
        this.salaire = 0.0f;
        this.prime = 0.0f;
        this.pseudo = "Inconnu";
    }

    /**
     * Constructeur avec salaire et prime.
     *
     * @param salaire Le salaire du programmeur.
     * @param prime   La prime du programmeur.
     */
    public Programmeur(float salaire, float prime) {
        super(); // Appelle le constructeur par défaut de Personne
        this.salaire = salaire;
        this.prime = prime;
        this.pseudo = "Inconnu";
    }

    /**
     * Constructeur avec salaire, prime et pseudo.
     *
     * @param salaire Le salaire du programmeur.
     * @param prime   La prime du programmeur.
     * @param pseudo  Le pseudo du programmeur.
     */
    public Programmeur(float salaire, float prime, String pseudo) {
        super(); // Appelle le constructeur par défaut de Personne
        this.salaire = salaire;
        this.prime = prime;
        this.pseudo = pseudo;
    }

    /**
     * Constructeur avec tous les paramètres possibles.
     *
     * @param nom         Le nom de la personne.
     * @param prenom      Le prénom de la personne.
     * @param anNaissance L'année de naissance de la personne.
     * @param salaire     Le salaire du programmeur.
     * @param prime       La prime du programmeur.
     * @param pseudo      Le pseudo du programmeur.
     */
    public Programmeur(String nom, String prenom, int anNaissance, float salaire, float prime, String pseudo) {
        super(nom, prenom, anNaissance); // Appelle le constructeur de Personne avec paramètres
        this.salaire = salaire;
        this.prime = prime;
        this.pseudo = pseudo;
    }

    /**
     * Retourne le salaire total du programmeur (salaire + prime).
     *
     * @return Le salaire total.
     */
    public float getSalaire() {
        return this.salaire + this.prime;
    }

    /**
     * Affiche les informations propres au programmeur.
     */
    @Override
    public void afficher() {
        System.out.println("Nom : " + getNom() + ", Prénom : " + getPrenom() +
                ", Pseudo : " + pseudo + ", Age : " + calculerAge() +
                ", Salaire total : " + getSalaire());
    }

    @Override
    public String toString() {
        return "Nom : " + getNom() + ", Prénom : " + getPrenom() +
                ", Age : " + calculerAge() + ", Pseudo : " + pseudo +
                ", Salaire total : " + getSalaire();
    }

    // Getters et Setters pour les nouveaux attributs
    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
}

