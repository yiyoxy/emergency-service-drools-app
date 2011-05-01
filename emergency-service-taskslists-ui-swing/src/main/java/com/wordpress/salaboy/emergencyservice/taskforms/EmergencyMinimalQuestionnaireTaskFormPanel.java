/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmergencyMinimalQuestionnairePanel.java
 *
 * Created on Nov 24, 2010, 4:00:11 PM
 */
package com.wordpress.salaboy.emergencyservice.taskforms;

import com.wordpress.salaboy.api.HumanTaskService;
import com.wordpress.salaboy.emergencyservice.tasklists.IncomingPhoneCallsTaskListPanel;
import com.wordpress.salaboy.emergencyservice.main.UserTaskListUI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.ws_ht.api.TAttachment;
import org.example.ws_ht.api.TAttachmentInfo;
import org.example.ws_ht.api.TStatus;
import org.example.ws_ht.api.TTask;
import org.example.ws_ht.api.wsdl.IllegalAccessFault;
import org.example.ws_ht.api.wsdl.IllegalArgumentFault;
import org.example.ws_ht.api.wsdl.IllegalStateFault;
import org.jbpm.task.AccessType;
import org.jbpm.task.Content;
import org.jbpm.task.service.ContentData;

/**
 *
 * @author esteban
 * @author salaboy
 */
public class EmergencyMinimalQuestionnaireTaskFormPanel extends javax.swing.JPanel {

    private final HumanTaskService taskClient;
    private String taskId;
    private IncomingPhoneCallsTaskListPanel parent;

