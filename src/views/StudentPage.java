
package views;

import dao.DepartmentDAO;
import dao.StudentDAO;
import db.DBConnection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import models.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class StudentPage extends javax.swing.JFrame {

    public StudentPage() {
        initComponents();
        loadStudents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lastnameTF = new javax.swing.JTextField();
        depTF = new javax.swing.JTextField();
        firstnameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        academicTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management");

        jPanel1.setBackground(new java.awt.Color(217, 218, 217));

        jPanel2.setBackground(new java.awt.Color(104, 164, 165));
        jPanel2.setPreferredSize(new java.awt.Dimension(81, 82));

        jButton1.setBackground(new java.awt.Color(104, 164, 165));
        jButton1.setForeground(new java.awt.Color(104, 164, 165));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/home.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Student managment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ADD TO DISCIPLINARY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lastnameTF.setBackground(new java.awt.Color(255, 255, 255));
        lastnameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastnameTF.setForeground(new java.awt.Color(0, 0, 0));
        lastnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTFActionPerformed(evt);
            }
        });

        depTF.setBackground(new java.awt.Color(255, 255, 255));
        depTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        depTF.setForeground(new java.awt.Color(0, 0, 0));
        depTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depTFActionPerformed(evt);
            }
        });

        firstnameTF.setBackground(new java.awt.Color(255, 255, 255));
        firstnameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstnameTF.setForeground(new java.awt.Color(0, 0, 0));
        firstnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Last Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Department :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" First Name :");

        table2.setForeground(new java.awt.Color(0, 0, 0));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Academic Year", "Department", "Disciplinary"
            }
        ));
        table2.setRowHeight(25);
        table2.setSelectionBackground(new java.awt.Color(104, 164, 165));
        table2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table2.setShowHorizontalLines(true);
        table2.setShowVerticalLines(true);
        table2.getTableHeader().setResizingAllowed(false);
        table2.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table2);

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Academic Year :");

        academicTF.setBackground(new java.awt.Color(255, 255, 255));
        academicTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        academicTF.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(77, 77, 77)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastnameTF)
                            .addComponent(academicTF)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(depTF)
                            .addComponent(firstnameTF, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(107, 107, 107))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(academicTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(depTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home h = new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // Get the selected row from the students table (table2)
    int selectedRow = table2.getSelectedRow();

    // Check if a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a student first.");
        return;
    }

    // Retrieve the student ID from the selected row (assuming ID is in the first column)
    int studentId = (int) table2.getValueAt(selectedRow, 0);

    // Retrieve the student data from the input fields
    String newFirstName = firstnameTF.getText();
    String newLastName = lastnameTF.getText();
    String newAcademicYear = academicTF.getText();
    String departmentIdText = depTF.getText(); // Get the department ID as a string

    // Check if any of the input fields are empty
    if (newFirstName.isEmpty() || newLastName.isEmpty() || newAcademicYear.isEmpty() || departmentIdText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields.");
        return;
    }

    // Try to parse the department ID as an integer
    int newDepartmentId = -1; // Default value for invalid department ID

    try {
        newDepartmentId = Integer.parseInt(departmentIdText); // Parse the department ID as an integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid department ID. Please enter a valid number.");
        return;
    }

    // Now proceed with the update
    try (Connection conn = DBConnection.getConnection()) {
        // Create an update query for updating student data
        String updateQuery = "UPDATE student SET first_name = ?, last_name = ?, academic_year = ?, department_id = ? WHERE id = ?";

        // Prepare the statement
        try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
            updateStmt.setString(1, newFirstName);
            updateStmt.setString(2, newLastName);
            updateStmt.setString(3, newAcademicYear);
            updateStmt.setInt(4, newDepartmentId);
            updateStmt.setInt(5, studentId);

            // Execute the update
            int rowsAffected = updateStmt.executeUpdate();

            // If rows were updated, show success message
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student updated successfully.");
                // Reload the students table data to reflect the update
                loadStudents(); // This method reloads all students data in your JTable
            } else {
                JOptionPane.showMessageDialog(this, "No changes were made.");
            }
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating student: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String fname, lname , ayear,department;
        fname = firstnameTF.getText();
        lname = lastnameTF.getText();
        ayear = academicTF.getText();
        department = depTF.getText();
        
        //Empty fields ??
        if (fname.isEmpty()|| lname.isEmpty() || ayear.isEmpty() || department.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill out all fields!!", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
         //format
    String namesPattern = "^[A-Za-z][a-z]{2,29}$";
    if (!fname.matches(namesPattern)) {
        JOptionPane.showMessageDialog(this, "Invalid first name", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    if (!lname.matches(namesPattern)) {
        JOptionPane.showMessageDialog(this, "Invalid last name", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    if (!ayear.matches(namesPattern)) {
        JOptionPane.showMessageDialog(this, "Invalid academic year", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }

// Convert departmentIdText to an integer
    int departmentId;
    try {
        departmentId = Integer.parseInt(department);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid department ID! Please enter a numeric value.");
        return;
    }

    // Check if the department ID exists in the database
    try {
        boolean departmentExists = DepartmentDAO.checkDepartmentExists(departmentId); // Validate department ID
        if (!departmentExists) {
            JOptionPane.showMessageDialog(this, "Invalid department ID! Please enter an existing department ID.");
            return;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error checking department ID: " + ex.getMessage());
        return;
    }

    // Create a Student object
    Student student = new Student();
    student.setFirstName(fname);
    student.setLastName(lname);
    student.setAcademicYear(ayear);
    student.setDepartmentId(departmentId);
    student.setDisciplinary(false); // Default value for disciplinary

    // Save the student
    StudentDAO studentDAO = new StudentDAO();
    try {
        studentDAO.addStudent(student);
        JOptionPane.showMessageDialog(this, "Student added successfully!");
        loadStudents(); // Refresh the JTable
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Get the selected row from the students table (table2)
    int selectedRow = table2.getSelectedRow();

    // Check if a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a student first.");
        return;
    }

    // Get the student ID from the selected row
    int studentId = (int) table2.getValueAt(selectedRow, 0); // Assuming ID is in the first column

    // Create a connection to the database
    try (Connection conn = DBConnection.getConnection()) {
        // Start a transaction to ensure both operations are atomic
        conn.setAutoCommit(false);

        // Add student to the disciplinary table
        String insertDisciplinaryQuery = "INSERT INTO disciplinary_student (id, first_name, last_name, academic_year, department_id, disciplinary) "
                                       + "SELECT id, first_name, last_name, academic_year, department_id, true FROM student WHERE id = ?";
        try (PreparedStatement insertStmt = conn.prepareStatement(insertDisciplinaryQuery)) {
            insertStmt.setInt(1, studentId);
            insertStmt.executeUpdate();
        }

        // Update the student's disciplinary field in the students table
        String updateStudentQuery = "UPDATE student SET disciplinary = true WHERE id = ?";
        try (PreparedStatement updateStmt = conn.prepareStatement(updateStudentQuery)) {
            updateStmt.setInt(1, studentId);
            updateStmt.executeUpdate();
        }

        // Commit the transaction
        conn.commit();

        // Show success message
        JOptionPane.showMessageDialog(this, "Student added to the disciplinary list.");

        // Reload disciplinary data (refresh disciplinary table)
        DiscPage discPageInstance = new DiscPage();
        discPageInstance.loadDisciplinaryStudents();
        // Optionally, reload students data to reflect the disciplinary update
        loadStudents();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error adding student to the disciplinary list: " + ex.getMessage());

        // Only try to rollback if the connection was successfully created
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                conn.rollback(); // This should be inside a separate try-with-resources block
            }
        } catch (SQLException rollbackEx) {
            rollbackEx.printStackTrace();
        }
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void firstnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTFActionPerformed

    private void lastnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTFActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         // Get the selected row from the students table
    int selectedRow = table2.getSelectedRow(); // Assuming table1 is your JTable for students

    // Check if a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a student to delete.");
        return;
    }

    // Retrieve the student ID from the selected row
    Object idValue = table2.getValueAt(selectedRow, 0); // Assuming ID is in the first column
    int studentId;

    try {
        studentId = Integer.parseInt(idValue.toString()); // Parse ID as an integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid student ID format.");
        return;
    }

    // Perform the deletion from the database
    try {
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.deleteStudent(studentId);

        JOptionPane.showMessageDialog(this, "Student deleted successfully.");

        // Reload the students table to reflect the changes
        loadStudents();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting student: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void depTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depTFActionPerformed
    
    private void loadStudents() {
    // Define the column names for the JTable
    String[] columnNames = {"ID", "First Name", "Last Name", "Academic Year", "Department ID", "Disciplinary"};

    // Create a DefaultTableModel to hold the data
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(columnNames);

    // Fetch students from the database
    String query = "SELECT * FROM student";
    try (Connection conn = DBConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Loop through the result set and add rows to the model
        while (rs.next()) {
            Object[] row = new Object[6];
            row[0] = rs.getInt("id");
            row[1] = rs.getString("first_name");
            row[2] = rs.getString("last_name");
            row[3] = rs.getString("academic_year");
            row[4] = rs.getInt("department_id");
            row[5] = rs.getBoolean("disciplinary") ? "Yes" : "No"; // Convert boolean to readable value
            model.addRow(row);
        }

        // Set the model for the JTable (table2)
        table2.setModel(model);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading students: " + ex.getMessage());
    }
}

    
    
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField academicTF;
    private javax.swing.JTextField depTF;
    private javax.swing.JTextField firstnameTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameTF;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
