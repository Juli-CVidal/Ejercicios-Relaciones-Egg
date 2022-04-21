/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Constantes.Constantes;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosJugador {

    private final ServiciosRevolver ServRev = new ServiciosRevolver();
    private final ArrayList<Integer> idsUsados = new ArrayList();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador crearJugador() {
        System.out.print("Ingrese su id (1-6): ");
        int ID = leer.nextInt();
        while (ID <= 0 || ID >= 7 || !idDisponible(ID)) {
            System.out.print(Constantes.ID_INVALIDO);
            ID = leer.nextInt();
        }

        idsUsados.add(ID);
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();
        nombre = String.valueOf(ID) + "-" + nombre;

        return new Jugador(ID, nombre);
    }

    private boolean idDisponible(int nuevoID) {
        for (int idUsado : idsUsados) {
            if (idUsado == nuevoID) {
                return false;
            }
        }
        return true;
    }

    public boolean disparar(Jugador jugador, Revolver revolver) {
        if (ServRev.mojar(revolver)) {
            jugador.setMojado(true);
        }

        ServRev.siguienteChorro(revolver);
        return jugador.isMojado();
    }
}
