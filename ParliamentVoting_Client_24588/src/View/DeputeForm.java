
package View;

import Model.Commission;
import Model.Depute;
import Model.Party;
import Service.CommissionService;
import Service.DeputeService;
import Service.PartyService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHEMA 01
 */
public class DeputeForm extends javax.swing.JInternalFrame {
    private DefaultTableModel tableModel = new DefaultTableModel();
    private DefaultListModel<Commission> listModel = new DefaultListModel<>();
    public DeputeForm() {
        initComponents();
        addItemsPartyCombo();
        addItemCommissionList();
        addData();
    }
    public void addItemsPartyCombo(){
       try {
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
           PartyService service =   (PartyService) theRegistry.lookup("parties");
           List<Party> parties = service.allParties();
           for(Party theObj: parties){
               partyCombo.addItem(theObj);
           }
       } catch (Exception ex) {
           ex.printStackTrace();
       }       
   }
 public void addItemCommissionList(){
       try {
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
           CommissionService service =    (CommissionService) theRegistry.lookup("commissions");
           List<Commission> commissins = service.allCommissions();
           for(Commission theObj: commissins){
               listModel.addElement(theObj);
           }
           commissionList.setModel(listModel);
       } catch (Exception ex) {
           ex.printStackTrace();
       
       }  
   }
 public void addData(){
         try {
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            DeputeService service =  (DeputeService) theRegistry.lookup("deputes");
            Depute theDepute = new Depute();
            DefaultTableModel tm=(DefaultTableModel) deputeTable.getModel();
            List<Depute> Obj = service.allDeputes();
              tableModel.setRowCount(0);
              if(Obj!=null){
           for(Depute i: Obj){
              Object data[]={
                  i.getDeputeId(),
                  i.getDepute_name(),
                  i.getGender(),
                  i.getBirthDate(),
                  i.getParty(),
                  i.getCommission(),
                  i.getPhone_number(),
                  i.getPassword(),
                  i.getRole()
                  
              };
              tm.addRow(data);
              
           }}else{
                  JOptionPane.showMessageDialog(this, "no data found");
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
        deputeTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        searchKey = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        depIdTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateTxt = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        partyCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commissionList = new javax.swing.JList<>();
        genderTxt = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Depute");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Depute name");

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

        deputeTable.setBackground(new java.awt.Color(204, 204, 255));
        deputeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Depute name", "Gender", "Birth date", "Party", "Commission", "Phone number", "Password", "Role"
            }
        ));
        jScrollPane1.setViewportView(deputeTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Search by Id");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Depute id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Phone number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Party");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Commission");

        jScrollPane2.setViewportView(commissionList);

        genderTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Day of birth");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addComponent(addBtn))
                                            .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(30, 30, 30)
                                                .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteBtn))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(136, 136, 136)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(41, 41, 41)
                                                    .addComponent(searchBtn))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGap(18, 18, Short.MAX_VALUE)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(8, 8, 8)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(229, 229, 229)
                                        .addComponent(partyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(83, 83, 83)
                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(407, 407, 407))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(depIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(partyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(jButton1)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
             if(depIdTxt.getText().trim().isEmpty() && depIdTxt.getText().length()==5
                ||nameTxt.getText().trim().isEmpty()
                ||commissionList.getSelectedValue().toString().trim().isEmpty()
                ||genderTxt.getSelectedItem().toString().trim().isEmpty()
                ||partyCombo.getSelectedItem().toString().trim().isEmpty()
                ||dateTxt.getDateFormatString().trim().isEmpty()
                ||phoneTxt.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(this, "fill all filled");
            }else if(phoneTxt.getText().trim().length()!=13 && phoneTxt.getText().trim().startsWith("+250") ){
                JOptionPane.showMessageDialog(this, "Invalid phone number", "check +250", HEIGHT);
        }else{
            
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            DeputeService service =    (DeputeService) theRegistry.lookup("deputes");
            Depute theDepute = new Depute();
            theDepute.setDeputeId(depIdTxt.getText());
            theDepute.setDepute_name(nameTxt.getText());
            theDepute.setGender(genderTxt.getSelectedItem().toString());
            theDepute.setParty((Party) partyCombo.getSelectedItem());
            theDepute.setPhone_number(phoneTxt.getText());
            theDepute.setPassword(passTxt.getText());
            theDepute.setRole("Depute");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date selectedDate = dateTxt.getDate();
            
            Date currentDate = new Date();
            if (selectedDate.after(currentDate)) {
                JOptionPane.showMessageDialog(this, "Birth date cannot be in the future");
                return; 
            }
            String date = sdf.format(selectedDate);
            theDepute.setBirthDate(date);
            Set<Commission> setCommi = new HashSet<>();
            List<Commission> commiList = commissionList.getSelectedValuesList();
            for(Commission theObj: commiList){
                setCommi.add(theObj);
            }
            theDepute.setCommission(setCommi);
            Depute theObj = service.addDepute(theDepute);
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
            if(depIdTxt.getText().trim().isEmpty() && depIdTxt.getText().length()==5
                ||nameTxt.getText().trim().isEmpty()
                ||commissionList.getSelectedValue().toString().trim().isEmpty()
                ||genderTxt.getSelectedItem().toString().trim().isEmpty()
                ||partyCombo.getSelectedItem().toString().trim().isEmpty()
                ||dateTxt.getDateFormatString().trim().isEmpty()
                ||phoneTxt.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(this, "fill all filled");
            }else if(phoneTxt.getText().trim().length()!=13 && phoneTxt.getText().trim().startsWith("+250") ){
                JOptionPane.showMessageDialog(this, "Invalid phone number", "check +250", HEIGHT);
        }else{
            
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            DeputeService service =    (DeputeService) theRegistry.lookup("deputes");
            Depute theDepute = new Depute();
            //theDepute.setDeputeId(searchKey.getText());
            theDepute.setDeputeId(depIdTxt.getText());
            theDepute.setDepute_name(nameTxt.getText());
            theDepute.setGender(genderTxt.getSelectedItem().toString());
            theDepute.setParty((Party) partyCombo.getSelectedItem());
            theDepute.setPhone_number(phoneTxt.getText());
            theDepute.setPassword(passTxt.getText());
            theDepute.setRole("Depute");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date selectedDate = dateTxt.getDate();
            
            Date currentDate = new Date();
            if (selectedDate.after(currentDate)) {
                JOptionPane.showMessageDialog(this, "Birth date cannot be in the future");
                return; 
            }
            String date = sdf.format(selectedDate);
            Set<Commission> setCommi = new HashSet<>();
            List<Commission> commiList = commissionList.getSelectedValuesList();
            for(Commission theObj: commiList){
                setCommi.add(theObj);
            }
            theDepute.setCommission(setCommi);
            
            Depute theObj = service.editDepute(theDepute);
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
            DeputeService service =    (DeputeService) theRegistry.lookup("deputes");
            Depute theDepute = new Depute();
            theDepute.setDeputeId(searchKey.getText());

            Depute theObj = service.removeDepute(theDepute);
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
            DeputeService service =    (DeputeService) theRegistry.lookup("deputes");
            Depute theDepute = new Depute();
            theDepute.setDeputeId(searchKey.getText());
            Depute theObj = service.findDepute(theDepute);

            if (theObj != null) {
                searchKey.setText(theObj.getDeputeId());
                depIdTxt.setText(theObj.getDeputeId());
                nameTxt.setText(theObj.getDepute_name());
                partyCombo.setSelectedItem(theObj.getParty());
               commissionList.setSelectedValue(theObj.getCommission(), true);
               dateTxt.setDateFormatString(theObj.getBirthDate());
               phoneTxt.setText(theObj.getPhone_number());

            } else {
                JOptionPane.showMessageDialog(this, "Data not found");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JList<Commission> commissionList;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField depIdTxt;
    private javax.swing.JTable deputeTable;
    private javax.swing.JComboBox<String> genderTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox<Party> partyCombo;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchKey;
    // End of variables declaration//GEN-END:variables
}
