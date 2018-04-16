/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mineriadatos;

/**
 *
 * @author joelv
 */
public class FrecuenciaDato {
    private String nombreAtrubuto;
    private int frecuencia = 0;
    
    public void setNombreAtributo(String nombreAtributo){this.nombreAtrubuto = nombreAtributo;}
    public void setFrecuencia(int frecuencia){this.frecuencia = frecuencia;}
    
    public String setNombreAtributo(){return this.nombreAtrubuto;}
    public int setFrecuencia(){return this.frecuencia;}
}
