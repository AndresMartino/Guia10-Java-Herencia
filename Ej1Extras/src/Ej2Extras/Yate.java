/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2Extras;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Yate extends Barco {

    private int potenciaYate;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int potenciaYate, int numCamarotes) {
        this.potenciaYate = potenciaYate;
        this.numCamarotes = numCamarotes;
    }

    public Yate(int potenciaYate, int numCamarotes, int matricula, int largoEslora, int añoFabricacion) {
        super(matricula, largoEslora, añoFabricacion);
        this.potenciaYate = potenciaYate;
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaYate() {
        return potenciaYate;
    }

    public void setPotenciaYate(int potenciaYate) {
        this.potenciaYate = potenciaYate;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public void crearBarco() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        super.crearBarco();
        System.out.println("ingrese la potencia del yate");
        this.potenciaYate=read.nextInt();
        System.out.println("Ingrese numero de camarotes");
        this.numCamarotes=read.nextInt();
        
    }
    @Override
    public long modulo(){
        return super.modulo()*(this.potenciaYate+this.numCamarotes);
    
    }
    @Override
    public void mostrarBarco() {
        System.out.println("----Barco de tipo Yate----");
        super.mostrarBarco();
        System.out.println("Cantidad de camarotes: "+this.numCamarotes);
        System.out.println("Potencia del yate en CV: "+this.potenciaYate);
    }

}
