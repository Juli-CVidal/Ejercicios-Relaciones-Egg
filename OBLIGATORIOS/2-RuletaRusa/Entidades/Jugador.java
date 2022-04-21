/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Jugador {

    private final Integer ID;
    private final String nombre;
    private boolean mojado;

    public Jugador(Integer ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = false;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Integer getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }
}
