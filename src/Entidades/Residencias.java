/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Residencias extends AlojamientoExtraHotelero{
    private Integer cantHab;
    private Boolean descuentoAgremios;
    private Boolean campoDeportivo;

    public Residencias() {
    }

    public Residencias(Integer cantHab, Boolean descuentoAgremios, Boolean campoDeportivo) {
        this.cantHab = cantHab;
        this.descuentoAgremios = descuentoAgremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(Integer cantHab, Boolean descuentoAgremios, Boolean campoDeportivo, Boolean tipo, Double mtos2) {
        super(tipo, mtos2);
        this.cantHab = cantHab;
        this.descuentoAgremios = descuentoAgremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(Integer cantHab, Boolean descuentoAgremios, Boolean campoDeportivo, Boolean tipo, Double mtos2, String nombre, String direccion, String localidad, String gerente) {
        super(tipo, mtos2, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.descuentoAgremios = descuentoAgremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHab() {
        return cantHab;
    }

    public void setCantHab(Integer cantHab) {
        this.cantHab = cantHab;
    }

    public Boolean getDescuentoAgremios() {
        return descuentoAgremios;
    }

    public void setDescuentoAgremios(Boolean descuentoAgremios) {
        this.descuentoAgremios = descuentoAgremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
        return "--Residencias--" + super.toString()+"\ncantHab= " + cantHab 
                + ", \ndescuentoAgremios= " + descuentoAgremios + ", \ncampoDeportivo= " + 
                campoDeportivo ;
    }
    
}
