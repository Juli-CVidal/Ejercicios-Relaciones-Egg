/*
// Curso Egg FullStack
 */
package Orquestador;

// @author JulianCVidal
import Constantes.Constantes;
import Entidades.Carta;
import Servicios.ServiciosBaraja;
import java.util.ArrayList;
import java.util.Scanner;

public class Orquestador {

    private static final Scanner LEER = new Scanner(System.in).useDelimiter("\n");
    private static final ServiciosBaraja SERVICE = new ServiciosBaraja();
    private static final ArrayList<Carta> BARAJA = SERVICE.crearBaraja();

    public static void menuPrincipal() {
        int opc;

        do {
            System.out.println(Constantes.OPCIONES_DISPONIBLES);
            System.out.print(Constantes.PEDIR_OPCION);
            opc = LEER.nextInt();

            if (!validar(opc)) {
                continue;
            }

            switch (opc) {
                case 1: //barajar
                    SERVICE.barajar(BARAJA);
                    break;

                case 2: //obtener una carta
                    mostrarCarta();
                    break;

                case 3: //ver cuántas cartas quedan disponibles
                    mostrarCartasDisponibles();
                    break;

                case 4: //obtener varias cartas
                    obtenerCartas();
                    break;

                case 5: //mostrar cartas usadas
                    System.out.println(Constantes.MOSTRAR_CARTAS_USADAS);
                    SERVICE.mostrarCartasUsadas(BARAJA);
                    break;

                case 6: //mostrar cartas disponibles
                    System.out.println(Constantes.MOSTRAR_CARTAS_DISPONIBLES);
                    SERVICE.mostrarCartasDisponibles(BARAJA);
                    break;
            }
            esperarTecla();

        } while (7 != opc);
        System.out.println(Constantes.SALIR);
    }

    private static boolean validar(int opc) {
        return 0 < opc && 7 >= opc;
    }

    private static void mostrarCarta() {
        Carta cartaActual = SERVICE.siguienteCarta(BARAJA);
        if (null == cartaActual) {
            System.out.println(Constantes.SIN_CARTAS_DISPONIBLES);
            return;
        }
        
        System.out.println(Constantes.MOSTRAR_CARTA);
        System.out.println(cartaActual);
    }

    private static void mostrarCartasDisponibles() {
        long cantidad = SERVICE.cartasDisponibles(BARAJA);
        System.out.println(Constantes.MOSTRAR_CANTIDAD_DISPONIBLES(cantidad));
    }

    private static void obtenerCartas() {
        System.out.print(Constantes.PEDIR_CANTIDAD);
        int cantidad = LEER.nextInt();
        if (0 >= cantidad) {
            System.out.println(Constantes.OPCION_INVALIDA);
            return;
        }
        ArrayList<Carta> cartasDevueltas = SERVICE.darCartas(BARAJA, cantidad);
        if (null != cartasDevueltas) {
            cartasDevueltas.forEach(System.out::println);
        }
    }

    private static void esperarTecla() {
        System.out.println(Constantes.ESPERAR_ENTER);
        String pass = LEER.next();
    }

}
