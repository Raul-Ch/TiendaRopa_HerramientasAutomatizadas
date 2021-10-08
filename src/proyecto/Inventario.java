/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.inventariosBL.InventarioBL;
import proyecto.inventariosDAL.Conexion;

/**
 *
 * @author raulr
 */
public class Inventario extends javax.swing.JFrame {
    
     Calendar fecha_actual=new GregorianCalendar();
    
    DefaultTableModel modelo;
    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();
        //fecha
        jdFecha_actual.setCalendar(fecha_actual);
        
        modelo=new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Categoría");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("fecha");
        this.tblInventario.setModel(modelo);
        this.mostrarDatos();
        this.limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        Text_Codigo = new javax.swing.JLabel();
        Text_Categoria = new javax.swing.JLabel();
        Text_Precio = new javax.swing.JLabel();
        Text_Stock = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btneliminartodo = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        txtcodigo = new javax.swing.JTextField();
        txtcategoria = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        txtfecha = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jdFecha_actual = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 60)); // NOI18N
        jLabel2.setText("Inventario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        tblInventario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Categoría", "Precio", "Stock"
            }
        ));
        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 580, 190));

        Text_Codigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        Text_Codigo.setText("Código:");
        getContentPane().add(Text_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        Text_Categoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        Text_Categoria.setText("Categoría:");
        getContentPane().add(Text_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        Text_Precio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        Text_Precio.setText("Precio:");
        getContentPane().add(Text_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        Text_Stock.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        Text_Stock.setText("Stock:");
        getContentPane().add(Text_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        btnnuevo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/clean (1).png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.setToolTipText("Limpia los campos de texto para ingresar nuevos datos.");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 180, -1));

        btnguardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/add (1).png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setToolTipText("Guarda en la tabla los datos (previamente) ingresados en la parte izq. de la pantalla");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 150, -1));
        btnguardar.getAccessibleContext().setAccessibleDescription("Este botón guarda en la tabla los datos ingresados en la parte izq. de la pantalla");

        btneliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/remove (1).png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setToolTipText("Elimina la fila seleccionada (prviamente con el mouse) de la tabla");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 150, -1));

        btneliminartodo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btneliminartodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/remove (1).png"))); // NOI18N
        btneliminartodo.setText("Eliminar todo");
        btneliminartodo.setToolTipText("Elimina todos los datos almacenados en la tabla");
        btneliminartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminartodoActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 180, -1));

        btnmodificar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/edit (1).png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setToolTipText("Permite modificar los datos ingresados (prviamente) en la parte derecha de la pantalla.");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 150, -1));

        txtcodigo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 40));

        txtcategoria.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txtcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, 40));

        txtprecio.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 40));

        txtstock.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 120, 40));

        txtfecha.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/FondoSinTransparencia.png"))); // NOI18N
        Background.setText("fecha");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 890, 540));

        jdFecha_actual.setBackground(new java.awt.Color(135, 133, 207));
        jdFecha_actual.setForeground(new java.awt.Color(135, 133, 207));
        jdFecha_actual.setDateFormatString("dd-MMM-yy");
        jdFecha_actual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        getContentPane().add(jdFecha_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 150, 40));

        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ventas");
        jMenu2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Salir");
        jMenu4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Menu menu=new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Ventas ventas=new Ventas();
        ventas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void txtcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategoriaActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
       Conexion conexion = new Conexion();
       InventarioBL inventInsert = recuperarDatosGUI();
       String strSentenciaInsert=String.format("INSERT INTO inventario (codigo, categoria, precio, stock) "
               + "VALUES('%d', '%s', '%d', '%d')", inventInsert.getCodigo(),
               inventInsert.getCategoria(),inventInsert.getPrecio(),inventInsert.getStock());
       
       conexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
              this.limpiar();
       
       
       /* String []info=new String[4];
        info[0]=txtcodigo.getText();
        info[1]=txtcategoria.getText();
        info[2]=txtprecio.getText();
        info[3]=txtstock.getText();
        modelo.addRow(info);*/
    }//GEN-LAST:event_btnguardarActionPerformed

    
    public void mostrarDatos(){
        /*   modelo.addColumn("Codigo");
        modelo.addColumn("Categoría");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("fecha");*/
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        Conexion conexion = new Conexion();
         try {
            ResultSet resultado=conexion.consultarRegistros("SELECT * FROM inventario");
            while (resultado.next()) {                
                System.out.println(resultado.getString("codigo"));
                System.out.println(resultado.getString("categoria"));
                System.out.println(resultado.getString("precio"));
                System.out.println(resultado.getString("stock"));
                System.out.println(resultado.getString("fecha"));
                Object[] oInventario={resultado.getString("codigo"),resultado.getString("categoria"),
                resultado.getString("precio"),resultado.getString("stock"),resultado.getString("fecha")};
                modelo.addRow(oInventario);
            }
        } catch (Exception e) {
            System.out.println("Hay un error"+e);
        }
        
        
        
    }
    public InventarioBL recuperarDatosGUI(){
        InventarioBL invent = new InventarioBL();
        
        int ID=(txtcodigo.getText().isEmpty())?0: Integer.parseInt(txtcodigo.getText());
        int pre=(txtprecio.getText().isEmpty())?0:Integer.parseInt(txtprecio.getText());
        int sto=(txtstock.getText().isEmpty())?0:Integer.parseInt(txtstock.getText());
        invent.setCodigo(ID);
        invent.setCategoria(txtcategoria.getText());
        invent.setPrecio(pre);
        invent.setStock(sto);
        
        return invent;
        
  
    }
    private void btneliminartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminartodoActionPerformed
       /* int fila=tblInventario.getRowCount();
        for(int i=fila-1; i>=0; i--){
            modelo.removeRow(i);
        }*/
       
        Conexion conexion = new Conexion();
       InventarioBL inventInsert = recuperarDatosGUI();
       String strSentenciaDeleteAll=String.format("DELETE FROM inventario");
       
       conexion.ejecutarSentenciaSQL(strSentenciaDeleteAll);
       this.mostrarDatos();
             this.limpiar();
       
       
    }//GEN-LAST:event_btneliminartodoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
