/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;


import Individual.IndividualPrinting;
import config.dbConnector;
import function.editgrade;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class grades extends javax.swing.JInternalFrame {
    private Connection connect;

  
   public grades() {

        initComponents();
    
        displayData();
        
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); 
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI(); 
        bi.setNorthPane(null);
           userTable.setDefaultRenderer(Object.class, new CustomTableCellRenderer());
              JTableHeader header = userTable.getTableHeader();
        header.setDefaultRenderer(new CustomHeaderRenderer());
    }

public void displayData() {
    try {
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT grd.g_id, sl.s_lname, sl.s_fname, sub.c_name, sub.c_teacher, grd.g_prelim, grd.g_midterm, grd.g_prefinal, grd.g_final, grd.g_year, grd.g_semester FROM tbl_studentlists sl INNER JOIN tbl_grades grd ON sl.s_id = grd.s_id INNER JOIN tbl_subjects sub ON grd.c_id = sub.c_id;");
        userTable.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}

public class CustomTableCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Check if the column is g_id, s_lname, s_fname, c_name, c_teacher, g_year, g_semester
        String columnName = table.getColumnName(column);
        if (columnName.equals("g_id") || columnName.equals("s_lname") || columnName.equals("s_fname") || columnName.equals("c_name") || columnName.equals("c_teacher") || columnName.equals("g_year") || columnName.equals("g_semester")) {
            // If it is, preserve original color
            cellComponent.setBackground(table.getBackground());
        } else {
            // Otherwise, check the grade value
            if (value != null) {
                try {
                    double grade = Double.parseDouble(value.toString());
                    if (grade > 2.9) { // Corrected condition
                        // Grades below 3 are displayed in red
                        cellComponent.setBackground(Color.RED);
                    } else {
                        // Grades equal to or above 3 maintain the default background color
                        cellComponent.setBackground(table.getBackground());
                    }
                } catch (NumberFormatException e) {
                    // Handle the case where the value cannot be parsed to double
                    // For instance, if value is not numeric
                    cellComponent.setBackground(table.getBackground());
                }
            } else {
                // Handle null values, maintain the default background color
                cellComponent.setBackground(table.getBackground());
            }
        }
    
    
    
        return cellComponent;
    }
}
      public class CustomHeaderRenderer implements TableCellRenderer {
        DefaultTableCellRenderer renderer;

        public CustomHeaderRenderer() {
            renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER); // Center align header text
            renderer.setBackground(Color.WHITE); // Set header background color
            renderer.setForeground(Color.BLACK); // Set header text color
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }


    
     
    
     public  String action;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        ref = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Add = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sea3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(151, 188, 98));
        panel.setForeground(new java.awt.Color(255, 51, 51));
        panel.setPreferredSize(new java.awt.Dimension(654, 593));

        ref.setBackground(new java.awt.Color(151, 188, 98));
        ref.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refMouseExited(evt);
            }
        });
        ref.setLayout(null);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh (3).png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ref.add(jLabel8);
        jLabel8.setBounds(0, 0, 30, 30);

        Add.setBackground(new java.awt.Color(151, 188, 98));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        Add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add User Group Woman Man (1).png"))); // NOI18N
        Add.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Grades");

        sea3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));
        sea3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sea3MouseClicked(evt);
            }
        });
        sea3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sea3ActionPerformed(evt);
            }
        });
        sea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sea3KeyReleased(evt);
            }
        });

        edit.setBackground(new java.awt.Color(151, 188, 98));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit (3).png"))); // NOI18N
        edit.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        delete.setBackground(new java.awt.Color(151, 188, 98));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        delete.add(jLabel3);
        jLabel3.setBounds(0, 0, 30, 30);

        userTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));
        userTable.setOpaque(false);
        jScrollPane1.setViewportView(userTable);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Print (8).png")); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Search");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sea3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ref, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sea3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseClicked
        displayData();
    }//GEN-LAST:event_refMouseClicked

    private void refMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseEntered
        ref.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_refMouseEntered

    private void refMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseExited
        ref.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_refMouseExited

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        editgrade ed= new  editgrade ();
        ed.setVisible(true);
        ed.action="Add";
        ed.label.setText("SAVE");
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_AddMouseExited

    private void sea3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sea3ActionPerformed
      
    }//GEN-LAST:event_sea3ActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
 int rowindex = userTable.getSelectedRow();
