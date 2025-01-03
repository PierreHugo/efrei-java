/**
 * Personne
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-09-30
 */

package ex2;

public class Personne {
    private String nom;
    private String prenom;
    private int anNaissance;
    private static int compteurPersonnes = 0;

    public Personne(String nom, String prenom, int anNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        compteurPersonnes++;
    }

    public Personne(String prenom, int anNaissance) {
        this.nom = "inconnu";
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        compteurPersonnes++;
    }

    public Personne() {
        this("Potter", "Harry", 1980);
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAnNaissance() { return anNaissance; }

    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setAnNaissance(int anNaissance) { this.anNaissance = anNaissance; }

    public void afficherPersonne() {
        System.out.println("Informations de la personne : ");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Année de naissance : " + anNaissance);
        System.out.println("------------------------------------------------------");
    }

    public int calculerAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - this.anNaissance;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prénom: " + this.prenom);
        System.out.println("Âge: " + calculerAge());
    }

    public void mange(String aliment) {
        System.out.println(this.nom + " " + this.prenom + " mange un/une " + aliment);
    }

    public static void afficherNbPers() {
        System.out.println("Nombre de personnes créées : " + compteurPersonnes);
    }
}
