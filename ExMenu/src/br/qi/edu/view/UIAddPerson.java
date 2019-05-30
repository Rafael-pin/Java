/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.qi.edu.view;

import br.qi.edu.model.Person;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

/**
 *
 * @author Rafael Pinheiro
 * @since 28/05/2019 - 14:06
 * @version 1.0 beta
 */
public class UIAddPerson extends javax.swing.JInternalFrame {

    /**
     * Creates new form UICadPerson
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
        jcbName = new javax.swing.JComboBox<>();
        jsAge = new javax.swing.JSpinner();
        jlpActions = new javax.swing.JLayeredPane();
        jbAdd = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Pessoa");

        jlpData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlName.setText("Nome");

        jlAge.setText("Idade");

        jcbName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "José", "Maria", "Eduardo", "Stephanie" }));

        jlpData.setLayer(jlName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jlAge, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jcbName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jsAge, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDataLayout = new javax.swing.GroupLayout(jlpData);
        jlpData.setLayout(jlpDataLayout);
        jlpDataLayout.setHorizontalGroup(
            jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDataLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlName)
                    .addComponent(jlAge))
                .addGap(72, 72, 72)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbName, 0, 206, Short.MAX_VALUE)
                    .addComponent(jsAge))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jlpDataLayout.setVerticalGroup(
            jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDataLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName)
                    .addComponent(jcbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAge)
                    .addComponent(jsAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jlpActions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAdd.setText("Cadastrar");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jlpActions.setLayer(jbAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpActionsLayout = new javax.swing.GroupLayout(jlpActions);
        jlpActions.setLayout(jlpActionsLayout);
        jlpActionsLayout.setHorizontalGroup(
            jlpActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpActionsLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jbAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpActionsLayout.setVerticalGroup(
            jlpActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpActionsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jbAdd)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpData)
                    .addComponent(jlpActions))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpActions)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add() {
        try {
            if (jcbName.getSelectedIndex() == 0) {
                throw new Exception("Escolha um nome!");
            }
            Person person = new Person (jcbName.getSelectedItem().toString(),Integer.parseInt(jsAge.getValue().toString()));
            JOptionPane.showMessageDialog(this,"Dados: \n" + person.toString(), "Relatório",JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Erro: " + e.getMessage(),"ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clean() {
        jcbName.setSelectedIndex(0);
        jsAge.setValue(0);
        jcbName.grabFocus();
    }
    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        add();
    }//GEN-LAST:event_jbAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAdd;
    private javax.swing.JComboBox<String> jcbName;
    private javax.swing.JLabel jlAge;
    private javax.swing.JLabel jlName;
    private javax.swing.JLayeredPane jlpActions;
    private javax.swing.JLayeredPane jlpData;
    private javax.swing.JSpinner jsAge;
    // End of variables declaration//GEN-END:variables
}
