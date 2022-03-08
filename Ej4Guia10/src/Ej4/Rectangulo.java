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
public class Rectangulo implements CalculoFormas{
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private double altura;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public void datosRectangulo(){
        System.out.println("Ingrese base de rectangulo");
        this.base=read.nextDouble();
        System.out.println("Ingrese altura de rectangulo");
        this.altura=read.nextDouble();
        area();
        perimetro();
    }
    
    
    @Override
    public void area() {
        System.out.printf("El area del rectangulo es %.2f \n",this.altura*this.base);
    }

    @Override
    public void perimetro() {
        System.out.printf("El perimetro del rectangulo es: %.2f \n",(this.altura+this.base)*2);
    }
    
    
}
