/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Alojamiento;
import Entidades.Hotel;
import java.util.Comparator;

/**
 *
 * @author julietagamez
 */
public class Comparadores {
    public static Comparator <Hotel> ordenarPorPrecioDesc= new Comparator<Hotel> (){
       

        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o2.getPrecioHabitacion().compareTo(o1.getPrecioHabitacion());
        }

        
    };
}
