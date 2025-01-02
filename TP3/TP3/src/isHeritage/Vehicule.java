/**
 * Vehicule.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package isHeritage;

public class Vehicule {
    /** Nombre de roues du véhicule. */
    private int nbRoues;

    /** Statut de remplissage (true : complet, false : non complet). */
    private boolean estComplet;

    /** Nombre d'objets Vehicule créés. */
    private static int nombreVehicules = 0;

    /** Nombre minimum de roues qu'un véhicule peut avoir. */
    private static final int MIN_ROUES = 2;

    /**
     * Constructeur avec un paramètre pour initialiser le nombre de roues.
     *
     * @param nbRoues Le nombre de roues.
     */
    public Vehicule(int nbRoues) {
        if (nbRoues < MIN_ROUES) {
            throw new IllegalArgumentException("Un véhicule doit avoir au moins " + MIN_ROUES + " roues.");
        }
        this.nbRoues = nbRoues;
        this.estComplet = false;
        nombreVehicules++;
    }

    /**
     * Méthode qui affiche si le véhicule roule.
     */
    public void roule() {
        System.out.println("(" + estComplet + ") Les " + nbRoues + " roues tournent.");
    }

    /**
     * Méthode qui affiche un message de freinage.
     */
    public void freine() {
        System.out.println("J'appuie sur le frein.");
    }

    /**
     * Inverse le statut de remplissage du véhicule.
     */
    public void invComplet() {
        this.estComplet = !this.estComplet;
    }

    // Getters et Setters
    public boolean isEstComplet() {
        return estComplet;
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public static int getNombreVehicules() {
        return nombreVehicules;
    }
}

