package dao;

import db.DBConnection;
import models.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO {
    // Methode to add a student
    public void addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO student (first_name, last_name, academic_year, department_id, disciplinary) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setString(3, student.getAcademicYear());
            stmt.setInt(4, student.getDepartmentId());
            stmt.setBoolean(5, student.isDisciplinary());
            
            stmt.executeUpdate();
        }
    }
    // Methode to delete a student
    public void deleteStudent(int studentId) throws SQLException {
    String query = "DELETE FROM student WHERE id = ?";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setInt(1, studentId);
        pstmt.executeUpdate();
    }
}

    
    // Method to update the disciplinary status of a student
    public void updateDisciplinaryStatus(int studentId, boolean disciplinary) throws SQLException {
        String query = "UPDATE student SET disciplinary = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setBoolean(1, disciplinary);
            pstmt.setInt(2, studentId);
            pstmt.executeUpdate();
        }
    }

    // Method to fetch student details by ID
    public Student getStudentById(int studentId) throws SQLException {
        String query = "SELECT * FROM student WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, studentId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Student student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setFirstName(rs.getString("first_name"));
                    student.setLastName(rs.getString("last_name"));
                    student.setAcademicYear(rs.getString("academic_year"));
                    student.setDepartmentId(rs.getInt("department_id"));
                    student.setDisciplinary(rs.getBoolean("disciplinary"));
                    return student;
                }
            }
        }
        return null;
    }
}

