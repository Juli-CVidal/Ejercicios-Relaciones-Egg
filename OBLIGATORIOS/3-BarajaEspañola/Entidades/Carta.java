/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Carta {

    private final String tipo;
    private final Integer numero;

    public Carta(String tipo, Integer numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " de " + tipo + "."; //1 de Espada, 7 de Oro..
    }
}
