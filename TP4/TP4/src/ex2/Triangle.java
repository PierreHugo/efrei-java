/**
 * Triangle.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package ex2;

public class Triangle extends Forme {
    /** Base du triangle. */
    private double base;

    /** Hauteur du triangle. */
    private double hauteur;

    /**
     * Constructeur pour initialiser le triangle.
     *
     * @param couleur La couleur du triangle.
     * @param base    La longueur de la base du triangle.
     * @param hauteur La hauteur du triangle.
     */
    public Triangle(String couleur, double base, double hauteur) {
        super(couleur);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double calculerSurface() {
        return (base * hauteur) / 2;
    }

    @Override
    public String toString() {
        return "Le triangle est de couleur " + getCouleur() + ", sa surface est " + calculerSurface() + " cm carré.";
    }
}

