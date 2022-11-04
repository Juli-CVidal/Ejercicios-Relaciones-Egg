/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Alumno {

    private final String nombre;
    private final String apellido;
    private final Long DNI;
    private Integer votosRecibidos;
    private boolean facilitador;
    private boolean facilitadorSuplente;

    public Alumno(String nombre, String apellido, Long DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.votosRecibidos = 0;
        this.facilitador = false;
        this.facilitadorSuplente = false;
    }

    public void setVotosRecibidos(Integer votosRecibidos) {
        this.votosRecibidos = votosRecibidos;
    }

    public void setFacilitador(boolean facilitador) {
        this.facilitador = facilitador;
    }

    public void setFacilitadorSuplente(boolean facilitadorSuplente) {
        this.facilitadorSuplente = facilitadorSuplente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getDNI() {
        return DNI;
    }

    public Integer getVotosRecibidos() {
        return votosRecibidos;
    }

    public boolean isFacilitador() {
        return facilitador;
    }

    public boolean isFacilitadorSuplente() {
        return facilitadorSuplente;
    }

}
