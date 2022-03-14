/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author julietagamez
 */
public class AlojamientoExtraHotelero extends Alojamiento{
    private Boolean tipo;
    private Double mtos2;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(Boolean tipo, Double mtos2) {
        this.tipo = tipo;
        this.mtos2 = mtos2;
    }

    public AlojamientoExtraHotelero(Boolean tipo, Double mtos2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.tipo = tipo;
        this.mtos2 = mtos2;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }

    public Double getMtos2() {
        return mtos2;
    }

    public void setMtos2(Double mtos2) {
        this.mtos2 = mtos2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return  super.toString()+"\nprivado= " + tipo 
                + ",\nmtos2= " + mtos2 ;
    }
   
    
            
}
