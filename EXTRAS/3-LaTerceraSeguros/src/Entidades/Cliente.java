/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Cliente {

    private final String nombre;
    private final String apellido;
    private final Integer DNI;
    private final String mail;
    private final String domicilio;
    private final Integer telefono;

    public Cliente(String nombre, String apellido, Integer DNI, String mail, String domicilio, Integer telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public String getMail() {
        return mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Integer getTelefono() {
        return telefono;
    }

}
