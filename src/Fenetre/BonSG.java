/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fenetre;

import Mapping.*;
import DAO.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIOUF ABBAS
 */
public class BonSG extends javax.swing.JInternalFrame {

    /**
     * Creates new form BonSG
     */
    String dept[][] = null;
    ArrayList list = new ArrayList();
    detailsBon dep = null;
    String[] Colonne = new String[4];
     float f = 0;
    float prTot = 0;
    public BonSG() {
        initComponents();
        Colonne[0] = "Matériel";
        Colonne[1] = "Nombre";
        Colonne[2] = "Prix unitaire";
        Colonne[3] = "Prix total";
        
        try {
   int a = BonCmdBean.getIdBon(0);
            list = BonCmdBean.Bonbi(a);
            dep = new detailsBon();
            dept = new String[list.size()][4];
            int i = 0;
            for (Object list1 : list) {
                dep = (detailsBon) list1;
                Materiel mate = MatosBean.rechById(dep.getIdMat());
                dept[i][0] = mate.getNom();
                dept[i][1] = dep.getQte() + "";
                dept[i][2] = mate.getPrix() + "";
               f = (mate.getPrix() * dep.getQte());
                dept[i][3] = f + "";
                prTot = prTot + f;
                jLabel4.setText(prTot + "FCFA");
                i++;
            }
            jTable1.setModel(new DefaultTableModel(dept, Colonne));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur" + ex.getMessage(), "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Prix Total Commande : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 200, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 300));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 190, 20));

        jButton1.setText("Transmettre à l'agent comptable");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 210, 40));

        jButton2.setText("Invalider Bon");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 110, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 100, 20));

        jButton3.setText("Quitter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int a = BonCmdBean.getIdBon(0);
            int b = BonCmdBean.TransBonSG(a, 1);
            if(b!=0){
                JOptionPane.showMessageDialog(null, "Bon!", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur" + ex.getMessage(), "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            int a = BonCmdBean.getIdBon(0);
            int b = BonCmdBean.TransBonSG(a, 3);
            if(b!=0){
                JOptionPane.showMessageDialog(null, "Bon annulé!", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur" + ex.getMessage(), "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
