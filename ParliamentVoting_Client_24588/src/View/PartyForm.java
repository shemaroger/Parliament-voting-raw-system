/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Party;
import Service.PartyService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHEMA 01
 */
public class PartyForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form PartyForm
     */
    DefaultTableModel tableModel = new DefaultTableModel();
    public PartyForm() {
        initComponents();
        addData();
    }
public void addData(){
         try {
             tableModel.setRowCount(0);
           Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            PartyService service =  (PartyService) theRegistry.lookup("parties");
            Party theParties = new Party();
            DefaultTableModel tm=(DefaultTableModel)managerTable.getModel();
            List<Party> Obj = service.allParties();
             // tm=(DefaultTableModel)managerTable.getModel();
           for(Party i: Obj){
              Object data[]={
                  i.getPartyId(),
                  i.getParty_name(),
                  i.getCreated_date()
              };
              tm.addRow(data);
           }  
         } catch (Exception e) {
             e.printStackTrace();
         }
        
     }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        managerTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        searchKey = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Parties");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel2.setText("Party name");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        managerTable.setBackground(new java.awt.Color(204, 204, 255));
        managerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Started date"
            }
        ));
        jScrollPane1.setViewportView(managerTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Search by Id");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(481, 481, 481))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(jButton1)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            PartyService service =  (PartyService) theRegistry.lookup("parties");
            Party theParties = new Party();
            theParties.setParty_name(nameTxt.getText());
            Party theObj = service.addParty(theParties);
            if(theObj!=null){
                JOptionPane.showMessageDialog(this, "Data saved");
            }else{
                JOptionPane.showMessageDialog(this, "Data not saved");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
              Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            PartyService service =  (PartyService) theRegistry.lookup("parties");
            Party theParties = new Party();
            theParties.setPartyId(Integer.parseInt(searchKey.getText()));
            theParties.setParty_name(nameTxt.getText());
            Party theObj = service.editParty(theParties);
            if(theObj!=null){
                JOptionPane.showMessageDialog(this, "Data Updated");
            }else{
                JOptionPane.showMessageDialog(this, "Data not updated");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try{
              int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete seleted record", "Confirm", JOptionPane.YES_NO_OPTION);
        if(searchKey.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Search ID required", "Enter ID", HEIGHT);
        }else 
       if(response==JOptionPane.YES_OPTION){
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            PartyService service =  (PartyService) theRegistry.lookup("parties");
            Party theParties = new Party();
            theParties.setPartyId(Integer.parseInt(searchKey.getText()));
            
            Party theObj = service.removeParty(theParties);
            if(theObj!=null){
                JOptionPane.showMessageDialog(this, "Data Deleted");
            }else{
                JOptionPane.showMessageDialog(this, "Data not deleted");
            }}
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
           Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            PartyService service =  (PartyService) theRegistry.lookup("parties");
            Party theParties = new Party();
            theParties.setPartyId(Integer.parseInt(searchKey.getText()));
            Party theObj = service.findParty(theParties);

            if (theObj != null) {
                searchKey.setText(String.valueOf(theObj.getPartyId()));
                nameTxt.setText(theObj.getParty_name());
            } else {
                JOptionPane.showMessageDialog(this, "Data not found");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managerTable;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchKey;
    // End of variables declaration//GEN-END:variables
}
