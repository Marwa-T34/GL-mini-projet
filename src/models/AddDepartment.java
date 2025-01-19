package models;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddDepartment {

    private String departmentName;

    // Constructor to initialize the department name
    public AddDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Method to add a department to the database
    public void execute() {
        String query = "INSERT INTO Department (name) VALUES (?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, departmentName);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Department added successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
}

