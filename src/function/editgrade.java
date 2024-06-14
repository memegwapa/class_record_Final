/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import Student.student;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class editgrade extends javax.swing.JFrame {
 

    
    public editgrade() {
        initComponents();
        displayData();
    }
    public void displayData(){
       try{
           dbConnector dbc = new dbConnector();
           ResultSet rs = dbc.getData("SELECT sl.s_id, sl.s_fname, sl.s_lname, sub.c_id, sub.c_name FROM tbl_studentlists sl INNER JOIN tbl_subjects sub ON sl.s_id = sub.c_id ORDER BY sl.s_id");
          userTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException ex){
           System.out.println("Errors: "+ex.getMessage());
        
       }
  }

   public  String action;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        id4 = new javax.swing.JTextField();
        pre = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        add2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        stu = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        fi = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        pref = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        s_fname = new javax.swing.JTextField();
        s_lname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Sem = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(151, 188, 98));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GRADE INFORMATION");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Grade ID");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 41, 87, 41));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Student ID");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 95, 87, 41));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Subject ID");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 168, 101, 41));

        id1.setEnabled(false);
        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        jPanel4.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 43, 196, 41));
        jPanel4.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 170, 196, 41));
        jPanel4.add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 252, 196, 41));

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Go Back.png"))); // NOI18N
        jButton4.setText("Go Back");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 450, -1, 32));

        add2.setBackground(new java.awt.Color(44, 95, 45));
        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add2MouseClicked(evt);
            }
        });
        add2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("label");
        add2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel4.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 104, 32));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Prelim");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 255, 57, 30));
        jPanel4.add(stu, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 97, 196, 41));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("MidTerm");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 299, -1, 41));
        jPanel4.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 299, 196, 41));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Pre-Final ");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 351, -1, 41));
        jPanel4.add(fi, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 400, 196, 41));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Final");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 398, 36, 41));
        jPanel4.add(pref, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 351, 196, 41));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("   Grades");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 231, 121, -1));

        s_fname.setEnabled(false);
        jPanel4.add(s_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 61, 196, 41));

        s_lname.setEnabled(false);
        jPanel4.add(s_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 115, 196, 41));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Student Details");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 13, 106, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Last Name");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 113, 87, 41));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("First Name");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 64, 87, 41));

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 144, -1, -1));

        userTable.setOpaque(false);
        jScrollPane1.setViewportView(userTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 310));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh (3).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 40, 30));

        Sem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Semester", "2nd Semester" }));
        Sem.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 102)));

        year.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023-2024", "2024-2025", "2025-2026", "2026-2027", "2027-2028", "2028-2029" }));
        year.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 102)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("school Year");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(530, 530, 530))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
    
    }//GEN-LAST:event_jPanel1MouseClicked

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        student st=new   student();
        st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseClicked
                                    
    // Check if all fields are filled
    if (pre.getText().isEmpty() || mid.getText().isEmpty() || pref.getText().isEmpty() || fi.getText().isEmpty() || stu.getText().isEmpty() || id4.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required!");
    } else {
        try {
            double prelim = Double.parseDouble(pre.getText());
            double midterm = Double.parseDouble(mid.getText());
            double prefinal = Double.parseDouble(pref.getText());
            double finalGrade = Double.parseDouble(fi.getText());
            String studentIdText = stu.getText();
            String sIdText = id4.getText();

            // Get selected year and semester
            String selectedYear = (String) year.getSelectedItem();
            String selectedSemester = (String) Sem.getSelectedItem();

            dbConnector dbc = new dbConnector();

            // Check if Student_id exists and display s_fname and s_lname
            String studentCheckQuery = "SELECT s_fname, s_lname FROM tbl_studentlists WHERE s_id = '" + studentIdText + "'";
            ResultSet studentInfo = dbc.getData(studentCheckQuery);

            if (studentInfo.next()) {
                String studentFirstName = studentInfo.getString("s_fname");
                String studentLastName = studentInfo.getString("s_lname");

                // Display the student's first name and last name in JTextFields
                s_fname.setText(studentFirstName);
                s_lname.setText(studentLastName);
            } else {
                JOptionPane.showMessageDialog(null, "Student ID not found!");
                return;
            }

            // Check if s_id exists
            String subjectCheckQuery = "SELECT COUNT(*) FROM tbl_subjects WHERE c_id = '" + sIdText + "'";
            if (!dbc.checkExistence("tbl_subjects", "c_id", sIdText)) {
                JOptionPane.showMessageDialog(null, "Subject ID not found!");
                return;
            }

            if (action.equals("Add")) {
                // Insert query with selected year and semester
                String query = "INSERT INTO tbl_grades (g_prelim, g_midterm, g_prefinal, g_final, s_id, c_id, g_year, g_Semester) VALUES ('" + 
                                prelim + "', '" + 
                                midterm + "', '" + 
                                prefinal + "', '" + 
                                finalGrade + "', '" + 
                                studentIdText + "', '" + 
                                sIdText + "', '" +
                                selectedYear + "', '" +
                                selectedSemester + "')";
                int result = dbc.insertData(query);
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Successfully Saved!");
                    this.dispose();
                } else {
                    System.out.println("Saving Data Failed!");
                }
            } else if (action.equals("Update")) {
                // Update query with selected year and semester
                String query = "UPDATE tbl_grades SET g_prelim = '" + prelim + 
                                "', g_midterm = '" + midterm + 
                                "', g_prefinal = '" + prefinal + 
                                "', g_final = '" + finalGrade + 
                                "', s_id = '" + studentIdText + 
                                "', c_id = '" + sIdText + 
                                "', g_year = '" + selectedYear +
                                "', g_semester = '" + selectedSemester +
                                "' WHERE g_id = '" + id1.getText() + "'";
                dbc.updateData(query);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No action selected!");
                this.dispose();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Grades must be valid numbers!");
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.");
        }
    }


    }//GEN-LAST:event_add2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String studentId = stu.getText(); // Get the student ID entered by the user
    if (!studentId.isEmpty()) { // Check if the student ID field is not empty
        dbConnector dbc = new dbConnector();

        // Retrieve the student's first name and last name based on the student ID
        String studentInfoQuery = "SELECT s_fname, s_lname FROM tbl_studentlists WHERE s_id = '" + studentId + "'";
        try {
            ResultSet studentInfo = dbc.getData(studentInfoQuery);
            if (studentInfo.next()) {
                String studentFirstName = studentInfo.getString("s_fname");
                String studentLastName = studentInfo.getString("s_lname");
  // Display the student's first name and last name in JTextFields
              s_fname.setText("");   
              s_fname.setText(studentFirstName);
              
          
                 s_lname.setText("");
               s_lname.setText(studentLastName);
            
              
            } else {
                JOptionPane.showMessageDialog(null, "Student Information not found!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please enter a Student ID");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      displayData();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(editgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editgrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Sem;
    private javax.swing.JPanel add2;
    public javax.swing.JTextField fi;
    public javax.swing.JTextField id1;
    public javax.swing.JTextField id4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label;
    public javax.swing.JTextField mid;
    public javax.swing.JTextField pre;
    public javax.swing.JTextField pref;
    public javax.swing.JTextField s_fname;
    public javax.swing.JTextField s_lname;
    public javax.swing.JTextField stu;
    private javax.swing.JTable userTable;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
