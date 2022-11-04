/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPerro {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Perro crearPerro() {
        Perro nuevoPerro = new Perro();
        System.out.print("Ingrese el nombre del perro: ");
        nuevoPerro.setNombre(leer.next());

        System.out.print("Su raza: ");
        nuevoPerro.setRaza(leer.next());

        System.out.print("Su edad: ");
        nuevoPerro.setEdad(leer.nextInt());

        System.out.print("Y su tamanio (pequenio/mediano/grande): ");
        nuevoPerro.setTamanio(leer.next());

        return nuevoPerro;
    }

    public ArrayList<Perro> crearListaPerros() {
        ArrayList<Perro> listaPerros = new ArrayList();
        for (int i = 1; i < 3; i++) {
            System.out.println("Perro Nº" + i + ":");
            listaPerros.add(crearPerro());
        }
        return listaPerros;
    }

    private Perro buscarPerro(ArrayList<Perro> listaPerros, String nombre) {
        for (Perro perro : listaPerros) {
            if (perro.getNombre().equals(nombre)) {
                return perro;
            }
        }
        return null;
    }

    public Perro adoptar(ArrayList<Perro> listaPerros) {
        System.out.println("Ingrese el nombre del perro a adoptar: ");
        String nombre = leer.next();
        return buscarPerro(listaPerros, nombre);
    }
}
