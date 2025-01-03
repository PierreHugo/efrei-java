/**
 * Etudiant
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-12-23
 */

package ex4;

public class Etudiant {
    private int numEtudiant;
    private String nom;
    private String prenom;
    private int age;
    private String specialite;
    private double moyenne;

    // Constructeur par défaut
    public Etudiant() {
        this.numEtudiant = 0;
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.age = 0;
        this.specialite = "Non spécifiée";
        this.moyenne = 0.0;
    }

    // Constructeur avec paramètres
    public Etudiant(int numEtudiant, String nom, String prenom, int age, String specialite, double moyenne) {
        this.numEtudiant = numEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.specialite = specialite;
        this.moyenne = moyenne;
    }

    // Getters et Setters
    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Etudiant{" +
                "numEtudiant=" + numEtudiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", specialite='" + specialite + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }
}

