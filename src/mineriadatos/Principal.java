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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        tabPrincipal = new javax.swing.JTabbedPane();
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
        panelAnalisis = new javax.swing.JPanel();
        tabPaneAnalisis = new javax.swing.JTabbedPane();
        jPUnivariable = new javax.swing.JPanel();
        jPBivariable = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxBiv1 = new javax.swing.JComboBox<>();
        comboBoxBiv2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaResBivariable = new javax.swing.JTextArea();
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

        tabPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        tabPrincipal.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

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

        tabPrincipal.addTab("Explorar", jExplorar);

        panelAnalisis.setBackground(new java.awt.Color(255, 255, 255));

        tabPaneAnalisis.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

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

        tabPaneAnalisis.addTab("Univariable", jPUnivariable);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Seleccione los atributos");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("VS");

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Evaluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Resultados");

        txtAreaResBivariable.setColumns(20);
        txtAreaResBivariable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtAreaResBivariable.setRows(5);
        txtAreaResBivariable.setEnabled(false);
        jScrollPane2.setViewportView(txtAreaResBivariable);

        javax.swing.GroupLayout jPBivariableLayout = new javax.swing.GroupLayout(jPBivariable);
        jPBivariable.setLayout(jPBivariableLayout);
        jPBivariableLayout.setHorizontalGroup(
            jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBivariableLayout.createSequentialGroup()
                .addGroup(jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBivariableLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxBiv1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(comboBoxBiv2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPBivariableLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel4)))
                .addGap(142, 142, 142)
                .addGroup(jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPBivariableLayout.setVerticalGroup(
            jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBivariableLayout.createSequentialGroup()
                .addGroup(jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPBivariableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPBivariableLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPBivariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(51, 51, 51)
                        .addComponent(comboBoxBiv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addComponent(comboBoxBiv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)))
                .addContainerGap(349, Short.MAX_VALUE))
        );

        tabPaneAnalisis.addTab("Bivariable", jPBivariable);

        javax.swing.GroupLayout panelAnalisisLayout = new javax.swing.GroupLayout(panelAnalisis);
        panelAnalisis.setLayout(panelAnalisisLayout);
        panelAnalisisLayout.setHorizontalGroup(
            panelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneAnalisis)
        );
        panelAnalisisLayout.setVerticalGroup(
            panelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneAnalisis)
        );

        tabPrincipal.addTab("Analisis", panelAnalisis);

        jPanel.add(tabPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 700));

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
        
        Atributo[] listaAtributos = relacionActual.getAtributos();
        String[] listaAtributosN = new String[listaAtributos.length];
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
        if((numericos.contains(A.getTipo()) || categoricos.contains(A.getTipo()))
                && (numericos.contains(A.getTipo()) || categoricos.contains(B.getTipo()))){
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
                    totalVertical += matrizContingencia.get(i).get(posiblesValoresB.size());
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
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JComboBox<String> comboBoxBiv1;
    private javax.swing.JComboBox<String> comboBoxBiv2;
    private javax.swing.JButton jBEditAtributos;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextArea jTDescripcion;
    private javax.swing.JTextField jTRelacionText;
    private javax.swing.JPanel panelAnalisis;
    private javax.swing.JTabbedPane tabPaneAnalisis;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JTextArea txtAreaResBivariable;
    // End of variables declaration//GEN-END:variables

}
