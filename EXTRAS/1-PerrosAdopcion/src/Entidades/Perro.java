/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal

import Constantes.Constantes;

public class Perro {

    private final String nombre;
    private final String raza;
    private final Integer edad;
    private Persona dueno;

    public Perro(String nombre, String raza, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.dueno = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }
    
    public boolean isAdoptado(){
        return this.dueno != null;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nRaza: " + raza
                + "\nEdad: " + edad
                + "\n" + mostrarAdopcion();
    }
    
    private String mostrarAdopcion(){
        if (isAdoptado()){
            return Constantes.ADOPTADO_POR(this.dueno);
        }
        return Constantes.BUSCA_ADOPCION;
    }
}
