/**
 * Start.java
 * <p>
 * Description: [Création de la classe Start]
 * <p>
 * Created by: ph
 * Date: 06/01/2025
 */

import java.sql.SQLException;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        // URL de connexion à la base de données
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/bdtpjava";
        String username = "root";
        String password = "";

        try (ActionsBD actionsBD = new ActionsBD(dbUrl, username, password)) {
            List<Programmeur> programmeurs = actionsBD.getProgrammeurs();
            System.out.println("Liste de tous les programmeurs : -----------------------");
            for (Programmeur prog : programmeurs) {
                System.out.println(prog);
            }

            System.out.println("Liste de tous les Simpson : -----------------------");
            for (Programmeur prog : programmeurs) {
                if (prog.getNom().equals("Simpson")){
                    System.out.println(prog);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erreur de connexion ou d'exécution : " + e.getMessage());
        }
    }
}

