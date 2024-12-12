package controller;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewOffer {

    public void viewOfferedItems(String userId) {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM offers WHERE item_id IN (SELECT item_id FROM items WHERE seller_id = ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Offer ID: " + rs.getString("offer_id"));
                System.out.println("Item ID: " + rs.getString("item_id"));
                System.out.println("User ID: " + rs.getString("user_id"));
                System.out.println("Offer Price: " + rs.getDouble("offer_price"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("-----------------------");
            }
        } catch (SQLException e) {
            System.out.println("Error viewing offers: " + e.getMessage());
        }
    }
}
