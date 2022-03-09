/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Circulo implements CalculoFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void datosCirculo() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese Radio del circulo");
        this.radio = read.nextInt();
        area();
        perimetro();

    }

    @Override
    public void area() {
        System.out.printf("El area del circulo es %.2f \n", PI * Math.pow(radio, 2));

    }

    @Override
    public void perimetro() {
        System.out.printf("El perimetro del circulo es: %.2f \n", (2 * PI * this.radio));
    }

}
