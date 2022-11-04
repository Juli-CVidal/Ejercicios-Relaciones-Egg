/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Revolver;

public class ServiciosRevolver {

    public boolean llenarRevolver(Revolver revolver) {
        Integer posCarga = (int) (Math.random() * 6) + 1;
        Integer posActual = (int) (Math.random() * 6) + 1;
        revolver.setPosicionCarga(posCarga);
        revolver.setPosicionActual(posActual);

        return true;
    }

    public boolean mojar(Revolver revolver) {
        return revolver.getPosicionActual() == revolver.getPosicionCarga();
    }

    public boolean siguienteChorro(Revolver revolver) {
        int posActual = revolver.getPosicionActual() + 1;
        if (posActual > 6) {
            posActual = 1;
        }

        revolver.setPosicionActual(posActual);
        return true;
    }
    
    public void mostrarRevolver(Revolver revolver){
        System.out.println("Posición de la carga: " + revolver.getPosicionCarga());
        System.out.println("Posición actual: " + revolver.getPosicionActual());
    }
}
