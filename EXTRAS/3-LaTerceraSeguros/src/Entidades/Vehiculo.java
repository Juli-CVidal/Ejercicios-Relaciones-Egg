/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Vehiculo {

    private final String marca;
    private final String modelo;
    private final Integer anio;
    private final Integer numeroMotor;
    private final String chasis;
    private final String color;
    private final String tipo; //camioneta,sedan...

    public Vehiculo(String marca, String modelo, Integer anio, Integer numeroMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public Integer getNumeroMotor() {
        return numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

}
