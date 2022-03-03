/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2;

/**
 *
 * @author Andrelo
 */
public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean tdt;

    public Televisor() {
        super();
    }

    public Televisor(Integer resolucion, boolean tdt, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese resolucion del televisor en pulgadas");
        this.resolucion = read.nextInt();
        System.out.println("Inggrese <true> o <false> si posee tdt");
        this.tdt = read.nextBoolean();
        precioFinal();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion>40) {
            this.precio=this.precio*1.3;
        }
        if (tdt) {
            this.precio+=500;
        }
        System.out.println("precio= "+this.precio);
    }

    @Override
    public String toString() {
        return "Televisor{" +"precio= "+this.precio + '}';
    }
   
    
}
