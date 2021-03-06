/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenetre;

import DAO.TypeSalBean;
import javax.swing.DefaultComboBoxModel;
import Mapping.*;
import DAO.*;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author DIOUF ABBAS
 */
public class InsMatos extends javax.swing.JInternalFrame {

    /**
     * Creates new form InsMatos
     */
    public InsMatos() throws Exception {
        initComponents();

        DefaultComboBoxModel modele = new DefaultComboBoxModel(SalleBean.findAll().toArray());
        salCBX.setModel(modele);
        salCBX.setSelectedIndex(0);

        DefaultComboBoxModel modele1 = new DefaultComboBoxModel(MatosBean.findAll().toArray());
        matCBX.setModel(modele1);
        matCBX.setSelectedIndex(0);
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
        salCBX = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        matCBX = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        nbTFD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Sélectionez la salle");

        salCBX.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        salCBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Sélectionnez le matériel");

        matCBX.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        matCBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Nombre");

        nbTFD.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nbTFD)
                    .addComponent(salCBX, 0, 172, Short.MAX_VALUE)
                    .addComponent(matCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(salCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(matCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(nbTFD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!JSType.isNumber(nbTFD.getText()))
        {
        JOptionPane.showMessageDialog(null, "Le champs nombre doit etre numérique", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
       nbTFD.setText("");
        return;
        }

        DetailsMatos dtm = new DetailsMatos();
        Salle sl = (Salle) salCBX.getSelectedItem();
        Materiel mt = (Materiel) matCBX.getSelectedItem();
        dtm.setIdMat(mt.getId());
        dtm.setIdSal(sl.getId());
        dtm.setNbMatos(Integer.parseInt(nbTFD.getText()));
        try {
            DetailsMatos dtm1 = DetailsMatosBean.verif(dtm.getIdMat(), dtm.getIdSal());
            if (dtm1 != null) {
                int plus = dtm.getNbMatos() + dtm1.getNbMatos();
                int stock = DetailsMatosBean.getStock(dtm.getIdMat(),34);
                if(dtm.getNbMatos()>stock)
                {
                JOptionPane.showMessageDialog(null, "Le nombre saisai est plus grand que la valeur en stock", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
                nbTFD.setText("");
                return;
                }
                int moins = stock-dtm.getNbMatos();
                int s= DetailsMatosBean.UpStock(dtm.getIdMat(),34, moins);
                int i = DetailsMatosBean.UpDetMat(dtm.getIdMat(), dtm.getIdSal(), plus);
                if (i != 0&s!=0) {
                    JOptionPane.showMessageDialog(null, "Bon!", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
            }
            else{
                int stock = DetailsMatosBean.getStock(dtm.getIdMat(),34);
                if(dtm.getNbMatos()>stock)
                {
                JOptionPane.showMessageDialog(null, "Le nombre saisai est plus grand que la valeur en stock", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
                nbTFD.setText("");
                return;
                }
                int moins = stock-dtm.getNbMatos();
                int s= DetailsMatosBean.UpStock(dtm.getIdMat(),34, moins);
            int i = DetailsMatosBean.addDetMAT(dtm);
            if (i != 0&s!=0) {
                    JOptionPane.showMessageDialog(null, "Bon!", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur" + ex.getMessage(), "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox matCBX;
    private javax.swing.JTextField nbTFD;
    private javax.swing.JComboBox salCBX;
    // End of variables declaration//GEN-END:variables
}
