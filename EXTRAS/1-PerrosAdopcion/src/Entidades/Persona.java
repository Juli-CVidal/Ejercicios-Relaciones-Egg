/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import Constantes.Constantes;
import java.util.ArrayList;

public class Persona {

    private final String nombre;
    private final String apellido;
    private final Integer edad;
    private final Integer DNI;
    private final ArrayList<Perro> adoptados;

    public Persona(String nombre, String apellido, Integer edad, Integer DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.adoptados = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public ArrayList<Perro> getAdoptados() {
        return adoptados;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre
                + "\n" + edad + " años, DNI: " + DNI
                + mostrarAdoptados();
    }
    
    public String mostrarAdoptados(){
        if (adoptados.isEmpty()){
            return Constantes.SIN_PERROS;
        }
        String nombresPerros = Constantes.MOSTRAR_PERROS;
        for (Perro perro : adoptados) {
            nombresPerros += perro.getNombre() + ", ";
        }
        return nombresPerros;
    }
}
