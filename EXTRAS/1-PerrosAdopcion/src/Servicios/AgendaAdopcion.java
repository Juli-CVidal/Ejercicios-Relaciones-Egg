/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Constantes.Constantes;
import Entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AgendaAdopcion {

	private final ServiciosPersona ServPers = new ServiciosPersona();
	private final ServiciosPerro ServPerro = new ServiciosPerro();
	private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

	private ArrayList<Perro> crearPerros() {
		ArrayList<Perro> perrosDisponibles = new ArrayList();
		Integer cantidad = 12;

		for (int i = 0; i < cantidad; i++) {
			perrosDisponibles.add(ServPerro.crearPerro(i));
		}
		return perrosDisponibles;
	}

	public void menu() {
		ArrayList<Perro> perrosDisponibles = crearPerros();
		ArrayList<Persona> listaPersonas = new ArrayList();
		Persona personaActual = null, personaNueva;
		int opc;

		System.out.println(Constantes.BIENVENIDA);

		do {
			System.out.println(Constantes.MOSTRAR_OPCIONES);
			System.out.print(Constantes.PEDIR_OPCION);
			opc = leer.nextInt();

			//Condición de salida
			if (opc == 6) {
				continue;
			}

			if (opc <= 0 || opc > 6) {
				System.out.println(Constantes.OPCION_INVALIDA);
				continue;
			}

			System.out.println();

			if (opc != 1 && listaPersonas.isEmpty()) {
				System.out.println(Constantes.PEDIR_REGISTRO);
				personaActual = ServPers.crearPersona(listaPersonas);
			}

			switch (opc) {
			case 1:
				personaActual = ServPers.crearPersona(listaPersonas);
				break;

			case 2:
				System.out.print(Constantes.PEDIR_NOMBRE_PERSONA);
				String nombre = leer.next();

				System.out.println(Constantes.PEDIR_APELLIDO_PERSONA);
				String apellido = leer.next();
				personaNueva = obtenerPersona(listaPersonas, nombre, apellido);

				if (personaActual == null) {
					System.out.println(Constantes.PERSONA_NO_REGISTRADA);
					break;
				}

				personaActual = personaNueva;
				break;

			case 3:
				ServPerro.mostrarPerros(perrosDisponibles);
				break;

			case 4:
				adoptar(perrosDisponibles, personaActual);
				break;

			case 5:
				ServPers.mostrarPersonas(listaPersonas);
				break;

			}

			esperarEnter();
		} while (6 == opc);
		System.out.println(Constantes.SALIR);
	}

	private boolean adoptar(ArrayList<Perro> perrosDisponibles, Persona persona) {
		System.out.print(Constantes.PEDIR_NOMBRE_PERRO);
		String nombrePerro = leer.next();
		Perro perroAdoptar = obtenerPerro(perrosDisponibles, nombrePerro);

		if (perroAdoptar == null) {
			System.out.println(Constantes.NOMBRE_INCORRECTO_PERRO);
			return false;
		}

		Persona adoptador = perroAdoptar.getDueno();
		if (adoptador != null) {
			System.out.println(Constantes.PERRO_YA_ADOPTADO);
			System.out.println(Constantes.ADOPTADO_POR(adoptador));
			return false;
		}

		perroAdoptar.setDueno(persona);
		System.out.println(Constantes.ADOPCION_EXITOSA);
		persona.getAdoptados().add(perroAdoptar);
		return true;
	}

	private Persona obtenerPersona(ArrayList<Persona> listaPersonas, String nombre, String apellido) {
		for (Persona persona : listaPersonas) {
			if (persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido)) {
				return persona;
			}
		}
		return null;
	}

	private Perro obtenerPerro(ArrayList<Perro> listaPerros, String nombre) {
		for (Perro perro : listaPerros) {
			if (perro.getNombre().equals(nombre)) {
				return perro;
			}
		}
		return null;
	}

	private void esperarEnter() {
		System.out.println(Constantes.ESPERAR_ENTER);
		String pass = leer.next();
	}
}
