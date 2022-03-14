
package Servicio;

import Entidades.Alojamiento;
import java.util.ArrayList;
import java.util.Scanner;

public class AlojamientoOrquesta extends AlojamientoService{
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
   public void menuAlojamiento(ArrayList<Alojamiento> listaAlojamiento){
       super.crearAlojamientos(listaAlojamiento);
       int opcion=0;
       while (opcion<5) {
           System.out.println("");
           System.out.println("---ALOJAMIENTOS---");
           System.out.println("Ingrese la opcion deseada\n1.Consultar todos los alojamientos\n2.Ver los alojamientos de mas caro a mas barato \n3.Mostrar Camping con restaurante \n4.Mostrar todas las residencias que tienen descuento");
           opcion=leer.nextInt();
           switch (opcion) {
               case 1:
                 super.mostrarAlojamiento(listaAlojamiento);
                   break;
               case 2:
                   super.mostrarHotelesPorPrecio(listaAlojamiento);
                  break;
               case 3:
                   super.mostrarCampingsConRestaurante(listaAlojamiento);
                   break;
               case 4:
                   super.mostrarResidenciasConDescuento(listaAlojamiento);
                   break;
               default:
                   System.out.println("Usted salio del sistema");
           }
       }
       
   }
}
