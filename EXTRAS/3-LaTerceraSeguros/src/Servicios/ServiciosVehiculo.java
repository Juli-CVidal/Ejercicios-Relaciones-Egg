/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Vehiculo;
import java.util.Scanner;

public class ServiciosVehiculo {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo() {
        System.out.print("Ingrese su marca: ");
        String marca = leer.next();

        System.out.print("Su modelo: ");
        String modelo = leer.next();

        System.out.print("Su año: ");
        Integer anio = leer.nextInt();
        
        System.out.print("Su número de motor: ");
        Integer numeroMotor = leer.nextInt();

        System.out.print("Su chasis: ");
        String chasis = leer.next();
        
        System.out.print("Su color: ");
        String color = leer.next();

        System.out.print("Y su tipo: ");
        String tipo = leer.next();
        
        return new Vehiculo(marca, modelo, anio, numeroMotor, chasis, color, tipo);
    }
}
