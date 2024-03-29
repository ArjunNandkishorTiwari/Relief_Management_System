/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Community;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.RoundedBorder;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CommunityFireRequest;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author arjun
 */
public class CommunityAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
   

    public CommunityAdminWorkAreaJPanel(JPanel userProcessContainer , UserAccount userAccount, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        
//        btnDonateBlood.setBorder(new RoundedBorder(20));
//        btnPoliceService.setBorder(new RoundedBorder(20));
//        btnRequestBlood.setBorder(new RoundedBorder(20));
//        btnRequestHospital1.setBorder(new RoundedBorder(20));
//        btnRequestServiceProvider.setBorder(new RoundedBorder(20));
//        jButton1.setBorder(new RoundedBorder(20));
//        jToggleButton1.setBorder(new RoundedBorder(20));
//        btnRequestHospital.setBorder(new RoundedBorder(20));
        

        //enterpriseNameLabel.setText(enterprise.getName()); //erated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

//    public CommunityAdminWorkAreaJPanel(JPanel UserContainer, UserAccount userAccount, ClinicOrganization clinicOrganization, Enterprise enterprise, EcoSystem system) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequestServiceProvider = new javax.swing.JButton();
        btnRequestHospital = new javax.swing.JButton();
        btnDonateBlood = new javax.swing.JButton();
        btnRequestBlood = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnRequestHospital1 = new javax.swing.JButton();
        btnPoliceService = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        SPTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRequestServiceProvider.setBackground(new java.awt.Color(255, 255, 255));
        btnRequestServiceProvider.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRequestServiceProvider.setText("Request Food");
        btnRequestServiceProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestServiceProviderActionPerformed(evt);
            }
        });
        add(btnRequestServiceProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 230, -1));

        btnRequestHospital.setBackground(new java.awt.Color(255, 255, 255));
        btnRequestHospital.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRequestHospital.setText("Request Community Health Aid");
        btnRequestHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestHospitalActionPerformed(evt);
            }
        });
        add(btnRequestHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 250, -1));

        btnDonateBlood.setBackground(new java.awt.Color(255, 255, 255));
        btnDonateBlood.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDonateBlood.setText("Donate Blood");
        btnDonateBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateBloodActionPerformed(evt);
            }
        });
        add(btnDonateBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 250, 240, -1));

        btnRequestBlood.setBackground(new java.awt.Color(255, 255, 255));
        btnRequestBlood.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRequestBlood.setText("Request Blood");
        btnRequestBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestBloodActionPerformed(evt);
            }
        });
        add(btnRequestBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 233, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setText("Request Shelter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 233, -1));

        btnRequestHospital1.setBackground(new java.awt.Color(255, 255, 255));
        btnRequestHospital1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRequestHospital1.setText("Request Patient Health Aid");
        btnRequestHospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestHospital1ActionPerformed(evt);
            }
        });
        add(btnRequestHospital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 233, -1));

        btnPoliceService.setBackground(new java.awt.Color(255, 255, 255));
        btnPoliceService.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnPoliceService.setText("Request Police Service");
        btnPoliceService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliceServiceActionPerformed(evt);
            }
        });
        add(btnPoliceService, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 233, -1));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jToggleButton1.setText("Fire Request");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 233, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 101, 510, 520));

        SPTitle.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        SPTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SPTitle.setText("Community Panel");
        add(SPTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 280, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_website_-_male_user_3440844 (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestServiceProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestServiceProviderActionPerformed
        // TODO add your handling code here:
        RequestServiceProviderJPanel requestServiceProviderJPanel = new RequestServiceProviderJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("requestServiceProviderJPanel",requestServiceProviderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnRequestServiceProviderActionPerformed

    private void btnRequestHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestHospitalActionPerformed
        // TODO add your handling code here:
        RequestHospitalJPanel requestHospitalJPanel = new RequestHospitalJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("requestHospitalJPanel",requestHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestHospitalActionPerformed

    private void btnDonateBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateBloodActionPerformed
        // TODO add your handling code here:
        RequestDonateBloodJPanel requestDonateBloodJPanel = new RequestDonateBloodJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("requestDonateBloodJPanel",requestDonateBloodJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnDonateBloodActionPerformed

    private void btnRequestBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestBloodActionPerformed
        // TODO add your handling code here:
        RequestBloodFromBankJPanel requestBloodFromBank = new RequestBloodFromBankJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("requestBloodFromBank",requestBloodFromBank);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestBloodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RequestShelterJPanel requestShelterJPanel = new RequestShelterJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("RequestShelterJPanel",requestShelterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRequestHospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestHospital1ActionPerformed
        // TODO add your handling code here:
        RequestDoctorCommunityAreaJPanel requestDoctorCommunityAreaJPanel = new RequestDoctorCommunityAreaJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("RequestDoctorCommunityAreaJPanel",requestDoctorCommunityAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestHospital1ActionPerformed

    private void btnPoliceServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliceServiceActionPerformed
        // TODO add your handling code here:
        RequestPoliceJPanel requestPoliceJPanel = new RequestPoliceJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("requestPoliceJPanel",requestPoliceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPoliceServiceActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        
        RequestFireDepartmentJPanel requestFireDepartmentJPanel = new  RequestFireDepartmentJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
         userProcessContainer.add("requestFireDepartmentJPanel",requestFireDepartmentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer);
    

    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SPTitle;
    private javax.swing.JButton btnDonateBlood;
    private javax.swing.JButton btnPoliceService;
    private javax.swing.JButton btnRequestBlood;
    private javax.swing.JButton btnRequestHospital;
    private javax.swing.JButton btnRequestHospital1;
    private javax.swing.JButton btnRequestServiceProvider;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
