/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.awt.Color;

/**
 *
 * @author 91799
 */
public class StudentDashboard extends javax.swing.JFrame {

    /**
     * Creates new form StudentDashboard
     */
   Color DefaultColor,ClickedColor;
    public StudentDashboard(){
        initComponents();
        DefaultColor= new Color(204,204,255);
        ClickedColor = new Color(246,208,129);
        
        // set default color 
         viewnotice.setBackground(DefaultColor);
         enrollnotice.setBackground(DefaultColor);
         
         //ready.setBackground(DefaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        viewnotice = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enrollnotice = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JOptionPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jLabel3.setText("Student Dashboard");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 740, 80));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 80));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewnotice.setBackground(new java.awt.Color(51, 51, 255));
        viewnotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewnoticeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewnoticeMousePressed(evt);
            }
        });
        viewnotice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ViewNotice");
        viewnotice.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 180, 39));

        jPanel5.add(viewnotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 40));

        enrollnotice.setBackground(new java.awt.Color(153, 0, 153));
        enrollnotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrollnoticeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enrollnoticeMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Workshop");

        javax.swing.GroupLayout enrollnoticeLayout = new javax.swing.GroupLayout(enrollnotice);
        enrollnotice.setLayout(enrollnoticeLayout);
        enrollnoticeLayout.setHorizontalGroup(
            enrollnoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enrollnoticeLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        enrollnoticeLayout.setVerticalGroup(
            enrollnoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enrollnoticeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(enrollnotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 430));

        JOptionPanel1.setBackground(new java.awt.Color(255, 202, 76));

        javax.swing.GroupLayout JOptionPanel1Layout = new javax.swing.GroupLayout(JOptionPanel1);
        JOptionPanel1.setLayout(JOptionPanel1Layout);
        JOptionPanel1Layout.setHorizontalGroup(
            JOptionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        JOptionPanel1Layout.setVerticalGroup(
            JOptionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel3.add(JOptionPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 680, 430));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewnoticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewnoticeMouseClicked
        // TODO add your handling code here:
         Studentnotice1 upsa= new Studentnotice1();
          JOptionPanel1.add(upsa);//setVisible(true);
        upsa.setVisible(true);
        
     
    }//GEN-LAST:event_viewnoticeMouseClicked

    private void viewnoticeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewnoticeMousePressed
        // TODO add your handling code here:
          viewnotice.setBackground(ClickedColor);
          enrollnotice.setBackground(DefaultColor);

    }//GEN-LAST:event_viewnoticeMousePressed

    private void enrollnoticeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrollnoticeMousePressed
        // TODO add your handling code here:
           viewnotice.setBackground(DefaultColor);
          enrollnotice.setBackground(ClickedColor);
    }//GEN-LAST:event_enrollnoticeMousePressed

    private void enrollnoticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrollnoticeMouseClicked
        // TODO add your handling code here:
        Studentworkshop ab = new Studentworkshop();
        JOptionPanel1.add(ab);
        ab.setVisible(true);
    }//GEN-LAST:event_enrollnoticeMouseClicked
  


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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard().setVisible(true);
            }
             });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JOptionPanel1;
    private javax.swing.JPanel enrollnotice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel viewnotice;
    // End of variables declaration//GEN-END:variables

}
