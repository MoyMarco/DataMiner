/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mineriadatos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joelv
 */
public class Relacion {
    private String relacion;
    private String[] descripcion = new String[0];
    private Atributo[] atributos = new Atributo[0];
    private DefaultTableModel datos = new DefaultTableModel();
    private char valorFaltante = '?';
    public Relacion(){}
    
    public Relacion(String relacion, Atributo[] atributos, DefaultTableModel datos, char valorFaltante){
        this.relacion = relacion;
        this.atributos = atributos;
        this.datos = datos; 
        this.valorFaltante = valorFaltante;
    }
    
    public void setRelacion(String relacion){this.relacion = relacion;}
    public void setAtributos(Atributo[] atributos){this.atributos = atributos;}
    public void setDatos(DefaultTableModel datos){this.datos = datos;}
    public void setDescripcion(String[] descripcion){this.descripcion = descripcion;}
    public void setValorFaltante(char valorFaltante){this.valorFaltante = valorFaltante;}
    
    public void clear(){descripcion = new String[0]; }
    
    public void setAtributosEnPosicion(int posicion, Atributo atributo){
        atributo.setTipo(atributos[posicion].getTipo());
        atributos[posicion] = atributo;
    }
    
    public String getRelacion(){return relacion;}
    public Atributo[] getAtributos(){return atributos;}
    public DefaultTableModel getDatos(){return datos;}
    public String[] getDescripcion(){return descripcion;}
    public char getValorFaltante(){return valorFaltante;}
    
    public String[] getNombresAtributos(){
        String[] nombresAtributos = new String[atributos.length];
        for(int c = 0 ; c<atributos.length ; c++){
            nombresAtributos[c] = atributos[c].getNombre();
        }
        return nombresAtributos;
    }
    
    public void setAtributo(Atributo atributo){
        Atributo[] aux = new Atributo[atributos.length + 1];
        
        for(int c = 0 ; c<aux.length-1 ; c++){
            aux[c] = atributos[c];
        }
        aux[aux.length-1] = atributo;
        atributos = aux;
    }
    
    public void setDescripcion(String descripcion){
        String[] aux = new String[this.descripcion.length + 1];
        
        for(int c = 0 ; c < aux.length-1 ; c++){
            aux[c] = this.descripcion[c];
        }
        aux[aux.length - 1] = descripcion;
        this.descripcion = aux;               
    }
    
    public String descripcionToString(){
        String descripcionCad = new String();
        for(int i=0 ; i<this.descripcion.length ; i++){
            descripcionCad = descripcionCad + this.descripcion[i] +"\n";
        }
        return descripcionCad;
    }
}
