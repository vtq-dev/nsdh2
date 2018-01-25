/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProgramConfigurationFrame.java
 *
 * Created on 2010-11-07, 15:26:23
 */

package nsdh.view;

import nsdh.*;

/**
 *
 * @author vtq
 */
public class ProgramConfigurationFrame extends javax.swing.JFrame {

    /** Creates new form ProgramConfigurationFrame */
    public ProgramConfigurationFrame(NsdhController nsdhController) {

        initComponents();
        this.nsdhController = nsdhController;

        loadParamsFromNsdhModel();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        paramsPanel = new javax.swing.JPanel();
        ns2PathLabel = new javax.swing.JLabel();
        ns2InputLabel = new javax.swing.JLabel();
        ns2outputLabel = new javax.swing.JLabel();
        generateNamFileLabel = new javax.swing.JLabel();
        namFilenameLabel = new javax.swing.JLabel();
        ns2PathTextField = new javax.swing.JTextField();
        ns2InputTextField = new javax.swing.JTextField();
        ns2OutputTextField = new javax.swing.JTextField();
        generateNamFileComboBox = new javax.swing.JComboBox();
        namFilenameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Konfiguracja Programu");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Anuluj");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        paramsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametry"));

        ns2PathLabel.setText("ścieżka programu ns-2:");

        ns2InputLabel.setText("nazwa pliku wejściowego ns-2:");

        ns2outputLabel.setText("nazwa pliku wyjściowego ns-2:");

        generateNamFileLabel.setText("czy generować plik dla NAM?:");

        namFilenameLabel.setText("nazwa pliku dla NAM:");

        generateNamFileComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tak", "Nie" }));
        generateNamFileComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateNamFileComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paramsPanelLayout = new javax.swing.GroupLayout(paramsPanel);
        paramsPanel.setLayout(paramsPanelLayout);
        paramsPanelLayout.setHorizontalGroup(
            paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paramsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ns2PathLabel)
                    .addComponent(ns2InputLabel)
                    .addComponent(ns2outputLabel)
                    .addComponent(generateNamFileLabel)
                    .addComponent(namFilenameLabel))
                .addGap(27, 27, 27)
                .addGroup(paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namFilenameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(generateNamFileComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ns2OutputTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(ns2PathTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(ns2InputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        paramsPanelLayout.setVerticalGroup(
            paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paramsPanelLayout.createSequentialGroup()
                .addGroup(paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ns2PathLabel)
                    .addComponent(ns2PathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ns2InputLabel)
                    .addComponent(ns2InputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ns2outputLabel)
                    .addComponent(ns2OutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateNamFileLabel)
                    .addComponent(generateNamFileComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namFilenameLabel)
                    .addComponent(namFilenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paramsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paramsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        saveParamsToNsdhModel();
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void generateNamFileComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateNamFileComboBoxActionPerformed

        if(generateNamFileComboBox.getSelectedIndex()==0){
            namFilenameTextField.setEnabled(true);
        }else if (generateNamFileComboBox.getSelectedIndex()==1){
            namFilenameTextField.setEnabled(false);
        }

    }//GEN-LAST:event_generateNamFileComboBoxActionPerformed

    private void loadParamsFromNsdhModel(){
        ns2PathTextField.setText(nsdhController.nsdhModel.settings.ns2Path);
        ns2OutputTextField.setText(nsdhController.nsdhModel.settings.ns2OutputFilePath);
        ns2InputTextField.setText(nsdhController.nsdhModel.settings.ns2InputFilePath);

        if(nsdhController.nsdhModel.settings.generateNamFile == true){
            generateNamFileComboBox.setSelectedIndex(0);

        }else{
            generateNamFileComboBox.setSelectedIndex(1);
        }

        namFilenameTextField.setText(nsdhController.nsdhModel.settings.namFileName);


    }

    private void saveParamsToNsdhModel(){
        nsdhController.nsdhModel.settings.ns2Path = ns2PathTextField.getText();
        nsdhController.nsdhModel.settings.ns2OutputFilePath = ns2OutputTextField.getText();
        nsdhController.nsdhModel.settings.ns2InputFilePath = ns2InputTextField.getText();

        if(generateNamFileComboBox.getSelectedIndex()==0){
            nsdhController.nsdhModel.settings.generateNamFile=true;
            nsdhController.nsdhModel.settings.namFileName=namFilenameTextField.getText();
        }else if (generateNamFileComboBox.getSelectedIndex()==1){
            nsdhController.nsdhModel.settings.generateNamFile=false;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox generateNamFileComboBox;
    private javax.swing.JLabel generateNamFileLabel;
    private javax.swing.JLabel namFilenameLabel;
    private javax.swing.JTextField namFilenameTextField;
    private javax.swing.JLabel ns2InputLabel;
    private javax.swing.JTextField ns2InputTextField;
    private javax.swing.JTextField ns2OutputTextField;
    private javax.swing.JLabel ns2PathLabel;
    private javax.swing.JTextField ns2PathTextField;
    private javax.swing.JLabel ns2outputLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel paramsPanel;
    // End of variables declaration//GEN-END:variables

    private NsdhController nsdhController;
}