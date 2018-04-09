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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;

/**
 *
 * @author joelv
 */
public class Principal extends javax.swing.JFrame {
    Archivo a = new Archivo();
 
    public Principal() {
        initComponents();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDescripcion = new javax.swing.JTextPane();
        jLDescripcion = new javax.swing.JLabel();
        jLRelaciontext = new javax.swing.JLabel();
        jCBEditar = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLRelaciontext1 = new javax.swing.JLabel();
        jLRelacion1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        jExplorar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1280, 10));

        jLRelacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion.setText("Relación");
        jExplorar.add(jLRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTDescripcion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTDescripcion.setText("Este es un ejemplo de la descripcion que sera presente siempre que se cargue un archivo ");
        jTDescripcion.setEnabled(false);
        jScrollPane2.setViewportView(jTDescripcion);

        jExplorar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 890, 80));

        jLDescripcion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLDescripcion.setForeground(new java.awt.Color(0, 0, 153));
        jLDescripcion.setText("Descripción");
        jExplorar.add(jLDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLRelaciontext.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLRelaciontext.setText("Ninguna");
        jExplorar.add(jLRelaciontext, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jCBEditar.setBackground(new java.awt.Color(255, 255, 255));
        jCBEditar.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
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
        jExplorar.add(jCBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, -1, -1));

        jList1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jScrollPane3.setViewportView(jList1);

        jExplorar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 250, 320));

        jLRelaciontext1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jExplorar.add(jLRelaciontext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, -1, -1));

        jLRelacion1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion1.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion1.setText("Atributos");
        jExplorar.add(jLRelacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, -1, -1));

        jTab.addTab("Explorar", jExplorar);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1285, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        jTab.addTab("Analisis", jPanel1);

        jPanel.add(jTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 700));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        jMSalir.setBackground(new java.awt.Color(102, 102, 102));
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
            try {
              relacion = a.abrirArchivo(archivo);
              agregarAVentana(relacion);
            } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_jMAbrirActionPerformed

    public void agregarAVentana(Relacion r){
        this.jLRelaciontext.setText(r.getRelacion());
        this.jTDatos.setModel(r.getDatos());
        //this.jTDatos.addRow();
    }
    
    private void jMGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMGuardarActionPerformed

    private void jMGuardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarcomoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMGuardarcomoActionPerformed

    private void jCBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEditarActionPerformed

    private void jCBEditarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCBEditarStateChanged
        if(this.jCBEditar.isSelected()){
            this.jTDatos.setEnabled(true);
            this.jTDescripcion.setEnabled(true);
        }else{
            this.jTDatos.setEnabled(false);
            this.jTDescripcion.setEnabled(false);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCBEditar;
    private javax.swing.JPanel jExplorar;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLRelacion;
    private javax.swing.JLabel jLRelacion1;
    private javax.swing.JLabel jLRelaciontext;
    private javax.swing.JLabel jLRelaciontext1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuItem jMAbrir;
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenuItem jMGuardar;
    private javax.swing.JMenuItem jMGuardarcomo;
    private javax.swing.JMenuBar jMSalir;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextPane jTDescripcion;
    private javax.swing.JTabbedPane jTab;
    // End of variables declaration//GEN-END:variables

}
