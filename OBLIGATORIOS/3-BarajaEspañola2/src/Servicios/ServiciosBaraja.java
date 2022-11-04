/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Carta;
import Enums.Numeros;
import Enums.Tipos;
import java.util.ArrayList;
import java.util.Collections;

public class ServiciosBaraja {

    public ArrayList<Carta> crearBaraja() {
        ArrayList<Carta> nuevaBaraja = new ArrayList();

        for (Tipos palo : Tipos.values()) {
            for (Numeros numero : Numeros.values()) {
                Carta nuevaCarta = new Carta(palo, numero);
                nuevaBaraja.add(nuevaCarta);
            }
        }

        barajar(nuevaBaraja);
        return nuevaBaraja;
    }

    public void barajar(ArrayList<Carta> baraja) {
        baraja.forEach(carta -> carta.setUsada(false));
        Collections.shuffle(baraja);
    }

    public Carta siguienteCarta(ArrayList<Carta> baraja) {
        for (Carta carta : baraja) {
            if (!carta.isUsada()) {
                carta.setUsada(true);
                return carta;
            }
        }
        return null;
    }

    public long cartasDisponibles(ArrayList<Carta> baraja) {
        return baraja.stream().filter(carta -> !carta.isUsada()).count();
    }

    public ArrayList<Carta> darCartas(ArrayList<Carta> baraja, int cantidad) {
        if (cartasDisponibles(baraja) < cantidad) {
            return null;
        }

        ArrayList<Carta> cartasDevolver = new ArrayList();
        int contador = 0;
        for (Carta carta : baraja) {
            if (!carta.isUsada()) {
                carta.setUsada(true);
                cartasDevolver.add(carta);
                contador++;
            }
            if (contador == cantidad) {
                break;
            }
        }
        return cartasDevolver;
    }
    
    public void mostrarBaraja(ArrayList<Carta> baraja){
        baraja.forEach((carta) -> {
            System.out.println(carta);
        });
    }

    public void mostrarCartasUsadas(ArrayList<Carta> baraja) {
        baraja.stream().filter(carta -> carta.isUsada()).forEach(System.out::println);
    }

    public void mostrarCartasDisponibles(ArrayList<Carta> baraja) {
        baraja.stream().filter(carta -> !carta.isUsada()).forEach(System.out::println);
    }
}
