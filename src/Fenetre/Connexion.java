/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fenetre;


import DAO.*;
import Mapping.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DIOUF ABBAS
 */
public class Connexion extends javax.swing.JFrame {

    /**
     * Creates new form Connexion
     */
    public Connexion() {
        initComponents();
        try {
                 DefaultComboBoxModel modele = new DefaultComboBoxModel(utilisateurDAO.findAll().toArray());
        poDCBX.setModel(modele);
        poDCBX.setSelectedIndex(0);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logTFD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        poDCBX = new javax.swing.JComboBox();
        cdeptChBX = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        passTFD = new javax.swing.JPasswordField();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Nom Utilisateur");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Mot de passe");

        logTFD.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Poste");

        poDCBX.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        poDCBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cdeptChBX.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cdeptChBX.setText("Chef de Département");
        cdeptChBX.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cdeptChBXItemStateChanged(evt);
            }
        });
        cdeptChBX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cdeptChBXFocusGained(evt);
            }
        });
        cdeptChBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdeptChBXActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(poDCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(logTFD, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(passTFD)))))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(cdeptChBX)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cdeptChBX)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(poDCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logTFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(passTFD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(cdeptChBX.isSelected()){
        try {
            Departement dp = (Departement) poDCBX.getSelectedItem();
            Chef_Dept em = ChefBean.Logon(logTFD.getText(), passTFD.getText(), dp.getId());
            if (em != null) {
                Chef_Dept.getInstance().setId(em.getId());
                Chef_Dept.getInstance().setId_dept(em.getId_dept());
                Chef_Dept.getInstance().setLogin(em.getLogin());
                Chef_Dept.getInstance().setPass(em.getPass());
                Chef_Dept.getInstance().setNom(em.getNom());
                new Menu().setVisible(true);
                this.dispose();
            } else {
                
                JOptionPane.showMessageDialog(null, "Login ou Password Incorrect!", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
            }
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur" + ex.getMessage(), "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
        }
        }
        else{
            Chef_Dept.getInstance().setId(450);
            try {
                utilisateur tst = (utilisateur) poDCBX.getSelectedItem();
                 utilisateur user = utilisateurDAO.Logon(logTFD.getText(), passTFD.getText(), tst.getPoste());
            if(user!=null)
            {
                utilisateur.getInstance().setId(user.getId());
                utilisateur.getInstance().setLogin(user.getLogin());
                utilisateur.getInstance().setNom(user.getNom());
                utilisateur.getInstance().setPass(user.getPass());
                utilisateur.getInstance().setPoste(user.getPoste());
            new Menu().setVisible(true);
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(null, "Login ou Password Incorrect!", "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur" + ex.getMessage(), "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
            }
           
            {
            
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cdeptChBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdeptChBXActionPerformed
        // TODO add your handling code here:
        if(cdeptChBX.isSelected()){
        jLabel3.setText("Département");
            try {
                 DefaultComboBoxModel modele = new DefaultComboBoxModel(DepartementBean.findAll().toArray());
        poDCBX.setModel(modele);
        poDCBX.setSelectedIndex(0);
        return;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erreur" + ex.getMessage(), "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
            }
       
        
        }
        try {
            jLabel3.setText("Poste");
                 DefaultComboBoxModel modele = new DefaultComboBoxModel(utilisateurDAO.findAll().toArray());
        poDCBX.setModel(modele);
        poDCBX.setSelectedIndex(0);
        return;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erreur" + ex.getMessage(), "Gestion Employe", JOptionPane.INFORMATION_MESSAGE);
            }
            
        
    }//GEN-LAST:event_cdeptChBXActionPerformed

    private void cdeptChBXFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cdeptChBXFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cdeptChBXFocusGained

    private void cdeptChBXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cdeptChBXItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cdeptChBXItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cdeptChBX;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField logTFD;
    private javax.swing.JPasswordField passTFD;
    private javax.swing.JComboBox poDCBX;
    // End of variables declaration//GEN-END:variables
}
