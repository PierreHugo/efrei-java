/**
 * Paiement.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package ex1;

public interface Paiement {
    /**
     * Effectue un paiement et retourne un message de confirmation.
     *
     * @param montant Le montant à payer.
     * @return Un message indiquant que le paiement a été effectué.
     */
    String effectuerPaiement(double montant);
}

