package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Department;


public class DepartmentDAO {

    // Method to add a department
    public void addDepartment(Department department) throws SQLException {
        String query = "INSERT INTO departments (name) VALUES (?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, department.getName());
            pstmt.executeUpdate();
        }
    }

    // Method to update a department
    public void updateDepartment(Department department) throws SQLException {
        String query = "UPDATE department SET name = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, department.getName());
            pstmt.setInt(2, department.getId());
            pstmt.executeUpdate();
        }
    }

    // Method to delete a department by ID
    public void deleteDepartment(int id) throws SQLException {
        String query = "DELETE FROM department WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    // Method to get all departments
    public ArrayList<Department> getAllDepartments() throws SQLException {
    ArrayList<Department> departments = new ArrayList<>();
    String query = "SELECT * FROM department";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery()) {

        while (rs.next()) {
            // Use the constructor to create a Department object
            Department department = new Department(rs.getInt("id"), rs.getString("name"));
            departments.add(department);
        }
    }
    return departments;
}


    // Method to check if a department exists by ID
    public static boolean checkDepartmentExists(int departmentId) throws SQLException {
        String query = "SELECT COUNT(*) AS count FROM department WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, departmentId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("count") > 0;
                }
            }
        }
        return false;
    }
}
