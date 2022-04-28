/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ServiceProvider.Food;

import Buisness.FoodAndShelterDistributor.Food;
import Buisness.FoodAndShelterDistributor.FoodDirectory;
import Buisness.ServiceProvider.Food.FoodInventory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import Business.WorkQueue.FoodOrgWorkQueue;
import Business.WorkQueue.FoodOrgWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rk
 */
public class ManageFoodInventory extends javax.swing.JPanel {

    /**
     * Creates new form ManageFoodInventory
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
    OrganizationDirectory organizationDirectory;
    private int quantity = 0;
    private String selectedFoodType;
    private double totalPrice = 0;
    
    public ManageFoodInventory(JPanel userProcessContainer,
   Enterprise enterprise,
   EcoSystem ecoSystem,
   UserAccount userAccount,
   OrganizationDirectory organizationDirectory) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        jAvaFoodTable1.getTableHeader().setDefaultRenderer(new HeaderColors());
        jAvaFoodTable.getTableHeader().setDefaultRenderer(new HeaderColors());
        
        
        populateFoodTypeComboBox();
        fillTheRequestedTable();
         populateFoodInventory();
    }

    
   private void populateFoodTypeComboBox() {
        jComboBoxFoodType.removeAllItems();

        for (Food food : ecoSystem.getFoodDirectory().getFoodList()) {
            jComboBoxFoodType.addItem(food.getFoodType());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAvaFoodTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxFoodType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTxtFoodQnty = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jAvaFoodTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FOOD INVENTORY");

        jAvaFoodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Food Type", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jAvaFoodTable);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Food Packets/ Quantity Available ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Buy Food From FS Distributor");

        jLabel4.setText("Food Type:");

        jComboBoxFoodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFoodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFoodTypeActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantity:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setText("Buy Food");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jAvaFoodTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Food Type", "Quantity", "Total Price", "Request Date", "Resolved Date", "Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jAvaFoodTable1);
        if (jAvaFoodTable1.getColumnModel().getColumnCount() > 0) {
            jAvaFoodTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxFoodType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtFoodQnty))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboBoxFoodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTxtFoodQnty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addGap(0, 50, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxFoodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFoodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFoodTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("jButton1ActionPerformed");
        
        
        quantity = Integer.parseInt(jTxtFoodQnty.getText());
        selectedFoodType = jComboBoxFoodType.getSelectedItem().toString();
        FoodOrgWorkRequest foodOrgWorkRequest = new FoodOrgWorkRequest(selectedFoodType,quantity);
        calculateTotalPrice();
        foodOrgWorkRequest.setTotalPrice(totalPrice);
        foodOrgWorkRequest.setRequestDate(new Date());
        foodOrgWorkRequest.setStatus("Requested");
        foodOrgWorkRequest.setSender(userAccount);
        ecoSystem.getWorkQueue().getWorkRequestList().add(foodOrgWorkRequest);
        

        fillTheRequestedTable();
       
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fillTheRequestedTable() {
        DefaultTableModel table = (DefaultTableModel) jAvaFoodTable1.getModel();
        table.setRowCount(0);

        for (int i = 0; i < ecoSystem.getWorkQueue().getWorkRequestList().size(); i++) {
            FoodOrgWorkRequest work = (FoodOrgWorkRequest) ecoSystem.getWorkQueue().getWorkRequestList().get(i);
            Object[] row = new Object[7];
            row[0] = work.getFoodReqId();
            row[1] = work.getFoodType();
            row[2] = work.getQuantity();
            row[3] = work.getTotalPrice();
            row[4] = work.getRequestDate();
            row[5] = work.getResolveDate();
            row[6] = work;
            table.addRow(row);
        }
    }

    private void calculateTotalPrice() {
        for (Food food : ecoSystem.getFoodDirectory().getFoodList()) {
            if (selectedFoodType.equals(food.getFoodType())) {
                totalPrice = quantity * food.getPrice();
            }
        }
    }

    private void updateFoodInventory() {
        boolean flag = false;
        for (int i = 0; i < ecoSystem.getWorkQueue().getWorkRequestList().size(); i++) {
            FoodOrgWorkRequest work = (FoodOrgWorkRequest) ecoSystem.getWorkQueue().getWorkRequestList().get(i);
            if (work.getStatus().equals("Approved")) {
                System.out.println("Approved 1");
                for (Food f : ecoSystem.getFoodInventory().getFoodInventory()) {
                    if (f.getFoodType().equals(work.getFoodType())) {
                        f.setQuantity(f.getQuantity() + work.getQuantity());
                        work.setStatus("Processed");
                        flag = true;
                    }
                }
                if (!flag) {
                    Food food = new Food();
                    food.setFoodType(work.getFoodType());
                    food.setQuantity(work.getQuantity());
                    work.setStatus("Processed");
                    ecoSystem.getFoodInventory().getFoodInventory().add(food);
                }
            }

        }
    }
    
    public void populateFoodInventory() {
        System.out.println("ui.ServiceProvider.Food.ManageFoodInventory.populateFoodInventory()");
        updateFoodInventory();
        DefaultTableModel table = (DefaultTableModel) jAvaFoodTable.getModel();
        table.setRowCount(0);

        for (int i = 0; i < ecoSystem.getFoodInventory().getFoodInventory().size(); i++) {
            Food food = ecoSystem.getFoodInventory().getFoodInventory().get(i);
            Object[] row = new Object[3];
            row[0] = food;
            row[1] = food.getFoodType();
            row[2] = food.getQuantity();
            table.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jAvaFoodTable;
    private javax.swing.JTable jAvaFoodTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxFoodType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxtFoodQnty;
    // End of variables declaration//GEN-END:variables
}
