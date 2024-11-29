import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Rent extends javax.swing.JFrame {
    String username;
    UserRole userRole;
    public Rent(String username, UserRole userRole) {
        this.username = username;
        this.userRole = userRole;
        
        initComponents();
        loadRentData();
        loadFirstRow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtRentEnd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtVehicleID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRent = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtRentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtCustomerID = new javax.swing.JTextField();
        txtRentStart = new javax.swing.JTextField();
        txtPricePerDay = new javax.swing.JTextField();
        lblTime1 = new javax.swing.JLabel();
        lblDate1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        returnRe = new javax.swing.JTextArea();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        jLabel4.setText("RentStart:");

        txtRentEnd.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtRentEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRentEndMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel5.setText("RentEnd:");

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
        jLabel1.setText("Rental Information");

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
        jLabel6.setText("VehicleID:");

        txtVehicleID.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtVehicleID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVehicleIDMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel8.setText("PricePerDay:");

        txtTotalPrice.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtTotalPrice.setForeground(new java.awt.Color(255, 0, 0));
        txtTotalPrice.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel9.setText("Total Price:");

        jLabel2.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel2.setText("RentID:");

        tblRent.setFont(new java.awt.Font("Kantumruy Pro", 0, 16)); // NOI18N
        tblRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RentID", "CustomerID", "VehicleID", "RentStart", "RentEnd", "PricePerDay", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRent.setRowHeight(30);
        tblRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRent);

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

        txtRentID.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtRentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRentIDKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        jLabel3.setText("Customer Name:");

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

        txtCustomerID.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtCustomerID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCustomerIDMouseClicked(evt);
            }
        });

        txtRentStart.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtRentStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRentStartMouseClicked(evt);
            }
        });

        txtPricePerDay.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        txtPricePerDay.setFocusable(false);
        txtPricePerDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPricePerDayMouseClicked(evt);
            }
        });

        lblTime1.setFont(new java.awt.Font("Kantumruy Pro", 1, 18)); // NOI18N
        lblTime1.setForeground(new java.awt.Color(0, 0, 204));
        lblTime1.setText("Time");

        lblDate1.setFont(new java.awt.Font("Kantumruy Pro", 1, 24)); // NOI18N
        lblDate1.setForeground(new java.awt.Color(0, 0, 204));
        lblDate1.setText("Date");

        returnRe.setColumns(20);
        returnRe.setFont(new java.awt.Font("Kantumruy Pro", 0, 12)); // NOI18N
        returnRe.setRows(5);
        jScrollPane2.setViewportView(returnRe);

        btnPrint.setBackground(new java.awt.Color(51, 51, 255));
        btnPrint.setFont(new java.awt.Font("Kantumruy Pro", 0, 18)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1)
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVehicleID, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(75, 75, 75)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(37, 37, 37)
                                                    .addComponent(txtRentStart, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(37, 37, 37)
                                                    .addComponent(txtRentEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtPricePerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(28, 28, 28)
                                                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtVehicleID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel4))
                                    .addComponent(txtRentStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel5))
                                    .addComponent(txtRentEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel8))
                                    .addComponent(txtPricePerDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel9))
                                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadFirstRow() {
        // Check if there is any data in the table
        if (tblRent.getRowCount() > 0) {
            // Select the first row
            tblRent.setRowSelectionInterval(0, 0);

            // Load data from the first row into the text fields
            txtRentID.setText(tblRent.getValueAt(0, 0).toString());
            txtCustomerID.setText(tblRent.getValueAt(0, 1).toString());
            txtVehicleID.setText(tblRent.getValueAt(0, 2).toString());
            txtRentStart.setText(tblRent.getValueAt(0, 3).toString());
            txtRentEnd.setText(tblRent.getValueAt(0, 4).toString());
            txtPricePerDay.setText(tblRent.getValueAt(0, 5).toString());
            txtTotalPrice.setText(tblRent.getValueAt(0, 6).toString());
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

            tblRent.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading rent data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void clearFields(){
        txtRentID.setText("");
        txtCustomerID.setText("");
        txtVehicleID.setText("");
        txtRentStart.setText("");
        txtRentEnd.setText("");
        txtPricePerDay.setText("");
        txtTotalPrice.setText("");
        tblRent.clearSelection();
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String rentID = txtRentID.getText().trim();

        // Validate required fields
        if (rentID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter RentID.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Check if the rent record exists
        if (!isRentRecordExists(rentID)) {
            JOptionPane.showMessageDialog(this, "Rent record not found.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get the associated vehicle ID before deletion
        String vehicleID = getVehicleIDByRentID(rentID);
        if (vehicleID == null) {
            JOptionPane.showMessageDialog(this, "Could not retrieve vehicle ID associated with the rent record.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Show confirmation dialog
        int confirmResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this rent record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirmResult != JOptionPane.YES_OPTION) {
            return; // User chose not to delete
        }

        // SQL Statements
        String deleteRentSql = "DELETE FROM tbl_rentals WHERE RentID = ?";
        String updateVehicleStatusSql = "UPDATE tbl_vehicle SET Status = ? WHERE VehicleID = ?"; // Update vehicle status back to available

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root")) {
            conn.setAutoCommit(false); // Begin transaction

            try (PreparedStatement pstmtDelete = conn.prepareStatement(deleteRentSql);
                 PreparedStatement pstmtUpdateStatus = conn.prepareStatement(updateVehicleStatusSql)) {

                // Delete the rent record
                pstmtDelete.setString(1, rentID);
                int rowsAffected = pstmtDelete.executeUpdate();

                // Update vehicle status if the deletion was successful
                if (rowsAffected > 0) {
                    pstmtUpdateStatus.setString(1, "available"); // Set status to 'available'
                    pstmtUpdateStatus.setString(2, vehicleID); // Set the correct vehicle ID
                    pstmtUpdateStatus.executeUpdate(); // Update vehicle status

                    conn.commit(); // Commit transaction

                    JOptionPane.showMessageDialog(this, "Rent record deleted successfully and vehicle status updated to 'available'.");
                    loadRentData(); // Refresh the rent data
                } else {
                    JOptionPane.showMessageDialog(this, "Error deleting rent record.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException e) {
                conn.rollback(); // Rollback if there's an error
                JOptionPane.showMessageDialog(this, "Error processing request: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error connecting to database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFields();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String rentID = txtRentID.getText().trim();
        String customerName = txtCustomerID.getText().trim(); // Keep this as a name to show to user
        String vehicleModel = txtVehicleID.getText().trim(); // Keep this as a model name to show to user
        String rentStart = txtRentStart.getText().trim();
        String rentEnd = txtRentEnd.getText().trim();

        if (rentID.isEmpty() || customerName.isEmpty() || vehicleModel.isEmpty() || rentStart.isEmpty() || rentEnd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        SimpleDateFormat displayFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date startDate, endDate;

        // Validate date format and order
        try {
            startDate = displayFormat.parse(rentStart);
            endDate = displayFormat.parse(rentEnd);
            if (endDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "Rent End date must be after Rent Start date.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use dd-MMM-yyyy.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double pricePerDay, totalPrice;

        // Validate price inputs
        try {
            pricePerDay = Double.parseDouble(txtPricePerDay.getText().trim().replace("$", "").replace(",", ""));
            totalPrice = Double.parseDouble(txtTotalPrice.getText().trim().replace("$", "").replace(",", ""));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price Per Day and Total Price must be valid numbers.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Convert customer name to ID
        String actualCustomerID = getCustomerIDByName(customerName);
        if (actualCustomerID == null) {
            JOptionPane.showMessageDialog(this, "Customer name not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convert vehicle model to ID
        String actualVehicleID = getVehicleIDByModel(vehicleModel);
        if (actualVehicleID == null) {
            JOptionPane.showMessageDialog(this, "Vehicle model not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the current vehicle ID associated with the rent record
        String currentVehicleID = getVehicleIDByRentID(rentID);
        String updateRentSql = "UPDATE tbl_rentals SET CustomerID = ?, VehicleID = ?, RentStart = ?, RentEnd = ?, PricePerDay = ?, TotalPrice = ? WHERE RentID = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(updateRentSql)) {

            java.sql.Date sqlRentStart = new java.sql.Date(startDate.getTime());
            java.sql.Date sqlRentEnd = new java.sql.Date(endDate.getTime());

            pstmt.setString(1, actualCustomerID);
            pstmt.setString(2, actualVehicleID);
            pstmt.setDate(3, sqlRentStart);
            pstmt.setDate(4, sqlRentEnd);
            pstmt.setDouble(5, pricePerDay);
            pstmt.setDouble(6, totalPrice);
            pstmt.setString(7, rentID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                // Update the status of the current vehicle to available if it is different
                if (!currentVehicleID.equals(actualVehicleID)) {
                    updateVehicleStatus(conn, currentVehicleID, "available"); // Update current vehicle to available
                    updateVehicleStatus(conn, actualVehicleID, "rented"); // Update new vehicle to rented
                }
                JOptionPane.showMessageDialog(this, "Rent record updated successfully.");
                loadRentData();
            } else {
                JOptionPane.showMessageDialog(this, "Rent record not found.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating rent record: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    // Method to update vehicle status
    private void updateVehicleStatus(Connection conn, String vehicleID, String status) throws SQLException {
        String updateVehicleStatusSql = "UPDATE tbl_vehicle SET Status = ? WHERE VehicleID = ?";
        try (PreparedStatement pstmtUpdateStatus = conn.prepareStatement(updateVehicleStatusSql)) {
            pstmtUpdateStatus.setString(1, status);
            pstmtUpdateStatus.setString(2, vehicleID);
            pstmtUpdateStatus.executeUpdate();
        }
    }
    
    private void tblRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRentMouseClicked
        int selectedRow = tblRent.getSelectedRow();
        if (selectedRow != -1) {
            txtRentID.setText(tblRent.getValueAt(selectedRow, 0).toString());
            txtCustomerID.setText(tblRent.getValueAt(selectedRow, 1).toString());
            txtVehicleID.setText(tblRent.getValueAt(selectedRow, 2).toString());
            txtRentStart.setText(tblRent.getValueAt(selectedRow, 3).toString());
            txtRentEnd.setText(tblRent.getValueAt(selectedRow, 4).toString());
            txtPricePerDay.setText(tblRent.getValueAt(selectedRow, 5).toString());
            txtTotalPrice.setText(tblRent.getValueAt(selectedRow, 6).toString());
        }
    }//GEN-LAST:event_tblRentMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String rentID = txtRentID.getText().trim();
        String customerID = txtCustomerID.getText().trim(); // This will be the name, so we need to convert it to ID
        String vehicleID = txtVehicleID.getText().trim(); // This will be the model name, so convert to ID
        String rentStart = txtRentStart.getText().trim();
        String rentEnd = txtRentEnd.getText().trim();

        // Validate required fields
        if (rentID.isEmpty() || customerID.isEmpty() || vehicleID.isEmpty() || rentStart.isEmpty() || rentEnd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        SimpleDateFormat displayFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date startDate, endDate;

        // Validate date format and order
        try {
            startDate = displayFormat.parse(rentStart);
            endDate = displayFormat.parse(rentEnd);
            if (endDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "Rent End date must be after Rent Start date.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use dd-MMM-yyyy.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double pricePerDay, totalPrice;

        // Validate price inputs
        try {
            pricePerDay = Double.parseDouble(txtPricePerDay.getText().trim().replace("$", "").replace(",", ""));
            totalPrice = Double.parseDouble(txtTotalPrice.getText().trim().replace("$", "").replace(",", ""));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price Per Day and Total Price must be valid numbers.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Convert customer name to ID
        String actualCustomerID = getCustomerIDByName(customerID);
        if (actualCustomerID == null) {
            JOptionPane.showMessageDialog(this, "Customer name not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convert vehicle model to ID
        String actualVehicleID = getVehicleIDByModel(vehicleID);
        if (actualVehicleID == null) {
            JOptionPane.showMessageDialog(this, "Vehicle model not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prepare SQL insert statement for rental
        String insertRentSql = "INSERT INTO tbl_rentals (RentID, CustomerID, VehicleID, RentStart, RentEnd, PricePerDay, TotalPrice) VALUES (?, ?, ?, ?, ?, ?, ?)";
        // Prepare SQL update statement for vehicle status
        String updateVehicleStatusSql = "UPDATE tbl_vehicle SET Status = ? WHERE VehicleID = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmtRent = conn.prepareStatement(insertRentSql);
             PreparedStatement pstmtUpdateStatus = conn.prepareStatement(updateVehicleStatusSql)) {

            java.sql.Date sqlRentStart = new java.sql.Date(startDate.getTime());
            java.sql.Date sqlRentEnd = new java.sql.Date(endDate.getTime());

            pstmtRent.setString(1, rentID);
            pstmtRent.setString(2, actualCustomerID); // Use the actual customer ID
            pstmtRent.setString(3, actualVehicleID); // Use the actual vehicle ID
            pstmtRent.setDate(4, sqlRentStart);
            pstmtRent.setDate(5, sqlRentEnd);
            pstmtRent.setDouble(6, pricePerDay);
            pstmtRent.setDouble(7, totalPrice);

            // Execute the rental insertion
            pstmtRent.executeUpdate();

            // Update the vehicle status to 'rented'
            pstmtUpdateStatus.setString(1, "rented");
            pstmtUpdateStatus.setString(2, actualVehicleID);
            pstmtUpdateStatus.executeUpdate();

            JOptionPane.showMessageDialog(this, "Rent record added successfully and vehicle status updated to 'rented'.");
            loadRentData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding rent record: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFields();
    }//GEN-LAST:event_btnAddActionPerformed

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

    private void txtRentStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRentStartMouseClicked
        showCalendar(txtRentStart);
        calculateTotalPrice();
    }//GEN-LAST:event_txtRentStartMouseClicked

    private void txtRentEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRentEndMouseClicked
        showCalendar(txtRentEnd);
        calculateTotalPrice();
    }//GEN-LAST:event_txtRentEndMouseClicked

    private void showCustomerDialog() {
        JDialog customerDialog = new JDialog(this, "Select Customer", true);
        customerDialog.setLayout(new BorderLayout());

        JPanel searchPanel = new JPanel(new BorderLayout());
        JTextField searchField = new JTextField();
        searchPanel.add(new JLabel("Search: "), BorderLayout.WEST);
        searchPanel.add(searchField, BorderLayout.CENTER);

        String[] columnNames = {"Customer ID", "Customer Name", "Phone Number", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable customerTable = new JTable(tableModel);

        customerTable.setFont(new Font("Kantumruy Pro", Font.PLAIN, 18));
        customerTable.setRowHeight(30);

        loadCustomerData("", tableModel);

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { filterTable(); }
            public void removeUpdate(DocumentEvent e) { filterTable(); }
            public void changedUpdate(DocumentEvent e) { filterTable(); }

            private void filterTable() {
                String searchTerm = searchField.getText();
                loadCustomerData(searchTerm, tableModel);
            }
        });

        customerTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = customerTable.getSelectedRow();
                if (selectedRow != -1) {
                    String customerName = customerTable.getValueAt(selectedRow, 1).toString();
                    txtCustomerID.setText(customerName);
                    customerDialog.dispose();
                }
            }
        });

        JButton openCustomerFormButton = new JButton("Add New Customer");
        openCustomerFormButton.setFont(new Font("Kantumruy Pro", Font.PLAIN, 18));
        openCustomerFormButton.addActionListener(e -> {
            Customer.main(null);
            Customer customerForm = new Customer(username, userRole); // Pass username and userRole
            customerForm.setVisible(true); // Show the customer form
        });

        customerDialog.add(searchPanel, BorderLayout.NORTH);
        customerDialog.add(new JScrollPane(customerTable), BorderLayout.CENTER);
        customerDialog.add(openCustomerFormButton, BorderLayout.SOUTH);
        customerDialog.setSize(700, 400);
        customerDialog.setLocationRelativeTo(this);
        customerDialog.setVisible(true);
    }

    // Method to load customer data based on search term
    private void loadCustomerData(String searchTerm, DefaultTableModel tableModel) {
        tableModel.setRowCount(0); // Clear existing data
        String query = "SELECT customerID, FullName, phoneNumber, address FROM tbl_customer "
                     + "WHERE FullName LIKE ? OR phoneNumber LIKE ? OR address LIKE ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            String searchPattern = "%" + searchTerm + "%";
            pstmt.setString(1, searchPattern);
            pstmt.setString(2, searchPattern);
            pstmt.setString(3, searchPattern);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String customerID = rs.getString("customerID");
                    String customerName = rs.getString("FullName");
                    String phoneNumber = rs.getString("phoneNumber");
                    String address = rs.getString("address");
                    tableModel.addRow(new Object[]{customerID, customerName, phoneNumber, address});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading customer data: " + e.getMessage());
        }
    }

    private void txtCustomerIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCustomerIDMouseClicked
        showCustomerDialog();
    }//GEN-LAST:event_txtCustomerIDMouseClicked

    private void showVehicleDialog() {
        JDialog vehicleDialog = new JDialog(this, "Select Vehicle", true);
        vehicleDialog.setLayout(new BorderLayout());

        String[] columnNames = {"Vehicle ID", "Vehicle Model", "Plate Number", "Price", "Status"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable vehicleTable = new JTable(tableModel) {
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                // Check if we are rendering the "Status" column (index 4)
                if (column == 4) {
                    String status = getValueAt(row, 4).toString();
                    if ("Rented".equalsIgnoreCase(status)) {
                        c.setForeground(Color.RED); // Rented vehicles in red
                    } else {
                        c.setForeground(new Color(0, 128, 0)); // Available vehicles in light green
                    }
                } else {
                    c.setForeground(Color.BLACK); // Reset the color for other columns
                }
                return c;
            }
        };

        vehicleTable.setFont(new Font("Kantumruy Pro", Font.BOLD, 16));
        vehicleTable.setRowHeight(30);

        // Load vehicle data
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement("SELECT VehicleID, Model, PlateNumber, Price, Status FROM tbl_vehicle");
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String vehicleID = rs.getString("VehicleID");
                String model = rs.getString("Model");
                String plateNumber = rs.getString("PlateNumber");
                double price = rs.getDouble("Price");
                String status = rs.getString("Status");
                tableModel.addRow(new Object[]{vehicleID, model, plateNumber, price, status});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading vehicle data: " + e.getMessage());
        }

        vehicleTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = vehicleTable.getSelectedRow();
                if (selectedRow != -1) {
                    String vehicleID = vehicleTable.getValueAt(selectedRow, 0).toString();
                    String vehicleModel = vehicleTable.getValueAt(selectedRow, 1).toString();
                    double price = (double) vehicleTable.getValueAt(selectedRow, 3);
                    String status = vehicleTable.getValueAt(selectedRow, 4).toString();

                    if ("Rented".equalsIgnoreCase(status)) {
                        JOptionPane.showMessageDialog(vehicleDialog, "Warning: This vehicle is currently rented and cannot be selected.", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        txtVehicleID.setText(vehicleID);  // Store ID for database
                        txtVehicleID.setText(vehicleModel); // Show model to user
                        txtPricePerDay.setText("$" + price);
                        vehicleDialog.dispose(); // Close the dialog after selection
                    }
                }
            }
        });

        vehicleDialog.add(new JScrollPane(vehicleTable), BorderLayout.CENTER);
        vehicleDialog.setSize(700, 300);
        vehicleDialog.setLocationRelativeTo(this);
        vehicleDialog.setVisible(true);
    }    
    private void txtVehicleIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVehicleIDMouseClicked
        showVehicleDialog();
    }//GEN-LAST:event_txtVehicleIDMouseClicked

    private void calculateTotalPrice() {
        // Check if the price per day is a valid number
        String priceText = txtPricePerDay.getText().replace("$", "");
        double pricePerDay;

        try {
            pricePerDay = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid price per day. Please enter a valid number.");
            return; // Exit the method if the price is invalid
        }

        // Check if the start and end dates are filled
        if (txtRentStart.getText().isEmpty() || txtRentEnd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select both the start and end dates.");
            return; // Exit the method if dates are not selected
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            Date startDate = dateFormat.parse(txtRentStart.getText());
            Date endDate = dateFormat.parse(txtRentEnd.getText());

            // Validate that start date is before end date
            if (startDate.after(endDate)) {
                JOptionPane.showMessageDialog(this, "Start date must be before end date.");
                return; // Exit the method if dates are in the wrong order
            }

            long diffInMillies = endDate.getTime() - startDate.getTime();
            long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            // Ensure the duration is positive
            if (diffInDays <= 0) {
                JOptionPane.showMessageDialog(this, "The rental duration must be more than 0 days.");
                return; // Exit the method if duration is not positive
            }

            double totalPrice = pricePerDay * diffInDays;
            txtTotalPrice.setText("$" + totalPrice);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Error parsing dates: " + e.getMessage());
        }
    }
    
    private void txtPricePerDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPricePerDayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricePerDayMouseClicked

    private void txtRentIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRentIDKeyReleased
        String rentID = txtRentID.getText().trim();
        if (!rentID.isEmpty()) {
            loadRentDataToTextArea(rentID);
        } else {
            returnRe.setText("");
        }
    }//GEN-LAST:event_txtRentIDKeyReleased

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
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading rent data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        String printContent = returnRe.getText();
        String companyName = "Orn Chhaileng"; // Replace with your company name
        String logoPath = "D:/Y4/NewTerm/logo.png"; // Replace with the actual path to your logo image

        if (printContent.length() > 0) {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(new ReceiptPrintable(printContent, companyName, logoPath));

            // Set the page format for an 80mm printer
            PageFormat pf = job.defaultPage();
            Paper paper = new Paper();
            double width = 80 * 2.83465; // 80mm width
            double height = paper.getHeight(); // Use default paper height (can be adjusted)
            paper.setSize(width, height);
            paper.setImageableArea(0, 0, width, height);
            pf.setPaper(paper);

            job.setPrintable(new ReceiptPrintable(printContent, companyName, logoPath), pf);

            boolean doPrint = job.printDialog();
            if (doPrint) {
                try {
                    job.print();
                    JOptionPane.showMessageDialog(null, "Printing Complete", "Printer", JOptionPane.INFORMATION_MESSAGE);
                } catch (PrinterException ex) {
                    JOptionPane.showMessageDialog(null, "Printing Failed: " + ex.getMessage(), "Printer", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Printing Canceled", "Printer", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Empty content can't be printed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void showCalendar(JTextField textField) {
        // Create a JCalendar instance
        JCalendar calendar = new JCalendar();
        calendar.setFont(new Font("Kantumruy Pro", Font.BOLD, 20)); // Font setup

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(calendar, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        // Font setup for buttons
        Font buttonFont = new Font("Kantumruy Pro", Font.BOLD, 20);
        okButton.setFont(buttonFont);
        cancelButton.setFont(buttonFont);

        okButton.addActionListener(e -> {
            Date selectedDate = calendar.getDate();
            if (selectedDate != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
                textField.setText(sdf.format(selectedDate));
            }
            ((JDialog) SwingUtilities.getWindowAncestor(panel)).dispose();
        });

        cancelButton.addActionListener(e -> ((JDialog) SwingUtilities.getWindowAncestor(panel)).dispose());

        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        JDialog dialog = new JDialog(this, "Select Date", true);
        dialog.getContentPane().add(panel);
        dialog.pack();
        dialog.setLocationRelativeTo(this); // Center the dialog
        dialog.setVisible(true);
    }
    
    private String getCustomerIDByName(String customerName) {
        String query = "SELECT CustomerID FROM tbl_customer WHERE FullName = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, customerName);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("CustomerID");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error checking customer name: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return null; // Return null if not found
    }

    // Method to get vehicle ID by model
    private String getVehicleIDByModel(String vehicleModel) {
        String query = "SELECT VehicleID FROM tbl_vehicle WHERE Model = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, vehicleModel);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("VehicleID");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error checking vehicle model: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return null; // Return null if not found
    }
    
    private boolean isRentRecordExists(String rentID) {
        String checkRentSql = "SELECT COUNT(*) FROM tbl_rentals WHERE RentID = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(checkRentSql)) {

            pstmt.setString(1, rentID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; // Return true if count is greater than 0
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error checking rent record: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return false; // Default return false if an error occurs
    }
    
    private String getVehicleIDByRentID(String rentID) {
        String vehicleID = null;
        String query = "SELECT VehicleID FROM tbl_rentals WHERE RentID = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/rental", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, rentID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                vehicleID = rs.getString("VehicleID");
            }
        } catch (SQLException e) {
            
        }
        return vehicleID;
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
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Rent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JTextArea returnRe;
    private javax.swing.JTable tblRent;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtPricePerDay;
    private javax.swing.JTextField txtRentEnd;
    private javax.swing.JTextField txtRentID;
    private javax.swing.JTextField txtRentStart;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtVehicleID;
    // End of variables declaration//GEN-END:variables
}
