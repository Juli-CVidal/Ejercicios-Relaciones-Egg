/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Constantes.Constantes;
import java.util.Scanner;
import Entidades.*;
import java.util.ArrayList;

public class Juego {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ServiciosBaraja ServBar = new ServiciosBaraja();

    public void menu() {
        Baraja barajaActual = ServBar.crearBaraja();
        ArrayList<Carta> cartasDisponibles = barajaActual.getCartasDisponibles();
        ArrayList<Carta> cartasUsadas = barajaActual.getCartasUsadas();

        Carta cartaActual;
        System.out.println("¡Que comience el juego!");
        Integer opc, cantidad;
        do {
            System.out.println(Constantes.OPCIONES_DISPONIBLES);
            System.out.print(Constantes.ELEGIR_OPCION);
            opc = leer.nextInt();

            if (opc <= 0 || opc >= 7) {
                if (opc != 7) {
                    System.out.println(Constantes.OPCION_INVALIDA);
                }else{
                    System.out.println(Constantes.SALIR);
                }
                continue;
            }

            switch (opc) {
                case 1: //barajar
                    System.out.println(Constantes.BARAJAR);
                    ServBar.barajar(cartasDisponibles, cartasUsadas);
                    break;

                case 2: //Obtener una carta
                    cartaActual = ServBar.siguienteCarta(barajaActual);
                    if (cartaActual != null) {
                        System.out.println(Constantes.MOSTRAR_CARTA + cartaActual);
                    } else {
                        System.out.println(Constantes.BARAJA_VACIA);
                    }
                    break;

                case 3: //ver cantidad de cartas disponibles
                    ServBar.cartasDisponibles(cartasDisponibles);
                    break;

                case 4: //Obtener varias cartas
                    System.out.print(Constantes.PEDIR_CANTIDAD);
                    cantidad = leer.nextInt();
                    while (cantidad <= 0) {
                        System.out.print(Constantes.OPCION_INVALIDA);
                        cantidad = leer.nextInt();
                    }

                    if (cantidad > cartasDisponibles.size()) {
                        System.out.println(Constantes.SIN_CARTAS_DISPONIBLES);
                        break;
                    }
                    System.out.println(Constantes.MOSTRAR_CARTAS);
                    ServBar.darCartas(barajaActual, cantidad);
                    break;

                case 5: //mostrar cartas del montón
                    if (cartasUsadas.isEmpty()) {
                        System.out.println(Constantes.SIN_CARTAS_MONTON);
                    }
                    System.out.println(Constantes.MOSTRAR_CARTAS_MONTON);
                    ServBar.mostrarMonton(cartasUsadas);
                    break;

                case 6:
                    if (cartasDisponibles.isEmpty()) {
                        System.out.println(Constantes.BARAJA_VACIA);
                        break;
                    }

                    System.out.println(Constantes.MOSTRAR_CARTAS_BARAJA);
                    ServBar.mostrarBaraja(cartasDisponibles);
                    break;
            }
            
            esperarTecla();
        } while (!opc.equals(7));
    }

    private void esperarTecla() {
        System.out.println(Constantes.ESPERAR_ENTER);
        String pass = leer.next();
    }
}
