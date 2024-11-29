import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Vehicle extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel(new String[]{"VehicleID", "Brand", "Model", "Year", "PlateNumber", "Gearbox", "Price", "Status", "Image"}, 0);
    String username;
    UserRole userRole;
    public Vehicle(String username, UserRole userRole) {
        this.username = username;
        this.userRole = userRole;
        initComponents();
        
        tblVehicle.setModel(model);
        tblVehicle.getColumnModel().getColumn(8).setMinWidth(0);
        tblVehicle.getColumnModel().getColumn(8).setMaxWidth(0);
        
        loadVehicleData();
        loadDataFromFirstRow();
        disableBtn();
        getCurrentTime();
        lblDate.setText(getCurrentDate());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehicle = new javax.swing.JTable();
        txtVehicleID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtBrand = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPlateNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboGearBox = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboYear = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        lblImage = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel2.setText("VehicleID:");

        tblVehicle.setFont(new java.awt.Font("Kantumruy Pro", 0, 16)); // NOI18N
        tblVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VehicleID", "Brand", "Model", "Year", "PlateNumber", "Gearbox", "Price", "Status", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVehicle.setRowHeight(30);
        tblVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehicleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehicle);

        txtVehicleID.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel3.setText("Brand:");

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

        txtBrand.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

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

        jLabel4.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel4.setText("PlateNumber:");

        txtPlateNumber.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel5.setText("Gearbox:");

        comboGearBox.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        comboGearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatic" }));

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

        jLabel1.setFont(new java.awt.Font("Kantumruy Pro", 1, 36)); // NOI18N
        jLabel1.setText("Vehicle Information");

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
        jLabel6.setText("Model:");

        txtModel.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel7.setText("Year:");

        comboYear.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        comboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        comboYear.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel8.setText("Price:");

        jLabel9.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel9.setText("Status:");

        comboStatus.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Rented", "Reserved" }));

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImage.setPreferredSize(new java.awt.Dimension(200, 200));
        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
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

        lblTime.setFont(new java.awt.Font("Kantumruy Pro", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 0, 204));
        lblTime.setText("Time");

        lblDate.setFont(new java.awt.Font("Kantumruy Pro", 1, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 204));
        lblDate.setText("Date");

        txtPrice.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtVehicleID)
                                                .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(comboGearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(154, 154, 154)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboGearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtVehicleID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadVehicleData() {
        String sql = "SELECT * FROM tbl_vehicle"; // Adjust your query as needed
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // Create a DefaultTableModel to hold the data
            DefaultTableModel tableModel = new DefaultTableModel(
                    new String[]{"VehicleID", "Brand", "Model", "Year", "PlateNumber", "Gearbox", "Price", "Status", "Image"}, 0);

            // Iterate through the ResultSet and add rows to the table model
            while (rs.next()) {
                String vehicleid = rs.getString("vehicleid");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String year = rs.getString("year");
                String platenumber = rs.getString("platenumber");
                String gearbox = rs.getString("gearbox");
                double price = rs.getDouble("price"); // Get price as a double for better precision
                String status = rs.getString("status");
                byte[] image = rs.getBytes("image"); // Retrieve the image bytes

                // Convert the image bytes to an ImageIcon for display in the JTable
                ImageIcon imageIcon = null;
                if (image != null && image.length > 0) {
                    // Resize the image to fit in the table cell
                    BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(image));
                    Image scaledImage = bufferedImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH); // Resize as needed
                    imageIcon = new ImageIcon(scaledImage); // Create ImageIcon from scaled image
                }

                // Add a new row to the table model
                tableModel.addRow(new Object[]{vehicleid, brand, model, year, platenumber, gearbox, price, status, imageIcon});
            }

            // Set the model to the JTable
            tblVehicle.setModel(tableModel);

            // Set column widths to 200
            for (int i = 0; i < tblVehicle.getColumnCount(); i++) {
                tblVehicle.getColumnModel().getColumn(i).setPreferredWidth(200); // Set all columns to 200 pixels wide
            }
            tblVehicle.getColumnModel().getColumn(8).setMinWidth(0);
            tblVehicle.getColumnModel().getColumn(8).setMaxWidth(0);
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading vehicle data: " + e.getMessage());
        }
    }
    
    private void tblVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehicleMouseClicked
        int selectedRow = tblVehicle.getSelectedRow(); // Get the selected row index

        // Check if a row is selected
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblVehicle.getModel();

            // Retrieve data from the selected row and populate the input fields
            txtVehicleID.setText(model.getValueAt(selectedRow, 0).toString());
            txtBrand.setText(model.getValueAt(selectedRow, 1).toString());
            txtModel.setText(model.getValueAt(selectedRow, 2).toString());
            comboYear.setSelectedItem(model.getValueAt(selectedRow, 3).toString());
            txtPlateNumber.setText(model.getValueAt(selectedRow, 4).toString());
            comboGearBox.setSelectedItem(model.getValueAt(selectedRow, 5).toString());
            txtPrice.setText(model.getValueAt(selectedRow, 6).toString());
            comboStatus.setSelectedItem(model.getValueAt(selectedRow, 7).toString());

            // Load the image for the selected vehicle if available
            ImageIcon imageIcon = (ImageIcon) model.getValueAt(selectedRow, 8);
            if (imageIcon != null) {
                lblImage.setIcon(imageIcon);
                lblImage.setText(""); // Clear text after image load
            } else {
                lblImage.setIcon(null);
                lblImage.setText("No image available");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No vehicle selected.");
        }
    }//GEN-LAST:event_tblVehicleMouseClicked
    
    private void disableBtn(){
         if (userRole == UserRole.STAFF) {
             btnAdd.setEnabled(false);
             btnEdit.setEnabled(false);
             btnDelete.setEnabled(false);
         }
     }
    
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
        clearInputFields(); // Clears all the input fields
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String vehicleID = txtVehicleID.getText().trim();
        // Check if vehicle ID is provided
        if (vehicleID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Vehicle ID to delete.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this vehicle?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; // User cancelled the delete action
        }

        // SQL delete statement
        String sql = "DELETE FROM tbl_vehicle WHERE vehicleid = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, vehicleID);

            // Execute the delete
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Vehicle deleted successfully!");

            // Clear the input fields after deleting
            clearInputFields();

            // Reload vehicle data to update the JTable
            loadVehicleData();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting vehicle: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String vehicleID = txtVehicleID.getText().trim();
        String brand = txtBrand.getText().trim();
        String model = txtModel.getText().trim();
        String year = (String) comboYear.getSelectedItem();
        String gearbox = (String) comboGearBox.getSelectedItem();
        String plateNumber = txtPlateNumber.getText().trim();
        String price = txtPrice.getText().trim();
        String status = (String) comboStatus.getSelectedItem();
        String imagePath = (String) lblImage.getClientProperty("imagePath");

        // Check if any fields are empty
        if (vehicleID.isEmpty() || brand.isEmpty() || model.isEmpty() || year == null ||
            plateNumber.isEmpty() || gearbox == null || price.isEmpty() || status == null) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields.");
            return;
        }

        // SQL update statement, optionally including the image if the user has selected one
        String sql = "UPDATE tbl_vehicle SET brand = ?, model = ?, year = ?, platenumber = ?, gearbox = ?, price = ?, status = ?";
        if (imagePath != null) {
            sql += ", image = ? WHERE vehicleid = ?";
        } else {
            sql += " WHERE vehicleid = ?";
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set the parameters for the prepared statement
            pstmt.setString(1, brand);
            pstmt.setString(2, model);
            pstmt.setString(3, year);
            pstmt.setString(4, plateNumber);
            pstmt.setString(5, gearbox);
            pstmt.setDouble(6, Double.parseDouble(price)); // Assuming price is stored as a double
            pstmt.setString(7, status);

            if (imagePath != null) {
                try (FileInputStream fis = new FileInputStream(new File(imagePath))) {
                    pstmt.setBinaryStream(8, fis, (int) new File(imagePath).length()); // Set the image
                    pstmt.setString(9, vehicleID); // Set vehicle ID as last parameter
                }
            } else {
                pstmt.setString(8, vehicleID); // If no image is updated, just set vehicle ID
            }

            // Execute the update
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Vehicle updated successfully!");

            // Clear the input fields after updating
            clearInputFields();

            // Reload vehicle data to update the JTable
            loadVehicleData();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating vehicle: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for price.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed
    
    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if (f != null) {
            String path = f.getAbsolutePath();
            try {
                BufferedImage bi = ImageIO.read(new File(path));
                Image img = bi.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img);
                lblImage.setIcon(icon);
                lblImage.putClientProperty("imagePath", path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error loading image: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_lblImageMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String vehicleID = txtVehicleID.getText().trim();
        String brand = txtBrand.getText().trim();
        String model = txtModel.getText().trim();
        String year = (String) comboYear.getSelectedItem();
        String gearbox = (String) comboGearBox.getSelectedItem();
        String plateNumber = txtPlateNumber.getText().trim();
        String price = txtPrice.getText().trim();
        String status = (String) comboStatus.getSelectedItem();
        String imagePath = (String) lblImage.getClientProperty("imagePath");

        // Check if any fields are empty
        if (vehicleID.isEmpty() || brand.isEmpty() || model.isEmpty() || year == null ||
            plateNumber.isEmpty() || gearbox == null || price.isEmpty() || status == null || imagePath == null) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields.");
            return;
        }

        // SQL insert statement including the image column
        String sql = "INSERT INTO tbl_vehicle (vehicleid, brand, model, year, platenumber, gearbox, price, status, image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql);
             FileInputStream fis = new FileInputStream(new File(imagePath))) {

            // Set the parameters for the prepared statement
            pstmt.setString(1, vehicleID);
            pstmt.setString(2, brand);
            pstmt.setString(3, model);
            pstmt.setString(4, year);
            pstmt.setString(5, plateNumber);
            pstmt.setString(6, gearbox);
            pstmt.setDouble(7, Double.parseDouble(price)); // Assuming price is stored as a double
            pstmt.setString(8, status);
            pstmt.setBinaryStream(9, fis, (int) new File(imagePath).length()); // Corrected to set image binary stream at index 9

            // Execute the update
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Vehicle added successfully with image!");

            // Clear the input fields after adding
            clearInputFields();

            // Reload vehicle data to update the JTable
            loadVehicleData();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding vehicle: " + e.getMessage()); // Handle SQL exceptions
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for price."); // Handle parsing errors
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage()); // Handle file input errors
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void loadDataFromFirstRow() {
        // SQL query to get data from the first row in the table
        String sql = "SELECT * FROM tbl_vehicle LIMIT 1"; // Assumes you're loading the first row

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // If a row exists, load the data into the form fields
            if (rs.next()) {
                // Set data into the text fields from the result set
                txtVehicleID.setText(rs.getString("vehicleid"));
                txtBrand.setText(rs.getString("brand"));
                txtModel.setText(rs.getString("model"));
                comboYear.setSelectedItem(rs.getString("year"));
                txtPlateNumber.setText(rs.getString("platenumber"));
                txtPrice.setText(rs.getString("price"));
                comboGearBox.setSelectedItem(rs.getString("gearbox"));
                comboStatus.setSelectedItem(rs.getString("status"));

                // Load the image (if it exists) from the database
                byte[] imgBytes = rs.getBytes("image");
                if (imgBytes != null) {
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(imgBytes).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
                    lblImage.setIcon(imageIcon);
                    lblImage.putClientProperty("imagePath", null); // Since the image is from the DB, no image path
                } else {
                    lblImage.setIcon(null); // Clear the image if none exists
                    lblImage.putClientProperty("imagePath", null);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No data found in the first row.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
        }
    }

    
    private void clearInputFields() {
        txtVehicleID.setText("");
        txtBrand.setText("");
        txtModel.setText("");
        comboYear.setSelectedIndex(0);
        txtPlateNumber.setText("");
        txtPrice.setText("");
        comboGearBox.setSelectedIndex(0);
        comboStatus.setSelectedIndex(0);
        lblImage.setIcon(null); // Clears the image preview
        lblImage.putClientProperty("imagePath", null);
    }
    
    Timer t;
    SimpleDateFormat st;
    private void getCurrentTime() {
        t = new Timer(0, (ActionEvent e) -> {
            Date dt = new Date();
            st = new SimpleDateFormat("hh:mm:ss a");
            String tt = st.format(dt);
            lblTime.setText(tt);
        });
        t.start();
    }
    
    private String getCurrentDate() {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Format the date and time as yyyy-MM-dd HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return currentDateTime.format(formatter);
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
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            //new Vehicle().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> comboGearBox;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JComboBox<String> comboYear;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblVehicle;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPlateNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtVehicleID;
    // End of variables declaration//GEN-END:variables
}
