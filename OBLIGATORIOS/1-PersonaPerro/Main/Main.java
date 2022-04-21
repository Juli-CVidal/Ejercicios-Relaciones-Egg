/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Persona;
import Servicios.ServiciosPersona;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ServiciosPersona ServPers = new ServiciosPersona();

        ArrayList<Persona> listaPersonas = new ArrayList();
        for (int i = 0; i < 2; i++) {
            System.out.println("Le pediremos primero su información y luego la de su perro.");
            listaPersonas.add(ServPers.crearPersona());
            System.out.println();
        }

        for (Persona persona : listaPersonas) {
            ServPers.mostrarPersona(persona);
            System.out.println();
        }
    }
}
