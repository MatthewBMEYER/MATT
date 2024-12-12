package controller;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeclineOffer {

    public void declineOffer(String offerId) {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "UPDATE offers SET status = 'Declined' WHERE offer_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, offerId);
            stmt.executeUpdate();
            System.out.println("Offer declined!");
        } catch (SQLException e) {
            System.out.println("Error declining offer: " + e.getMessage());
        }
    }
}
