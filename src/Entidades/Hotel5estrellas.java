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
public class Hotel5estrellas extends Hotel4estrellas{
    private Integer cantidadSalonesConferencia;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;

    public Hotel5estrellas() {
    }

    public Hotel5estrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimosinas) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Hotel5estrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer numHabitaciones, Integer numCamas, Integer numPisos, Double precioHabitacion) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, numHabitaciones, numCamas, numPisos, precioHabitacion);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Hotel5estrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer numHabitaciones, Integer numCamas, Integer numPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, numHabitaciones, numCamas, numPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }


   


   

    public Integer getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(Integer cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
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
        return "---Hotel5estrellas---" + 
                "\nnombre hotel = "+super.nombre+
                "\nlocalidad= "+super.localidad+
                "\ndireccion= "+super.direccion+ 
                "\ngerente= "+super.gerente+
                "\ncantidadSalonesConferencia= " + cantidadSalonesConferencia +
                ", \ncantidadSuites= " + cantidadSuites +
                ", \ncantidadLimosinas= " + cantidadLimosinas+
                "\ndireccion= "+super.direccion+ 
                "\ngerente= "+super.gerente+"\ngimnasio= "+ super.gimnasio+ 
                "\nprecio habitacion= "+super.getPrecioHabitacion()+
                "\nnombre restaurante= "+super.nombreRestaurante+
                "\ncapacidad restaurante= "+ super.capacidadRestaurante;
    }
    
}
