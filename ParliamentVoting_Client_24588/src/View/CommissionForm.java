/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Commission;
import Service.CommissionService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHEMA 01
 */
public class CommissionForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form CommissionForm
     */
    DefaultTableModel tableModel = new DefaultTableModel();
    public CommissionForm() {
        initComponents();
        addData();
    }
public void addData(){
         try {
             tableModel.setRowCount(0);
           Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            CommissionService service =   (CommissionService) theRegistry.lookup("commissions");
            Commission theCommission = new Commission();
            DefaultTableModel tm=(DefaultTableModel)managerTable.getModel();
            List<Commission> Obj = service.allCommissions();
           for(Commission i: Obj){
              Object data[]={
                  i.getCommmissionId(),
                  i.getCommission_name(),
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
        jLabel1.setText("Commissions");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel2.setText("Commission name");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(jButton1)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            if(nameTxt.getText().trim().isEmpty()
                 ){
            JOptionPane.showMessageDialog(this, "fill all filled");
            
        }else{
            
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            CommissionService service =   (CommissionService) theRegistry.lookup("commissions");
            Commission theCommission = new Commission();
            theCommission.setCommission_name(nameTxt.getText());
            Commission theObj = service.addCommission(theCommission);
            if(theObj!=null){
                JOptionPane.showMessageDialog(this, "Data saved");
            }else{
                JOptionPane.showMessageDialog(this, "Data not saved");
            }}
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
             if(nameTxt.getText().trim().isEmpty()
                 ){
            JOptionPane.showMessageDialog(this, "fill all filled");
            
        }else{
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            CommissionService service =   (CommissionService) theRegistry.lookup("commissions");
            Commission theCommission = new Commission();
            theCommission.setCommmissionId(Integer.parseInt(searchKey.getText()));
            theCommission.setCommission_name(nameTxt.getText());
            Commission theObj = service.editCommission(theCommission);
            if(theObj!=null){
                JOptionPane.showMessageDialog(this, "Data Updated");
            }else{
                JOptionPane.showMessageDialog(this, "Data not updated");
            }}
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
            CommissionService service =   (CommissionService) theRegistry.lookup("commissions");
            Commission theCommission = new Commission();
            theCommission.setCommmissionId(Integer.parseInt(searchKey.getText()));

            Commission theObj = service.removeCommission(theCommission);
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
             if(searchKey.getText().trim().isEmpty()
                 ){
            JOptionPane.showMessageDialog(this, "Provide id you are searching for");
            
        }else{
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            CommissionService service =   (CommissionService) theRegistry.lookup("commissions");
            Commission theCommission = new Commission();
            theCommission.setCommmissionId(Integer.parseInt(searchKey.getText()));
            Commission theObj = service.findCommission(theCommission);

            if (theObj != null) {
                searchKey.setText(String.valueOf(theObj.getCommmissionId()));
                nameTxt.setText(theObj.getCommission_name());
            } else {
                JOptionPane.showMessageDialog(this, "Data not found");
            }}
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
