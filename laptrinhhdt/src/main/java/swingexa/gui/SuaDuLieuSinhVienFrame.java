/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexa.gui;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MyPC
 */
public class SuaDuLieuSinhVienFrame extends javax.swing.JInternalFrame {
    
    public int idstudent;

    /**
     * Creates new form SuaDuLieuSinhVienFrame
     */
    public SuaDuLieuSinhVienFrame() {
        initComponents();
    }

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }
    
    public void load_student_data() throws SQLException{
        Student sv = new Student();
        Student kq = sv.get_student_by_id(this.idstudent);
        jtxtFullname.setText(kq.getFullname());
        jtxtSdt.setText(kq.getSdt());
        jtxtEmail.setText(kq.getEmail());
    }
    
    public void load_student_image_data(){
        Student sv = new Student();
        Student kq = sv.get_student_image_by_id(this.idstudent);
        jtxtFullname.setText(kq.getFullname());
        jtxtSdt.setText(kq.getSdt());
        jtxtEmail.setText(kq.getEmail());
        ImageIcon icon = new ImageIcon(kq.getImageOut());
        jlblImage.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtFullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtSdt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jbtnUpdate = new javax.swing.JButton();
        jbtnQuit = new javax.swing.JButton();
        jlblImage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtImage = new javax.swing.JTextField();
        jbtnBrowse = new javax.swing.JButton();

        jLabel1.setText("Fullname");

        jLabel2.setText("Phone");

        jLabel3.setText("Email");

        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnQuit.setText("Quit");
        jbtnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuitActionPerformed(evt);
            }
        });

        jLabel4.setText("Image");

        jtxtImage.setText("jTextField1");

        jbtnBrowse.setText("Browse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtFullname)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtSdt)
                                .addComponent(jtxtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtImage, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnBrowse)
                                    .addComponent(jbtnUpdate))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnQuit)
                                .addGap(0, 38, Short.MAX_VALUE))
                            .addComponent(jlblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnBrowse))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnUpdate)
                    .addComponent(jbtnQuit))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuitActionPerformed
        try {
            // TODO add your handling code here:
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(SuaDuLieuSinhVienFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnQuitActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        try {
            // TODO add your handling code here:
            Student sv = new Student(idstudent, jtxtFullname.getText(),
                    jtxtSdt.getText(),
                    jtxtEmail.getText());
            sv.update_current_student();
            JOptionPane.showMessageDialog(null, "Đã cập nhật dữ liệu");
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(SuaDuLieuSinhVienFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnQuit;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JLabel jlblImage;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFullname;
    private javax.swing.JTextField jtxtImage;
    private javax.swing.JTextField jtxtSdt;
    // End of variables declaration//GEN-END:variables
}
