/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Constantes.Constantes;
import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;

public class ServiciosBaraja {

    public Baraja crearBaraja() {
        ArrayList<Carta> barajaCartas = new ArrayList();
        String[] tipos = {"Espada", "Basto", "Oro", "Copa"};
        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String tipoCarta : tipos) {
            for (Integer numeroCarta : numeros) {
                barajaCartas.add(new Carta(tipoCarta, numeroCarta));
            }
        }
        Collections.shuffle(barajaCartas);
        return new Baraja(barajaCartas);
    }

    public boolean barajar(ArrayList<Carta> cartasDisponibles, ArrayList<Carta> cartasUsadas) {
        cartasDisponibles.addAll(cartasUsadas);
        cartasUsadas.removeAll(cartasUsadas);
        Collections.shuffle(cartasDisponibles);
        return true;
    }

    
    public Carta siguienteCarta(Baraja barajaCartas) {
        ArrayList<Carta> cartasDisponibles = barajaCartas.getCartasDisponibles();
        ArrayList<Carta> cartasUsadas = barajaCartas.getCartasUsadas();

        if (cartasDisponibles.isEmpty()) {
            return null;
        }

        Carta cartaActual = cartasDisponibles.get(0);
        cartasDisponibles.remove(0);
        cartasUsadas.add(cartaActual);

        return cartaActual;
    }

    public boolean cartasDisponibles(ArrayList<Carta> cartasDisponibles) {
        System.out.println(Constantes.MOSTRAR_CANTIDAD_DISPONIBLES(cartasDisponibles.size()));
        return !cartasDisponibles.isEmpty();
    }

    public boolean darCartas(Baraja barajaCartas, Integer cantidad) {
        ArrayList<Carta> cartasDisponibles = barajaCartas.getCartasDisponibles();
        Carta cartaActual;

        if (cartasDisponibles.size() < cantidad) {
            return false;
        }

        for (int i = 0; i < cantidad; i++) {
            cartaActual = siguienteCarta(barajaCartas);
            System.out.println(cartaActual);
        }

        return true;
    }

    public boolean mostrarMonton(ArrayList<Carta> cartasUsadas) {
        for (Carta cartas : cartasUsadas) {
            if (cartas.isUsada()){
                System.out.println(cartas);
            }
            
        }
        cartasUsadas.forEach(System.out::println);
        return cartasUsadas.isEmpty();
    }

    public boolean mostrarBaraja(ArrayList<Carta> cartasDisponibles) {
        cartasDisponibles.forEach(System.out::println);
        return cartasDisponibles.isEmpty();
    }
}
