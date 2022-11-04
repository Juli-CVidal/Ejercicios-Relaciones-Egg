/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Comparadores.Comparadores;
import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import Constantes.Constantes;

public class ServiciosJuego {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final ServiciosJugador ServJuga = new ServiciosJugador();
    private final ServiciosRevolver ServRev = new ServiciosRevolver();

    public void comenzarJuego(ArrayList<Jugador> listaJugadores, Revolver revolver) {
        System.out.println("¡Que comience el juego!");
        ServRev.llenarRevolver(revolver);

        for (int i = 0; i < 6; i++) {
            System.out.println("\nJugadores ingresados: " + (i + 1) + " de 6");
            listaJugadores.add(ServJuga.crearJugador());
        }
        Collections.sort(listaJugadores, Comparadores.ordenarPorID);
    }

    public void menu() {
        Juego partidaActual = new Juego();
        int numeroJugador = 0;
        String opc = "Y";

        ArrayList<Jugador> listaJugadores = partidaActual.getListaJugadores();
        Revolver revolver = partidaActual.getRevolver();
        comenzarJuego(listaJugadores, revolver);
        Jugador jugadorActual;

        do {
            jugadorActual = listaJugadores.get(numeroJugador);
            numeroJugador++;
            if (numeroJugador > 5) {
                numeroJugador = 0;
            }
            
            if (jugadorActual.isMojado()) {
                continue;
            }
            siguienteRonda(jugadorActual, revolver);

            System.out.print("\n" + Constantes.SEGUIR_JUGANDO);
            opc = leer.next().substring(0, 1).toUpperCase();

        } while (!todosMojados(listaJugadores) && !opc.equals("N"));
        mostrarResultados(listaJugadores);
    }

    public void siguienteRonda(Jugador jugadorActual, Revolver revolver) {
        System.out.println("\nTurno del jugador: " + jugadorActual.getNombre());
        if (ServJuga.disparar(jugadorActual, revolver)) {
            System.out.println(Constantes.JUGADOR_MOJADO);
            System.out.println(Constantes.RECARGAR);
            ServRev.llenarRevolver(revolver);
        } else {
            System.out.println(Constantes.JUGADOR_SALVADO);
        }
    }

    public boolean todosMojados(ArrayList<Jugador> listaJugadores) {
        return listaJugadores.stream().noneMatch((jugador) -> (!jugador.isMojado()));
    }

    public void mostrarResultados(ArrayList<Jugador> listaJugadores) {
        listaJugadores.forEach((jugador) -> {
            System.out.println(jugador.getNombre() + ", mojado: " + jugador.isMojado());
        });
    }
}