/*       int fila=tblInventario.getSelectedRow();
       if(fila>=0){
           modelo.removeRow(fila);
       }*/
 Conexion conexion = new Conexion();
       InventarioBL inventInsert = recuperarDatosGUI();
       String strSentenciaDelete=String.format("DELETE FROM inventario WHERE codigo =%d", inventInsert.getCodigo());
       
       conexion.ejecutarSentenciaSQL(strSentenciaDelete);
       this.mostrarDatos();
             this.limpiar();

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
       /* int fila=Integer.parseInt(txtfila.getText ());
        int columna=Integer.parseInt(txtcolumna.getText ());
        modelo.setValueAt(txtnuevodato.getText(),fila,columna);*/
       
       Conexion conexion = new Conexion();
       InventarioBL inventInsert = recuperarDatosGUI();
       String strSentenciaUpdate=String.format("UPDATE inventario SET categoria='%s', precio='%d', stock='%d' WHERE codigo='%d'",inventInsert.getCategoria(),inventInsert.getPrecio(),
               inventInsert.getStock(), inventInsert.getCodigo());
       
       conexion.ejecutarSentenciaSQL(strSentenciaUpdate);
       this.mostrarDatos();
       this.limpiar();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed

        /*txtcodigo.setText("");
        txtcategoria.setText("");
        txtstock.setText("");
        txtprecio.setText("");
        txtfila.setText("");
        txtcolumna.setText("");
        txtnuevodato.setText("");*/
        
        this.limpiar();
    }//GEN-LAST:event_btnnuevoActionPerformed

    public void limpiar(){
        txtcodigo.setText("");
        txtcategoria.setText("");
        txtstock.setText("");
        txtprecio.setText("");
        
        btnguardar.setEnabled(true);
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
        
        
    }
    private void tblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMouseClicked
if(evt.getClickCount()==1){
    JTable receptor =(JTable) evt.getSource();
    txtcodigo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
    txtcategoria.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
    txtprecio.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
    txtstock.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
    
}
        btnguardar.setEnabled(false);
        btnmodificar.setEnabled(true);
        btneliminar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_tblInventarioMouseClicked

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Text_Categoria;
    private javax.swing.JLabel Text_Codigo;
    private javax.swing.JLabel Text_Precio;
    private javax.swing.JLabel Text_Stock;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminartodo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFecha_actual;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JLabel txtfecha;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
