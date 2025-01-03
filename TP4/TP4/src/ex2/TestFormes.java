/**
 * TestFormes.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package ex2;

public class TestFormes {
    public static void main(String[] args) {
        // Création d'objets de type Forme via les sous-classes
        Forme unCarre = new Carre("Rouge", 4);
        Forme unCercle = new Cercle("Bleu", 5);
        Forme unTriangle = new Triangle("Vert", 3, 6);

        // Calcul et affichage des surfaces
        System.out.println(unCarre);
        System.out.println(unCercle);
        System.out.println(unTriangle);

        // Test de la méthode toString()
        System.out.println("\nTest avec toString() :");
        System.out.println(unCercle);
        System.out.println(unCarre);

        // Test de la méthode equals()
        Cercle cercle1 = new Cercle("Rouge", 5);
        Cercle cercle2 = new Cercle("Rouge", 5);
        Cercle cercle3 = new Cercle("Bleu", 7);

        System.out.println("\nComparaison cercle1 et cercle2 (avant redéfinition equals) : " + cercle1.equals(cercle2));
        System.out.println("Comparaison cercle1 et cercle3 (avant redéfinition equals) : " + cercle1.equals(cercle3));

        // Redéfinition equals
        System.out.println("\nComparaison cercle1 et cercle2 (après redéfinition equals) : " + cercle1.equals(cercle2));
        System.out.println("Comparaison cercle1 et cercle3 (après redéfinition equals) : " + cercle1.equals(cercle3));
    }
}

