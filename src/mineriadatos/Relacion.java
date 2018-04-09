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
    private Atributo[] atributos = new Atributo[0];
    private DefaultTableModel datos = new DefaultTableModel();
    
    public Relacion(){}
    
    public Relacion(String relacion, Atributo[] atributos, DefaultTableModel datos){
        this.relacion = relacion;
        this.atributos = atributos;
        this.datos = datos; 
    }
    
    public void setRelacion(String relacion){this.relacion = relacion;}
    public void setAtributos(Atributo[] atributos){this.atributos = atributos;}
    public void setDatos(DefaultTableModel datos){this.datos = datos;}
    
    public String getRelacion(){return relacion;}
    public Atributo[] getAtributos(){return atributos;}
    public DefaultTableModel getDatos(){return datos;}
    
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
}
