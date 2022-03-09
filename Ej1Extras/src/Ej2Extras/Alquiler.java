/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2Extras;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author Andrelo
 */
public class Alquiler<T extends Barco> {
    private String nombreCliiente;
    private long dniCliente;
    private T barcoAlquiler;
    private LocalDate fechaInicioAlquiler=LocalDate.now();
    private LocalDate fechaFinAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombreCliiente, long dniCliente, T barcoAlquiler, LocalDate fechaInicioAlquiler, LocalDate fechaFinAlquiler) {
        this.nombreCliiente = nombreCliiente;
        this.dniCliente = dniCliente;
        this.barcoAlquiler = barcoAlquiler;
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.fechaFinAlquiler = fechaFinAlquiler;
    }

    public String getNombreCliiente() {
        return nombreCliiente;
    }

    public void setNombreCliiente(String nombreCliiente) {
        this.nombreCliiente = nombreCliiente;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public T getBarcoAlquiler() {
        return barcoAlquiler;
    }

    public void setBarcoAlquiler(T barcoAlquiler) {
        this.barcoAlquiler = barcoAlquiler;
    }

    public LocalDate getFechaInicioAlquiler() {
        return fechaInicioAlquiler;
    }

    public void setFechaInicioAlquiler(LocalDate fechaInicioAlquiler) {
        this.fechaInicioAlquiler = fechaInicioAlquiler;
    }

    public LocalDate getFechaFinAlquiler() {
        return fechaFinAlquiler;
    }

    public void setFechaFinAlquiler(LocalDate fechaFinAlquiler) {
        this.fechaFinAlquiler = fechaFinAlquiler;
    }
    
    public long tiempoAlquilado(){
        return DAYS.between(fechaInicioAlquiler,fechaFinAlquiler);
    
    }
    
    public void crearAlquiler(){
        long modulEspecifico=barcoAlquiler.modulo()*tiempoAlquilado();
        System.out.println("DATOS CLIENTE:");
        System.out.println("Cliente: "+this.nombreCliiente+" DNI: "+this.dniCliente);
        barcoAlquiler.mostrarBarco();
        System.out.println("PRECIO TOTAL POR ALQUILAR "+tiempoAlquilado()+" DIAS, ES DE: "+modulEspecifico );
       
    }
    
    
   
}
