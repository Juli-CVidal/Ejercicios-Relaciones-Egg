/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Persona;
import java.util.Scanner;

public class ServiciosPersona {
    private final ServiciosPerro ServPerr = new ServiciosPerro();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona nuevaPersona = new Persona();
        
        System.out.print("Ingrese su nombre: ");
        nuevaPersona.setNombre(leer.next());
        
        System.out.print("Su apellido: ");
        nuevaPersona.setApellido(leer.next());
        
        System.out.print("Su edad: ");
        nuevaPersona.setEdad(leer.nextInt());
        
        System.out.print("Y su DNI: ");
        nuevaPersona.setDNI(leer.nextInt());
        
        System.out.println("\nAhora le pediremos la información acerca de su perro");
        nuevaPersona.setPerro(ServPerr.crearPerro());
        
        return nuevaPersona;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(persona.getApellido() + ", " + persona.getNombre());
        System.out.println("DNI: " + persona.getDNI());
        System.out.println("Edad: " + persona.getEdad() + " años");
        System.out.println("\nSu perro es:");
        ServPerr.mostrarPerro(persona.getPerro());
    }
}
