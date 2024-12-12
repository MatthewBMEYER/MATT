package controller;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcceptOffer {

    public void acceptOffer(String offerId) {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "UPDATE offers SET status = 'Accepted' WHERE offer_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, offerId);
            stmt.executeUpdate();
            System.out.println("Offer accepted!");
        } catch (SQLException e) {
            System.out.println("Error accepting offer: " + e.getMessage());
        }
    }
}
