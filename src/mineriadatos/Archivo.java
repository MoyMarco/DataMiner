/*
 * En esta clase se hará llevara acabo la manipulacion del archivo (Guardar, abrir, etc.)
 */
package mineriadatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joelv
 */
public class Archivo {
    private Relacion relacion = new Relacion();
    private ArrayList<String> datos = new ArrayList<String>();
    private boolean leerDatos = false, esComentario = false, datosLeidos = false;
    private char valorFaltante;                                            
    
    private void identificarEtiqueta(String cadena){
        boolean leerComando = false, leerResto = false;
        char[] palabra = new char[15];
        char[] resto = new char[100];
        char[] linea;
        int cont = 0;
        linea = cadena.toCharArray();
        esComentario = datosLeidos = false;
        
        for(int c = 0; c < cadena.length() ; c++){
            if(linea[c] == '%'){
                if(linea[c+1] == '%'){
                    linea[0] = ' ';
                    linea[1] = ' ';
                    relacion.setDescripcion(String.valueOf(String.valueOf(linea).trim()));
                    break;
                }
            }
            else if(leerComando && linea[c] != ' '){
                palabra[cont++] = linea[c];
            }
            else if(linea[c] == '@'){
                leerComando = true;
            }
            else if(linea[c] == ' ' && leerComando){
                leerComando = false;
                leerResto = true;
                cont = 0;
            }      
            else if(leerResto){
                resto[cont++] = linea[c];
            }
            else{
                if(!datosLeidos){
                    datos.add(cadena);
                    datosLeidos = true;
                }
            }
        }  
        if(leerResto || leerComando){
            aplicarEtiqueta(String.valueOf(palabra), String.valueOf(resto));
        }
    }
    
    private void aplicarEtiqueta(String palabra, String resto){
        palabra = palabra.toUpperCase();
        if("RELATION".equals(palabra.trim())){
            relacion.setRelacion(resto.trim());
        }      
        if(palabra.trim().equals("ATTRIBUTE")){
            String[] resto1 = resto.trim().split(" ");
            Atributo atributo = new Atributo();
            atributo.setNombre(resto1[0]);
            atributo.setTipo(resto1[1]);
            if(resto1.length == 3){
            atributo.setDominio(resto1[2]);
            }else if (resto1.length > 3){
                String aux = new String();
                for(int i = 2 ;i<resto1.length; i++){
                    aux = aux + resto1[i] + " ";
                }
                atributo.setDominio(aux); 
            }
            relacion.setAtributo(atributo);
        }
        if(palabra.trim().equals("MISSINGVALUE")){
            try{
                valorFaltante = resto.trim().charAt(0);
            }catch(Exception e){
                valorFaltante = '?';
            }
            relacion.setValorFaltante(valorFaltante);
        }        
        if(palabra.trim().equals("DATA")){
            leerDatos = true;
        }        
    }
    
    private void leerDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] datosSeparados = new String[1];
        String[] aux = null;

        if(leerDatos == true){
            modelo.addColumn("No.");
            for(int c= 0 ; c < relacion.getNombresAtributos().length ; c++){
                modelo.addColumn(relacion.getNombresAtributos()[c]);
            }
            for (int f = 0 ; f < datos.size() ; f++) {
                datosSeparados[0] = (String.valueOf(f+1));
                datosSeparados = datos.get(f).split(",");
                aux = new String[datosSeparados.length + 1];
                for(int i = 1 ; i < datosSeparados.length + 1 ; i++){
                    aux[i] = datosSeparados[i-1];  
                }
                aux[0] = String.valueOf(f+1);
                modelo.addRow(aux);
            }
            relacion.setDatos(modelo);
        }
    }
    
    public Relacion abrirArchivo (File archivo) throws FileNotFoundException, IOException {
        relacion = new Relacion();
        datos.clear();
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        
        while((cadena = b.readLine())!=null) {
            identificarEtiqueta(cadena);
        }
        leerDatos();
        b.close();
        return relacion;
    }
    
    public void guardar (Relacion r, String ruta){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            String[] descripcion = r.getDescripcion();
            Atributo[] atributos = r.getAtributos();
            DefaultTableModel datos = r.getDatos();
                
            for(int i = 0 ; i < descripcion.length ; i++){
                pw.println("%%" + descripcion[i]);
            }
            pw.println("@RELATION " + r.getRelacion());
            for(int i = 0 ; i < atributos.length ; i++){
                pw.println("@ATTRIBUTE " +atributos[i].toString());
            }
            pw.println("@MISSINGVALUE " + r.getValorFaltante());
            pw.println("@DATA");
            for(int f = 0 ; f<datos.getRowCount() ; f++){
                for(int c = 1 ; c<datos.getColumnCount() ; c++){
                    if(c == 1){
                        pw.print(datos.getValueAt(f, c));
                    }else{
                        pw.print("," + datos.getValueAt(f, c));
                    }
                }
                pw.println();
            }
        } catch (Exception e) {
            e.printStackTrace();   
        } finally {
            try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
            }
        }
    }
    
    public void guardarComo (Relacion r, String ruta){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            String[] descripcion = r.getDescripcion();
            Atributo[] atributos = r.getAtributos();
            DefaultTableModel datos = r.getDatos();
                
            for(int i = 0 ; i < descripcion.length ; i++){
                pw.println("%%" + descripcion[i]);
            }
            pw.println("@RELATION " + r.getRelacion());
            for(int i = 0 ; i < atributos.length ; i++){
                pw.println("@ATTRIBUTE " + atributos[i].toString());
            }
            pw.println("@MISSINGVALUE " + r.getValorFaltante());
            pw.println("@DATA");
            for(int f = 0 ; f<datos.getRowCount() ; f++){
                for(int c = 1 ; c<datos.getColumnCount() ; c++){
                    if(c == 1){
                        pw.print(datos.getValueAt(f, c));
                    }else{
                        pw.print("," + datos.getValueAt(f, c));
                    }
                }
                pw.println();
            }
        } catch (Exception e) {
            e.printStackTrace();   
        } finally {
            try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }   
}