if (rowindex < 0) {
    JOptionPane.showMessageDialog(null, "Please Select an Item");
} else {
    TableModel model = userTable.getModel();

    // Check if the rowindex is within the bounds of the table model data
    if (rowindex < model.getRowCount()) {
        editgrade ed = new editgrade();

        String studentId = String.valueOf(model.getValueAt(rowindex, 0)); // Assuming student ID is in column 0
        dbConnector dbc = new dbConnector();

        // Retrieve the student's first name and last name based on the student ID
        String studentInfoQuery = "SELECT s_fname, s_lname FROM tbl_studentlists WHERE s_id = '" + studentId  + "'";
        try {
            ResultSet studentInfo = dbc.getData(studentInfoQuery);
            if (studentInfo.next()) {
                String studentFirstName = studentInfo.getString("s_fname");
                String studentLastName = studentInfo.getString("s_lname");

                // Display student ID, first name, and last name in the editgrade form
                ed.id1.setText(studentId);
                ed.stu.setText(studentId);
                ed.id4.setText(String.valueOf(model.getValueAt(rowindex, 1))); // Assuming subject ID is in column 1
                ed.s_fname.setText(studentFirstName); // Display student's first name
                ed.s_lname.setText(studentLastName); // Display student's last name
                ed.pre.setText(String.valueOf(model.getValueAt(rowindex, 2))); // Assuming prelim grade is in column 2
                ed.mid.setText(String.valueOf(model.getValueAt(rowindex, 3))); // Assuming midterm grade is in column 3
                ed.pref.setText(String.valueOf(model.getValueAt(rowindex, 4))); // Assuming prefinal grade is in column 4
                ed.fi.setText(String.valueOf(model.getValueAt(rowindex, 5))); // Assuming final grade is in column 5

                ed.setVisible(true);
                ed.action = "Update";
                ed.label.setText("UPDATE");
            } else {
                JOptionPane.showMessageDialog(null, "Student Information not found!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Invalid row index selected");
    }
}

    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_editMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
int rowIndex = userTable.getSelectedRow();
if(rowIndex < 0){
JOptionPane.showMessageDialog(null, "Please select data first from the table!");
}else{
TableModel model = userTable.getModel();
Object value = model.getValueAt(rowIndex, 0);
String id = value.toString();
  int a =JOptionPane.showConfirmDialog(null, "Are you sure to delete ID: "+id);
if(a== JOptionPane. YES_OPTION){
dbConnector dbc = new dbConnector();
int id1 = Integer.parseInt(id);
dbc.deleteData(id1, "tbl_grades");
displayData();
}
}

    }//GEN-LAST:event_jLabel3MouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
     delete.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
      delete.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_deleteMouseExited

    private void sea3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sea3MouseClicked
  
    // Assuming you have a JTextField named 'searchField' where users enter their search term
    String searchTerm = sea3.getText();

    // Check if the search term is empty
    if (searchTerm.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a search term.");
        return; // Exit the method if the search term is empty
    }

    // Perform the search
    dbConnector dbc = new dbConnector();
    ResultSet resultSet = dbc.searchData("tbl_grades", searchTerm);

    // Process the search results, e.g., display them in a table or list
    // Example: Display the search results using the custom method
  //  displaySearchResults(resultSet);

    }//GEN-LAST:event_sea3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  // MessageFormat header = new MessageFormat("Grade Details");
 //   MessageFormat footer = new MessageFormat("Page {0,number,integer}");
   // try {
   //     userTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
  //  } catch (java.awt.print.PrinterException e) {
    //    System.err.format("Cannot print: %s%n", e.getMessage());
   //}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sea3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sea3KeyReleased
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    userTable.setRowSorter(sorter); // Set the row sorter to the table

    String regex = sea3.getText(); // Get the search text from the text field
    try {
        sorter.setRowFilter(RowFilter.regexFilter(regex));
    } catch (java.util.regex.PatternSyntaxException ex) {
        // Handle invalid regular expression syntax
        System.err.println("Invalid regular expression: " + ex.getMessage());
    }
    }//GEN-LAST:event_sea3KeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         int rowindex = userTable.getSelectedRow();
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please select an Item!");
        }else{

            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = userTable.getModel();
                 ResultSet rs = dbc.getData("SELECT grd.g_id, sl.s_lname, sl.s_fname, sub.c_name, sub.c_teacher, grd.g_prelim, grd.g_midterm, grd.g_prefinal, grd.g_final, grd.g_year, grd.g_semester "
                     + "FROM tbl_studentlists sl "
                     + "INNER JOIN tbl_grades grd ON sl.s_id = grd.g_id "
                     + "INNER JOIN tbl_subjects sub ON grd.c_id = sub.c_id "
                     + "WHERE grd.g_id ="+tbl.getValueAt(rowindex,0)+"");
                if(rs.next()){
                    IndividualPrinting ipt = new IndividualPrinting ();
                    ipt.uid.setText(""+rs.getInt("g_id"));
                    ipt.fn.setText(""+rs.getString("s_lname"));
                    ipt.ln.setText(""+rs.getString("s_fname"));
                    ipt.sub.setText(""+rs.getString("c_name"));
                    ipt.tea.setText(""+rs.getString("c_teacher"));
                    // Set grades and change color based on condition
                double prelimGrade = rs.getDouble("g_prelim");
                double midtermGrade = rs.getDouble("g_midterm");
                double prefinalGrade = rs.getDouble("g_prefinal");
                double finalGrade = rs.getDouble("g_final");
                
                ipt.pre.setText("" + prelimGrade); 
                ipt.mid.setText("" + midtermGrade);
                ipt.prefi.setText("" + prefinalGrade);
                ipt.fi.setText("" + finalGrade);
                
                if (prelimGrade > 2.9)
                    ipt.pre.setForeground(Color.RED); // or any other color for above 2.9
                else
                    ipt.pre.setForeground(Color.BLACK);
                
                if (midtermGrade > 2.9)
                    ipt.mid.setForeground(Color.RED); // or any other color for above 2.9
                else
                    ipt.mid.setForeground(Color.BLACK);
                
                if (prefinalGrade > 2.9)
                    ipt.prefi.setForeground(Color.RED); // or any other color for above 2.9
                else
                    ipt.prefi.setForeground(Color.BLACK);
                
                if (finalGrade > 2.9)
                    ipt.fi.setForeground(Color.RED); // or any other color for above 2.9
                else
                    ipt.fi.setForeground(Color.BLACK);
                
                ipt.year.setText("" + rs.getString("g_year")); 
                ipt.sem.setText("" + rs.getString("g_semester"));

                ipt.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No record found for the selected ID.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel ref;
    private javax.swing.JTextField sea3;
    javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
