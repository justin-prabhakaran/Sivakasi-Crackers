/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sivakasicrackers;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author justin
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    javax.swing.JFrame obj;
    AdminPage(javax.swing.JFrame obj){
        this.obj = obj;
        initComponents();
        updatetable();
    }
    public AdminPage() {
        initComponents();
        updatetable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuatity = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S.No", "Name", "Price", "Quantity"
            }
        ));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Name");

        jLabel3.setText("Price");

        jLabel4.setText("Quantity");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtPrice)
                                    .addComponent(txtQuatity, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jButton1)
                                .addGap(62, 62, 62)
                                .addComponent(jButton2)
                                .addGap(57, 57, 57)
                                .addComponent(jButton3)
                                .addGap(67, 67, 67)
                                .addComponent(jButton4)))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtQuatity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set up the database connection parameters
            String url = "jdbc:mysql://localhost:3306/crackersdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "justin";
            String password = "justinpassword";
            // Connect to the database
            
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to the database!");
            // Do something with the database connection here...

            String qry = "INSERT INTO CRACKERS_TABLE(NAME,PRICE,QUANTITY) VALUES (?,?,?)";
            PreparedStatement ps =connection.prepareStatement(qry);
            
            ps.setString(1,txtName.getText());
            ps.setInt(2,Integer.parseInt(txtPrice.getText()));
            ps.setInt(3,Integer.parseInt(txtQuatity.getText()));
            
            ps.execute();
            // Close the database connection
            connection.close();
            System.out.println("Disconnected from the database.");
            updatetable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.setVisible(false);
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set up the database connection parameters
            String url = "jdbc:mysql://localhost:3306/crackersdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "justin";
            String password = "justinpassword";
            // Connect to the database
            
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to the database!");

            // Do something with the database connection here...
            Statement statement = connection.createStatement();
            
            int sno = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
            String name = txtName.getText();
            int price = Integer.parseInt(txtPrice.getText());
            int quantity = Integer.parseInt(txtQuatity.getText());
            String qry = "UPDATE CRACKERS_TABLE SET NAME = ?,PRICE =? ,QUANTITY = ? WHERE SNO = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(qry);
            
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,price);
            preparedStatement.setInt(3,quantity);
            preparedStatement.setInt(4,sno);
  
            preparedStatement.execute();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM CRACKERS_TABLE");
//            while(resultSet.next()){
//                int sno = resultSet.getInt("SNO");
//                String name = resultSet.getString("NAME");
//                int price = resultSet.getInt("PRICE");
//                int quantity = resultSet.getInt("QUANTITY");
//                
//            }
            // Close the database connection
            connection.close();
            System.out.println("Disconnected from the database.");
            updatetable();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
        int row = jTable1.getSelectedRow();
        String name = jTable1.getValueAt(row,1).toString();
        String price = jTable1.getValueAt(row,2).toString();
        String quantity = jTable1.getValueAt(row,3).toString();
        txtName.setText(name);
        txtPrice.setText(price);
        txtQuatity.setText(quantity);
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set up the database connection parameters
            String url = "jdbc:mysql://localhost:3306/crackersdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "justin";
            String password = "justinpassword";
            // Connect to the database
            
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to the database!");

            // Do something with the database connection here...
            Statement statement = connection.createStatement();
            
            int sno = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
            String qry = "DELETE FROM CRACKERS_TABLE WHERE SNO = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(qry);
        
            preparedStatement.setInt(1,sno);

            preparedStatement.execute();
            txtName.setText("");
            txtPrice.setText("");
            txtQuatity.setText("");
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM CRACKERS_TABLE");
//            while(resultSet.next()){
//                int sno = resultSet.getInt("SNO");
//                String name = resultSet.getString("NAME");
//                int price = resultSet.getInt("PRICE");
//                int quantity = resultSet.getInt("QUANTITY");
//                
//            }
            // Close the database connection
            connection.close();
            System.out.println("Disconnected from the database.");
            updatetable();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }
    
    final void updatetable(){
          try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set up the database connection parameters
            String url = "jdbc:mysql://localhost:3306/crackersdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "justin";
            String password = "justinpassword";
            // Connect to the database
            
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to the database!");

            // Do something with the database connection here...
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CRACKERS_TABLE");
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0);
            while(resultSet.next()){
                int sno = resultSet.getInt("SNO");
                String name = resultSet.getString("NAME");
                int price = resultSet.getInt("PRICE");
                int quantity = resultSet.getInt("QUANTITY");
                
                String data[] = {String.valueOf(sno),name,String.valueOf(price),String.valueOf(quantity)};
                
                ;
                tableModel.addRow(data);
            }
            // Close the database connection
            connection.close();
            System.out.println("Disconnected from the database.");
        } catch (Exception e) {
              System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuatity;
    // End of variables declaration//GEN-END:variables
}
