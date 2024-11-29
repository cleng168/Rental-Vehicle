import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JFrame {
    String username;
    UserRole userRole;
    DefaultTableModel model = new DefaultTableModel(new String[]{"CustomerID", "FullName", "PhoneNumber", "Address", "CardID"}, 0);
    public Customer(String username, UserRole userRole) {
        this.username = username;
        this.userRole = userRole;
        initComponents();
        tblCustomer.setModel(model);
        loadData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        txtCustomerID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtFullName = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblIdCard = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\YEAR4\\Java III\\Icon for Rental\\trash.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 51, 255));
        btnAdd.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon("D:\\YEAR4\\Java III\\Icon for Rental\\plus.png")); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Kantumruy Pro", 1, 36)); // NOI18N
        jLabel1.setText("Customer Information");

        btnEdit.setBackground(new java.awt.Color(102, 255, 153));
        btnEdit.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon("D:\\YEAR4\\Java III\\Icon for Rental\\pencil.png")); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel6.setText("PhoneNumber:");

        txtAddress.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel2.setText("CustomerID:");

        tblCustomer.setFont(new java.awt.Font("Kantumruy Pro", 0, 16)); // NOI18N
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CoustomerID", "FullName", "PhoneNumber", "Address", "ID Card"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.setRowHeight(30);
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        txtCustomerID.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel3.setText("FullName");

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

        txtFullName.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

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

        jLabel7.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel7.setText("Address:");

        txtPhoneNumber.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        lblIdCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIdCard.setPreferredSize(new java.awt.Dimension(200, 200));
        lblIdCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIdCardMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel8.setText("Search:");

        txtSearch.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(195, 195, 195))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadData() {
        String sql = "SELECT * FROM tbl_customer";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // Create a DefaultTableModel to hold the data
            DefaultTableModel tableModel = new DefaultTableModel(new String[]{"CustomerID", "FullName", "PhoneNumber", "Address", "CardID"}, 0);

            // Iterate through the ResultSet and add rows to the table model
            while (rs.next()) {
                String customerid = rs.getString("customerid");
                String fullname = rs.getString("fullname");
                String phonenumber = rs.getString("phonenumber");
                String address = rs.getString("address");
                byte[] idcard = rs.getBytes("cardid");

                
                ImageIcon imageIcon = null;
                if (idcard != null && idcard.length > 0) {
                    // Resize the image to fit in the table cell
                    BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(idcard));
                    Image scaledImage = bufferedImage.getScaledInstance(250, 165, Image.SCALE_SMOOTH); // Resize as needed
                    imageIcon = new ImageIcon(scaledImage); // Create ImageIcon from scaled image
                }

                // Add a new row to the table model
                tableModel.addRow(new Object[]{customerid, fullname, phonenumber, address, imageIcon});
            }

            // Set the model to the JTable
            tblCustomer.setModel(tableModel);

            // Set column widths to 200
            for (int i = 0; i < tblCustomer.getColumnCount(); i++) {
                tblCustomer.getColumnModel().getColumn(i).setPreferredWidth(200); // Set all columns to 200 pixels wide
            }
            tblCustomer.getColumnModel().getColumn(4).setMinWidth(0);
            tblCustomer.getColumnModel().getColumn(4).setMaxWidth(0);
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading customer data: " + e.getMessage());
        }
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblCustomer.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a customer to delete.");
            return;
        }

        String customerID = (String) tblCustomer.getValueAt(selectedRow, 0); // Get CustomerID from the selected row

        // Show confirmation dialog
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this customer?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; // Exit if the user selected "No"
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root")) {
            String sql = "DELETE FROM tbl_customer WHERE customerid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, customerID);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer deleted successfully.");
            loadData(); // Refresh the table
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting customer: " + e.getMessage());
        }
        clearFields();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String fullName = txtFullName.getText().trim();
        String phoneNumber = txtPhoneNumber.getText().trim();
        String address = txtAddress.getText().trim();
        String imagePath = (String) lblIdCard.getClientProperty("imagePath");

        if (fullName.isEmpty() || phoneNumber.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root")) {
            // SQL query to insert without specifying customerID (it will be auto-incremented)
            String insertSql = "INSERT INTO tbl_customer (fullname, phonenumber, address, cardid) VALUES (?, ?, ?, ?)";
            String idSql = "SELECT LAST_INSERT_ID()"; // To retrieve the last inserted ID

            try (PreparedStatement pstmt = conn.prepareStatement(insertSql);
                 PreparedStatement idStmt = conn.prepareStatement(idSql)) {

                // Set values for the other fields
                pstmt.setString(1, fullName);
                pstmt.setString(2, phoneNumber);
                pstmt.setString(3, address);

                // Handle the image (ID card)
                if (imagePath != null && !imagePath.isEmpty()) {
                    try {
                        // Convert image to byte array
                        BufferedImage img = ImageIO.read(new File(imagePath));
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        ImageIO.write(img, "png", baos);  // Change format if necessary
                        pstmt.setBytes(4, baos.toByteArray());
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage());
                        return;
                    }
                } else {
                    pstmt.setNull(4, java.sql.Types.BLOB);  // No image, insert null
                }

                // Execute the query to insert the customer
                pstmt.executeUpdate();

                // Fetch the auto-generated customerID using LAST_INSERT_ID()
                try (ResultSet rs = idStmt.executeQuery()) {
                    if (rs.next()) {
                        int generatedCustomerID = rs.getInt(1);  // Get the auto-generated customerID
                        JOptionPane.showMessageDialog(this, "Customer added successfully. Generated Customer ID: " + generatedCustomerID);
                    }
                }

                // Refresh the table and clear the input fields
                loadData();  // Refresh the table with updated data
                clearFields();  // Clear input fields

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Connection error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = tblCustomer.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a customer to edit.");
            return;
        }

        String customerID = txtCustomerID.getText().trim();
        String fullName = txtFullName.getText().trim();
        String phoneNumber = txtPhoneNumber.getText().trim();
        String address = txtAddress.getText().trim();
        String imagePath = (String) lblIdCard.getClientProperty("imagePath");

        if (customerID.isEmpty() || fullName.isEmpty() || phoneNumber.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root")) {
            String sql = "UPDATE tbl_customer SET fullname = ?, phonenumber = ?, address = ?, cardid = ? WHERE customerid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, fullName);
            pstmt.setString(2, phoneNumber);
            pstmt.setString(3, address);

            if (imagePath != null) {
                // Convert image to byte array
                BufferedImage img = ImageIO.read(new File(imagePath));
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(img, "png", baos); // change format if needed
                pstmt.setBytes(4, baos.toByteArray());
            } else {
                pstmt.setNull(4, java.sql.Types.BLOB);
            }

            pstmt.setString(5, customerID);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer updated successfully.");
            loadData(); // Refresh the table
            clearFields();

        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(this, "Error updating customer: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        int selectedRow = tblCustomer.getSelectedRow(); // Get the selected row index

        // Check if a row is selected
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();

            // Retrieve data from the selected row and populate the input fields
            txtCustomerID.setText(model.getValueAt(selectedRow, 0).toString());
            txtFullName.setText(model.getValueAt(selectedRow, 1).toString());
            txtPhoneNumber.setText(model.getValueAt(selectedRow, 2).toString());
            txtAddress.setText(model.getValueAt(selectedRow, 3).toString());

            // Load the image for the selected vehicle if available
            ImageIcon imageIcon = (ImageIcon) model.getValueAt(selectedRow, 4);
            if (imageIcon != null) {
                lblIdCard.setIcon(imageIcon);
                lblIdCard.setText(""); // Clear text after image load
            } else {
                lblIdCard.setIcon(null);
                lblIdCard.setText("No image available");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No vehicle selected.");
        }
    }//GEN-LAST:event_tblCustomerMouseClicked

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
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void clearFields() {
        txtCustomerID.setText("");
        txtFullName.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        lblIdCard.setIcon(null); // Clear the ID card image
        lblIdCard.putClientProperty("imagePath", null); // Clear the image path
    }
    
    private void lblIdCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIdCardMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if (f != null) {
            String path = f.getAbsolutePath();
            try {
                BufferedImage bi = ImageIO.read(new File(path));
                Image img = bi.getScaledInstance(250, 165, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img);
                lblIdCard.setIcon(icon);
                lblIdCard.putClientProperty("imagePath", path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error loading image: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_lblIdCardMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchTerm = txtSearch.getText().trim().toLowerCase();

        // Clear the current table data
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        model.setRowCount(0);

        // SQL query to search for customers by fullname, phonenumber, or address
        String sql = "SELECT customerid, fullname, phonenumber, address, cardid FROM tbl_customer " +
                     "WHERE LOWER(fullname) LIKE ? OR LOWER(phonenumber) LIKE ? OR LOWER(address) LIKE ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Use wildcard to match partial text in fullname, phonenumber, or address
            pstmt.setString(1, "%" + searchTerm + "%");
            pstmt.setString(2, "%" + searchTerm + "%");
            pstmt.setString(3, "%" + searchTerm + "%");

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String customerid = rs.getString("customerid");
                    String fullname = rs.getString("fullname");
                    String phonenumber = rs.getString("phonenumber");
                    String address = rs.getString("address");
                    byte[] idcard = rs.getBytes("cardid");

                    ImageIcon imageIcon = null;
                    if (idcard != null && idcard.length > 0) {
                        BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(idcard));
                        Image scaledImage = bufferedImage.getScaledInstance(250, 165, Image.SCALE_SMOOTH);
                        imageIcon = new ImageIcon(scaledImage);
                    }

                    model.addRow(new Object[]{customerid, fullname, phonenumber, address, imageIcon});
                }
            }

        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(this, "Error searching customers: " + e.getMessage());
        }
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new Customer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdCard;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
