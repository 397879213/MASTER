package Form.Hospital;

import BO.Hospital.ManageAdmServices;
import Controller.Hospital.ManageAdmServicesController;
import TableModel.Hospital.AdmissionServicesTableModel;
import TableModel.Hospital.PatientAdmissionsTableModel;
import TableModel.Hospital.PatientInvoiceDetailTableModel;
import TableModel.Hospital.PatientInvoicesTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.GUIUtils;

public class frmManageAdmServices extends javax.swing.JInternalFrame {

    public frmManageAdmServices() {

        initComponents();
        this.setSize(Constants.xSize - 220, Constants.ySize - 120);
    }
    String patientId = "";
    String admissionNo = "";
    String invoiceNo = "";
    String CON = "";
    ManageAdmServicesController ctlManageAdmServices = new ManageAdmServicesController();
    ManageAdmServices objManageAdmServices = new ManageAdmServices();

    List<ManageAdmServices> listPatientAdmissions = new ArrayList();
    List<ManageAdmServices> listAdmWiseServices = new ArrayList();
    List<ManageAdmServices> listPatInvoices = new ArrayList();
    List<ManageAdmServices> listInvoiceDetail = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblOPDInvoices = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblInvoiceDetail = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAdmissionList = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAdmissionServices = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtWard = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAdmissionNumber = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtPatName = new javax.swing.JTextField();
        txtAgeGender = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiagnosis = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(880, 710));
        setRequestFocusEnabled(false);

        pnlPL.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPL.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblPacsLink.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        lblPacsLink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPacsLink.setForeground(new java.awt.Color(0, 102, 102));
        lblPacsLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacsLink.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout pnlPLLayout = new javax.swing.GroupLayout(pnlPL);
        pnlPL.setLayout(pnlPLLayout);
        pnlPLLayout.setHorizontalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Admission Services", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPD Invoices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblOPDInvoices.setBackground(java.awt.SystemColor.activeCaption);
        tblOPDInvoices.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblOPDInvoices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Invoice By","Invoice Date", "Amount"
            }
        ));
        tblOPDInvoices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOPDInvoicesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblOPDInvoicesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOPDInvoicesMouseReleased(evt);
            }
        });
        tblOPDInvoices.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblOPDInvoicesPropertyChange(evt);
            }
        });
        tblOPDInvoices.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblOPDInvoicesKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblOPDInvoices);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblInvoiceDetail.setBackground(java.awt.SystemColor.activeCaption);
        tblInvoiceDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblInvoiceDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "CPT","Price"
            }
        ));
        tblInvoiceDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInvoiceDetailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblInvoiceDetailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblInvoiceDetailMouseReleased(evt);
            }
        });
        tblInvoiceDetail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblInvoiceDetailPropertyChange(evt);
            }
        });
        tblInvoiceDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblInvoiceDetailKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(tblInvoiceDetail);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admissions List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAdmissionList.setBackground(java.awt.SystemColor.activeCaption);
        tblAdmissionList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAdmissionList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Admitted By","Admission Date","Pri. Physician"
            }
        ));
        tblAdmissionList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdmissionListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAdmissionListMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAdmissionListMouseReleased(evt);
            }
        });
        tblAdmissionList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblAdmissionListPropertyChange(evt);
            }
        });
        tblAdmissionList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAdmissionListKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(tblAdmissionList);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admission Services", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAdmissionServices.setBackground(java.awt.SystemColor.activeCaption);
        tblAdmissionServices.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAdmissionServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Inv. By", "CPT", "Price"
            }
        ));
        tblAdmissionServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdmissionServicesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAdmissionServicesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAdmissionServicesMouseReleased(evt);
            }
        });
        tblAdmissionServices.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblAdmissionServicesPropertyChange(evt);
            }
        });
        tblAdmissionServices.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAdmissionServicesKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(tblAdmissionServices);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Patient Id :  ");

        txtPrimaryPhy.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Physician : ");

        txtWard.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Client Name : ");

        txtClient.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Admission No : ");

        txtAdmissionNumber.setEditable(false);

        txtBed.setEditable(false);

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtPatName.setEditable(false);

        txtAgeGender.setEditable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdmissionNumber)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrimaryPhy)
                            .addComponent(txtPatName, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgeGender, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(txtBed)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnTransfer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Save Diagnosis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnTransfer)
                    .addComponent(btnExit)
                    .addComponent(jButton1))
                .addGap(10, 10, 10))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtDiagnosis.setColumns(20);
        txtDiagnosis.setRows(5);
        jScrollPane1.setViewportView(txtDiagnosis);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblOPDInvoicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOPDInvoicesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOPDInvoicesMouseClicked

    private void tblOPDInvoicesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOPDInvoicesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOPDInvoicesMousePressed

    private void tblOPDInvoicesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOPDInvoicesMouseReleased
        ManageAdmServices objInv = listPatInvoices.get(tblOPDInvoices.getSelectedRow());
        invoiceNo = objInv.getInvoiceNo();
        CON = objInv.getCON();
        invoiceDetail(invoiceNo);
    }//GEN-LAST:event_tblOPDInvoicesMouseReleased

    private void tblOPDInvoicesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblOPDInvoicesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOPDInvoicesPropertyChange

    private void tblOPDInvoicesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOPDInvoicesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOPDInvoicesKeyPressed

    private void tblInvoiceDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailMouseClicked

    private void tblInvoiceDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceDetailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailMousePressed

    private void tblInvoiceDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceDetailMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailMouseReleased

    private void tblInvoiceDetailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblInvoiceDetailPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailPropertyChange

    private void tblInvoiceDetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblInvoiceDetailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailKeyPressed

    private void tblAdmissionListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmissionListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionListMouseClicked

    private void tblAdmissionListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmissionListMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionListMousePressed

    private void tblAdmissionListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmissionListMouseReleased
        // TODO add your handling code here:
        ManageAdmServices obj = listPatientAdmissions.get(tblAdmissionList.getSelectedRow());
        patientId = obj.getPatientId();
        admissionNo = obj.getAdmissionNo();
        admissionWiseServices(patientId, admissionNo);
        setPatientDemography();
    }//GEN-LAST:event_tblAdmissionListMouseReleased

    private void tblAdmissionListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblAdmissionListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionListPropertyChange

    private void tblAdmissionListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAdmissionListKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionListKeyPressed

    private void tblAdmissionServicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmissionServicesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionServicesMouseClicked

    private void tblAdmissionServicesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmissionServicesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionServicesMousePressed

    private void tblAdmissionServicesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmissionServicesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionServicesMouseReleased

    private void tblAdmissionServicesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblAdmissionServicesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionServicesPropertyChange

    private void tblAdmissionServicesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAdmissionServicesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmissionServicesKeyPressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "to Transfer invoice OPD to IPD.");
        if (confirmation != 0) {
            return;
        }
        objManageAdmServices.setAdmissionNo(admissionNo);
        objManageAdmServices.setCON(CON);
        if (ctlManageAdmServices.updateAdmissionNo(objManageAdmServices)) {
            JOptionPane.showMessageDialog(null, "Invoice transfer to IPD");
            selectPatientAdmissions(patientId);
            selectPatientInvoices(patientId, "0");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to transfer the Invoice to IPD");
        }
    }//GEN-LAST:event_btnTransferActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
        if (GUIUtils.completePatientId(txtPatientId.getText())) {
            patientId = Constants.completePatientId;
        }
        selectPatientAdmissions(patientId);
        selectPatientInvoices(patientId, "0");
        setPatientDemography();

    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtPatientId.setText("");
        txtPatName.setText("");
        txtAgeGender.setText("");
        txtAdmissionNumber.setText("");
        txtWard.setText("");
        txtBed.setText("");
        txtClient.setText("");
        txtPrimaryPhy.setText("");
        
        listAdmWiseServices.clear();
        listInvoiceDetail.clear();
        listPatInvoices.clear();
        listPatientAdmissions.clear();
        tblInvoiceDetail.setModel(new PatientInvoiceDetailTableModel(listInvoiceDetail));
        tblOPDInvoices.setModel(new PatientInvoicesTableModel(listPatInvoices));
        tblAdmissionServices.setModel(new AdmissionServicesTableModel(listAdmWiseServices));
        tblAdmissionList.setModel(new PatientAdmissionsTableModel(listPatientAdmissions));
    
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        objManageAdmServices.setAdmissionNo(admissionNo);
        objManageAdmServices.setDiagnosisRemarks(txtDiagnosis.getText().trim());
        if (ctlManageAdmServices.updateAdmissionDiagnisisRemarks(objManageAdmServices)) {
            JOptionPane.showMessageDialog(null, "Diagnisis Remarks save successfully");
            selectPatientAdmissions(patientId);
            selectPatientInvoices(patientId, "0");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save Diagnisis. Kindly contact Administrator.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblAdmissionList;
    private javax.swing.JTable tblAdmissionServices;
    private javax.swing.JTable tblInvoiceDetail;
    private javax.swing.JTable tblOPDInvoices;
    private javax.swing.JTextField txtAdmissionNumber;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextArea txtDiagnosis;
    private javax.swing.JTextField txtPatName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    private void selectPatientAdmissions(String patientId) {
        listPatientAdmissions = ctlManageAdmServices.selectPatientAdmissions(patientId);
        tblAdmissionList.setModel(new PatientAdmissionsTableModel(listPatientAdmissions));
        ListSelectionModel selectionModel = tblAdmissionList.getSelectionModel();
        tblAdmissionList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPatientAdmissionsColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAdmissionList);
    }

    private void setPatientAdmissionsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblAdmissionList.getColumnCount(); i++) {
            column = tblAdmissionList.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(80);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void admissionWiseServices(String patientId, String admissionNo) {
        listAdmWiseServices = ctlManageAdmServices.selectAdmissionWiseServices(
                patientId, admissionNo);
        tblAdmissionServices.setModel(new AdmissionServicesTableModel(listAdmWiseServices));
        ListSelectionModel selectionModel = tblAdmissionServices.getSelectionModel();
        tblAdmissionServices.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setAdmissionWiseServicesColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAdmissionServices);
    }

    private void setAdmissionWiseServicesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblAdmissionServices.getColumnCount(); i++) {
            column = tblAdmissionServices.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(80);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void selectPatientInvoices(String patientId, String admissionNo) {
        listPatInvoices = ctlManageAdmServices.selectPatientInvoices(patientId,
                admissionNo);
        tblOPDInvoices.setModel(new PatientInvoicesTableModel(listPatInvoices));
        ListSelectionModel selectionModel = tblOPDInvoices.getSelectionModel();
        tblOPDInvoices.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPatientInvoicesColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblOPDInvoices);
    }

    private void setPatientInvoicesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblOPDInvoices.getColumnCount(); i++) {
            column = tblOPDInvoices.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(80);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void invoiceDetail(String invoiceNo) {
        listInvoiceDetail = ctlManageAdmServices.selectInvoiceDetail(invoiceNo);
        tblInvoiceDetail.setModel(new PatientInvoiceDetailTableModel(listInvoiceDetail));
        ListSelectionModel selectionModel = tblInvoiceDetail.getSelectionModel();
        tblInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setinvoiceDetailColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblInvoiceDetail);
    }

    private void setinvoiceDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblInvoiceDetail.getColumnCount(); i++) {
            column = tblInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(220);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void setPatientDemography() {
        
        listPatientAdmissions = ctlManageAdmServices.selectPatientAdmissions(patientId);
        objManageAdmServices = listPatientAdmissions.get(tblAdmissionList.getSelectedRow());
        txtPatientId.setText(patientId.substring(3));
        txtPatName.setText(objManageAdmServices.getFullName());
        txtAgeGender.setText(objManageAdmServices.getAge()
                + " \\ " + objManageAdmServices.getGenderDesc());
        txtAdmissionNumber.setText(objManageAdmServices.getAdmissionNo());
        txtWard.setText(objManageAdmServices.getWardDesc());
        txtBed.setText(objManageAdmServices.getBedDesc());
        txtClient.setText(objManageAdmServices.getClientDesc());
        txtPrimaryPhy.setText(objManageAdmServices.getPrimaryPhysicianName());
        txtDiagnosis.setText(objManageAdmServices.getDiagnosisRemarks());
        
    }
}
