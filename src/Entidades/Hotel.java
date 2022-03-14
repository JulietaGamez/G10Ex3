
package Entidades;

public class Hotel extends Alojamiento{
    private Integer numHabitaciones;
    private Integer numCamas;
    private Integer numPisos;
    private Double precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer numHabitaciones, Integer numCamas, Integer numPisos, Double precioHabitacion) {
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Hotel(Integer numHabitaciones, Integer numCamas, Integer numPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
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
        return super.toString()+"\nnumHabitaciones= " + numHabitaciones
                + ", \nnumCamas= " + numCamas + ", \nnumPisos=" + numPisos 
                + ", \nprecioHabitacion= " + precioHabitacion  ;
    }
    
            
}
