/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Carta {

    private final String tipo;
    private final Integer numero;
    private  boolean usada;

    public Carta(String tipo, Integer numero) {
        this.tipo = tipo;
        this.numero = numero;
        this.usada = false;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public boolean isUsada() {
        return usada;
    }

    public void setUsada(boolean usada) {
        this.usada = usada;
    }
    

    @Override
    public String toString() {
        return numero + " de " + tipo + "."; //1 de Espada, 7 de Oro..
    }
}
