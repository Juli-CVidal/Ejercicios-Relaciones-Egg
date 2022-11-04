/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import Enums.Numeros;
import Enums.Tipos;

public class Carta {

    private final Tipos tipo;
    private final Numeros numero;
    private boolean usada;

    public Carta(Tipos tipo, Numeros numero) {
        this.tipo = tipo;
        this.numero = numero;
        this.usada = false;
    }

    public boolean isUsada() {
        return usada;
    }

    public void setUsada(boolean usada) {
        this.usada = usada;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public Numeros getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " de " + tipo;
    }

}
