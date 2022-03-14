/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4estrellas;
import Entidades.Hotel5estrellas;
import Entidades.Residencias;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlojamientoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alojamiento> listaAlojamiento = new ArrayList();

    public ArrayList<Alojamiento> crearAlojamientos(ArrayList<Alojamiento> listaAlojamiento) {

        Hotel4estrellas h4 = new Hotel4estrellas("A", "La fuerza", 20, 10, 20, 4, 0.0, "Hotel el Paso", "Ruta 30", "Bolivar", "Jorge Perez");
        h4.setPrecioHabitacion(calcularPrecioHabitacion(h4));
        listaAlojamiento.add(h4);
        Hotel4estrellas h4a = new Hotel4estrellas("B", "Comedor", 30, 30, 40, 4, 0.0, "Hotel Cordillera", "Ruta 20", "Allende", "Oscar Gomez");
        h4a.setPrecioHabitacion(calcularPrecioHabitacion(h4a));
        listaAlojamiento.add(h4a);
        Hotel4estrellas h4b = new Hotel4estrellas("A", "Cafe Europa", 40, 10, 60, 4, 0.0, "Hotel Rio Grande", "Ruta 7", "Areco", "Rosa Garcia");
        h4b.setPrecioHabitacion(calcularPrecioHabitacion(h4b));
        listaAlojamiento.add(h4b);

        Hotel5estrellas h5 = new Hotel5estrellas(2, 3, 2, "B", "Jerome", 50, 15, 50, 4, 0.0, "Hotel Imagine", "Republica del Salvador 32", "CABA", "Susana Lopez");
        h5.setPrecioHabitacion(calcularPrecioHabitacion(h5));
        listaAlojamiento.add(h5);
        Hotel5estrellas h5a = new Hotel5estrellas(1, 2, 1, "B", "Pez Espada", 30, 25, 55, 2, 0.0, "Hotel Singapur", "Tali 132", "Costa Esmeralda", "Matias Kriep");
        h5a.setPrecioHabitacion(calcularPrecioHabitacion(h5a));
        listaAlojamiento.add(h5a);
        Hotel5estrellas h5b = new Hotel5estrellas(4, 3, 3, "A", "Jerome", 100, 35, 60, 5, 0.0, "Hotel Posta Alta", "Ecaudor 554", "Zapala", "Jorge Lupo");
        h5b.setPrecioHabitacion(calcularPrecioHabitacion(h5b));
        listaAlojamiento.add(h5b);
        Hotel5estrellas h5c = new Hotel5estrellas(5, 4, 4, "A", "Jerome", 50, 15, 50, 4, 0.0, "Hotel Runtun", "Mana 32", "Manta", "Diana Velasco");
        h5c.setPrecioHabitacion(calcularPrecioHabitacion(h5c));
        listaAlojamiento.add(h5c);

        Camping c = new Camping(10, 5, true, true, 2000.00, "Camping Chachingo", "Mana 32", "Manta", "Diana Velasco");
        listaAlojamiento.add(c);
        Camping c1 = new Camping(20, 15, true, false, 4000.00, "Camping Potrerillos", "Cerro nevado 32", "Lujan", "Juan Ponce");
        listaAlojamiento.add(c1);
        Camping c2 = new Camping(150, 10, false, false, 14000.00, "Camping Vallecitos", "Portal 6210", "Tupungato", "Pedro Juarez");
        listaAlojamiento.add(c2);
        Camping c3 = new Camping(50, 25, false, true, 2500.00, "Camping Monañita", "Echeverria 532", "Lujan", "Franco Mendoza");
        listaAlojamiento.add(c3);
        Residencias r = new Residencias(40,false, true, true, 2500.00, "Camping Monañita", "Echeverria 298", "Lujan", "Fausta Cordero");
        listaAlojamiento.add(r);
        Residencias r1 = new Residencias(50, false, true, false, 4500.00, "Residencia Paz", "Cervantes 987", "Lulunta", "Gladis Gimenez");
        listaAlojamiento.add(r1);
        Residencias r2 = new Residencias(60, true, false, false, 6500.00, "Residencia Brisa", "Cerezos 432", "Maipu", "Viviana Canosa");
        listaAlojamiento.add(r2);
        Residencias r3 = new Residencias(34, false, false, false, 1500.00, "Residencia Cruz del Sur", "Piedra negra", "Tunuyan", "Guillermo Pedroza");
        listaAlojamiento.add(r3);

        return listaAlojamiento;
    }

    public void mostrarAlojamiento(ArrayList<Alojamiento> listaAlojamiento) {
        for (Alojamiento alojamiento : listaAlojamiento) {
            System.out.println("");

            System.out.println(alojamiento.toString());

        }
    }

    public Double calcularPrecioHabitacion(Alojamiento a) {
        Double precio = 0.0;
        if ((a instanceof Hotel4estrellas) || (a instanceof Hotel5estrellas)) {
            Hotel4estrellas h = (Hotel4estrellas) a;
            precio = 50.00 + (h.getNumHabitaciones() * 2);

            if (h.getCapacidadRestaurante() < 30) {
                precio = precio + 10;
            } else if (h.getCapacidadRestaurante() >= 30 && h.getCapacidadRestaurante() < 50) {
                precio = precio + 30;
            } else if (h.getCapacidadRestaurante() > 50) {
                precio = precio + 50;
            }
            if (h.getGimnasio().equalsIgnoreCase("A")) {//aca iba un IF directamente, antes habia puesto un else y por eso no entraba
                precio = precio + 50;
            } else if (h.getGimnasio().equalsIgnoreCase("B")) {
                precio = precio + 30;
            }

            if (h instanceof Hotel5estrellas) {
                Hotel5estrellas h5 = (Hotel5estrellas) h;
                precio = precio + (h5.getCantidadLimosinas() * 15);
            }

        }

        return precio;
    }

    public void mostrarHotelesPorPrecio(ArrayList<Alojamiento> listaAlojamiento) {
        ArrayList<Hotel> listaHoteles = new ArrayList();
        for (Alojamiento alojamiento : listaAlojamiento) {
            if (alojamiento instanceof Hotel) {
                listaHoteles.add((Hotel) alojamiento);
            }
        }
        Collections.sort(listaHoteles, Comparadores.ordenarPorPrecioDesc);
        for (Hotel listaHotele : listaHoteles) {
            System.out.println(listaHotele);
        }
    }

    public void mostrarCampingsConRestaurante(ArrayList<Alojamiento> listaAlojamiento) {
        int contador = 0;
        for (Alojamiento a : listaAlojamiento) {
            if (a instanceof Camping) {
                Camping c = (Camping) a;
                if (c.getRestaurante().equals(true)) {
                    contador++;
                    System.out.println(c);
                }
            }
        }
        if (contador == 0) {
            System.out.println("Lo sentimos no tenemos Campings con Restaurante");
        }
    }
    public void mostrarResidenciasConDescuento(ArrayList<Alojamiento> listaAlojamiento) {
        int contador = 0;
        for (Alojamiento a : listaAlojamiento) {
            if (a instanceof Residencias) {
                Residencias r = (Residencias) a;
                if (r.getDescuentoAgremios().equals(true)) {
                    contador++;
                    System.out.println(r);
                }
            }
        }
        if (contador == 0) {
            System.out.println("Lo sentimos no tenemos Residencias con Descuento");
        }
    }
}
