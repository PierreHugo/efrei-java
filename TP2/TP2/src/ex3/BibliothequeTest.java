/**
 * BilbiothequeTest
 *
 * <p>Création de la classe BibliothequeTest.</p>
 *
 * @author Pierre Hugo
 * @version 1.0
 * @since 2024-12-23
 */

package ex3;

public class BibliothequeTest {
    public static void main(String[] args) {
        // Création des étagères
        Etagere chimie = new Etagere(1, "Chimie", 5);
        Etagere informatique = new Etagere(2, "Informatique", 5);

        // Ajout de livres à l'étagère Chimie
        chimie.ajouterLivre(new Livre("La chimie organique", 201, "John McMurry", 1200, 2019));
        chimie.ajouterLivre(new Livre("Introduction à la chimie analytique", 202, "Daniel C. Harris", 800, 2021));
        chimie.ajouterLivre(new Livre("Chimie générale", 203, "Raymond Chang", 1000, 2018));

        // Ajout de livres à l'étagère Informatique
        informatique.ajouterLivre(new Livre("Introduction aux algorithmes", 301, "Thomas H. Cormen", 1300, 2020));
        informatique.ajouterLivre(new Livre("Design Patterns", 302, "Erich Gamma", 400, 1994));
        informatique.ajouterLivre(new Livre("Java pour les débutants", 303, "Herbert Schildt", 700, 2019));

        // Afficher les livres
        chimie.afficherLivres();
        informatique.afficherLivres();

        // Calculer et afficher la somme totale des pages
        System.out.println("Somme des pages (Chimie) : " + chimie.sommePages());
        System.out.println("Somme des pages (Informatique) : " + informatique.sommePages());

        // Rechercher un livre par titre
        chimie.chercherLivreParTitre("Chimie générale");

        // Afficher les livres ayant moins de 1000 pages
        informatique.chercherPetitsLivres(1000);

        // Afficher les nouveaux livres de l'année 2021
        chimie.afficherNouveauxLivres(2021);

        // Modifier le nombre de pages d'un livre
        informatique.changerNbPages(302, 450);

        // Supprimer un livre
        chimie.supprimerLivre(202);

        // Afficher les livres après suppression
        chimie.afficherLivres();
    }
}

