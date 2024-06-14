/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import Student.student;
import config.dbConnector;
import javax.swing.JOptionPane;



/**
 *
 * @author user
 */
public class editsub extends javax.swing.JFrame {
 

    
    public editsub() {
        initComponents();
    }

   
   public  String action;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ids = new javax.swing.JTextField();
        tea = new javax.swing.JTextField();
        sub = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        add = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        scd1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(151, 188, 98));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Subject ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 25, 87, 41));

        scd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scd.setText("Schedule");
        jPanel2.add(scd, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 190, 85, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Subject Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 87, 41));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Teacher Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 138, 101, 41));

        ids.setEnabled(false);
        ids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsActionPerformed(evt);
            }
        });
        jPanel2.add(ids, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 27, 196, 41));
        jPanel2.add(tea, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 140, 196, 41));
        jPanel2.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 88, 196, 41));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Go Back.png"))); // NOI18N
        jButton2.setText("Go Back");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 249, -1, 32));

        add.setBackground(new java.awt.Color(44, 95, 45));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("label");
        add.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 90, 30));

        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 249, 105, 32));

        scd1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        scd1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:30 Pm to 2 Pm", "2:00 Pm to 3:30 Pm" }));
        scd1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 102)));
        jPanel2.add(scd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 190, 167, 41));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SUBJECT INFORMATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      student st=new   student();
      st.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
    
    }//GEN-LAST:event_jPanel1MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
    if (sub.getText().isEmpty() || tea.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required!");
    } else {
        String userIdInput = JOptionPane.showInputDialog("Enter User ID:");
        if (userIdInput != null && !userIdInput.isEmpty()) {
            int userId = Integer.parseInt(userIdInput);
            dbConnector dbc = new dbConnector();

             // Check if the user with the provided userId is a teacher
            String userType = dbc.getUserType(userId);
            if (userType != null && userType.equals("Teacher")) {
                // Proceed with the insertion or update based on action
                if (action.equals("Insert")) {
                    int result = dbc.insertData("INSERT INTO tbl_subjects(u_id, c_name, c_Teacher, c_schedule) VALUES ('" + userId + "', '" + sub.getText() + "', '" + tea.getText() + "', '" + scd1.getSelectedItem() + "')");

                    if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Successfully Saved!");
                        this.dispose();
                    } else {
                        System.out.println("Saving Data Failed!");
                    }
                } else if (action.equals("Update")) {
                    dbc.updateData("UPDATE tbl_subjects SET c_name='" + sub.getText() + "', c_Teacher='" + tea.getText()+ "', c_schedule='" + scd1.getSelectedItem() + "' WHERE c_id=" + ids.getText());
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "The user with the provided ID is not a teacher.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "User ID cannot be empty!");
        }
    } 
    

    }//GEN-LAST:event_addMouseClicked

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
            java.util.logging.Logger.getLogger(editsub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editsub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editsub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editsub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editsub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    public javax.swing.JTextField ids;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel label;
    private javax.swing.JLabel scd;
    public javax.swing.JComboBox<String> scd1;
    public javax.swing.JTextField sub;
    public javax.swing.JTextField tea;
    // End of variables declaration//GEN-END:variables
}
