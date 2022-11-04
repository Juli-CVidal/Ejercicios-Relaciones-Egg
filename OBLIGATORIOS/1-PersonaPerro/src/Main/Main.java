/*
// Curso Egg FullStack
 */
package Main;
//Author JulianCVidal

import Entidades.Perro;
import Entidades.Persona;
import Servicios.ServiciosPerro;
import Servicios.ServiciosPersona;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    private static ServiciosPerro ServPerr = new ServiciosPerro();

    public static void main(String[] args) {
        ServiciosPersona ServPers = new ServiciosPersona();

        System.out.println("Primero ingrese a las personas:");
        ArrayList<Persona> listaPersonas = ServPers.crearListaPersonas();

        System.out.println("\nAhora a las mascotas:");
        ArrayList<Perro> listaPerros = ServPerr.crearListaPerros();

        for (Persona pers : listaPersonas) {
            System.out.println("\nTurno de: " + pers.getNombre());
            adoptarPerro(pers, listaPerros);
        }
        
        
        System.out.println("Resultado final: ");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }

    private static void adoptarPerro(Persona pers, ArrayList<Perro> listaPerros) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perro perroAdoptar = null;
        String opc = "N";
        do {
            perroAdoptar = ServPerr.adoptar(listaPerros);
            if (null == perroAdoptar) {
                System.out.print("No se ha encontrado un perro con el nombre ingresado, quiere ingresar otro nombre(S/N)? ");
                opc = leer.next().substring(0, 1);
            }else{
                opc = "N";
            }

        } while (!"N".equalsIgnoreCase(opc));

        pers.setPerro(perroAdoptar);
    }
}
