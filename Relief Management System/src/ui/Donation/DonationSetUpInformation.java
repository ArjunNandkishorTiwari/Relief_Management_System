/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Donation;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Location.LocationPoint;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.GoogleMaps.OrganizationMapJPanel;

/**
 *
 * @author meghanshubhatt
 */
public class DonationSetUpInformation extends javax.swing.JPanel {

    /**
     * Creates new form DonationSetUpInformation
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
    OrganizationDirectory organizationDirectory;
     private LocationPoint locationPoint;

    public DonationSetUpInformation(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.organizationDirectory = organizationDirectory;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackNgoSponsor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JLocation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jOrgName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBackNgoSponsor.setBackground(new java.awt.Color(102, 217, 255));
        btnBackNgoSponsor.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBackNgoSponsor.setText("<< Back");
        btnBackNgoSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackNgoSponsorActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bar-chart.png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jButton1.setText("Set Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JLocation.setEditable(false);
        JLocation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLocationActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 217, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setText("Set Location");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel5.setText("Organization Name");

        jOrgName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrgNameActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bar-chart.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBackNgoSponsor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jButton2)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackNgoSponsor)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel2))
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackNgoSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNgoSponsorActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackNgoSponsorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //enterprise.getOrganizationDirectory().createOrganization(Organization.Type.NGOOrganization, jOrgName.getText(), locationPoint);

        if("".equals(jOrgName.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!");
        }else if("".equals(JLocation.getText())) {
            JOptionPane.showMessageDialog(null, "Please set a location");
        }else {
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.DonationOrganization, jOrgName.getText(), locationPoint);
            resetFields();
            JOptionPane.showMessageDialog(null, "Information Saved!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
     public void resetFields() {
        jOrgName.setText("");
        JLocation.setText("");
    }
 public void populateLongituteLatitude(LocationPoint locationPoint) {
        this.locationPoint = locationPoint;
        JLocation.setText(locationPoint.getLatitude() + ", " + locationPoint.getLongitude());
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OrganizationMapJPanel muajp = new OrganizationMapJPanel(userProcessContainer,ecoSystem,enterprise);
        userProcessContainer.add("OrganizationLocationJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JLocationActionPerformed

    private void jOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOrgNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JLocation;
    private javax.swing.JButton btnBackNgoSponsor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jOrgName;
    // End of variables declaration//GEN-END:variables
}