    public EmergencyMinimalQuestionnaireTaskFormPanel(IncomingPhoneCallsTaskListPanel parent, HumanTaskService taskClient, String id) {
        this.taskClient = taskClient;
        this.taskId = id;
        this.parent = parent;
        initComponents();
        configure();
        
    }
    
    
    private HumanTaskService getTaskClient(){
        return this.taskClient;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        taskActionjButton = new javax.swing.JButton();
        suggestProcedureJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        phoneCalljLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        emergencyTypeJComboBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        locationxjTextField = new javax.swing.JTextField();
        locationyjTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nroOfPeoplejFormattedTextField = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        genderjComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(300, 440));
        setName("Emergency Questionaire"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 480));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Task Actions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        taskActionjButton.setText("Start");
        taskActionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskActionjButtonActionPerformed(evt);
            }
        });

        suggestProcedureJButton.setText("Suggest Procedure");
        suggestProcedureJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestProcedureJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(taskActionjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suggestProcedureJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(taskActionjButton)
                .addComponent(suggestProcedureJButton))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Provided Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel7.setText("Phone Call:");

        phoneCalljLabel.setText("<Call Information>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneCalljLabel)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneCalljLabel)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Minimal Questionnaire", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel3.setText("Emergency Type:");

        emergencyTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FIRE", "CAR_CRASH", "HEART_ATTACK", "ROBBERY" }));

        jLabel12.setText("Location:");

        locationxjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationxjTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setText("Number of People:");

        nroOfPeoplejFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        nroOfPeoplejFormattedTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nroOfPeoplejFormattedTextFieldPropertyChange(evt);
            }
        });
        nroOfPeoplejFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nroOfPeoplejFormattedTextFieldKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nroOfPeoplejFormattedTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nroOfPeoplejFormattedTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nroOfPeoplejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locationxjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locationyjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emergencyTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emergencyTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(locationxjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationyjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(nroOfPeoplejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Single Person Emergency", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("Gender:");

        genderjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        genderjComboBox.setEnabled(false);

        jLabel5.setText("Age:");

        ageJTextField.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(genderjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void configure(){
        String taskinfo = "";

        try {
            ObjectInputStream ois = null;

            List<TAttachmentInfo> attachmentsInfo = getTaskClient().getAttachmentInfos(this.taskId);
            TAttachmentInfo firstAttachmentInfo = attachmentsInfo.get(0);
            TAttachment attachment = getTaskClient().getAttachments(this.taskId, firstAttachmentInfo.getName()).get(0);

            ByteArrayInputStream bais = new ByteArrayInputStream(((Content) attachment.getValue()).getContent());
            ois = new ObjectInputStream(bais);
            taskinfo = (String) ois.readObject();
        } catch (Exception ex) {
            Logger.getLogger(UserTaskListUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] values= taskinfo.split(",");
        System.out.println("TaskInfo = "+taskinfo);
        String timestamp = values[0].trim(); 
        String phoneNumber = values[1].trim(); 
        Integer locationX = Integer.valueOf(values[2].trim());
        Integer locationY = Integer.valueOf(values[3].trim());
        locationxjTextField.setText(locationX.toString());
        locationyjTextField.setText(locationY.toString());
        phoneCalljLabel.setText("Time: "+timestamp +" - Phone Number: "+phoneNumber);
    }
    
    private void suggestProcedureJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestProcedureJButtonActionPerformed
        ObjectOutputStream out = null;
        try {

            Map<String, Object> info = new HashMap<String, Object>();
            info.put("emergency.locationx", Integer.valueOf(locationxjTextField.getText()));
            info.put("emergency.locationy", Integer.valueOf(locationyjTextField.getText()));
            info.put("emergency.type", emergencyTypeJComboBox.getModel().getSelectedItem());
            info.put("emergency.nroofpeople", Integer.valueOf(nroOfPeoplejFormattedTextField.getText()));
            if(nroOfPeoplejFormattedTextField.getText().equals("1")){
                info.put("patient.age", Integer.valueOf(ageJTextField.getText()));
                info.put("patient.gender", genderjComboBox.getModel().getSelectedItem());
            }

            ContentData result = new ContentData();
            result.setAccessType(AccessType.Inline);
            result.setType("java.util.Map");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            out = new ObjectOutputStream(bos);
            out.writeObject(info);
            result.setContent(bos.toByteArray());
           
            getTaskClient().setAuthorizedEntityId("operator");
            getTaskClient().complete(this.taskId.toString(), result);
            

            this.parent.hideDialog();

        } catch (IllegalArgumentFault ex) {
            Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateFault ex) {
            Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessFault ex) {
            Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_suggestProcedureJButtonActionPerformed

    private void nroOfPeoplejFormattedTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nroOfPeoplejFormattedTextFieldPropertyChange

    }//GEN-LAST:event_nroOfPeoplejFormattedTextFieldPropertyChange

    private void nroOfPeoplejFormattedTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nroOfPeoplejFormattedTextFieldKeyPressed
             genderjComboBox.setEnabled(isOnePersonEmergency());
             ageJTextField.setEnabled(isOnePersonEmergency());
    }//GEN-LAST:event_nroOfPeoplejFormattedTextFieldKeyPressed

    private void nroOfPeoplejFormattedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nroOfPeoplejFormattedTextFieldKeyReleased
             genderjComboBox.setEnabled(isOnePersonEmergency());
             ageJTextField.setEnabled(isOnePersonEmergency());
    }//GEN-LAST:event_nroOfPeoplejFormattedTextFieldKeyReleased

    private void nroOfPeoplejFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nroOfPeoplejFormattedTextFieldKeyTyped
        
             genderjComboBox.setEnabled(isOnePersonEmergency());
             ageJTextField.setEnabled(isOnePersonEmergency());
       
        
    }//GEN-LAST:event_nroOfPeoplejFormattedTextFieldKeyTyped

    private void taskActionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskActionjButtonActionPerformed
        try {
            TTask task = getTaskClient().getTaskInfo(taskId);
            TStatus status = task.getStatus();
            String statusName = status.name();
            System.out.println("Status of the TASK = "+statusName);
            //@TODO: check the status and show or not the button!
        } catch (IllegalArgumentFault ex) {
            Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        getTaskClient().setAuthorizedEntityId("operator");
        try {
            getTaskClient().start(taskId);
        } catch (IllegalArgumentFault ex) {
            Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateFault ex) {
            Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessFault ex) {
            Logger.getLogger(EmergencyMinimalQuestionnaireTaskFormPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        taskActionjButton.setText("Started...");
        taskActionjButton.setEnabled(false);
       
    }//GEN-LAST:event_taskActionjButtonActionPerformed

    private void locationxjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationxjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationxjTextFieldActionPerformed

    private boolean isOnePersonEmergency(){
        
        String nroOfPeople = nroOfPeoplejFormattedTextField.getText();
        if(nroOfPeople != null && !nroOfPeople.equals("")){
            int nroOfPeopleInt = Integer.valueOf(nroOfPeople);
            if(nroOfPeopleInt == 1){
                return true;
            }
        }
        return false;
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JComboBox emergencyTypeJComboBox;
    private javax.swing.JComboBox genderjComboBox;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField locationxjTextField;
    private javax.swing.JTextField locationyjTextField;
    private javax.swing.JFormattedTextField nroOfPeoplejFormattedTextField;
    private javax.swing.JLabel phoneCalljLabel;
    private javax.swing.JButton suggestProcedureJButton;
    private javax.swing.JButton taskActionjButton;
    // End of variables declaration//GEN-END:variables
}
