/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal


public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer DNI;
    //OneToOne 1...1
    private Perro perro;
    



    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer DNI, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre
                + "\n" + mostrarPerro();
    }

    private String mostrarPerro() {
        if (null == perro) {
            return "No tiene perros";
        }
        return "Duenio de : " + perro.toString();
    }
}
