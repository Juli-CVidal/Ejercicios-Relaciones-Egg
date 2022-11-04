/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Date;

public class Poliza {

    private final Cliente cliente;
    private final Vehiculo vehiculo;
    private final Integer numero;
    private final Date FechaInicio;
    private final Date FechaFin;
    private final Integer cantidadCuotas;
    private final String tipoDePago;
    private final Double montoTotal;
    private final boolean incluyeGranizo;
    private final Double montoMaximoGranizo;
    private final String tipoCobertura;

    public Poliza(Cliente cliente, Vehiculo vehiculo, Integer numero, Date FechaInicio, Date FechaFin, Integer cantidadCuotas, String tipoDePago, Double montoTotal, boolean incluyeGranizo, Double montoMaximoGranizo, String tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numero = numero;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.tipoDePago = tipoDePago;
        this.montoTotal = montoTotal;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Integer getNumero() {
        return numero;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public Double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

}
