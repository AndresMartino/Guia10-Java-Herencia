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
public class BarcoMotor extends Barco{
    private int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(int potencia, int matricula, int largoEslora, int añoFabricacion) {
        super(matricula, largoEslora, añoFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void crearBarco(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        super.crearBarco();
        System.out.println("ingrese la potencia del barco a motor");
        this.potencia=read.nextInt();
        
    }
    @Override
    public long modulo(){
        return super.modulo()*this.potencia;
    }
    
    @Override
    public void mostrarBarco() {
        System.out.println("----Barco de tipo barco a motor----");
        super.mostrarBarco();
        System.out.println("Potencia en CV: "+this.potencia);
    }
}
