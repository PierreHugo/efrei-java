/**
 * Forme.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package ex2;

public abstract class Forme {
    /** Couleur de la forme. */
    private String couleur;

    /**
     * Constructeur pour initialiser la couleur.
     *
     * @param couleur La couleur de la forme.
     */
    public Forme(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Calcule la surface de la forme.
     *
     * @return La surface de la forme.
     */
    public abstract double calculerSurface();

    /**
     * Retourne la couleur de la forme.
     *
     * @return La couleur.
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Définit la couleur de la forme.
     *
     * @param couleur La nouvelle couleur.
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}

