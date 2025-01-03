/**
 * Cercle.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package ex2;

public class Cercle extends Forme {
    /** Rayon du cercle. */
    private double rayon;

    /**
     * Constructeur pour initialiser le cercle.
     *
     * @param couleur La couleur du cercle.
     * @param rayon   Le rayon du cercle.
     */
    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Le cercle est de couleur " + getCouleur() + ", sa surface est " + calculerSurface() + " cm carré.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cercle cercle = (Cercle) obj;
        return Double.compare(cercle.calculerSurface(), this.calculerSurface()) == 0
                && this.getCouleur().equals(cercle.getCouleur());
    }

}

