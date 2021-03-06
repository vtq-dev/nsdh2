/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NetworkSettingsFrame.java
 *
 * Created on 2010-06-05, 14:19:32
 */

package nsdh.view;

import nsdh.*;
import javax.swing.table.*;
import javax.swing.*;
import java.util.*;
import nsdh.model.script_models.*;

/**
 *
 * @author vtq
 */
public class NetworkSettingsFrame extends javax.swing.JFrame {

    /** Creates new form NetworkSettingsFrame */
    public NetworkSettingsFrame(NsdhGUI nsdhGUI) {

        this.nsdhGUI = nsdhGUI;
        this.nsdhController = nsdhGUI.nsdhController;

        initComponents();

        loadRoutingType();

        createServiceTable();
        LoadServiceTableFromNsdhModel();

        createQueuePolicyTable();
        LoadQueuePolicyTableFromNsdhModel();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        queuePolicyPanel = new javax.swing.JPanel();
        queuePolicyScrollPane = new javax.swing.JScrollPane();
        queuePolicyTable = new javax.swing.JTable();
        queuePolicyAddButton = new javax.swing.JButton();
        queuePolicyEditButton = new javax.swing.JButton();
        queuePolicyRemoveButton = new javax.swing.JButton();
        servicePanel = new javax.swing.JPanel();
        serviceScrollPane = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        serviceAddButton = new javax.swing.JButton();
        serviceEditButton = new javax.swing.JButton();
        serviceRemoveButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        routingPanel = new javax.swing.JPanel();
        routingTypeLabel = new javax.swing.JLabel();
        routingTypeComboBox = new javax.swing.JComboBox();
        cancelButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ustawienia sieci");
        setBounds(new java.awt.Rectangle(100, 50, 0, 0));
        setResizable(false);

        queuePolicyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Definicje polityk kolejkowania"));

        queuePolicyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        queuePolicyScrollPane.setViewportView(queuePolicyTable);

        queuePolicyAddButton.setText("Dodaj");
        queuePolicyAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queuePolicyAddButtonActionPerformed(evt);
            }
        });

        queuePolicyEditButton.setText("Edytuj");
        queuePolicyEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queuePolicyEditButtonActionPerformed(evt);
            }
        });

        queuePolicyRemoveButton.setText("Usun");
        queuePolicyRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queuePolicyRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout queuePolicyPanelLayout = new javax.swing.GroupLayout(queuePolicyPanel);
        queuePolicyPanel.setLayout(queuePolicyPanelLayout);
        queuePolicyPanelLayout.setHorizontalGroup(
            queuePolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queuePolicyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(queuePolicyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(queuePolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queuePolicyAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(queuePolicyEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(queuePolicyRemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addContainerGap())
        );
        queuePolicyPanelLayout.setVerticalGroup(
            queuePolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queuePolicyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(queuePolicyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queuePolicyPanelLayout.createSequentialGroup()
                        .addComponent(queuePolicyAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queuePolicyEditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queuePolicyRemoveButton))
                    .addComponent(queuePolicyScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        servicePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Definicje Usług"));

        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        serviceScrollPane.setViewportView(serviceTable);

        serviceAddButton.setText("Dodaj");
        serviceAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceAddButtonActionPerformed(evt);
            }
        });

        serviceEditButton.setText("Edytuj");
        serviceEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceEditButtonActionPerformed(evt);
            }
        });

        serviceRemoveButton.setText("Usun");
        serviceRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout servicePanelLayout = new javax.swing.GroupLayout(servicePanel);
        servicePanel.setLayout(servicePanelLayout);
        servicePanelLayout.setHorizontalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serviceScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(serviceEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(serviceRemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap())
        );
        servicePanelLayout.setVerticalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servicePanelLayout.createSequentialGroup()
                        .addComponent(serviceAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serviceEditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serviceRemoveButton))
                    .addComponent(serviceScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        routingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Routing"));

        routingTypeLabel.setText("Tryb routingu:");

        routingTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "auto (najkrotsza sciezka)", "manual (tablice routingu + najkrotsza sciezka)" }));

        javax.swing.GroupLayout routingPanelLayout = new javax.swing.GroupLayout(routingPanel);
        routingPanel.setLayout(routingPanelLayout);
        routingPanelLayout.setHorizontalGroup(
            routingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(routingTypeLabel)
                .addGap(18, 18, 18)
                .addComponent(routingTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        routingPanelLayout.setVerticalGroup(
            routingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(routingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routingTypeLabel)
                    .addComponent(routingTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cancelButton.setText("Anuluj");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(servicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(queuePolicyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(routingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(servicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(queuePolicyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(routingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Edytuj wybrana usluge
     * @param evt
     */
    private void serviceEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceEditButtonActionPerformed

        if(serviceTable.getSelectedRow()>-1){
            DefaultTableModel model = (DefaultTableModel)serviceTable.getModel();
            String selectedService = (String)model.getValueAt(serviceTable.getSelectedRow(), 0);
            new ServiceSettingsFrame(nsdhController, nsdhGUI.graphPanel, this, selectedService);
        }
        
    }//GEN-LAST:event_serviceEditButtonActionPerformed

    private void queuePolicyAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queuePolicyAddButtonActionPerformed
        new QueuePolicySettingsFrame(nsdhController, nsdhGUI.graphPanel, this, null);
    }//GEN-LAST:event_queuePolicyAddButtonActionPerformed

    private void loadRoutingType(){

        if(nsdhController.nsdhModel.network_settings.routing_type.equals("auto")){
            routingTypeComboBox.setSelectedIndex(0);
        }else{
            routingTypeComboBox.setSelectedIndex(1);
        }

    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        
        if(this.routingTypeComboBox.getSelectedIndex()==0){
            nsdhController.nsdhModel.network_settings.routing_type = "auto";
        }else{
            nsdhController.nsdhModel.network_settings.routing_type = "manual";
        }

        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void serviceRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceRemoveButtonActionPerformed

        if(serviceTable.getSelectedRow()>-1){
            int countinueOption = JOptionPane.showConfirmDialog(
                    this,
                    "Czy na pewno chcesz usunac usluge? \n"
                    + "Usuniete zostana rowniez polaczenia server-klient\n"
                    + "i wpisy w kolejkach z nia zwiazane","Ostrzeżenie",
                    JOptionPane.YES_NO_OPTION);

            if(countinueOption==0){

                DefaultTableModel model = (DefaultTableModel)serviceTable.getModel();

                String selectedService = (String)model.getValueAt(serviceTable.getSelectedRow(), 0);

                nsdhController.DeleteService(selectedService);
                nsdhGUI.graphPanel.loadEdgesFromNsdhModel();
                this.LoadServiceTableFromNsdhModel();
            }
        }


       

    }//GEN-LAST:event_serviceRemoveButtonActionPerformed

    private void queuePolicyRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queuePolicyRemoveButtonActionPerformed

        if(queuePolicyTable.getSelectedRow()>-1){
            int countinueOption = JOptionPane.showConfirmDialog(
                    this,
                    "Czy na pewno chcesz usunac polityke kolejkowania? \n"
                    + "Usuniete zostana rowniez polaczenia z nia zwiazane","Ostrzeżenie",
                    JOptionPane.YES_NO_OPTION);

            if(countinueOption==0){

                DefaultTableModel model = (DefaultTableModel)queuePolicyTable.getModel();

                String selectedQueuePolicy = (String)model.getValueAt(queuePolicyTable.getSelectedRow(), 0);

                nsdhController.DeleteQueuePolicy(selectedQueuePolicy);
                nsdhGUI.graphPanel.loadEdgesFromNsdhModel();
                this.LoadQueuePolicyTableFromNsdhModel();
            }
        }

    }//GEN-LAST:event_queuePolicyRemoveButtonActionPerformed

    private void serviceAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceAddButtonActionPerformed
        new ServiceSettingsFrame(nsdhController, nsdhGUI.graphPanel, this, null);
    }//GEN-LAST:event_serviceAddButtonActionPerformed

    private void queuePolicyEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queuePolicyEditButtonActionPerformed

        if(queuePolicyTable.getSelectedRow()>-1){
            DefaultTableModel model = (DefaultTableModel)queuePolicyTable.getModel();
            String selectedQueuePolicy = (String)model.getValueAt(queuePolicyTable.getSelectedRow(), 0);
            new QueuePolicySettingsFrame(nsdhController, nsdhGUI.graphPanel, this, selectedQueuePolicy);
        }

    }//GEN-LAST:event_queuePolicyEditButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void createServiceTable(){
        //zainicjalizuj model tabeli
        String[] values = new String[]{"Nazwa", "Serwer-transport", "Serwer-aplikacja","Klient"};
        serviceTable.setModel(new DefaultTableModel(values,0) {
                                 @Override
                                 //tabela nie moze byc edytowana
                                 public boolean isCellEditable(int row, int column)
                                 {
                                     return false;
                                 }
                             }
                );
        DefaultTableModel model = (DefaultTableModel)serviceTable.getModel();

    }

    public void LoadServiceTableFromNsdhModel(){

        DefaultTableModel model = (DefaultTableModel)serviceTable.getModel();

        //wyczysc tabele
        int rowsNum = serviceTable.getRowCount();
        for(int i=rowsNum-1; i>= 0; i--){
            model.removeRow(i);
        }



        //dodaj do tabeli wiersze z modelu
        for(Service service: nsdhController.nsdhModel.network_settings.service_list.values()){
            String[] serviceArray = new String[4];
            serviceArray[0] = service.name;
            serviceArray[1]= service.server_transport.server_agent;
            serviceArray[2]= service.server_application.type;
            serviceArray[3]= service.client_sink.client_agent;

            model.insertRow(model.getRowCount(), serviceArray);
        }
    }


    private void createQueuePolicyTable(){
        //zainicjalizuj model tabeli
        String[] values = new String[]{"Nazwa", "Scheduler"};
        queuePolicyTable.setModel(new DefaultTableModel(values,0) {
                                 @Override
                                 //tabela nie moze byc edytowana
                                 public boolean isCellEditable(int row, int column)
                                 {
                                     return false;
                                 }
                             }
                );
        DefaultTableModel model = (DefaultTableModel)queuePolicyTable.getModel();
    }
    
    
    public void LoadQueuePolicyTableFromNsdhModel(){

        DefaultTableModel model = (DefaultTableModel)queuePolicyTable.getModel();

        //wyczysc tabele
        int rowsNum = queuePolicyTable.getRowCount();
        for(int i=rowsNum-1; i>= 0; i--){
            model.removeRow(i);
        }

        //dodaj do tabeli wiersze z modelu
        for(Queue_policy queue_policy: nsdhController.nsdhModel.network_settings.queue_policy_list.values()){
            String[] rowArray = new String[2];
            rowArray[0] = queue_policy.name;
            rowArray[1]= queue_policy.scheduler;
        
            model.insertRow(model.getRowCount(), rowArray);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton okButton;
    private javax.swing.JButton queuePolicyAddButton;
    private javax.swing.JButton queuePolicyEditButton;
    private javax.swing.JPanel queuePolicyPanel;
    private javax.swing.JButton queuePolicyRemoveButton;
    private javax.swing.JScrollPane queuePolicyScrollPane;
    private javax.swing.JTable queuePolicyTable;
    private javax.swing.JPanel routingPanel;
    private javax.swing.JComboBox routingTypeComboBox;
    private javax.swing.JLabel routingTypeLabel;
    private javax.swing.JButton serviceAddButton;
    private javax.swing.JButton serviceEditButton;
    private javax.swing.JPanel servicePanel;
    private javax.swing.JButton serviceRemoveButton;
    private javax.swing.JScrollPane serviceScrollPane;
    private javax.swing.JTable serviceTable;
    // End of variables declaration//GEN-END:variables

    private NsdhController nsdhController;
    private NsdhGUI nsdhGUI;

}
