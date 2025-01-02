/**
 * Avion.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package isHeritage;

public class Avion extends Vehicule {
    /** Nombre de réacteurs de l'avion. */
    private int nbReact;

    /**
     * Constructeur pour créer un avion.
     *
     * @param nbRoues Le nombre de roues.
     * @param nbReact Le nombre de réacteurs.
     */
    public Avion(int nbRoues, int nbReact) {
        super(nbRoues);
        this.nbReact = nbReact;
    }

    /**
     * Procédure qui affiche que l'avion vole.
     */
    public void vole() {
        System.out.println("Je vole.");
    }

    /**
     * Redéfinition de la méthode freine.
     */
    @Override
    public void freine() {
        System.out.println("J'inverse les " + nbReact + " réacteurs.");
        super.freine();
    }

    /**
     * Redéfinition de la méthode roule.
     */
    @Override
    public void roule() {
        if (isEstComplet()) {
            System.out.println("Je pousse les réacteurs.");
        }
        super.roule();
    }

    // Getter pour nbReact
    public int getNbReact() {
        return nbReact;
    }
}

