/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidesign;

import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public registration() {
        initComponents();
       
    }

    public static String email, usname;

    public boolean duplicateCheck() {
        dbConnector dbc = new dbConnector();

        try {
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + un.getText() + "' OR u_email  = '" + em.getText() + "'";
            ResultSet resultSet = dbc.getData(query);

            if (resultSet.next()) {
                email = resultSet.getString("u_email");
                if (email.equals(em.getText())) {
                    JOptionPane.showMessageDialog(null, "Email is Already Used!");
                    em.setText("");
                }

                usname = resultSet.getString("u_username");
                if (usname.equals(un.getText())) {
                    JOptionPane.showMessageDialog(null, "Username is Already Used!");
                    un.setText("");
                }

                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        em = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        at = new javax.swing.JComboBox<>();
        lblfn = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lbln = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        lblem1 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblconpass = new javax.swing.JLabel();
        lblem = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 95, 45));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(44, 95, 45));
        jPanel4.setLayout(null);

        em.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel4.add(em);
        em.setBounds(310, 140, 210, 30);

        ln.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel4.add(ln);
        ln.setBounds(30, 210, 210, 30);

        fn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        fn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fnMousePressed(evt);
            }
        });
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel4.add(fn);
        fn.setBounds(30, 140, 210, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(151, 188, 98));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button (6).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 132, 50);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(223, 330, 140, 49);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Choose Account Type");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(188, 12, 180, 20);

        pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel4.add(pass);
        pass.setBounds(310, 210, 210, 30);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        icon2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel6.add(icon2);
        icon2.setBounds(0, 0, 30, 30);

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eye (1).png"))); // NOI18N
        icon1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        jPanel6.add(icon1);
        icon1.setBounds(0, 0, 30, 30);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(520, 210, 40, 30);

        at.setBackground(new java.awt.Color(151, 188, 98));
        at.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        at.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher", "Student" }));
        at.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        at.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atActionPerformed(evt);
            }
        });
        jPanel4.add(at);
        at.setBounds(220, 38, 110, 30);

        lblfn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblfn.setForeground(new java.awt.Color(44, 95, 45));
        lblfn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblfnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblfnFocusLost(evt);
            }
        });
        jPanel4.add(lblfn);
        lblfn.setBounds(30, 170, 210, 18);

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbluser.setForeground(new java.awt.Color(44, 95, 45));
        jPanel4.add(lbluser);
        lbluser.setBounds(30, 310, 210, 18);

        lbln.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbln.setForeground(new java.awt.Color(44, 95, 45));
        jPanel4.add(lbln);
        lbln.setBounds(30, 240, 210, 18);

        lblpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblpass.setForeground(new java.awt.Color(44, 95, 45));
        jPanel4.add(lblpass);
        lblpass.setBounds(310, 240, 250, 20);
        jPanel4.add(lblem1);
        lblem1.setBounds(1046, 197, 207, 18);

        pass1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        jPanel4.add(pass1);
        pass1.setBounds(310, 280, 210, 30);

        jLabel7.setText("First Name");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(30, 130, 70, 10);

        jLabel8.setText("Last Name");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 200, 200, 10);

        jLabel9.setText("Username");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 270, 200, 10);

        jLabel11.setText("Confirm Password");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(310, 270, 210, 10);
        jPanel4.add(jLabel12);
        jLabel12.setBounds(610, 32, 211, 0);

        jLabel13.setText("Password");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(310, 200, 210, 10);

        lblconpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblconpass.setForeground(new java.awt.Color(44, 95, 45));
        jPanel4.add(lblconpass);
        lblconpass.setBounds(310, 310, 210, 18);

        lblem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblem.setForeground(new java.awt.Color(44, 95, 45));
        jPanel4.add(lblem);
        lblem.setBounds(310, 170, 210, 18);

        jLabel14.setText("Email");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(310, 130, 70, 10);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel5.setText("Already have an account?");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(80, 400, 342, 39);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registration");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(12, 36, 128, 39);

        un.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        jPanel4.add(un);
        un.setBounds(30, 280, 210, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Login");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 75, 40);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(420, 400, 100, 38);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        icon4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon4MousePressed(evt);
            }
        });
        jPanel5.add(icon4);
        icon4.setBounds(0, 0, 30, 30);

        icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eye (1).png"))); // NOI18N
        icon3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon3MousePressed(evt);
            }
        });
        jPanel5.add(icon3);
        icon3.setBounds(0, 0, 30, 30);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(520, 280, 40, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 3.png"))); // NOI18N
        jPanel4.add(jLabel16);
        jLabel16.setBounds(10, 0, 554, 480);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(410, 60, 570, 490);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 84, 94));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Class Record (3).png")); // NOI18N
        jLabel19.setText("Class Record");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 11, 180, 38);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Strong password.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 30, 450, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void atActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atActionPerformed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        pass.setEchoChar('*');
    }//GEN-LAST:event_icon1MousePressed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
  if (fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty()
            || un.getText().isEmpty() || pass.getText().isEmpty()) {
            lblfn.setText("First Name is Required");
            lbln.setText("Last Name is Required");
            lbluser.setText("Username is Required");
            lblem.setText("Email is Required");
            lblpass.setText("Password is Required");
            lblconpass.setText("Confirm Password is Required");
        } else if (pass.getText().length() < 8) {
            lblpass.setText("Password character should be 8 or more");
            lblconpass.setText("");
        } else if (!pass.getText().equals(pass1.getText())) {
            lblconpass.setText("Passwords do not match");
        } else if (duplicateCheck()) {
            System.out.println("Duplicate Exist");
        } else {
            dbConnector dbc = new dbConnector();
            try {
                String ps = passwordHasher.hashPassword(pass.getText());
                int result = dbc.insertData("INSERT INTO tbl_user(u_fname,u_lname, u_email, u_username, u_password, u_type, u_status) "
                    + "VALUES ('" + fn.getText() + "', '" + ln.getText() + "', '" + em.getText() + "', '" + un.getText() + "', '" + ps + "', '" + at.getSelectedItem() + "', 'Pending')");
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Registration Success!");
                    Login Ig = new Login();
                    Ig.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Connection Error!");
                }
            } catch (NoSuchAlgorithmException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_jLabel1MousePressed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void fnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnMousePressed

    }//GEN-LAST:event_fnMousePressed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        pass.setEchoChar((char) 0);
    }//GEN-LAST:event_icon2MousePressed

    private void icon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MousePressed
        icon3.setVisible(true);
        icon4.setVisible(false);
        pass1.setEchoChar((char) 0);
    }//GEN-LAST:event_icon4MousePressed

    private void icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MousePressed
        icon4.setVisible(true);
        icon3.setVisible(false);
        pass1.setEchoChar('*');
    }//GEN-LAST:event_icon3MousePressed

    private void lblfnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblfnFocusGained
     
    }//GEN-LAST:event_lblfnFocusGained

    private void lblfnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblfnFocusLost
    
    }//GEN-LAST:event_lblfnFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> at;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblconpass;
    private javax.swing.JLabel lblem;
    private javax.swing.JLabel lblem1;
    private javax.swing.JLabel lblfn;
    private javax.swing.JLabel lbln;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
