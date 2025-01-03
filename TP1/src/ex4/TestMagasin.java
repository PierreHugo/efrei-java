/**
 * TestMagasin
 *
 * <p>Description of the class.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-10-06
 */

package ex4;

public class TestMagasin {
    public static void main(String[] args) {
        // Création de quelques instances de la classe Produit
        Produit produit1 = new Produit(1, "Ordinateur Portable", 799.99, 10);
        Produit produit2 = new Produit(2, "Smartphone", 599.99, 25);
        Produit produit3 = new Produit(3, "Casque Audio", 99.99, 50);

        // Affichage des détails de chaque produit
        produit1.afficherDetails();
        produit2.afficherDetails();
        produit3.afficherDetails();

        // Modification des attributs d'un produit
        produit3.setPrix(89.99); // On baisse le prix du casque audio
        produit3.setQuantite(40); // On ajuste la quantité

        // Afficher les détails après la modification
        System.out.println("Après modification :");
        produit3.afficherDetails();
    }
}
