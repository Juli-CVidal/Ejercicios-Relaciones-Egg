/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Perro;
import java.util.Scanner;

public class ServiciosPerro {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro nuevoPerro = new Perro();
        System.out.print("Ingrese el nombre del perro: ");
        nuevoPerro.setNombre(leer.next());

        System.out.print("Su raza: ");
        nuevoPerro.setRaza(leer.next());

        System.out.print("Su edad: ");
        nuevoPerro.setEdad(leer.nextInt());

        System.out.print("Y su tamaño (pequeño/mediano/grande): ");
        nuevoPerro.setTamaño(leer.next());

        return nuevoPerro;
    }
    
    public void mostrarPerro(Perro perro){
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Edad: " + perro.getEdad() + " años.");
        System.out.println("Tamaño: " + perro.getTamaño());
    }
}
