/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package javaapplication7;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 91799
 */
public class Studentnotice1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Studentnotice1
     */
    
  private void populateTableFromDatabase() {
   var dbconn = DBConnection.connectDB();
 // Use your connectDB method
    if (dbconn != null) {
        try {
           
            String sqlQuery = "SELECT notice_id, notice_text FROM admindashboard";
            PreparedStatement st = dbconn.prepareStatement(sqlQuery);
            ResultSet resultSet = st.executeQuery(sqlQuery);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                 int noticeId = resultSet.getInt("notice_id");
                String noticeText = resultSet.getString("notice_text");
                model.addRow(new Object[]{noticeId,noticeText});
            }

            resultSet.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dbconn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

    
    
    public Studentnotice1() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI uis = (BasicInternalFrameUI)this.getUI();
        uis.setNorthPane(null);
        
        
        populateTableFromDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sr.No", "notice_text"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(0);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(45);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(45);
            jTable1.getColumnModel().getColumn(1).setMinWidth(3000);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(3000);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(3000);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
