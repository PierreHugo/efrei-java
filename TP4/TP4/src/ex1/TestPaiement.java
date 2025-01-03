/**
 * TestPaiement.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package ex1;

public class TestPaiement {
    public static void main(String[] args) {
        // Tableau de moyens de paiement
        Paiement[] paiements = {
                new PaiementCarteCredit(),
                new PaiementPayPal(),
                new PaiementCryptomonnaie()
        };

        // Montant à payer
        double montant = 100.50;

        // Boucle pour effectuer le paiement avec chaque méthode
        for (Paiement paiement : paiements) {
            System.out.println(paiement.effectuerPaiement(montant));
        }
    }
}

