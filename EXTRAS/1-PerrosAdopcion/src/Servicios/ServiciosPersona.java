/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Constantes.Constantes;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPersona {
    private final ServiciosPerro ServPerr = new ServiciosPerro();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(ArrayList<Persona> listaPersonas) {
        System.out.print(Constantes.PEDIR_NOMBRE_PERSONA);
        String nombre = leer.next();

        
        System.out.print(Constantes.PEDIR_APELLIDO_PERSONA);
        String apellido = leer.next();
        
        System.out.print(Constantes.PEDIR_EDAD_PERSONA);
        Integer edad = leer.nextInt();
        
        System.out.print(Constantes.PEDIR_DNI_PERSONA);
        Integer DNI = leer.nextInt();
        
        Persona nuevaPersona = new Persona(nombre,apellido,edad,DNI);
        listaPersonas.add(nuevaPersona);
        return nuevaPersona;
    }
    
    public void mostrarPersonas(ArrayList<Persona> listaPersonas){
        listaPersonas.forEach(persona -> {
            System.out.println(persona);
            System.out.println();
        });
    }
}
