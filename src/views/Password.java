package views;

import db.DBConnection;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class Password extends javax.swing.JFrame {

    
    public Password() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        currentPassTF = new javax.swing.JPasswordField();
        showPasswordCB1 = new javax.swing.JCheckBox();
        newPassTF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password Page");

        jPanel1.setBackground(new java.awt.Color(217, 218, 217));

        jPanel2.setBackground(new java.awt.Color(104, 164, 165));
        jPanel2.setPreferredSize(new java.awt.Dimension(81, 82));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Change Password");

        jButton2.setBackground(new java.awt.Color(104, 164, 165));
        jButton2.setForeground(new java.awt.Color(104, 164, 165));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/settings.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jToggleButton2.setBackground(new java.awt.Color(0, 153, 153));
        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Submit");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Current Password :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("New Password :");

        currentPassTF.setBackground(new java.awt.Color(255, 255, 255));
        currentPassTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        currentPassTF.setForeground(new java.awt.Color(102, 102, 102));
        currentPassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPassTFActionPerformed(evt);
            }
        });

        showPasswordCB1.setBackground(new java.awt.Color(217, 218, 217));
        showPasswordCB1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showPasswordCB1.setForeground(new java.awt.Color(0, 0, 0));
        showPasswordCB1.setText("Show password");
        showPasswordCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCB1ActionPerformed(evt);
            }
        });

        newPassTF.setBackground(new java.awt.Color(255, 255, 255));
        newPassTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newPassTF.setForeground(new java.awt.Color(102, 102, 102));
        newPassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPasswordCB1)
                            .addComponent(currentPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(564, Short.MAX_VALUE)
                    .addComponent(newPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(180, 180, 180)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(currentPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(showPasswordCB1)
                .addGap(73, 73, 73)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(332, Short.MAX_VALUE)
                    .addComponent(newPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(218, 218, 218)))
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

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
         String currentPassword = new String(currentPassTF.getPassword()); // Get the current password entered by the user
    String newPassword = new String(newPassTF.getPassword()); // Get the new password entered by the user
    String username = "admin";  // You can change this if necessary or dynamically fetch the username

    // Check if either field is empty
    if (currentPassword.isEmpty() || newPassword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both current and new passwords.");
        return;
    }

    try (Connection conn = DBConnection.getConnection()) {
        // Step 1: Check if the current password is correct
        String checkPasswordQuery = "SELECT password FROM User WHERE username = ?";
        try (PreparedStatement checkStmt = conn.prepareStatement(checkPasswordQuery)) {
            checkStmt.setString(1, username);  // Set the username

            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next()) {
                    String storedPassword = rs.getString("password");

                    // Step 2: Compare current password
                    if (!currentPassword.equals(storedPassword)) {
                        JOptionPane.showMessageDialog(this, "Current password is incorrect.");
                        return;
                    }

                    // Step 3: Update with new password
                    String updatePasswordQuery = "UPDATE User SET password = ? WHERE username = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(updatePasswordQuery)) {
                        updateStmt.setString(1, newPassword);  // Set the new password
                        updateStmt.setString(2, username);  // Set the username
                        updateStmt.executeUpdate();
                        
                        JOptionPane.showMessageDialog(this, "Password updated successfully.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Username not found.");
                }
            }
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void currentPassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPassTFActionPerformed

    }//GEN-LAST:event_currentPassTFActionPerformed

    private void showPasswordCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCB1ActionPerformed

        if(showPasswordCB1.isSelected()){
        currentPassTF.setEchoChar((char)0);
        newPassTF.setEchoChar((char)0);
        
        }else{
        currentPassTF.setEchoChar('*');
        newPassTF.setEchoChar('*');
        
        }
    }//GEN-LAST:event_showPasswordCB1ActionPerformed

    private void newPassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassTFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Settings s = new Settings();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField currentPassTF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPasswordField newPassTF;
    private javax.swing.JCheckBox showPasswordCB1;
    // End of variables declaration//GEN-END:variables
}
