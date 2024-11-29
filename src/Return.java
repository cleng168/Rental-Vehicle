import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Return extends javax.swing.JFrame {
    String username;
    UserRole userRole;
    public Return(String username, UserRole userRole) {
        this.username = username;
        this.userRole = userRole;
        initComponents();
        loadRentData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRentID = new javax.swing.JTextField();
        txtPlateNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        returnRe = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReturn = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Kantumruy Pro", 1, 36)); // NOI18N
        jLabel1.setText("Return Vehicle");

        jLabel2.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel2.setText("RentID:");

        txtRentID.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtRentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRentIDKeyReleased(evt);
            }
        });

        txtPlateNumber.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel3.setText("PlateNumber:");

        returnRe.setColumns(20);
        returnRe.setFont(new java.awt.Font("Kantumruy Pro", 0, 12)); // NOI18N
        returnRe.setRows(5);
        jScrollPane1.setViewportView(returnRe);

        tblReturn.setFont(new java.awt.Font("Kantumruy Pro", 0, 14)); // NOI18N
        tblReturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReturnID", "Customer Name", "PlateNumber", "StartDate", "ReturnDate", "Total Price", "OverDay"
            }
        ));
        jScrollPane2.setViewportView(tblReturn);

        btnClear.setBackground(new java.awt.Color(255, 153, 255));
        btnClear.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon("D:\\YEAR4\\Java III\\Icon for Rental\\clear-alt.png")); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon("D:\\YEAR4\\Java III\\Icon for Rental\\left.png")); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(423, 423, 423))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(btnClear))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRentIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRentIDKeyReleased
        // Get the current text in the txtRentID field
        String rentID = txtRentID.getText().trim();

        // Check if rentID is not empty
        if (!rentID.isEmpty()) {
            loadRentDataToTextArea(rentID);
        } else {
            returnRe.setText("");
            txtPlateNumber.setText("");  // Clear the Plate Number field if rentID is empty
        }
    }//GEN-LAST:event_txtRentIDKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (userRole == null) {
            System.out.println("User role is not set.");
            this.dispose();
            return;
        }

        switch (userRole) {
            case DEALER:
                System.out.println("Navigating to Dealer Dashboard");
                DealerDashboard dd = new DealerDashboard(username, userRole);
                dd.setVisible(true);
                break;
            case STAFF:
                System.out.println("Navigating to Staff Dashboard");
                StaffDashboard sd = new StaffDashboard(username, userRole);
                sd.setVisible(true);
                break;
            default:
                System.out.println("User role not recognized: " + userRole);
                break;
        }
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearVehicleReturn();
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void clearVehicleReturn() {
        String rentID = txtRentID.getText().trim();

        if (rentID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Rent ID to return the vehicle.", "Missing Rent ID", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Confirm the return action with the user
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to return this vehicle and clear the record?", "Confirm Return", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; // Cancel if the user chooses "No"
        }

        String updateVehicleStatusSql = "UPDATE tbl_vehicle v "
                                       + "JOIN tbl_rentals r ON v.VehicleID = r.VehicleID "
                                       + "SET v.Status = 'available' "
                                       + "WHERE r.RentID = ?";

        String deleteRentalRecordSql = "DELETE FROM tbl_rentals WHERE RentID = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement updateStatusStmt = conn.prepareStatement(updateVehicleStatusSql);
             PreparedStatement deleteRentalStmt = conn.prepareStatement(deleteRentalRecordSql)) {

            // Update the vehicle status to 'available'
            updateStatusStmt.setString(1, rentID);
            int statusUpdated = updateStatusStmt.executeUpdate();

            // Delete the rental record
            deleteRentalStmt.setString(1, rentID);
            int rowsDeleted = deleteRentalStmt.executeUpdate();

            if (statusUpdated > 0 && rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Vehicle returned successfully and status updated to available.", "Return Successful", JOptionPane.INFORMATION_MESSAGE);

                // Clear all related fields in the UI
                txtRentID.setText("");
                returnRe.setText("");
                txtPlateNumber.setText("");
                loadRentData(); // reload rental data in the table (if applicable)
            } else {
                JOptionPane.showMessageDialog(this, "No rental record found for Rent ID: " + rentID, "Record Not Found", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error processing vehicle return: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadRentDataToTextArea(String rentID) {
        String sql = "SELECT r.RentID, c.CustomerID, c.FullName AS CustomerName, v.VehicleID, v.Model AS VehicleModel, " +
                     "v.PlateNumber, r.RentStart, r.RentEnd, r.PricePerDay, r.TotalPrice " +
                     "FROM tbl_rentals r " +
                     "JOIN tbl_customer c ON r.CustomerID = c.CustomerID " +
                     "JOIN tbl_vehicle v ON r.VehicleID = v.VehicleID " +
                     "WHERE r.RentID = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set the Rent ID parameter
            pstmt.setString(1, rentID);
            ResultSet rs = pstmt.executeQuery();

            // Prepare content for the JTextArea
            StringBuilder textContent = new StringBuilder();
            SimpleDateFormat displayFormat = new SimpleDateFormat("dd-MMM-yyyy");

            if (rs.next()) {
                String customerName = rs.getString("CustomerName");
                String vehicleModel = rs.getString("VehicleModel");
                String plateNumber = rs.getString("PlateNumber");  // Get the plate number
                String rentStart = (rs.getDate("RentStart") != null) ? displayFormat.format(rs.getDate("RentStart")) : "N/A";
                String rentEnd = (rs.getDate("RentEnd") != null) ? displayFormat.format(rs.getDate("RentEnd")) : "N/A";
                String pricePerDay = String.format("$%.2f", rs.getDouble("PricePerDay"));
                String totalPrice = String.format("$%.2f", rs.getDouble("TotalPrice"));

                // Set the plate number in the txtPlateNumber field
                txtPlateNumber.setText(plateNumber);
                
                textContent.append("========================================\n");
                textContent.append("\t    RENTAL DETAILS\n");
                textContent.append("========================================\n");
                textContent.append("Rent ID\t: ").append(rentID).append("\n");
                textContent.append("Cus Name\t: ").append(customerName).append("\n");
                textContent.append("Vehicle Model\t: ").append(vehicleModel).append("\n");
                textContent.append("Plate Number\t: ").append(plateNumber).append("\n");
                textContent.append("========================================\n");
                textContent.append("Rent Start\t: ").append(rentStart).append("\n");
                textContent.append("Rent End\t: ").append(rentEnd).append("\n");
                textContent.append("========================================\n");
                textContent.append("Price Per Day\t: ").append(pricePerDay).append("\n");
                textContent.append("Total Price\t: ").append(totalPrice).append("\n");
                textContent.append("========================================\n");
                textContent.append("\t     Thank You\n");
                
                // Set the content to the JTextArea
                returnRe.setText(textContent.toString());
            } else {
                // Display a message if no data found and clear the Plate Number field
                returnRe.setText("No data found for Rent ID: " + rentID);
                txtPlateNumber.setText("");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading rent data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadRentData() {
        String sql = "SELECT r.RentID, c.CustomerID, c.FullName AS CustomerName, v.VehicleID, v.Model AS VehicleModel, " +
                     "r.RentStart, r.RentEnd, r.PricePerDay, r.TotalPrice " +
                     "FROM tbl_rentals r " +
                     "JOIN tbl_customer c ON r.CustomerID = c.CustomerID " +
                     "JOIN tbl_vehicle v ON r.VehicleID = v.VehicleID";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            DefaultTableModel tableModel = new DefaultTableModel(
                    new String[]{"RentID", "CustomerName", "VehicleModel", "RentStart", "RentEnd", "PricePerDay", "TotalPrice"}, 0);

            SimpleDateFormat displayFormat = new SimpleDateFormat("dd-MMM-yyyy");

            while (rs.next()) {
                String rentID = rs.getString("RentID");
                String customerName = rs.getString("CustomerName");
                String vehicleModel = rs.getString("VehicleModel");
                java.sql.Date rentStartDate = rs.getDate("RentStart");
                java.sql.Date rentEndDate = rs.getDate("RentEnd");
                String rentStart = (rentStartDate != null) ? displayFormat.format(rentStartDate) : "N/A";
                String rentEnd = (rentEndDate != null) ? displayFormat.format(rentEndDate) : "N/A";
                double pricePerDay = rs.getDouble("PricePerDay");
                double totalPrice = rs.getDouble("TotalPrice");
                String formattedPricePerDay = String.format("$%.2f", pricePerDay);
                String formattedTotalPrice = String.format("$%.2f", totalPrice);

                tableModel.addRow(new Object[]{rentID, customerName, vehicleModel, rentStart, rentEnd, formattedPricePerDay, formattedTotalPrice});
            }

            tblReturn.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading rent data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea returnRe;
    private javax.swing.JTable tblReturn;
    private javax.swing.JTextField txtPlateNumber;
    private javax.swing.JTextField txtRentID;
    // End of variables declaration//GEN-END:variables
}
