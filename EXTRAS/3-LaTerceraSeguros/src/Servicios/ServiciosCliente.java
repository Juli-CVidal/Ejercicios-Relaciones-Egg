/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Cliente;
import java.util.Scanner;

public class ServiciosCliente {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();

        System.out.print("Su apellido: ");
        String apellido = leer.next();

        System.out.print("Su DNI: ");
        Integer DNI = pedirNumero(8);

        System.out.print("Su mail: ");
        String mail = leer.next();
        
        System.out.print("Su domicilio: ");
        String domicilio = leer.next();

        System.out.print("Y su teléfono: ");
        Integer telefono = pedirNumero(10);
        
        return new Cliente(nombre, apellido, DNI, mail, domicilio, telefono);
    }

    private Integer pedirNumero(int digitos) {
        Integer numero = leer.nextInt();
        while (numero < 0 || String.valueOf(numero).length() != digitos) {
            System.out.print("Ingrese un DNI válido: ");
            numero = leer.nextInt();
        }
        return numero;
    }
}
