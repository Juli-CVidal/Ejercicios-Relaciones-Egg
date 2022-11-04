/*
// Curso Egg FullStack
 */
package Comparadores;

// @author JulianCVidal
import Entidades.Jugador;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Jugador> ordenarPorID = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador jug1, Jugador jug2) {
            return jug1.getID().compareTo(jug2.getID());
        }

    };
}
