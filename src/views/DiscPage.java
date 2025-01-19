
package views;



import db.DBConnection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class DiscPage extends javax.swing.JFrame {

    public DiscPage() {
        initComponents();
        loadDisciplinaryStudents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disciplinary list");

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
        jLabel7.setText("Disciplinary Commitee List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
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
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(204, 0, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        table3.setForeground(new java.awt.Color(0, 0, 0));
        table3.setModel(new javax.swing.table.DefaultTableModel(
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
        table3.setRowHeight(25);
        table3.setSelectionBackground(new java.awt.Color(104, 164, 165));
        table3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table3.setShowHorizontalLines(true);
        table3.setShowVerticalLines(true);
        table3.getTableHeader().setResizingAllowed(false);
        table3.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       // Get the selected row from the disciplinary table
    int selectedRow = table3.getSelectedRow();

    // Check if a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a student to delete.");
        return;
    }

    // Get the student ID from the selected row
    int studentId = (int) table3.getValueAt(selectedRow, 0); // Assuming ID is in the first column
    
    Connection conn = null;
    
    try {
        // Create a connection to the database
        conn =DBConnection.getConnection();
        // Start a transaction
        conn.setAutoCommit(false);

        // Delete the student from the disciplinary table
        String deleteDisciplinaryQuery = "DELETE FROM disciplinary_student WHERE id = ?";
        try (PreparedStatement deleteStmt = conn.prepareStatement(deleteDisciplinaryQuery)) {
            deleteStmt.setInt(1, studentId);
            deleteStmt.executeUpdate();
        }

        // Update the student's disciplinary value in the students table
        String updateStudentQuery = "UPDATE student SET disciplinary = false WHERE id = ?";
        try (PreparedStatement updateStmt = conn.prepareStatement(updateStudentQuery)) {
            updateStmt.setInt(1, studentId);
            updateStmt.executeUpdate();
        }

        // Commit the transaction
        conn.commit();

        // Show success message
        JOptionPane.showMessageDialog(this, "Student removed from the disciplinary list.");

        // Reload the disciplinary data to refresh the table
        loadDisciplinaryStudents();

    } catch (SQLException ex) {
        // Handle errors and rollback the transaction
        try {
            conn.rollback();
        } catch (SQLException rollbackEx) {
            rollbackEx.printStackTrace();
        }

        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error removing student from the disciplinary list: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton5ActionPerformed
    
    
    public void loadDisciplinaryStudents() {
    // Define the column names for the disciplinary students table
    String[] columnNames = {"ID", "First Name", "Last Name", "Academic Year", "Department ID", "Disciplinary"};

    // Create a DefaultTableModel to hold the data
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(columnNames);

    // Fetch disciplinary students from the database
    String query = "SELECT * FROM disciplinary_student";
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

        // Set the model for the disciplinary table (e.g., disciplinaryTable)
        table3.setModel(model);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading disciplinary students: " + ex.getMessage());
    }
}

    public static void main(String args[]) {
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiscPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table3;
    // End of variables declaration//GEN-END:variables
}
