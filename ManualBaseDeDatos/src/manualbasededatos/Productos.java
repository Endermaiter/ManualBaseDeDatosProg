package manualbasededatos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DefaultTableModel modelo;
    public Productos() {
        initComponents();
        mostrarDatosTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        txtConsulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botonConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Precio");

        jLabel2.setText("Nombre:");

        jLabel1.setText("ID:");

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precios"
            }
        ));
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        jLabel4.setText("Buscar(ID):");

        botonConsulta.setText("Consultar");
        botonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(botonInsertar)
                .addGap(140, 140, 140)
                .addComponent(botonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(botonEliminar)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtNombre)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonConsulta)
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(botonConsulta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        Connection con = null;
            try{
            
            //conexion base de datos    
            
            con = Conexion.establecerConexionBD();
            
            int fila = tablaDatos.getSelectedRow();
            String codigo = tablaDatos.getValueAt(fila, 0).toString();
            
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM articulos WHERE ID=?");
            ps.setString(1,codigo);
            ps.setInt(1,Integer.valueOf(txtConsulta.getText()));
            ps.execute();
            
            //tabla
            
            modelo = (DefaultTableModel) tablaDatos.getModel();
            modelo.removeRow(fila);
            
            JOptionPane.showMessageDialog(null,"¡Producto Eliminado!");
            limpiarCajas();
            con.close();
            }catch(SQLException e){
                System.out.println(e);
         }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Connection con = null;
            try{
            
            //Conexion Base de Datos   
                
            con = Conexion.establecerConexionBD();
            
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO articulos(ID,Nombre,Precio) VALUES(?,?,?)");
            ps.setInt(1,Integer.valueOf(txtID.getText()));
            ps.setString(2, txtNombre.getText());
            ps.setFloat(3, Float.valueOf(txtPrecio.getText()));
            ps.execute();
            
            //tabla
            
            modelo = (DefaultTableModel) tablaDatos.getModel();
            JOptionPane.showMessageDialog(null,"¡Producto Registrado!");
            Object[]fila = new Object[3];
            fila[0] = txtID.getText();
            fila[1] = txtNombre.getText();
            fila[2] = txtPrecio.getText();
            modelo.addRow(fila);
            
            limpiarCajas();
            con.close();
            }catch(SQLException e){
                System.out.println(e);
         }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Connection con = null;
            try{
            
            //Base de Datos    
            
            con = Conexion.establecerConexionBD();
            ps = (PreparedStatement) con.prepareStatement("UPDATE articulos SET ID=?,Nombre=?,Precio=? WHERE ID=?");
            ps.setInt(1,Integer.valueOf(txtID.getText()));
            ps.setString(2, txtNombre.getText());
            ps.setFloat(3, Float.valueOf(txtPrecio.getText()));
            ps.setFloat(4, Integer.valueOf(txtID.getText()));
            ps.executeUpdate();
            
            //tabla
            
            int fila = tablaDatos.getSelectedRow();
            tablaDatos.setValueAt(txtID.getText(), fila, 0);
            tablaDatos.setValueAt(txtNombre.getText(), fila, 1);
            tablaDatos.setValueAt(txtPrecio.getText(), fila, 2);
            
            JOptionPane.showMessageDialog(null,"¡Producto Modificado!");
            limpiarCajas();
            con.close();
            }catch(SQLException e){
                System.out.println(e);
         }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaActionPerformed
        Connection con = null;
        try{
            
            //base de datos
            
            con = Conexion.establecerConexionBD();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM articulos WHERE ID = ?");
            ps.setInt(1,Integer.valueOf(txtConsulta.getText()));
            rs = ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "¡Producto Econtrado!");
                txtID.setText(rs.getString("ID"));
                txtNombre.setText(rs.getString("Nombre"));
                txtPrecio.setText(rs.getString("Precio"));
                
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado ningun Prodcuto con ese ID. Inténtelo de nuevo.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_botonConsultaActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        
        //metodo para colocar los datos en las cajas de texto al clicar en una fila de la tabla
        
        Connection con = null;
        try{
            con = Conexion.establecerConexionBD();
            int fila = tablaDatos.getSelectedRow();
            String codigo = tablaDatos.getValueAt(fila, 0).toString();
            ps = (PreparedStatement) con.prepareStatement("SELECT ID,Nombre,Precio FROM articulos WHERE ID=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtID.setText(rs.getString("ID"));
                txtNombre.setText(rs.getString("Nombre"));
                txtPrecio.setText(rs.getString("Precio"));
                txtConsulta.setText(rs.getString("ID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tablaDatosMouseClicked

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsulta;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

private void limpiarCajas(){
    
    //metodo para limpiar las cajas de texto
    
    txtID.setText("");
    txtNombre.setText("");
    txtPrecio.setText("");
    txtConsulta.setText("");
}

private void mostrarDatosTabla(){
    
    //método que muestra la tabla de la base de datos al abrir la aplicacion
    
    Connection con = null;
        try{
            DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
            tablaDatos.setModel(modelo);
            for(int i =0;i < tablaDatos.getRowCount();i++){
                modelo.removeRow(i);
            }
            con = Conexion.establecerConexionBD();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM articulos");
            
            
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColl = rsMd.getColumnCount();
            while(rs.next()){
                Object rowDatos[] = new Object[cantidadColl];
                for(int i=0;i<cantidadColl;i++){
                    rowDatos[i]= rs.getString(i+1);
                }
                modelo.addRow(rowDatos);
            }
    }catch(SQLException ex){
        System.out.println(ex);
    }
    
}
}
