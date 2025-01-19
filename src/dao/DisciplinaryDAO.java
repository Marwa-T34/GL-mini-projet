package dao;

import db.DBConnection;
import models.Student;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DisciplinaryDAO {

    // Method to add a student to the disciplinary list
    public void addDisciplinaryStudent(Student student) throws SQLException {
        String query = "INSERT INTO disciplinary_student (id, first_name, last_name, academic_year, department_id, disciplinary) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getFirstName());
            pstmt.setString(3, student.getLastName());
            pstmt.setString(4, student.getAcademicYear());
            pstmt.setInt(5, student.getDepartmentId());
            pstmt.setBoolean(6, student.isDisciplinary());
            pstmt.executeUpdate();
        }
    }
}
