import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class User extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Username", "Password", "UserRole"}, 0);
    String username;
    UserRole userRole;
    public User(String username, UserRole userRole) {
        initComponents();
        this.username = username;
        this.userRole = userRole;
        tblUser.setModel(model);
        loadUserData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboUserRole = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Kantumruy Pro", 1, 36)); // NOI18N
        jLabel1.setText("User Information");

        jLabel2.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        txtName.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel3.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel4.setText("Password:");

        txtPassword.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel5.setText("UserRole:");

        comboUserRole.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dealer", "Staff" }));

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

        tblUser.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Username", "Password", "User Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.setRowHeight(30);
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        jLabel6.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel6.setText("ID:");

        txtID.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel7.setText("Search:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(comboUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6)
                        .addGap(85, 85, 85)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = txtName.getText().trim();
        String username = txtUsername.getText().trim();
        String password = txtPassword.getText().trim();
        String userRole = comboUserRole.getSelectedItem().toString().toUpperCase(); // Use getSelectedItem() for JComboBox

        // Check if any field is empty
        if (name.isEmpty() || username.isEmpty() || password.isEmpty() || userRole.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!");
            return;
        }

        String insertSql = "INSERT INTO tbl_user (name, username, password, userRole) VALUES (?, ?, ?, ?)";
        String idSql = "SELECT LAST_INSERT_ID()"; // Query to get the last inserted ID

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(insertSql);
             PreparedStatement idStmt = conn.prepareStatement(idSql)) {

            // Insert the user data
            pstmt.setString(1, name);
            pstmt.setString(2, username);
            pstmt.setString(3, password);
            pstmt.setString(4, userRole);

            pstmt.executeUpdate();

            // Fetch the last inserted ID
            try (ResultSet rs = idStmt.executeQuery()) {
                if (rs.next()) {
                    int generatedId = rs.getInt(1); // Get the auto-generated ID
                    DefaultTableModel model = (DefaultTableModel) tblUser.getModel();
                    model.addRow(new Object[]{generatedId, name, username, password, userRole}); // Mask the password
                }
            }

            // Clear the input fields after adding
            clear();

            JOptionPane.showMessageDialog(this, "User added successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding user: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = tblUser.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to edit!");
            return;
        }

        // Get the data from the selected row
        String originalUsername = tblUser.getValueAt(selectedRow, 2).toString(); // Username is unique

        String id = txtID.getText().trim();
        String name = txtName.getText().trim();  
        String username = txtUsername.getText().trim();
        String password = txtPassword.getText().trim();
        String userRole = comboUserRole.getSelectedItem().toString().toUpperCase();

        // Check if any field is empty
        if (id.isEmpty() || name.isEmpty() || username.isEmpty() || password.isEmpty() || userRole.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!");
            return;
        }

        String sql = "UPDATE tbl_user SET id = ?, name = ?, username = ?, password = ?, userRole = ? WHERE username = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set parameters for the update statement
            pstmt.setString(1, id);  // Update ID
            pstmt.setString(2, name);
            pstmt.setString(3, username);
            pstmt.setString(4, password);
            pstmt.setString(5, userRole);
            pstmt.setString(6, originalUsername); // Update based on the original username

            pstmt.executeUpdate();

            tblUser.setValueAt(id, selectedRow, 0);    // Update ID in the table
            tblUser.setValueAt(name, selectedRow, 1);
            tblUser.setValueAt(username, selectedRow, 2);
            tblUser.setValueAt("*****", selectedRow, 3); // Display masked password
            tblUser.setValueAt(userRole, selectedRow, 4);

            JOptionPane.showMessageDialog(this, "User updated successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating user: " + e.getMessage());
        }

        // Clear the input fields
        clear();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblUser.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete!");
            return;
        }

        String id = tblUser.getValueAt(selectedRow, 0).toString();  // Use the ID as a unique identifier

        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM tbl_user WHERE id = ?";

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, id);  // Use ID for deletion

                pstmt.executeUpdate();

                DefaultTableModel model = (DefaultTableModel) tblUser.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(this, "User deleted successfully!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error deleting user: " + e.getMessage());
            }

            // Clear input fields
            clear();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void clear(){
        txtID.setText("");
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        comboUserRole.setSelectedIndex(0);
    }
    
    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        // Get the selected row index
        int selectedRow = tblUser.getSelectedRow();

        if (selectedRow != -1) {
            // Populate text fields with selected user data
            txtID.setText(tblUser.getValueAt(selectedRow, 0).toString());
            txtName.setText(tblUser.getValueAt(selectedRow, 1).toString());
            txtUsername.setText(tblUser.getValueAt(selectedRow, 2).toString());
            txtPassword.setText(tblUser.getValueAt(selectedRow, 3).toString());
            comboUserRole.setSelectedItem(tblUser.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_tblUserMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchTerm = txtSearch.getText().trim().toLowerCase();

        DefaultTableModel model = (DefaultTableModel) tblUser.getModel();
        model.setRowCount(0);

        // SQL query with LIKE for partial matches on both name and username
        String sql = "SELECT id, name, username, password, userRole FROM tbl_user WHERE LOWER(name) LIKE ? OR LOWER(username) LIKE ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + searchTerm + "%"); // Wildcard for partial match in name
            pstmt.setString(2, "%" + searchTerm + "%"); // Wildcard for partial match in username

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String userRole = rs.getString("userRole").toUpperCase();

                    model.addRow(new Object[]{id, name, username, "*****", userRole});
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error searching users: " + e.getMessage());
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void loadUserData() {
        String sql = "SELECT id, name, username, password, userRole FROM tbl_user";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Username", "Password", "UserRole"}, 0);

            // Iterate through the ResultSet and add rows to the model
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String userRole = rs.getString("userRole").toUpperCase();

                // Add a new row to the table model
                model.addRow(new Object[]{id, name, username, password, userRole});
            }

            
            tblUser.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading user data: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new User().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> comboUserRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
