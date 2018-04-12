/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mineriadatos;

import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joelv
 */
public class Principal extends javax.swing.JFrame {
    Archivo a = new Archivo();
    String ruta = new String();
    Relacion relacionActual = null;
 
    public Principal() {
        initComponents();
        // aldo was here
        //aldo was here for the second time
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jTab = new javax.swing.JTabbedPane();
        jExplorar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLRelacion = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jCBEditar = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLstAtributos = new javax.swing.JList<>();
        jLRelaciontext1 = new javax.swing.JLabel();
        jLRelacion1 = new javax.swing.JLabel();
        jTRelacionText = new javax.swing.JTextField();
        jLCantidadAtributos = new javax.swing.JLabel();
        jLCantidadInstancias = new javax.swing.JLabel();
        jBEditAtributos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTDescripcion = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPUnivariable = new javax.swing.JPanel();
        jPBivariable = new javax.swing.JPanel();
        jMSalir = new javax.swing.JMenuBar();
        jMArchivo = new javax.swing.JMenu();
        jMAbrir = new javax.swing.JMenuItem();
        jMGuardar = new javax.swing.JMenuItem();
        jMGuardarcomo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTab.setBackground(new java.awt.Color(204, 204, 204));
        jTab.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        jExplorar.setBackground(new java.awt.Color(255, 255, 255));
        jExplorar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTDatos.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jTDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTDatos.setEnabled(false);
        jScrollPane1.setViewportView(jTDatos);

        jExplorar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 970, 430));
        jExplorar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1280, 10));

        jLRelacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion.setText("Relación");
        jExplorar.add(jLRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLDescripcion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLDescripcion.setForeground(new java.awt.Color(0, 0, 153));
        jLDescripcion.setText("Descripción");
        jExplorar.add(jLDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jCBEditar.setBackground(new java.awt.Color(255, 255, 255));
        jCBEditar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jCBEditar.setText("Editar");
        jCBEditar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCBEditarStateChanged(evt);
            }
        });
        jCBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEditarActionPerformed(evt);
            }
        });
        jExplorar.add(jCBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, -1, -1));

        jLstAtributos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jLstAtributos);

        jExplorar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 250, 320));

        jLRelaciontext1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jExplorar.add(jLRelaciontext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, -1, -1));

        jLRelacion1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion1.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion1.setText("Atributos");
        jExplorar.add(jLRelacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, -1, -1));

        jTRelacionText.setEditable(false);
        jTRelacionText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTRelacionText.setText("Ninguna");
        jExplorar.add(jTRelacionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 740, -1));

        jLCantidadAtributos.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLCantidadAtributos.setText("Cantidad de atributos:");
        jExplorar.add(jLCantidadAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, -1));

        jLCantidadInstancias.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLCantidadInstancias.setText("Cantidad de instancias:");
        jExplorar.add(jLCantidadInstancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 570, -1, -1));

        jBEditAtributos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jBEditAtributos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Edit Property_40px.png"))); // NOI18N
        jBEditAtributos.setActionCommand("Editar  atributos");
        jBEditAtributos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jExplorar.add(jBEditAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 40, 50, 50));

        jLabel1.setText("Editar atributos");
        jExplorar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 100, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jExplorar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, -20, 10, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Edit_40px.png"))); // NOI18N
        jExplorar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, -1, -1));

        jTDescripcion.setColumns(20);
        jTDescripcion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTDescripcion.setRows(20);
        jTDescripcion.setText("No se ha cargado archivo...");
        jTDescripcion.setToolTipText("");
        jScrollPane4.setViewportView(jTDescripcion);

        jExplorar.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 910, 100));

        jTab.addTab("Explorar", jExplorar);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPUnivariableLayout = new javax.swing.GroupLayout(jPUnivariable);
        jPUnivariable.setLayout(jPUnivariableLayout);
        jPUnivariableLayout.setHorizontalGroup(
            jPUnivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPUnivariableLayout.setVerticalGroup(
            jPUnivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Univariable", jPUnivariable);

        javax.swing.GroupLayout jPBivariableLayout = new javax.swing.GroupLayout(jPBivariable);
        jPBivariable.setLayout(jPBivariableLayout);
        jPBivariableLayout.setHorizontalGroup(
            jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPBivariableLayout.setVerticalGroup(
            jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bivariable", jPBivariable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        jTab.addTab("Analisis", jPanel1);

        jPanel.add(jTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 700));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        jMSalir.setBackground(new java.awt.Color(0, 153, 153));
        jMSalir.setFont(new java.awt.Font("lcmssb8", 0, 15)); // NOI18N

        jMArchivo.setForeground(new java.awt.Color(255, 255, 255));
        jMArchivo.setText("Archivo");
        jMArchivo.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMArchivo.setName(""); // NOI18N

        jMAbrir.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jMAbrir.setText("Abrir");
        jMAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAbrirActionPerformed(evt);
            }
        });
        jMArchivo.add(jMAbrir);

        jMGuardar.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jMGuardar.setText("Guardar");
        jMGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGuardarActionPerformed(evt);
            }
        });
        jMArchivo.add(jMGuardar);

        jMGuardarcomo.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jMGuardarcomo.setText("Guardar como");
        jMGuardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGuardarcomoActionPerformed(evt);
            }
        });
        jMArchivo.add(jMGuardarcomo);

        jMSalir.add(jMArchivo);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jMenu4.setLabel("Salir");
        jMSalir.add(jMenu4);

        setJMenuBar(jMSalir);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAbrirActionPerformed
        JFileChooser fc=new JFileChooser();
        int seleccion=fc.showOpenDialog(this);
        Relacion relacion = new Relacion();
        if(seleccion==JFileChooser.APPROVE_OPTION){
            File archivo = fc.getSelectedFile();
            ruta = archivo.getPath();
            try {
              relacion = a.abrirArchivo(archivo);
              agregarAVentana(relacion);
              marcarError(2,2);
              //a.evaluaExpRegular(relacion);
            } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_jMAbrirActionPerformed

    public void agregarAVentana(Relacion r){
        relacionActual = r;
        
        Atributo[] listaAtributos = r.getAtributos();
        String[] listaAtributosN = new String[listaAtributos.length];
        
        this.jTDescripcion.setText(r.descripcionToString());
        this.jTRelacionText.setText(r.getRelacion());
        this.jTDatos.setModel(r.getDatos());
        for(int i = 0 ; i<listaAtributos.length ; i++){
            String nombre = listaAtributos[i].getNombre();
            String tipo = listaAtributos[i].getTipo();
            listaAtributosN[i] = nombre + " - " + tipo;
        }
        this.jLstAtributos.setListData(listaAtributosN);
        this.jLCantidadAtributos.setText("Cantidad de atributos: " + r.getAtributos().length);
        this.jLCantidadInstancias.setText("Cantidad de Instancias: " + r.getDatos().getRowCount());
        //this.jTDatos.addRow();
    }
    
    private void jMGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarActionPerformed
        relacionActual.clear();
        relacionActual.setRelacion(this.jTRelacionText.getText());
        relacionActual.setDescripcion(this.jTDescripcion.getText().split("\n"));
        relacionActual.setDatos((DefaultTableModel) this.jTDatos.getModel());
        a.guardar(relacionActual, ruta);
    }//GEN-LAST:event_jMGuardarActionPerformed

    private void jMGuardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarcomoActionPerformed
        String auxRuta = new String();
        JFileChooser fc=new JFileChooser();
        int seleccion=fc.showSaveDialog(this);
        if(JFileChooser.APPROVE_OPTION == seleccion){
            File f = fc.getSelectedFile();
            auxRuta = f.getPath()+".txt";
       
            relacionActual.clear();
            relacionActual.setRelacion(this.jTRelacionText.getText());
            relacionActual.setDescripcion(this.jTDescripcion.getText());
            relacionActual.setDatos((DefaultTableModel) this.jTDatos.getModel());
            a.guardarComo(relacionActual, auxRuta);
        }
    }//GEN-LAST:event_jMGuardarcomoActionPerformed

    private void jCBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEditarActionPerformed

    private void jCBEditarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCBEditarStateChanged
        if(this.jCBEditar.isSelected()){
            this.jTDatos.setEnabled(true);
            this.jTDescripcion.setEditable(true);
            this.jTRelacionText.setEditable(true);
        }else{
            this.jTDatos.setEnabled(false);
            this.jTDescripcion.setEditable(false);
            this.jTRelacionText.setEditable(false);
        }
        
    }//GEN-LAST:event_jCBEditarStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void marcarError(int f, int c){
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditAtributos;
    private javax.swing.JCheckBox jCBEditar;
    private javax.swing.JPanel jExplorar;
    private javax.swing.JLabel jLCantidadAtributos;
    private javax.swing.JLabel jLCantidadInstancias;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLRelacion;
    private javax.swing.JLabel jLRelacion1;
    private javax.swing.JLabel jLRelaciontext1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jLstAtributos;
    private javax.swing.JMenuItem jMAbrir;
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenuItem jMGuardar;
    private javax.swing.JMenuItem jMGuardarcomo;
    private javax.swing.JMenuBar jMSalir;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPBivariable;
    private javax.swing.JPanel jPUnivariable;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextArea jTDescripcion;
    private javax.swing.JTextField jTRelacionText;
    private javax.swing.JTabbedPane jTab;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
