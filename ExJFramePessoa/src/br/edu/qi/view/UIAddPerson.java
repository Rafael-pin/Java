/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.view;

import br.edu.qi.model.Person;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Pinheiro
 * @since 20/05/2019 - 14:17
 * @version 1.0 Beta
 */
public class UIAddPerson extends javax.swing.JFrame {

    /**
     * Creates new form UIAddPerson
     */
    public UIAddPerson() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpData = new javax.swing.JLayeredPane();
        jlName = new javax.swing.JLabel();
        jlAge = new javax.swing.JLabel();
        jlWeight = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jtAge = new javax.swing.JTextField();
        jtWeight = new javax.swing.JTextField();
        jlpActions = new javax.swing.JLayeredPane();
        jbAdd = new javax.swing.JButton();
        jbClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlpData.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jlName.setText("Nome");

        jlAge.setText("Idade");

        jlWeight.setText("Peso");

        jtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNameKeyPressed(evt);
            }
        });

        jtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtAgeKeyPressed(evt);
            }
        });

        jtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtWeightKeyPressed(evt);
            }
        });

        jlpData.setLayer(jlName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jlAge, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jlWeight, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jtAge, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jtWeight, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDataLayout = new javax.swing.GroupLayout(jlpData);
        jlpData.setLayout(jlpDataLayout);
        jlpDataLayout.setHorizontalGroup(
            jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDataLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlWeight)
                    .addComponent(jlName, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jlAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jlpDataLayout.setVerticalGroup(
            jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDataLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAge, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlWeight)
                    .addComponent(jtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jlpActions.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        jbAdd.setText("Cadastrar");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });
        jbAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAddKeyPressed(evt);
            }
        });

        jbClean.setText("Limpar");
        jbClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCleanActionPerformed(evt);
            }
        });
        jbClean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCleanKeyPressed(evt);
            }
        });

        jlpActions.setLayer(jbAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpActions.setLayer(jbClean, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpActionsLayout = new javax.swing.GroupLayout(jlpActions);
        jlpActions.setLayout(jlpActionsLayout);
        jlpActionsLayout.setHorizontalGroup(
            jlpActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpActionsLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jbClean, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jlpActionsLayout.setVerticalGroup(
            jlpActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpActionsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jlpActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbClean, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlpActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jlpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jlpActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add() {
        Person person = new Person(jtName.getText(),Integer.parseInt(jtAge.getText()),Double.parseDouble(jtWeight.getText()));
        JOptionPane.showMessageDialog(this,"Relatório\n"+person.toString(),"Dados",JOptionPane.PLAIN_MESSAGE);
    }//close add
    
    private void clean() {
        jtName.setText("");
        jtAge.setText("");
        jtWeight.setText("");
        jtName.grabFocus();
    }
    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        add();
        clean();
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCleanActionPerformed
        clean();
    }//GEN-LAST:event_jbCleanActionPerformed

    private void jbAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAddKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            add();
            clean();
        }  
    }//GEN-LAST:event_jbAddKeyPressed

    private void jbCleanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCleanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            clean();
        } 
    }//GEN-LAST:event_jbCleanKeyPressed

    private void jtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
           jtAge.grabFocus();
    }//GEN-LAST:event_jtNameKeyPressed

    private void jtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAgeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
           jtWeight.grabFocus();
    }//GEN-LAST:event_jtAgeKeyPressed

    private void jtWeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtWeightKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            add();
            clean();
        }
    }//GEN-LAST:event_jtWeightKeyPressed

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
            java.util.logging.Logger.getLogger(UIAddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIAddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIAddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIAddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIAddPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbClean;
    private javax.swing.JLabel jlAge;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlWeight;
    private javax.swing.JLayeredPane jlpActions;
    private javax.swing.JLayeredPane jlpData;
    private javax.swing.JTextField jtAge;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextField jtWeight;
    // End of variables declaration//GEN-END:variables
}
