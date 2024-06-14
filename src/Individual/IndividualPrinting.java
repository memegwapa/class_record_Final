/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individual;

import Student.grades;
import config.PanelPrinter;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class IndividualPrinting extends javax.swing.JFrame {

    /**
     * Creates new form IndividualPrinting
     */
    public IndividualPrinting() {
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        page = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sub = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sem = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        tea = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        prefi = new javax.swing.JLabel();
        mid = new javax.swing.JLabel();
        fi = new javax.swing.JLabel();
        pre = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(151, 188, 98));

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        page.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 880, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("St. Cecilia's College - Cebu, Inc.");
        page.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 420, 28));

        uid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uid.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        page.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 68, 18));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Student Name:");
        page.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, 32));

        fn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        page.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 130, 32));

        ln.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ln.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        page.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 170, 130, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Subject name:");
        page.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 122, 32));

        sub.setBackground(new java.awt.Color(51, 153, 255));
        sub.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        page.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 165, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Prelim:");
        page.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, 32));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\unnamed (1) (2) (1).jpg")); // NOI18N
        page.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText(" Poblacion Ward II, Minglanilla, Philippines");
        page.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 340, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("College Report Card");
        page.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 113, 265, 32));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Grade ID:");
        page.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Teacher Name:");
        page.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 32));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Semester:");
        page.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 92, 32));

        sem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        page.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 174, 32));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("School Year:");
        page.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 110, 32));

        year.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        page.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 118, 32));

        tea.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        page.add(tea, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 162, 32));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Final:");
        page.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, 32));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("Midterm:");
        page.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, 32));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Pre-Final:");
        page.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, 32));

        prefi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        page.add(prefi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 59, 32));

        mid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        page.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 59, 32));

        fi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        page.add(fi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 59, 32));

        pre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        page.add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 59, 32));

        print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Print (4).png"))); // NOI18N
        print.setText("PRINT");
        print.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true));
        print.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(565, 565, 565)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(155, 155, 155))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 95, 45));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRINTING FORMS");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Back");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         grades usf= new  grades ();
        usf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
  JPanel mypanel = new JPanel();
  PanelPrinter pPrint = new PanelPrinter(page);
   pPrint.printPanel();

    }//GEN-LAST:event_printActionPerformed

    
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
            java.util.logging.Logger.getLogger(IndividualPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndividualPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndividualPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndividualPrinting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndividualPrinting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    public javax.swing.JLabel fi;
    public javax.swing.JLabel fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel ln;
    public javax.swing.JLabel mid;
    private javax.swing.JPanel page;
    public javax.swing.JLabel pre;
    public javax.swing.JLabel prefi;
    private javax.swing.JButton print;
    public javax.swing.JLabel sem;
    public javax.swing.JLabel sub;
    public javax.swing.JLabel tea;
    public javax.swing.JLabel uid;
    public javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
