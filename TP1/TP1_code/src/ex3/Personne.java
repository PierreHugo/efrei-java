/**
 * Personne
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-10-06
 */

package ex3;

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

    public boolean isBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }

    public void afficherNombresPremiers(int annee) {
        for (int i = 2; i <= annee; i++) {
            if (isPremier(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPremier(int nombre) {
        if (nombre <= 1) return false;
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String chaine) {
        int n = chaine.length();
        for (int i = 0; i < n / 2; i++) {
            if (chaine.charAt(i) != chaine.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int nombre) {
        String chaine = String.valueOf(nombre);
        return isPalindrome(chaine);
    }
}