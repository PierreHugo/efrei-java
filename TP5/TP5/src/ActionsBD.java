/**
 * ActionsBD.java
 * <p>
 * Description: [Création de la classe ActionBD]
 * <p>
 * Created by: ph
 * Date: 06/01/2025
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActionsBD implements AutoCloseable {

    private String dbUrl;
    private String username;
    private String password;

    private Connection connection;

    public ActionsBD(String dbUrl, String username, String password) throws SQLException {
        this.dbUrl = dbUrl;
        this.username = username;
        this.password = password;
        this.connection = DriverManager.getConnection(this.dbUrl, this.username, this.password);
    }

    public List<Programmeur> getProgrammeurs() throws SQLException {
        List<Programmeur> programmeurs = new ArrayList<>();

        String sql = "SELECT * FROM programmeur";

        try (PreparedStatement pstmt = this.connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Liste des programmeurs récupérés : ---------------------------------------");

            while (rs.next()) {
                programmeurs.add(new Programmeur(
                        rs.getString("NOM"),
                        rs.getString("PRENOM"),
                        rs.getString("ANNAISSANCE"),
                        rs.getInt("SALAIRE"),
                        rs.getInt("PRIME"),
                        rs.getString("PSEUDO")
                ));
            }
        }
        return programmeurs;
    }

    @Override
    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}

