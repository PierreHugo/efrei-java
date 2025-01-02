/**
 * Carre.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package ex2;

public class Carre extends Forme {
    /** Longueur du côté du carré. */
    private double cote;

    /**
     * Constructeur pour initialiser le carré.
     *
     * @param couleur La couleur du carré.
     * @param cote    La longueur du côté du carré.
     */
    public Carre(String couleur, double cote) {
        super(couleur);
        this.cote = cote;
    }

    @Override
    public double calculerSurface() {
        return cote * cote;
    }

    @Override
    public String toString() {
        return "Le carré est de couleur " + getCouleur() + ", sa surface est " + calculerSurface() + " cm carré.";
    }
}

