/**
 * Personne
 *
 * <p>Création d'une classe "Personne".</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-09-30
 */

package ex1;

public class Personne {
    // Les attributs privés de la classe "Personne":
    private String nom;
    private String prenom;
    private int anNaissance;

    //constructeur avec aucune initialisation par défaut
    public Personne(String nom, String prenom, int anNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
    }

    //constructeur permettant d'initialiser nom à "inconnu" et qui récupère prenom
    //et année de naissance dans les paramètres du constructeur
    public Personne(String prenom, int anNaissance) {
        this.nom = "inconnu";
        this.prenom = prenom;
        this.anNaissance = anNaissance;
    }

    //constructeur avec aucune argument par défaut
    public Personne() {
        this.nom = "Potter";
        this.prenom = "Harry";
        this.anNaissance = 1980;
    }

    // getters
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public int getAnNaissance() {return anNaissance;}

    // setters
    public void setNom(String nom) {nom = nom;}
    public void setPrenom(String prenom) {prenom = prenom;}
    public void setAnNaissance(int anNaissance) {this.anNaissance = anNaissance;}


    // methode pour afficher une personne
    public void afficherPersonne() {
        System.out.println("Informations de la personne : ");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Année de naissance : " + anNaissance);
        System.out.println("------------------------------------------------------");

    }
}