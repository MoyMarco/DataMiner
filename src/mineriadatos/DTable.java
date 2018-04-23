/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mineriadatos;

import java.awt.Color;
import java.awt.Component;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Aldo
 */
public class DTable extends JTable {
    //clase que extiende de JTable para poder pintar la celda en base a 
    //la evaluacion de los datos
    //como se necesita saber el dominio, se incluye una variable para la relacion
    private Relacion relacion;
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, 
            int rowIndex, int columnIndex){
        Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);
        //ignora la primer columna porque es la del identificador
        if(columnIndex>0){
            //obtiene los atributos y la fila de la celda
            Atributo[] atributos = relacion.getAtributos();
            Vector row = (Vector)relacion.getDatos().getDataVector().get(rowIndex);
            //guarda los valores en variables para practicidad
            String valor = getValueAt(rowIndex,columnIndex).toString();
            
            String dominio = atributos[columnIndex-1].getDominio().trim();
            if(!valor.matches(dominio)){//evalua la expresion regular
                component.setBackground(Color.yellow);
                component.setForeground(Color.red);
            }else{
                component.setBackground(Color.white);
                component.setForeground(Color.BLACK);
            }
        }        
        return component;
    }

    public void setRelacion (Relacion r){ 
        relacion = r; 
    }
    public Relacion getRelacion(){
        return relacion;
    }
}

