
package Entidades;

public class Camping extends AlojamientoExtraHotelero{
    private Integer capacidadCarpas;
    private Integer cantBanios;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer capacidadCarpas, Integer cantBanios, Boolean restaurante) {
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public Camping(Integer capacidadCarpas, Integer cantBanios, Boolean restaurante, Boolean tipo, Double mtos2) {
        super(tipo, mtos2);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public Camping(Integer capacidadCarpas, Integer cantBanios, Boolean restaurante, Boolean tipo, Double mtos2, String nombre, String direccion, String localidad, String gerente) {
        super(tipo, mtos2, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public Integer getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(Integer capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
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
        return "--Camping--" +super.toString()+ "\ncapacidadCarpas= " + capacidadCarpas + ", \ncantBanios= " + cantBanios + ", \nrestaurante= " + restaurante;
    }
    
}
