/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mtms;

/**
 *
 * @author user
 */

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class MainJFrame extends javax.swing.JFrame {

    static Connection conn; 
    static Statement st; 
    static boolean IsConnected;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbxType = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbxInfo = new javax.swing.JTextArea();
        tbxConnectionString = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbxPeople = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        cbxRep = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbxDetail = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MTMS Database Connection");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("MainFrame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Type"));
        jPanel1.setToolTipText("");

        cbxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No type" }));
        cbxType.setName("cbxTypes"); // NOI18N
        cbxType.setOpaque(false);
        cbxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTypeActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBar(null);

        tbxInfo.setColumns(20);
        tbxInfo.setRows(5);
        jScrollPane1.setViewportView(tbxInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(cbxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        tbxConnectionString.setEditable(false);
        tbxConnectionString.setForeground(new java.awt.Color(102, 102, 102));
        tbxConnectionString.setText("jdbc:mysql://localhost:3306/MTMS?user=root&password=mysql");
        tbxConnectionString.setToolTipText("");

        btnEdit.setText("Edit");
        btnEdit.setToolTipText("");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblError.setText("Not connected.");
        lblError.setToolTipText("");
        lblError.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jScrollPane3.setHorizontalScrollBar(null);

        tbxPeople.setColumns(20);
        tbxPeople.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        tbxPeople.setRows(5);
        jScrollPane3.setViewportView(tbxPeople);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Reports"));

        cbxRep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No report" }));
        cbxRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRepActionPerformed(evt);
            }
        });

        tbxDetail.setColumns(20);
        tbxDetail.setRows(5);
        jScrollPane2.setViewportView(tbxDetail);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbxRep, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cbxRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbxConnectionString, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbxConnectionString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError)
                .addContainerGap())
        );

        lblError.getAccessibleContext().setAccessibleName("ErrMsg");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ConnectRoles(String sql)
    {
        IsConnected = false;
        conn = getConnection(); 
        try {  
            st = (Statement) conn.createStatement();
            lblError.setText("Database connection successful..");
            
            cbxType.removeAllItems();
            cbxType.addItem("Not selected");
              
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()) { 
                String type_name=rs.getString("Type");
                cbxType.addItem(type_name);
            }  
            conn.close();
            cbxType.setSelectedIndex(0);
            IsConnected = true;
        } catch (SQLException e) {  
            lblError.setText("Cannot connect to database.");
            IsConnected = false;
        }  
    }
    
    public String ConnectPeople(String sql)
    {
        IsConnected = false;
        conn = getConnection(); 
        String info = "";
        try {  
            st = (Statement) conn.createStatement();
            lblError.setText("Database connection successful..");
    
            ResultSet rs = st.executeQuery(sql); 
            info = "PID   Password  Name                Birthdate  Type    \r\n";
            while (rs.next()) {         
                String temp=rs.getString("PID");
                info+=temp;info+=" ";
                temp=rs.getString("Pwd");
                info+=String.format("%-10s", temp);
                temp=rs.getString("Name");
                info+=String.format("%-20s", temp);
                temp=rs.getDate("Birthdate").toString();
                info+=String.format("%-11s", temp);
                temp=rs.getString("Type");
                info+=String.format("%-8s", temp);
                info+="\r\n";      
            }  
            conn.close();
            cbxType.setSelectedIndex(0);
            IsConnected = true;
        } catch (SQLException e) {  
            lblError.setText("Cannot connect to database.");
            info="Cannot connect to database.";
            IsConnected = false;
        } 
        return info;
    }
    
    public void ConnectReports(String sql)
    { 
        IsConnected = false;
        conn = getConnection(); 
        try {  
            st = (Statement) conn.createStatement();
            lblError.setText("Database connection successful..");
            
            cbxRep.removeAllItems();
            cbxRep.addItem("Not selected");
              
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()) { 
                String RID=rs.getString("RID");
                cbxRep.addItem(RID);
            }  
            conn.close();
            cbxRep.setSelectedIndex(0);
            IsConnected = true;
        } catch (SQLException e) {  
            lblError.setText("Cannot connect to database.");
            IsConnected = false;
        }  
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ConnectRoles("select * from Roles");
        tbxPeople.setText(ConnectPeople("select * from People order by PID"));
        ConnectReports("select * from Reports order by RID");
    }//GEN-LAST:event_formWindowOpened

    private void cbxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTypeActionPerformed
        // TODO add your handling code here:
        if (!IsConnected) {return;}
        if (cbxType.getSelectedIndex()==0) {
            tbxInfo.setText("");
            return;
        }
        conn = getConnection(); 
        try {  
            String sql = "select * from Roles where Type = '"; 
            sql+=cbxType.getSelectedItem().toString();
            sql+="'";
            st = (Statement) conn.createStatement();
            
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()) { 
                String info="Your are a ";
                info+=rs.getString("Type").toLowerCase();
                info+=".\r\nYou can ";
                if(rs.getInt("CanSeeIntro")!=0)
                {info+="\r\n  ->see the introduction";}
                if(rs.getInt("CanSeeOwn")!=0)
                {info+=";\r\n  ->see your own test results";}
                if(rs.getInt("CanSeeAll")!=0)
                {info+=";\r\n  ->see all the test results";}
                if(rs.getInt("CanRequest")!=0)
                {info+=";\r\n  ->request a test";}
                if(rs.getInt("CanFillBlank")!=0)
                {info+=";\r\n  ->fill in the results";}
                if(rs.getInt("CanChange")!=0)
                {info+=";\r\n  ->edit a report";}
                info+=".\r\n";
                tbxInfo.setText(info);
            }  
            conn.close();
        } catch (SQLException e) {  
            lblError.setText("Connection lost.");
            tbxInfo.setText(e.getMessage());
            IsConnected = false;
        } 
        
    }//GEN-LAST:event_cbxTypeActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(!tbxConnectionString.isEditable()){
            tbxConnectionString.setEditable(true);
            btnEdit.setText("Use");
        }
        else{
            tbxConnectionString.setEditable(false);
            btnEdit.setText("Edit");
            ConnectRoles("select * from Roles");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cbxRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRepActionPerformed
        // TODO add your handling code here:
        if (!IsConnected) {return;}
        if (cbxRep.getSelectedIndex()==0) {
            tbxDetail.setText("");
            return;
        }
        conn = getConnection(); 
        try {  
            String sql = "select * from Reports where RID = '"; 
            sql+=cbxRep.getSelectedItem().toString();
            sql+="'";
            st = (Statement) conn.createStatement();
            
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()) { 
                String info="Report detail:\r\n";
                info +="\r\nRID:\t\t"+rs.getString("RID");
                info +="\r\nReport type:\t\t"+rs.getString("ReportType");
                info +="\r\nRequest date:\t\t"+rs.getDate("RequestDate").toString();
                info +="\r\nStatus:\t\t"+rs.getString("Status");
                info +="\r\nRequested by:\t\t"+rs.getString("RequestedBy");
                info +="\r\nLast changed by:\t"+rs.getString("LastChangedBy");
                info +="\r\nDetail:\t\t"+rs.getString("Detail")+"\r\n";  
                tbxDetail.setText(info);
            }  
            conn.close();
        } catch (SQLException e) {  
            lblError.setText("Connection lost.");
            tbxDetail.setText(e.getMessage());
            IsConnected = false;
        } 
    }//GEN-LAST:event_cbxRepActionPerformed

    public Connection getConnection() {  
        Connection con = null;  
        try {  
            Class.forName("com.mysql.jdbc.Driver");
              
            if(tbxConnectionString.getText()=="")
            {
                con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/MTMS?user=root&password=mysql");
            }
            else
            {
                con = DriverManager.getConnection( tbxConnectionString.getText());
            }
              
        } catch (Exception e) {  
            System.out.println("Connection failed" + e.getMessage());  
        }  
        return con; 
    }  
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox cbxRep;
    private javax.swing.JComboBox cbxType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField tbxConnectionString;
    private javax.swing.JTextArea tbxDetail;
    private javax.swing.JTextArea tbxInfo;
    private javax.swing.JTextArea tbxPeople;
    // End of variables declaration//GEN-END:variables
}