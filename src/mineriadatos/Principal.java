/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mineriadatos;

import java.awt.GridLayout;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jTab = new javax.swing.JTabbedPane();
        jPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDatos = new DTable();
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
        jTERAtributo = new javax.swing.JTextField();
        jTNombreAtributo = new javax.swing.JTextField();
        jLRelacion2 = new javax.swing.JLabel();
        jLRelacion3 = new javax.swing.JLabel();
        jLRelacion4 = new javax.swing.JLabel();
        jBEliminarInstancia = new javax.swing.JButton();
        jBAgregarInstancia = new javax.swing.JButton();
        jLRelacion5 = new javax.swing.JLabel();
        btnEliminaAtrib = new javax.swing.JButton();
        btnBuscayRem = new javax.swing.JButton();
        jLRelacion11 = new javax.swing.JLabel();
        jLRelacion12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDescripcion = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPUnivariable = new javax.swing.JPanel();
        jPGrafica = new javax.swing.JPanel();
        jLMedia = new javax.swing.JLabel();
        jLMediana = new javax.swing.JLabel();
        jLDesvEst = new javax.swing.JLabel();
        jLModa = new javax.swing.JLabel();
        btnGraficar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLstAtributos1 = new javax.swing.JList<>();
        jLRelacion6 = new javax.swing.JLabel();
        jLRelacion7 = new javax.swing.JLabel();
        jLRelacion15 = new javax.swing.JLabel();
        jPBivariable = new javax.swing.JPanel();
        jLRelacion8 = new javax.swing.JLabel();
        jLRelacion9 = new javax.swing.JLabel();
        comboBoxBiv1 = new javax.swing.JComboBox<>();
        comboBoxBiv2 = new javax.swing.JComboBox<>();
        jLRelacion10 = new javax.swing.JLabel();
        btnEvalueBiv = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        txtAreaResBivariable = new javax.swing.JTextArea();
        jLRelacion13 = new javax.swing.JLabel();
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
        jPrincipal.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
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
        jPrincipal.add(jCBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, -1, -1));

        jLstAtributos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLstAtributos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstAtributosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jLstAtributos);

        jPrincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 250, 240));

        jLRelaciontext1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPrincipal.add(jLRelaciontext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, -1, -1));

        jLRelacion1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLRelacion1.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion1.setText("ER");
        jLRelacion1.setToolTipText("");
        jLRelacion1.setAutoscrolls(true);
        jLRelacion1.setFocusTraversalPolicyProvider(true);
        jPrincipal.add(jLRelacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, -1, -1));

        jTRelacionText.setEditable(false);
        jTRelacionText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTRelacionText.setText("Ninguna");
        jPrincipal.add(jTRelacionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 740, -1));

        jLCantidadAtributos.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLCantidadAtributos.setText("Cantidad de atributos:");
        jPrincipal.add(jLCantidadAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 630, -1, -1));

        jLCantidadInstancias.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLCantidadInstancias.setText("Cantidad de instancias:");
        jPrincipal.add(jLCantidadInstancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, -20, 30, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Edit_40px.png"))); // NOI18N
        jPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, -1, -1));

        jTERAtributo.setEditable(false);
        jPrincipal.add(jTERAtributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 190, -1));

        jTNombreAtributo.setEditable(false);
        jPrincipal.add(jTNombreAtributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, 190, -1));

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
        jPrincipal.add(jLRelacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, -1, -1));

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
        jPrincipal.add(jLRelacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 460, -1, -1));

        btnEliminaAtrib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Delete View_30px.png"))); // NOI18N
        btnEliminaAtrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaAtribActionPerformed(evt);
            }
        });
        jPrincipal.add(btnEliminaAtrib, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 460, 50, 50));

        btnBuscayRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Clear Search_30px.png"))); // NOI18N
        btnBuscayRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscayRemActionPerformed(evt);
            }
        });
        jPrincipal.add(btnBuscayRem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, 50, 50));

        jLRelacion11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLRelacion11.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion11.setText("Eliminar");
        jLRelacion11.setToolTipText("");
        jLRelacion11.setAutoscrolls(true);
        jLRelacion11.setFocusTraversalPolicyProvider(true);
        jPrincipal.add(jLRelacion11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 510, -1, -1));

        jLRelacion12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLRelacion12.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion12.setText("Buscar y remplazar");
        jLRelacion12.setToolTipText("");
        jLRelacion12.setAutoscrolls(true);
        jLRelacion12.setFocusTraversalPolicyProvider(true);
        jPrincipal.add(jLRelacion12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, -1, -1));

        jScrollPane2.setEnabled(false);
        jScrollPane2.setViewportView(jTDescripcion);

        jPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 870, 90));

        jTab.addTab("Explorar", jPrincipal);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        jPUnivariable.setBackground(new java.awt.Color(255, 255, 255));
        jPUnivariable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLMedia.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLMedia.setForeground(new java.awt.Color(0, 0, 153));
        jLMedia.setText("Media: ");

        jLMediana.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLMediana.setForeground(new java.awt.Color(0, 0, 153));
        jLMediana.setText("Mediana: ");

        jLDesvEst.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLDesvEst.setForeground(new java.awt.Color(0, 0, 153));
        jLDesvEst.setText("Desviacion estandar: ");

        jLModa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLModa.setForeground(new java.awt.Color(0, 0, 153));
        jLModa.setText("Moda(s): ");

        javax.swing.GroupLayout jPGraficaLayout = new javax.swing.GroupLayout(jPGrafica);
        jPGrafica.setLayout(jPGraficaLayout);
        jPGraficaLayout.setHorizontalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGraficaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDesvEst, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jLModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPGraficaLayout.setVerticalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGraficaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMediana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLDesvEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLModa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPUnivariable.add(jPGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 550, 170));

        btnGraficar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Pie Chart_30px.png"))); // NOI18N
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        jPUnivariable.add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 50, 50));

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

        jLRelacion15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion15.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion15.setText("Resultados");
        jPUnivariable.add(jLRelacion15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jTabbedPane1.addTab("Univariable", jPUnivariable);

        jPBivariable.setBackground(new java.awt.Color(255, 255, 255));
        jPBivariable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLRelacion8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion8.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion8.setText("vs");
        jPBivariable.add(jLRelacion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLRelacion9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion9.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion9.setText("Seleccione atributos");
        jPBivariable.add(jLRelacion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        comboBoxBiv1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jPBivariable.add(comboBoxBiv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 230, 30));

        comboBoxBiv2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jPBivariable.add(comboBoxBiv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 230, 30));

        jLRelacion10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLRelacion10.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion10.setText("Resultados");
        jPBivariable.add(jLRelacion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        btnEvalueBiv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnEvalueBiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mineriadatos/iconos/Work_30px.png"))); // NOI18N
        btnEvalueBiv.setToolTipText("");
        btnEvalueBiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvalueBivActionPerformed(evt);
            }
        });
        jPBivariable.add(btnEvalueBiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 369, 50, 50));

        jScrollPane.setEnabled(false);

        txtAreaResBivariable.setColumns(20);
        txtAreaResBivariable.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtAreaResBivariable.setRows(5);
        jScrollPane.setViewportView(txtAreaResBivariable);

        jPBivariable.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 700, 350));

        jLRelacion13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLRelacion13.setForeground(new java.awt.Color(0, 0, 153));
        jLRelacion13.setText("Evaluar");
        jLRelacion13.setToolTipText("");
        jLRelacion13.setAutoscrolls(true);
        jLRelacion13.setFocusTraversalPolicyProvider(true);
        jPBivariable.add(jLRelacion13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

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
        Relacion relacion;
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
        //actualiza datos de la ventana cuando se modifica la relacion
        relacionActual = r;
        this.jTDatos.setRelacion(r);
        Atributo[] listaAtributos = r.getAtributos();
        String[] listaAtributosN = new String[listaAtributos.length];
        
        this.comboBoxBiv1.removeAllItems();
        this.comboBoxBiv2.removeAllItems();
        
        this.jTDescripcion.setText(r.descripcionToString());
        this.jTRelacionText.setText(r.getRelacion());
        this.jTDatos.setModel(r.getDatos());
     
        for(int i = 0 ; i<listaAtributos.length ; i++){
            String nombre = listaAtributos[i].getNombre();
            this.comboBoxBiv1.addItem(listaAtributos[i].getNombre());
            this.comboBoxBiv2.addItem(listaAtributos[i].getNombre());
            
            String tipo = listaAtributos[i].getTipo();
            listaAtributosN[i] = nombre + " - " + tipo;
        }
        DefaultListModel model = new DefaultListModel();
        for(String val : listaAtributosN){
            model.addElement(val);
        }
        
        this.jLstAtributos.setModel(model);
        this.jLstAtributos1.setModel(model);
        this.jLCantidadAtributos.setText("Cantidad de atributos: " + r.getAtributos().length);
        this.jLCantidadInstancias.setText("Cantidad de Instancias: " + r.getDatos().getRowCount());
        
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
            String auxRuta;
       
            JFileChooser fc=new JFileChooser();
            int seleccion=fc.showSaveDialog(this);
            if(JFileChooser.APPROVE_OPTION == seleccion){
                File f = fc.getSelectedFile();
                auxRuta = f.getPath()+".txt";
       
                relacionActual.clear();
                relacionActual.setRelacion(this.jTRelacionText.getText());
                relacionActual.setDescripcion(this.jTDescripcion.getText().split("\n"));
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
            if(this.jLstAtributos.getSelectedIndex() != -1){
                this.jTNombreAtributo.setText(relacionActual.getAtributos()[this.jLstAtributos.getSelectedIndex()].getNombre()); 
                this.jTERAtributo.setText(relacionActual.getAtributos()[this.jLstAtributos.getSelectedIndex()].getDominio());
            }
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
        modelo.removeRow(this.jTDatos.getSelectedRow());
        relacionActual.setDatos(modelo);
        agregarAVentana(relacionActual);
    }//GEN-LAST:event_jBEliminarInstanciaActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
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
        
        if("BINARY".equals(tipoAtributo.toUpperCase()) || "ORDINAL".equals(tipoAtributo.toUpperCase()) || "NOMINAL".equals(tipoAtributo.toUpperCase()) || "CATEGORIC".equals(tipoAtributo.toUpperCase())){
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
        }else if("NUMERIC".equals(tipoAtributo.toUpperCase()) || "DISCRETE".equals(tipoAtributo.toUpperCase()) || "CONTINUOUS".equals(tipoAtributo.toUpperCase())){
            
            
            for(int i = 0; i<relacionActual.getDatos().getDataVector().size();i++){
                row = (Vector) relacionActual.getDatos().getDataVector().elementAt(i);
                lista.add(Double.parseDouble(row.get(posicionAtributo).toString()));
               
            }
            media = lista.stream().mapToDouble(val->val).average().getAsDouble(); 
            dataset.add(lista, nombreAtributo, nombreAtributo);
            dataset.add(lista, "1", nombreAtributo);
            dataset.add(lista, "2", nombreAtributo);
            dataset.add(lista, "3", nombreAtributo);
            dataset.add(lista, "4", nombreAtributo);
            
            grafica = ChartFactory.createBoxAndWhiskerChart(relacionActual.getRelacion(), "Atributo", "Valores", dataset, false);
            //this.add(new JLabel("Media: " + getMean(lista.toArray(new Double[lista.size()]))));
            Double[] envia = new Double[lista.size()];
            for (int i = 0; i <lista.size(); i++)
                envia[i] = lista.get(i);
            this.jLMedia.setText("Media: " + getMedia(envia));
            this.jLMediana.setText("Mediana: " + getMediana(envia));
            this.jLDesvEst.setText("Desviacion estandar: " + getDesvEst(envia));
            List<Double> moda = getModa(envia);
            if(moda != null){
                this.jLModa.setText("Moda: " + moda);
            }else{
                this.jLModa.setText("No hay moda");
            }
            
            System.out.println(getMedia(envia));
        }
        
        
        ChartPanel panel = new ChartPanel(grafica);
        
        //this.getContentPane().add(panel);
        //this.pack();
      
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(panel);
        Ventana.pack();
       // Ventana.setBounds(800, 500, 500, 800);
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnGraficarActionPerformed
    
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

    private void btnEvalueBivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvalueBivActionPerformed
        //revisar y analizar
        //Sets para aceptar posibles valores futuros
        Set<String> numericos = new HashSet<>();
        numericos.add("numeric");
        numericos.add("discrete");
        numericos.add("continuous");
        Set<String> categoricos = new HashSet<>();
        categoricos.add("binary");
        categoricos.add("ordinal");
        categoricos.add("nominal");
        categoricos.add("categoric");
        int indxA;
        int indxB;
        Atributo[] listaAtributos = relacionActual.getAtributos();
        Atributo A;
        Atributo B;
        indxA = this.comboBoxBiv1.getSelectedIndex();
        indxB = this.comboBoxBiv2.getSelectedIndex();
        A = listaAtributos[indxA];
        B = listaAtributos[indxB];
        try{
        if((numericos.contains(A.getTipo()) || categoricos.contains(A.getTipo()))
                && (numericos.contains(B.getTipo()) || categoricos.contains(B.getTipo()))){
            //los tipos de dato estan en formato aceptable
            //revisar si son numerico vs numerico o cat vs cat
            if(numericos.contains(A.getTipo()) && numericos.contains(B.getTipo())){
                //si ambos son numericos calcular correlacion de pearson---------------------------
                //calcular las sigmas
                double mediaA;
                double mediaB;
                double sumatoriaA = 0;
                double sumatoriaB = 0;
                double sigmaA;
                double sigmaB;
                double pearson = 0;
                List<Double> listA = new ArrayList<>();
                List<Double> listB = new ArrayList<>();
                Vector row;
                String result;
                //sacar datos del defaultTableModel para calcular promedio
                for(int i = 0; i<relacionActual.getDatos().getDataVector().size();i++){
                    row = (Vector) relacionActual.getDatos().getDataVector().elementAt(i);
                    listA.add(Double.parseDouble(row.get(indxA+1).toString()));
                    listB.add(Double.parseDouble(row.get(indxB+1).toString()));
                }
                //calcular las medias
                mediaA = listA.stream().mapToDouble(val->val).average().getAsDouble();
                mediaB = listB.stream().mapToDouble(val->val).average().getAsDouble();
                for(int i = 0; i<relacionActual.getDatos().getDataVector().size();i++){
                    sumatoriaA += Math.pow((listA.get(i)-mediaA),2);
                    sumatoriaB += Math.pow((listB.get(i)-mediaB),2);
                }
                //calcular sigmas
                sigmaA = Math.sqrt((sumatoriaA/relacionActual.getDatos().getDataVector().size()));
                sigmaB = Math.sqrt((sumatoriaB/relacionActual.getDatos().getDataVector().size()));
                //calcular el coeficiente de pearson
                for(int i = 0; i<relacionActual.getDatos().getDataVector().size();i++){
                    pearson += ( (listA.get(i)-mediaA)*(listB.get(i)-mediaB) );
                }
                pearson = pearson / (relacionActual.getDatos().getDataVector().size()*sigmaA*sigmaB);
                result = "Numerico VS Numerico\nCoeficiente de correlacion = "+pearson+"\n";
                if(pearson==(-1)){
                    result += "Correlacion negativa perfecta";
                }else if(pearson<(-0.5) && pearson>(-1)){
                    result += "Correlacion Negativa";
                }else if(pearson>(-0.5) && pearson<(0.5)){
                    result += "No existe correlacion";
                }else if(pearson>(0.5) && pearson <1){
                    result += "Correlacion positiva";
                }else if(pearson == 1){
                    result += "Correlacion positiva perfecta";
                }
                this.txtAreaResBivariable.setText(result);
            }else if (categoricos.contains(A.getTipo()) && categoricos.contains(B.getTipo())){
                //cat vs cat--------------------------------------------------------
                //prueba chi-cuadrada y coeficiente Tschuprow
                StringTokenizer st;
                List<List<Integer>> matrizContingencia = new ArrayList<List<Integer>>();
                List<List<Double>> matrizEsperadas = new ArrayList<List<Double>>();
                double equisCuadrada;
                double tschuprow;
                List<String> posiblesValoresA = new ArrayList<>();//dominio de valores de A
                List<String> posiblesValoresB = new ArrayList<>();//dominio de  valores B
                String dominioA;
                String dominioB;
                Atributo[] row;
                row = relacionActual.getAtributos();
                //obtener los dominios de los atributos
                dominioA = row[indxA].getDominio();
                dominioB = row[indxB].getDominio();
                //comprobar que el dominio no sea una ER sino un conjunto
                if(!dominioA.startsWith("(") || !dominioB.startsWith("(")){
                    this.txtAreaResBivariable.setText("Dominio incompatible");
                    return;
                }
                //limpiar de parentesis
                dominioA = dominioA.replace("(","");
                dominioA = dominioA.replace(")","");
                dominioB = dominioB.replace("(","");
                dominioB = dominioB.replace(")","");
                //separarlos y guardar en listas
                st = new StringTokenizer(dominioA);
                while (st.hasMoreTokens()) {  
                    posiblesValoresA.add(st.nextToken("|").trim());
                }  
                st = new StringTokenizer(dominioB);
                while (st.hasMoreTokens()) {  
                    posiblesValoresB.add(st.nextToken("|").trim());
                }
                //crear y llenar la tabla de contingencia  con 0
                //(ultima fila y columna contienen totales
                for(int i = 0;i<posiblesValoresB.size()+1;i++){
                    matrizContingencia.add(new ArrayList<Integer>());
                    for(int b=0;b<posiblesValoresA.size()+1;b++){
                        matrizContingencia.get(i).add(0);
                    }
                }
                //contar y llenar la tabla de contingencia con datos
                Vector rowV;
                int coordEsperadaA = -1;
                int coordEsperadaB = -1;
                for(int i = 0; i<relacionActual.getDatos().getDataVector().size();i++){
                    rowV = (Vector) relacionActual.getDatos().getDataVector().elementAt(i);
                    
                    for(int b=0;b<posiblesValoresB.size();b++){
                        if(posiblesValoresB.get(b).equals(rowV.get(indxB+1))){
                            coordEsperadaB = b;
                            break;
                        }
                    }
                    for(int a=0;a<posiblesValoresA.size();a++){
                        if(posiblesValoresA.get(a).equals(rowV.get(indxA+1))){
                            coordEsperadaA = a;
                            break;
                        }
                    }
                    if(coordEsperadaB != -1 && coordEsperadaA != -1){
                        int anterior = matrizContingencia.get(coordEsperadaB).get(coordEsperadaA);
                        anterior++;
                        matrizContingencia.get(coordEsperadaB).set(coordEsperadaA, anterior);
                    }
                    coordEsperadaA = -1;
                    coordEsperadaB = -1;
                }
                //llenar los totales de la tabla de contingencia
                //(ultima fila y columna
                int totalColumna = 0;
                int totalFila = 0;
                for(int i=0;i<posiblesValoresB.size();i++){
                    List<Integer> fila = matrizContingencia.get(i);
                    for(int a=0;a<posiblesValoresA.size();a++){
                        totalFila += fila.get(a);
                    }
                    fila.set(fila.size()-1, totalFila);
                    totalFila = 0;
                }
                for(int i=0;i<posiblesValoresA.size();i++){
                    for(int a=0;a<posiblesValoresB.size();a++){
                        List<Integer> fila = matrizContingencia.get(a);
                        totalColumna += fila.get(i);
                    }
                    matrizContingencia.get(posiblesValoresB.size()).set(i, totalColumna);
                    totalColumna=0;
                }
                //hacer la comprobacion de que las sumas totales horizontal y vertical sean iguales
                int totalVertical = 0;
                int totalHorizontal = 0;
                for(int i=0;i<posiblesValoresB.size();i++){
                    totalVertical += matrizContingencia.get(i).get(posiblesValoresA.size());
                }
                for(int i=0;i<posiblesValoresA.size();i++){
                    totalHorizontal += matrizContingencia.get(posiblesValoresB.size()).get(i);
                }
                //si los dos totales son iguales, proceder
                if(totalHorizontal == totalVertical){
                    //calcular la matriz de frecuencias esperadas
                    for(int b = 0;b<posiblesValoresB.size();b++){
                        matrizEsperadas.add(new ArrayList<Double>());
                        for(int a=0;a<posiblesValoresA.size();a++){
                            double valor;
                            valor = matrizContingencia.get(b).get(posiblesValoresA.size())
                                    * matrizContingencia.get(posiblesValoresB.size()).get(a);
                            valor = valor/totalVertical;
                            matrizEsperadas.get(b).add(valor);
                            valor = 0;
                        }
                    }
                    //calcular la equis cuadrada :D
                    equisCuadrada = 0;
                    for(int b=0;b<posiblesValoresB.size();b++){
                        for(int a=0;a<posiblesValoresA.size();a++){
                            double r;
                            r = matrizContingencia.get(b).get(a)-matrizEsperadas.get(b).get(a);
                            r = Math.pow(r, 2);
                            r = r/matrizEsperadas.get(b).get(a);
                            equisCuadrada += r;
                            r=0;
                        }
                    }
                    //calcular coeficiente de tschuprow
                    tschuprow = 0;
                    double denom;
                    denom = (posiblesValoresA.size() - 1)*(posiblesValoresB.size() -1);
                    denom = Math.sqrt(denom);
                    denom = totalVertical * denom;
                    tschuprow = Math.sqrt((equisCuadrada/denom));
                    if(tschuprow == 0){
                        this.txtAreaResBivariable.setText("cat vs cat\n"+""
                                + "Coeficiente de Tschuprow = "+tschuprow+ ""
                                        + "\nCompleta Independencia");
                    }else if(tschuprow >= 0.9){
                        this.txtAreaResBivariable.setText("cat vs cat\n"+""
                                + "Coeficiente de Tschuprow = "+tschuprow+ ""
                                        + "\nCompleta Dependencia");
                    }else if (tschuprow > 0 && tschuprow <0.9){
                        this.txtAreaResBivariable.setText("cat vs cat\n"+""
                                + "Coeficiente de Tschuprow = "+tschuprow);
                    }          
                }
            }else{
                //en este caso son numerico vs cat, incompatibles
                this.txtAreaResBivariable.setText("incompatibles");
            }
        }else{
            //los tipos de dato estan en formato inaceptable, enviar mensaje de error
            this.txtAreaResBivariable.setText("error en tipos de dato");
        }
        }catch (Exception ex){
            this.txtAreaResBivariable.setText("Error, faltan datos o hay corruptos");
        }
    }//GEN-LAST:event_btnEvalueBivActionPerformed

    private void btnEliminaAtribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaAtribActionPerformed
        //eliminar atributo de lista de atributos
        if(this.jLstAtributos.getSelectedIndex()<0){
             JOptionPane.showMessageDialog(this.btnBuscayRem, "Seleccione un atributo de la lista anterior","Error",2);
             return;
        }
        int selectedIndex = this.jLstAtributos.getSelectedIndex();
        DefaultListModel model = (DefaultListModel) this.jLstAtributos.getModel();
        if (selectedIndex != -1) {
            model.remove(selectedIndex);
        }
        //eliminar de la tabla de datos
        int nRow= this.jTDatos.getRowCount();
        int nCol= this.jTDatos.getColumnCount()-1;
        Object[][] cells= new Object[nRow][nCol];
        String[] names= new String[nCol];

        for(int j=0; j<nCol; j++){
            if(j<selectedIndex+1){
                names[j]= this.jTDatos.getColumnName(j);
                for(int i=0; i<nRow; i++){
                    cells[i][j]= this.jTDatos.getValueAt(i, j);
                }
            }else{
                names[j]= this.jTDatos.getColumnName(j+1);
                for(int i=0; i<nRow; i++){
                    cells[i][j]= this.jTDatos.getValueAt(i, j+1);
                }
            }
        }
        DefaultTableModel newModel= new DefaultTableModel(cells, names);
        this.jTDatos.setModel(newModel);
        this.jTNombreAtributo.setText("");
        this.jTERAtributo.setText("");
        relacionActual.setDatos(newModel);
        //eliminar el atributo de la relacion actual
       ArrayList<Atributo> list = new ArrayList(Arrays.asList(
       relacionActual.getAtributos()));
       list.remove(selectedIndex);
       relacionActual.setAtributos(list.toArray(new Atributo[list.size()]));
       
       agregarAVentana(relacionActual);
    }//GEN-LAST:event_btnEliminaAtribActionPerformed

    private void btnBuscayRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscayRemActionPerformed
        int selectedAtrib = this.jLstAtributos.getSelectedIndex();
        if(selectedAtrib < 0){
            JOptionPane.showMessageDialog(this.btnBuscayRem, "Seleccione un atributo de la lista anterior","Error",2);
        }else{
            JTextField buscar = new JTextField("");
            JTextField reemplazar = new JTextField("");
            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Buscar:"));
            panel.add(buscar);
            panel.add(new JLabel("Reemplazar:"));
            panel.add(reemplazar);
            int result = JOptionPane.showConfirmDialog(null, panel, "Buscar y reemplazar",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                //sacar datos del defaultTableModel
                for(int i = 0; i<relacionActual.getDatos().getDataVector().size();i++){
                    Vector row = (Vector) relacionActual.getDatos().getDataVector().elementAt(i);
                    if(row.get(selectedAtrib+1).equals(buscar.getText())){
                        row.set(selectedAtrib+1, reemplazar.getText());
                        relacionActual.getDatos().getDataVector().set(i, row);
                    }
                }
                this.jTDatos.setEnabled(true);
                this.jTDatos.setModel(relacionActual.getDatos());
                this.jTDatos.setEnabled(false);
            } else {
                System.out.println("Cancelled");
            }
        }
    }//GEN-LAST:event_btnBuscayRemActionPerformed

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
    private javax.swing.JButton btnBuscayRem;
    private javax.swing.JButton btnEliminaAtrib;
    private javax.swing.JButton btnEvalueBiv;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JComboBox<String> comboBoxBiv1;
    private javax.swing.JComboBox<String> comboBoxBiv2;
    private javax.swing.JButton jBAgregarInstancia;
    private javax.swing.JButton jBEliminarInstancia;
    private javax.swing.JCheckBox jCBEditar;
    private javax.swing.JLabel jLCantidadAtributos;
    private javax.swing.JLabel jLCantidadInstancias;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLDesvEst;
    private javax.swing.JLabel jLMedia;
    private javax.swing.JLabel jLMediana;
    private javax.swing.JLabel jLModa;
    private javax.swing.JLabel jLRelacion;
    private javax.swing.JLabel jLRelacion1;
    private javax.swing.JLabel jLRelacion10;
    private javax.swing.JLabel jLRelacion11;
    private javax.swing.JLabel jLRelacion12;
    private javax.swing.JLabel jLRelacion13;
    private javax.swing.JLabel jLRelacion15;
    private javax.swing.JLabel jLRelacion2;
    private javax.swing.JLabel jLRelacion3;
    private javax.swing.JLabel jLRelacion4;
    private javax.swing.JLabel jLRelacion5;
    private javax.swing.JLabel jLRelacion6;
    private javax.swing.JLabel jLRelacion7;
    private javax.swing.JLabel jLRelacion8;
    private javax.swing.JLabel jLRelacion9;
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
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    /*
    private javax.swing.JTable jTDatos;
    */
    private DTable jTDatos;
    private javax.swing.JTextPane jTDescripcion;
    private javax.swing.JTextField jTERAtributo;
    private javax.swing.JTextField jTNombreAtributo;
    private javax.swing.JTextField jTRelacionText;
    private javax.swing.JTabbedPane jTab;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtAreaResBivariable;
    // End of variables declaration//GEN-END:variables

    List<Double> getModa(Double[] datos){
        Map<Double, Integer> m = new HashMap<Double, Integer>();
        for(double elemento:datos){
            if(m.containsKey(elemento)){
                m.put(elemento,m.get(elemento)+1);                
            }else{
                m.put(elemento, 1);
            }
        }
        int repeticiones = 0;
        List<Double> moda = new ArrayList<Double>();
        Iterator<Entry<Double,Integer>> iterador = m.entrySet().iterator();
        while (iterador.hasNext()) {	      
            Entry<Double,Integer> e = iterador.next();	    	
            if (e.getValue() > repeticiones) {
              moda.clear();
              moda.add(e.getKey());
              repeticiones = e.getValue();
            } else if (e.getValue() == repeticiones)
              moda.add(e.getKey());  
        }
        if (moda.size() == datos.length)
        return null;
        else
        return moda;
    }
    
    double getMedia(Double[] datos) {
        Double[] data = datos;
        int size = data.length; 
        double sum = 0.0;
        for(double a : data)
            sum += a;
        return sum/size;
    }

    double getVarianza(Double[] datos) {
        Double[] data = datos;
        int size= data.length; 
        Double mean = getMedia(datos);
        Double temp = 0.0;
        for(Double a :data)
            temp += (a-mean)*(a-mean);
        return temp/(size-1);
    }

    double getDesvEst(Double[] datos) {
        Double[] data = datos;
        int size= data.length; 
        return Math.sqrt(getVarianza(datos));
    }

     double getMediana(Double[] datos) {
        Double[] data =datos;
        int size= data.length; 
        Arrays.sort(data);
        if (data.length % 2 == 0) {
           return (data[(data.length / 2) - 1] + data[data.length / 2]) / 2.0;
        } 
       return data[data.length / 2];
    }
}
