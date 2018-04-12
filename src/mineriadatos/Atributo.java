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
public class Atributo {
    private String nombre;
    private String tipo;
    private String dominio;
    
    public Atributo(){}
    
    public Atributo(String nombre, String tipo, String dominio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.dominio = dominio;
    }
    
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setTipo(String tipo){this.tipo = tipo;}
    public void setDominio(String dominio){this.dominio = dominio;}
    
    public String getNombre(){return nombre;}
    public String getTipo(){return tipo;}
    public String getDominio(){return dominio;}

    public String toString(){
        return  nombre + " " + tipo + " " + dominio;
    }
}
