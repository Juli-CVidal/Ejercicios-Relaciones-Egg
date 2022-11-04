/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Perro;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ServiciosPerro {

    private final String[] nombrePerros = {"Coco", "Thor", "Max", "Rocky", "Toby", "Simba", "Luna", "Nala", "Kira", "Lola", "Bimba", "Mia", "Tommy", "Sam"};
    private final String[] razasPerros = {"Husky", "Caniche", "Collie", "Beagle", "Gran Danés", "Pastor Alemán", "Chihuahua", "Callejero", "Bóxer", "Salchicha", "Labrador"};

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ServiciosPerro() {
        List<String> listaNombres = Arrays.asList(nombrePerros);
        Collections.shuffle(listaNombres);
        listaNombres.toArray(nombrePerros);
    }

    public Perro crearPerro(Integer indiceNombre) {
        String nombre = nombrePerros[indiceNombre];

        Integer indiceRaza = (int) (Math.random() * razasPerros.length);
        String raza = razasPerros[indiceRaza];
        Integer edad = (int) (Math.random() * 17);

        return new Perro(nombre, raza, edad);
    }

    public void mostrarPerros(ArrayList<Perro> listaPerros) {
        listaPerros.forEach(perro -> {
            System.out.println(perro);
            System.out.println();
        });
    }
}
