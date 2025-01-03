/**
 * Produit
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-10-06
 */

package ex4;

public class Produit {
    // Attributs
    private int id;
    private String nom;
    private double prix;
    private int quantite;

    // Constructeur pour initialiser les attributs
    public Produit(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    // Méthode pour afficher les détails du produit
    public void afficherDetails() {
        System.out.println("Produit ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Prix: " + prix + " EUR");
        System.out.println("Quantité disponible: " + quantite);
        System.out.println("--------------------------------");
    }
}
