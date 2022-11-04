/*
// Curso Egg FullStack
 */
package Constantes;

// @author JulianCVidal
public class Constantes {
    public static final String OPCIONES_DISPONIBLES = "1.Barajar \n"
            + "2.Obtener una carta \n"
            + "3.Ver cuántas cartas disponibles hay \n"
            + "4.Obtener más de una carta \n"
            + "5.Ver qué cartas se encuentran en el montón \n"
            + "6.Ver qué cartas se encuentran en la baraja \n"
            + "7.Salir";

    public static final String ELEGIR_OPCION = "¿Qué quiere hacer? ";
    public static final String PEDIR_CANTIDAD = "¿Cuántas cartas quiere? ";
    public static final String OPCION_INVALIDA = "La opción ingresada no es válida, reintente: ";
    public static final String SALIR = "Espero le haya gustado, ¡nos vemos la próxima!";
    public static final String ESPERAR_ENTER = "\nPresione Enter para continuar";
    
    public static final String BARAJAR = "Mezclando cartas...";
    
    public static final String BARAJA_VACIA = "La baraja no contiene ninguna carta...";
    public static final String MOSTRAR_CANTIDAD_DISPONIBLES(int cantidad){
        return "La baraja tiene " + cantidad + " cartas disponibles";
    }

    public static final String SIN_CARTAS_DISPONIBLES = "No hay suficientes cartas... ";
    public static final String SIN_CARTAS_MONTON = "El montón no tiene cartas... ";
    
    public static final String MOSTRAR_CARTAS = "Las cartas que le ha tocado son: ";
    public static final String MOSTRAR_CARTA = "La carta que le ha tocado es: ";
    
    public static final String MOSTRAR_CARTAS_BARAJA = "Las cartas que se encuentran en la baraja son: ";
    public static final String MOSTRAR_CARTAS_MONTON = "Las cartas que se encuentran en el montón son: ";
}
