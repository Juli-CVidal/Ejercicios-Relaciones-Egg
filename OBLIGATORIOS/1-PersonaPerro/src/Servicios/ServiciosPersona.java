/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPersona {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Persona crearPersona() {
        Persona nuevaPersona = new Persona();

        System.out.print("Ingrese su nombre: ");
        nuevaPersona.setNombre(leer.next());

        System.out.print("Su apellido: ");
        nuevaPersona.setApellido(leer.next());

        System.out.print("Su edad: ");
        nuevaPersona.setEdad(leer.nextInt());

        System.out.print("Y su DNI: ");
        nuevaPersona.setDNI(leer.nextInt());

        return nuevaPersona;
    }

    public ArrayList<Persona> crearListaPersonas() {
        ArrayList<Persona> listaPersonas = new ArrayList();
        for (int i = 1; i < 3; i++) {
            System.out.println("Persona Nº" + i + ":");
            listaPersonas.add(crearPersona());
        }

        return listaPersonas;
    }
}
