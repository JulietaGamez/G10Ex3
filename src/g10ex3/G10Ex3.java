/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ex3;

import Entidades.Alojamiento;
import Servicio.AlojamientoOrquesta;
import Servicio.AlojamientoService;
import java.util.ArrayList;

public class G10Ex3 {

    public static void main(String[] args) {
      //AlojamientoService aS= new AlojamientoService();
      ArrayList<Alojamiento> listaAlojamiento= new ArrayList();
      //Alojamiento a= new Alojamiento();
      //aS.crearAlojamientos(listaAlojamiento);
      //aS.mostrarAlojamiento(listaAlojamiento);
       AlojamientoOrquesta aO= new AlojamientoOrquesta();
       aO.menuAlojamiento(listaAlojamiento);
    }
    
}
