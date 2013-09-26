/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.banco;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {
    
    private int idEntidad;
    private String codigoEntidad;
    private String nombre;
    private String cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
    
    //Constructor Vacio
    
    public EntidadBancaria(){
    
    
    }

    //Constructor Sobrecargado
    public EntidadBancaria(int idEntidad, String codigoEntidad, String nombre, String cif, TipoEntidadBancaria tipoEntidadBancaria) {
        this.idEntidad = idEntidad;
        this.codigoEntidad = codigoEntidad;
        this.nombre = nombre;
        this.cif = cif;
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }
    
    
    
    
}
