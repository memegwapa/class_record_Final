/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidesign;

import Dashboard.dashboardAdmin;
import Dashboard.dashboardStudent;
import Dashboard.dashboardTeacher;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


 
public class Login extends javax.swing.JFrame {

     // Store the last login time for each user
    private static final Map<String, LocalDateTime> lastLoginTimes = new HashMap<>();
    public Login() {
        initComponents();
   
    }
   
    public class UserSessionManager {
    
    
    // This method checks if the user is logging in again within a certain time frame (e.g., 1 minute)
    public String getLoginMessage(String userType) {
        // Get the current time
        LocalDateTime currentTime = LocalDateTime.now();
        
        // Get the last login time for the user
        LocalDateTime lastLoginTime = lastLoginTimes.getOrDefault(userType, null);
        
        // If last login time is recorded and it's within the time frame (e.g., 1 minute), return "Welcome back" message
        if (lastLoginTime != null && Duration.between(lastLoginTime, currentTime).toMinutes()< 1) {
            return "Welcome back, " + userType + "!";
        }
        
        // Update the last login time for the user
        lastLoginTimes.put(userType, currentTime);
        
        // Return "Welcome" message
        return "Welcome, " + userType + "!";
    }
}
   
    
    
    
    
 static String status;
    static String type;
public static boolean loginAcc(String email, String password){
dbConnector connector = new dbConnector();
try{
   String query = "SELECT * FROM tbl_user  WHERE u_email = '"+ email + "'";
ResultSet resultSet = connector.getData(query);
 if(resultSet.next()){
     
     String hashedPass= resultSet.getString("u_password");
     String rehashedPass= passwordHasher.hashPassword(password);
           
   
     if(hashedPass.equals(rehashedPass)){
   status = resultSet.getString("u_status");
    type = resultSet.getString("u_type");
     Session sess=  Session.getInstances();
      sess.setUid(resultSet.getInt("u_id")); 
     sess.setFname(resultSet.getString("u_fname"));
      sess.setIname(resultSet.getString("u_lname"));
       sess.setEmail(resultSet.getString("u_email"));
       sess.setUsername(resultSet.getString("u_username"));
          sess.setType(resultSet.getString("u_type"));
           sess.setStatus(resultSet.getString("u_status"));       
return true;
}else{
return false;
}
 }else{
return false;
         }
}catch (SQLException |NoSuchAlgorithmException ex) {
return false;
}
}

 
     public boolean teacherLoggedIn() {
        // Implement your logic here to check if a teacher is logged in
        // For example, you might check if the user type is "Teacher" and if they are currently logged in
        // You can use any appropriate method for checking login status, such as checking a session variable, database flag, etc.
        
        // For demonstration, let's assume there's a boolean variable 'teacherLoggedIn' that indicates whether a teacher is logged in
        boolean teacherLoggedIn = true; // Replace this with your actual logic
        
        return teacherLoggedIn;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 498));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(44, 95, 45));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("Don't have an account?");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(65, 350, 210, 28);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setText("Login");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(50, 70, 115, 43);

        lbluser.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbluser.setForeground(new java.awt.Color(44, 95, 45));
        jPanel4.add(lbluser);
        lbluser.setBounds(47, 185, 290, 17);

        lblpass.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblpass.setForeground(new java.awt.Color(44, 95, 45));
        jPanel4.add(lblpass);
        lblpass.setBounds(46, 259, 290, 17);

        user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 51), 2, true));
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
        });
        jPanel4.add(user);
        user.setBounds(47, 154, 290, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Email ");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(50, 140, 60, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Password");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(47, 212, 80, 15);

        pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 51), 2, true));
        jPanel4.add(pass);
        pass.setBounds(47, 227, 290, 31);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(null);

        icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon3MousePressed(evt);
            }
        });
        jPanel6.add(icon3);
        icon3.setBounds(0, 0, 30, 30);

        icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eye (1).png"))); // NOI18N
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon4MousePressed(evt);
            }
        });
        jPanel6.add(icon4);
        icon4.setBounds(0, 0, 30, 30);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(340, 230, 40, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Register");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4);
        jLabel4.setBounds(6, 0, 74, 28);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(266, 350, 80, 28);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame (6).png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 110, 60);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(152, 282, 120, 57);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 3 (1).png"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 410);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(190, 40, 400, 410);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green-dark-wave-background-free-vector (1).jpg"))); // NOI18N
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 780, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
  
     
    }//GEN-LAST:event_userFocusGained

    private void icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MousePressed
        icon4.setVisible(true);
        icon3.setVisible(false);
  
          pass.setEchoChar((char) 0);
    }//GEN-LAST:event_icon3MousePressed

    private void icon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MousePressed
        icon3.setVisible(true);
        icon4.setVisible(false);
     
         pass.setEchoChar('*');
    }//GEN-LAST:event_icon4MousePressed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
     
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      registration rg= new registration();
      rg.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
   if (user.getText().isEmpty() || pass.getText().isEmpty()) {
        lbluser.setText("Email is Required");
        lblpass.setText("Password is Required");
    } else {
        if (loginAcc(user.getText(), pass.getText())) {
            if (!status.equals("Active")) {
                JOptionPane.showMessageDialog(null, "Inactive Account, Contact The Admin!");
            } else {
                JOptionPane.showMessageDialog(null, "Login Success");
                
                // Create an instance of UserSessionManager to handle login messages
                UserSessionManager sessionManager = new UserSessionManager();
                String loginMessage = sessionManager.getLoginMessage(type);
                JOptionPane.showMessageDialog(null, loginMessage);
                
                // Proceed with dashboard based on user type
                switch (type) {
                    case "Admin":
                        dashboardAdmin ads = new dashboardAdmin();
                        ads.setVisible(true);
                        this.dispose();
                        break;
                    case "Student":
                        dashboardStudent std = new dashboardStudent();
                        std.setVisible(true);
                        this.dispose();
                        break;
                    case "Teacher":
                        dashboardTeacher dst = new dashboardTeacher();
                        dst.setVisible(true);
                        this.dispose();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No Account type Found, Contact The Admin!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Account");
        }
    }

    
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
