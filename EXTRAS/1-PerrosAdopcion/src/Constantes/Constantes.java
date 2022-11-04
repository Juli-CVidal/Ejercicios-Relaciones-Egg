/*
// Curso Egg FullStack
 */

package Constantes;

// @author JulianCVidal

import Entidades.Persona;



public class Constantes {
    public static final String BIENVENIDA = "¡Bienvenidos a la agencia de adopción!";
    public static final String MOSTRAR_OPCIONES = "Opciones disponibles: \n"
            + "1.Registrar nuevo usuario \n"
            + "2.Cambiar de usuario \n"
            + "3.Ver todos los perros \n"
            + "4.Adoptar un perro \n"
            + "5.Mostrar todos los usuarios \n"
            + "6.Salir";
    
    public static final String PEDIR_REGISTRO = "Primero debe registrarse: ";
    public static final String PEDIR_OPCION = "Ingrese una opción: ";
    public static final String ESPERAR_ENTER = "Presione Enter para continuar. ";
    public static final String OPCION_INVALIDA = "La opción ingresada no es válida... ";
    public static final String SALIR = "¡Espero hayan encontrado un buen compañero, nos vemos!";
    
    
    public static final String PEDIR_NOMBRE_PERRO = "¿Cuál es el nombre del perro que quiere adoptar? ";
    public static final String NOMBRE_INCORRECTO_PERRO = "No hay ningún perro con ese nombre";
    
    public static final String PEDIR_NOMBRE_PERSONA = "Ingrese su nombre: ";
    public static final String PEDIR_APELLIDO_PERSONA = "Y su apellido: ";
    public static final String PEDIR_EDAD_PERSONA = "Su edad: ";
    public static final String PEDIR_DNI_PERSONA = "Y su DNI: ";
    
    
    public static final String PERSONA_NO_REGISTRADA = "Usted no se encuentra registrado, si desea hacerlo seleccione 1";
    
    public static final String ADOPCION_EXITOSA = "¡Buena elección!¡Serán muy buenos compañeros!";
    public static final String BUSCA_ADOPCION = "En busca de adopción";
    public static final String PERRO_YA_ADOPTADO = "El perro que eligió ya ha sido adoptado.";
    
    public static final String ADOPTADO_POR(Persona adoptador){
        return "Su dueño es: " + adoptador.getApellido() + ", " + adoptador.getNombre();
    }
    
    public static final String SIN_PERROS = "No ha adoptado perros";
    public static final String MOSTRAR_PERROS = "Es dueño de: ";
    
    
}
