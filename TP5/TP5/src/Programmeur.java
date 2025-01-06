/**
 * Programmeur.java
 * <p>
 * Description: [Création de la classe Programmeur]
 * <p>
 * Created by: ph
 * Date: 06/01/2025
 */

public class Programmeur {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private int salaire;
    private int prime;
    private String pseudo;

    public Programmeur(String nom, String prenom, String dateNaissance, int salaire, int prime, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.salaire = salaire;
        this.prime = prime;
        this.pseudo = pseudo;
    }

    @Override
    public String toString() {
        return "Programmeur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", salaire=" + salaire +
                ", prime=" + prime +
                ", pseudo='" + pseudo + '\'' +
                '}';
    }

    public String getNom(){
        return this.nom;
    }
}

