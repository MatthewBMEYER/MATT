package controller;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MakeOffer {

    public void makeOffer(String offerId, String itemId, String userId, double offerPrice) {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "INSERT INTO offers (offer_id, item_id, user_id, offer_price, status) VALUES (?, ?, ?, ?, 'Pending')";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, offerId);
            stmt.setString(2, itemId);
            stmt.setString(3, userId);
            stmt.setDouble(4, offerPrice);
            stmt.executeUpdate();
            System.out.println("Offer made successfully!");
        } catch (SQLException e) {
            System.out.println("Error creating offer: " + e.getMessage());
        }
    }
}
