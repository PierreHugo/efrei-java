/**
 * Start.java
 *
 * Description: [Ajoutez une description ici]
 *
 * Created by: ph
 * Date: 02/01/2025
 */

/**
 * Classe principale contenant le point d'entrée de l'application.
 */
package isHeritage;

import java.util.Scanner;

/**
 * Classe principale pour tester les classes Personne et Programmeur.
 */
public class Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée utilisateur pour initialiser un objet Programmeur
        System.out.println("Entrez le nom : ");
        String nom = scanner.nextLine();

        System.out.println("Entrez le prénom : ");
        String prenom = scanner.nextLine();

        System.out.println("Entrez l'année de naissance : ");
        int anNaissance = scanner.nextInt();

        System.out.println("Entrez le salaire : ");
        float salaire = scanner.nextFloat();

        System.out.println("Entrez la prime : ");
        float prime = scanner.nextFloat();

        scanner.nextLine(); // Consomme le saut de ligne

        System.out.println("Entrez le pseudo : ");
        String pseudo = scanner.nextLine();

        // Création de l'objet Programmeur avec les données entrées
        Programmeur programmeur = new Programmeur(nom, prenom, anNaissance, salaire, prime, pseudo);

        // Affichage des informations
        System.out.println("\n>>>>> BIENVENUE ! <<<<<");
        programmeur.afficher();

        scanner.close();
    }
}
