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
public class Velero extends Barco {

    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Velero(int numMastiles, int matricula, int largoEslora, int añoFabricacion) {
        super(matricula, largoEslora, añoFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public void crearBarco() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        super.crearBarco();
        System.out.println("Ingrese el numero de mastiles del velero");
        this.numMastiles = read.nextInt();

    }

    @Override
    public long modulo() {

        return super.modulo() * this.numMastiles;

    }

    @Override
    public void mostrarBarco() {
        System.out.println("----Barco de tipo Velero----");
        super.mostrarBarco();
        System.out.println("Cantidad de mastiles: "+this.numMastiles);
    }
}
