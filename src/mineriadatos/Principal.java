/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mineriadatos;

import java.awt.Color;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;

/**
 *
 * @author joelv
 */
public class Principal extends javax.swing.JFrame {
    Archivo a = new Archivo();
    String ruta = new String();
    Relacion relacionActual = null;
    int posicionAtributoEnLista = -1;
 
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
        jPrincipal = new javax.swing.JPanel();
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTDescripcion = new javax.swing.JTextArea();
        jTERAtributo = new javax.swing.JTextField();
        jTNombreAtributo = new javax.swing.JTextField();
        jLRelacion2 = new javax.swing.JLabel();
        jLRelacion3 = new javax.swing.JLabel();
        jLRelacion4 = new javax.swing.JLabel();
        jBEliminarInstancia = new javax.swing.JButton();
        jBAgregarInstancia = new javax.swing.JButton();
        jLRelacion5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPUnivariable = new javax.swing.JPanel();
        jPGrafica = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLstAtributos1 = new javax.swing.JList<>();
        jLRelacion6 = new javax.swing.JLabel();
        jLRelacion7 = new javax.swing.JLabel();
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

        jPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 910, 440));
        jPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1280, 10));

        jLRelacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion.setText("Relación");
        jPrincipal.add(jLRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLDescripcion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLDescripcion.setForeground(new java.awt.Color(0, 0, 153));
        jLDescripcion.setText("Descripción");
        jPrincipal.add(jLDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jCBEditar.setBackground(new java.awt.Color(255, 255, 255));
        jCBEditar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jCBEditar.setText("Editar todo");
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
        jPrincipal.add(jCBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 80, -1, -1));

        jLstAtributos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLstAtributos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstAtributosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jLstAtributos);

        jPrincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 250, 270));

        jLRelaciontext1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPrincipal.add(jLRelaciontext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, -1, -1));

        jLRelacion1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLRelacion1.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion1.setText("ER");
        jLRelacion1.setToolTipText("");
        jLRelacion1.setAutoscrolls(true);
        jLRelacion1.setFocusTraversalPolicyProvider(true);
        jPrincipal.add(jLRelacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, -1, -1));

        jTRelacionText.setEditable(false);
        jTRelacionText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTRelacionText.setText("Ninguna");
        jPrincipal.add(jTRelacionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 740, -1));

        jLCantidadAtributos.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLCantidadAtributos.setText("Cantidad de atributos:");
        jPrincipal.add(jLCantidadAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 620, -1, -1));

        jLCantidadInstancias.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLCantidadInstancias.setText("Cantidad de instancias:");
        jPrincipal.add(jLCantidadInstancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, -20, 30, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Edit_40px.png"))); // NOI18N
        jPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, -1, -1));

        jTDescripcion.setColumns(20);
        jTDescripcion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTDescripcion.setRows(20);
        jTDescripcion.setText("No se ha cargado archivo...");
        jTDescripcion.setToolTipText("");
        jScrollPane4.setViewportView(jTDescripcion);

        jPrincipal.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 860, 100));

        jTERAtributo.setEditable(false);
        jPrincipal.add(jTERAtributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 560, 190, -1));

        jTNombreAtributo.setEditable(false);
        jPrincipal.add(jTNombreAtributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 530, 190, -1));

        jLRelacion2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion2.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion2.setText("Atributos");
        jPrincipal.add(jLRelacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 170, -1, -1));

        jLRelacion3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLRelacion3.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion3.setText("Instancias");
        jLRelacion3.setToolTipText("");
        jLRelacion3.setAutoscrolls(true);
        jPrincipal.add(jLRelacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLRelacion4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLRelacion4.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion4.setText("Nombre");
        jLRelacion4.setToolTipText("");
        jLRelacion4.setAutoscrolls(true);
        jLRelacion4.setFocusTraversalPolicyProvider(true);
        jPrincipal.add(jLRelacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 530, -1, -1));

        jBEliminarInstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Minus_30px.png"))); // NOI18N
        jBEliminarInstancia.setEnabled(false);
        jBEliminarInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarInstanciaActionPerformed(evt);
            }
        });
        jPrincipal.add(jBEliminarInstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 40, 40));

        jBAgregarInstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Plus_30px.png"))); // NOI18N
        jBAgregarInstancia.setEnabled(false);
        jBAgregarInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarInstanciaActionPerformed(evt);
            }
        });
        jPrincipal.add(jBAgregarInstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 40, 40));

        jLRelacion5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLRelacion5.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion5.setText("Editar atributos");
        jLRelacion5.setToolTipText("");
        jLRelacion5.setAutoscrolls(true);
        jPrincipal.add(jLRelacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, -1, -1));

        jTab.addTab("Explorar", jPrincipal);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        jPUnivariable.setBackground(new java.awt.Color(255, 255, 255));
        jPUnivariable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPGraficaLayout = new javax.swing.GroupLayout(jPGrafica);
        jPGrafica.setLayout(jPGraficaLayout);
        jPGraficaLayout.setHorizontalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPGraficaLayout.setVerticalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPUnivariable.add(jPGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 550, 510));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Pie Chart_30px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPUnivariable.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 50, 50));

        jLstAtributos1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLstAtributos1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstAtributos1ValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(jLstAtributos1);

        jPUnivariable.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 270, 270));

        jLRelacion6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion6.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion6.setText("Atributos");
        jPUnivariable.add(jLRelacion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLRelacion7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLRelacion7.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion7.setText("Graficar");
        jLRelacion7.setToolTipText("");
        jLRelacion7.setAutoscrolls(true);
        jLRelacion7.setFocusTraversalPolicyProvider(true);
        jPUnivariable.add(jLRelacion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

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
            .addComponent(jTabbedPane1)
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
        this.jLstAtributos1.setListData(listaAtributosN);
        this.jLCantidadAtributos.setText("Cantidad de atributos: " + r.getAtributos().length);
        this.jLCantidadInstancias.setText("Cantidad de Instancias: " + r.getDatos().getRowCount());
        //this.jTDatos.addRow();
    }
    
    private void jMGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarActionPerformed
        if(relacionActual != null){
            relacionActual.clear();
            relacionActual.setRelacion(this.jTRelacionText.getText());
            relacionActual.setDescripcion(this.jTDescripcion.getText().split("\n"));
            relacionActual.setDatos((DefaultTableModel) this.jTDatos.getModel());
            a.guardar(relacionActual, ruta);
        }else{
            JOptionPane.showMessageDialog(null, "Aun no se ha cargado alguna base de datos ");
        } 
    }//GEN-LAST:event_jMGuardarActionPerformed

    private void jMGuardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarcomoActionPerformed
        
        if(relacionActual != null){
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
        }else{
            JOptionPane.showMessageDialog(null, "Aun no se ha cargado alguna base de datos ");
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
            this.jTNombreAtributo.setEditable(true);
            this.jTERAtributo.setEditable(true);
            this.jBAgregarInstancia.setEnabled(true);
            this.jBEliminarInstancia.setEnabled(true);
        }else if(!this.jCBEditar.isSelected()){
            this.jTDatos.setEnabled(false);
            this.jTDescripcion.setEditable(false);
            this.jTRelacionText.setEditable(false);
            this.jTNombreAtributo.setEditable(false);
            this.jTERAtributo.setEditable(false);
            this.jBAgregarInstancia.setEnabled(false);
            this.jBEliminarInstancia.setEnabled(false);
            try{
                 Atributo atributo = new Atributo();
            atributo.setNombre(this.jTNombreAtributo.getText());
            atributo.setDominio(this.jTERAtributo.getText());//
            leerNuevosDatos();
            relacionActual.setAtributosEnPosicion(posicionAtributoEnLista, atributo);
                agregarAVentana(relacionActual);
            }catch(Exception e2){}
        }
        
    }//GEN-LAST:event_jCBEditarStateChanged

    private void jLstAtributosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstAtributosValueChanged
        if(posicionAtributoEnLista == -1){
            posicionAtributoEnLista = this.jLstAtributos.getSelectedIndex();
            this.jTNombreAtributo.setText(relacionActual.getAtributos()[this.jLstAtributos.getSelectedIndex()].getNombre()); 
            this.jTERAtributo.setText(relacionActual.getAtributos()[this.jLstAtributos.getSelectedIndex()].getDominio()); 
        }else{
            Atributo atributo = new Atributo();
            atributo.setNombre(this.jTNombreAtributo.getText());
            atributo.setDominio(this.jTERAtributo.getText());//
            leerNuevosDatos();
            relacionActual.setAtributosEnPosicion(posicionAtributoEnLista, atributo);
            posicionAtributoEnLista = this.jLstAtributos.getSelectedIndex();
            this.jTNombreAtributo.setText(relacionActual.getAtributos()[this.jLstAtributos.getSelectedIndex()].getNombre()); 
            this.jTERAtributo.setText(relacionActual.getAtributos()[this.jLstAtributos.getSelectedIndex()].getDominio()); 
        }
    }//GEN-LAST:event_jLstAtributosValueChanged

    private void jBAgregarInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarInstanciaActionPerformed
       DefaultTableModel modelo = relacionActual.getDatos();
       Vector os = null;
       modelo.addRow(os);
       relacionActual.setDatos(modelo);
       agregarAVentana(relacionActual);
    }//GEN-LAST:event_jBAgregarInstanciaActionPerformed

    private void jBEliminarInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarInstanciaActionPerformed
        DefaultTableModel modelo = relacionActual.getDatos();
        Vector os = null;
        modelo.removeRow(this.jTDatos.getSelectedRow());
        relacionActual.setDatos(modelo);
        agregarAVentana(relacionActual);
    }//GEN-LAST:event_jBEliminarInstanciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        JFreeChart grafica = null;
        String[] atributo = this.jLstAtributos1.getSelectedValue().split("-");
        int posicionAtributo = this.jLstAtributos1.getSelectedIndex()+1;
        int totalInstancias = 0;
        String nombreAtributo = atributo[0].trim();
        String tipoAtributo = atributo[1].trim();
        String valor = new String();
        List<String> listaValores = identificarPosiblesValores(posicionAtributo-1);
        DefaultTableModel modelo = relacionActual.getDatos();
        
        List<Double> lista = new ArrayList<>();
        double media = 0;
        Vector row = new Vector();
        
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        
        if("BINARY".equals(tipoAtributo) || "ORDINAL".equals(tipoAtributo) || "NOMINAL".equals(tipoAtributo) || "CATEGORIC".equals(tipoAtributo)){
           for(int i = 0 ; i < listaValores.size() ; i++){
               for (int j = 0 ; j < modelo.getRowCount() ; j++){
                    if(modelo.getValueAt(j, posicionAtributo).equals(listaValores.get(i))){
                        totalInstancias++;
                        valor = listaValores.get(i);
                    }    
               }
               datos.addValue( totalInstancias, "", valor);
               totalInstancias = 0;
           }
           
           grafica = ChartFactory.createBarChart3D(relacionActual.getRelacion(), nombreAtributo, "Frecuencia", datos, PlotOrientation.HORIZONTAL, true, true, true);
           //grafica = ChartFactory.createBarChart(relacionActual.getRelacion(), nombreAtributo, "Frecuencia", datos);
        }else if("NUMERIC".equals(tipoAtributo) || "DISCRETE".equals(tipoAtributo) || "CONTINUOUS".equals(tipoAtributo)){
            
            
            for(int i = 0; i<relacionActual.getDatos().getDataVector().size();i++){
                row = (Vector) relacionActual.getDatos().getDataVector().elementAt(i);
                lista.add(Double.parseDouble(row.get(posicionAtributo).toString()));
               
            }
            media = lista.stream().mapToDouble(val->val).average().getAsDouble();
            System.out.println(media);
            dataset.add(lista, nombreAtributo, nombreAtributo);
            
            grafica = ChartFactory.createBoxAndWhiskerChart(relacionActual.getRelacion(), nombreAtributo, valor, dataset, false);
        }
        
    
        ChartPanel panel = new ChartPanel(grafica);
        //this.getContentPane().add(panel);
        //this.pack();
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public List<String> identificarPosiblesValores(int posicion){
        List<String> listaValores  = new ArrayList<>();
        String dominio;
        Atributo[] row;
        StringTokenizer st;
        row  = relacionActual.getAtributos();
        dominio = row[posicion].getDominio();
        dominio = dominio.replace("(","");
        dominio = dominio.replace(")","");
        
        st = new StringTokenizer(dominio);
        while (st.hasMoreTokens()){
            listaValores.add(st.nextToken("|").trim());
        }
        return listaValores;
    }
    
    private void jLstAtributos1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstAtributos1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstAtributos1ValueChanged

    private void leerNuevosDatos(){
        DefaultTableModel modelo = relacionActual.getDatos();
        String[] nombresAtributos = new String[relacionActual.getNombresAtributos().length+1];

            nombresAtributos[0] = "No.";
            for(int c= 1 ; c <  nombresAtributos.length ; c++){
                nombresAtributos[c] = relacionActual.getNombresAtributos()[c-1];
            }
            modelo.setColumnIdentifiers(nombresAtributos);
            relacionActual.setDatos(modelo);
    }
    
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
    private javax.swing.JButton jBAgregarInstancia;
    private javax.swing.JButton jBEliminarInstancia;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCBEditar;
    private javax.swing.JLabel jLCantidadAtributos;
    private javax.swing.JLabel jLCantidadInstancias;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLRelacion;
    private javax.swing.JLabel jLRelacion1;
    private javax.swing.JLabel jLRelacion2;
    private javax.swing.JLabel jLRelacion3;
    private javax.swing.JLabel jLRelacion4;
    private javax.swing.JLabel jLRelacion5;
    private javax.swing.JLabel jLRelacion6;
    private javax.swing.JLabel jLRelacion7;
    private javax.swing.JLabel jLRelaciontext1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jLstAtributos;
    private javax.swing.JList<String> jLstAtributos1;
    private javax.swing.JMenuItem jMAbrir;
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenuItem jMGuardar;
    private javax.swing.JMenuItem jMGuardarcomo;
    private javax.swing.JMenuBar jMSalir;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPBivariable;
    private javax.swing.JPanel jPGrafica;
    private javax.swing.JPanel jPUnivariable;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextArea jTDescripcion;
    private javax.swing.JTextField jTERAtributo;
    private javax.swing.JTextField jTNombreAtributo;
    private javax.swing.JTextField jTRelacionText;
    private javax.swing.JTabbedPane jTab;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
