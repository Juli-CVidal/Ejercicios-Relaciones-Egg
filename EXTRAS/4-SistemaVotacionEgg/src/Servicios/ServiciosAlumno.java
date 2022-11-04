/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Alumno;
import java.util.ArrayList;

public class ServiciosAlumno {

    private final String[] nombres = {"Julian", "Emiliano", "Yeumen", "Bruno", "Rocio", "Lucia", "Paula", "Matias", "Gonzalo", "Martin", "Sol", "Santiago", "Augusto"};
    private final String[] apellidos = {"Sanchez", "Gallerani", "Cogo", "Videla", "Quiroga", "Canillas", "Vidal", "Riba", "Germani", "Trillini", "Garcia", "Rodriguez"};

    public boolean crearAlumnos(ArrayList<Alumno> listaAlumnos, int cantidad) {
        Alumno nuevoAlumno;
        int indexNombres, indexApellidos;
        long DNI;

        for (int i = 0; i < cantidad; i++) {
            DNI = (int) (Math.random() * 899999999) + 10000000;
            indexNombres = (int) (Math.random() * nombres.length);
            indexApellidos = (int) (Math.random() * apellidos.length);
            nuevoAlumno = new Alumno(nombres[indexNombres], apellidos[indexApellidos], DNI);
            listaAlumnos.add(nuevoAlumno);
        }
        return true;
    }

    public void mostrarAlumno(Alumno alumno) {
        System.out.println(alumno.getApellido() + ", " + alumno.getNombre() + ":");
        System.out.println("Votos recibidos: " + alumno.getVotosRecibidos());
        System.out.println("Facilitador: " + alumno.isFacilitador() + ", suplente: " + alumno.isFacilitadorSuplente());
    }

    public void mostrarAlumnos(ArrayList<Alumno> listaAlumnos) {
        listaAlumnos.forEach((alumno) -> {
            mostrarAlumno(alumno);
        });
    }
}
