
package View;

import Model.SetElection;
import Service.SetElectionService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHEMA 01
 */
public class SetElectionForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form SetElectionForm
     */
    DefaultTableModel tableModel = new DefaultTableModel();
    public SetElectionForm() {
        initComponents();
        addData();
    }
     public void addData(){
         try {
             tableModel.setRowCount(0);
             Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            SetElectionService service = (SetElectionService) theRegistry.lookup("setElections");
            SetElection theSetElection = new SetElection();
            DefaultTableModel tm=(DefaultTableModel)managerTable.getModel();
            List<SetElection> Obj = service.allElections();
             
           for(SetElection i: Obj){
              Object data[]={
                  i.getProposalId(),
                  i.getProposal_name(),
                  i.getProposal_description(),
                  i.getDate(),
                  i.getStatus()
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
        jLabel4 = new javax.swing.JLabel();
        proIdTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        proDescriptionTxt = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        dateTxt = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Set election");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Proposal name");

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
                "Proposal ID", "Proposal name", "Proposal description", "Election date", "Status"
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Proposal id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Proposal description");

        proDescriptionTxt.setColumns(20);
        proDescriptionTxt.setRows(5);
        jScrollPane2.setViewportView(proDescriptionTxt);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Date");

        jButton2.setText("Election is Over");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(addBtn)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(39, 39, 39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(proIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(proIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(jButton1)
                            .addComponent(deleteBtn))
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBtn)
                            .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            SetElectionService service = (SetElectionService) theRegistry.lookup("setElections");
            SetElection theSetElection = new SetElection();
            theSetElection.setProposal_name(nameTxt.getText());
            theSetElection.setProposalId(proIdTxt.getText());
            theSetElection.setProposal_description(proDescriptionTxt.getText());
            theSetElection.setStatus("Voting");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(dateTxt.getDate());
            theSetElection.setDate(date);
            SetElection theObj = service.addSetElection(theSetElection);
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
            SetElectionService service = (SetElectionService) theRegistry.lookup("setElections");
            SetElection theSetElection = new SetElection();
            theSetElection.setProposalId(searchKey.getText());
            theSetElection.setProposalId(proIdTxt.getText());
            theSetElection.setProposal_name(nameTxt.getText());
            theSetElection.setProposal_description(proDescriptionTxt.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(dateTxt.getDate());
            theSetElection.setDate(date);
            SetElection theObj = service.editSetElection(theSetElection);
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
            SetElectionService service = (SetElectionService) theRegistry.lookup("setElections");
            SetElection theSetElection = new SetElection();
            theSetElection.setProposalId(proIdTxt.getText());

            SetElection theObj = service.removeSetElection(theSetElection);
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
            SetElectionService service = (SetElectionService) theRegistry.lookup("setElections");
            SetElection theSetElection = new SetElection();
            theSetElection.setProposalId(searchKey.getText());
            SetElection theObj = service.findSetElection(theSetElection);

            if (theObj != null) {
                proIdTxt.setText(theObj.getProposalId());
                nameTxt.setText(theObj.getProposal_name());
                proDescriptionTxt.setText(theObj.getProposal_description());
                dateTxt.setDateFormatString(theObj.getDate());
                
            } else {
                JOptionPane.showMessageDialog(this, "Data not found");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           try{
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            SetElectionService service = (SetElectionService) theRegistry.lookup("setElections");
            SetElection theSetElection = new SetElection();
            theSetElection.setProposalId(searchKey.getText());
            theSetElection.setStatus("Done");
            SetElection theObj = service.editSetElection(theSetElection);
            if(theObj!=null){
                JOptionPane.showMessageDialog(this, "Data Updated");
            }else{
                JOptionPane.showMessageDialog(this, "Data not updated");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable managerTable;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextArea proDescriptionTxt;
    private javax.swing.JTextField proIdTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchKey;
    // End of variables declaration//GEN-END:variables
}
