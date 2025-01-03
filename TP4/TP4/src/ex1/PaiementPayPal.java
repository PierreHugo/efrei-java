/**
 * PaiementPaypal.java
 * <p>
 * Description: [Ajoutez une description ici]
 * <p>
 * Created by: ph
 * Date: 02/01/2025
 */

package ex1;

public class PaiementPayPal implements Paiement {
    @Override
    public String effectuerPaiement(double montant) {
        return "Paiement de " + montant + "€ effectué via PayPal.";
    }
}

