/**
 * Utilisation.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package isHeritage;

public class Utilisation {
    public static void main(String[] args) {
        // Création d'un véhicule avec 6 roues
        Vehicule vehicule1 = new Vehicule(6);
        vehicule1.roule();
        vehicule1.freine();

        // Création d'un avion avec 4 roues et 2 réacteurs
        Avion avion1 = new Avion(4, 2);
        avion1.invComplet(); // Rendre l'avion complet
        avion1.roule();
        avion1.vole();
        avion1.freine();

        // Création d'un avion avec 8 roues et 4 réacteurs
        Vehicule vehiculeRef = new Avion(8, 4);
        vehiculeRef.roule();
        if (vehiculeRef instanceof Avion) {
            Avion avionRef = (Avion) vehiculeRef;
            avionRef.vole();
            avionRef.freine();
        }

        // Affichage du nombre total de véhicules créés
        System.out.println("Nombre total de véhicules créés : " + Vehicule.getNombreVehicules());
    }
}

