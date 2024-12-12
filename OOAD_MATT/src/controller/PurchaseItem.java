package controller;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PurchaseItem {

    public void purchaseItem(String userId, String itemId) {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "UPDATE items SET item_stock = item_stock - 1 WHERE item_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, itemId);
            stmt.executeUpdate();
            System.out.println("Item purchased successfully!");
        } catch (SQLException e) {
            System.out.println("Error during purchase: " + e.getMessage());
        }
    }
}
