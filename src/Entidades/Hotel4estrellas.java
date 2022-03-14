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
public class Hotel4estrellas extends Hotel{
    protected String gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4estrellas() {
    }

   

    public Hotel4estrellas(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer numHabitaciones, Integer numCamas, Integer numPisos, Double precioHabitacion) {
        super(numHabitaciones, numCamas, numPisos, precioHabitacion);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Hotel4estrellas(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer numHabitaciones, Integer numCamas, Integer numPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(numHabitaciones, numCamas, numPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
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
        return "---Hotel4estrellas---" + super.toString()+ "\ngimnasio= " + gimnasio 
                + ", \nnombreRestaurante= " + nombreRestaurante 
                + ", \ncapacidadRestaurante= " + capacidadRestaurante 
                ;
                
                
    }
    
    
}
