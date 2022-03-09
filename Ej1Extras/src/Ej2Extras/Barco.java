/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2Extras;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Barco {
    protected int matricula;
    protected int largoEslora;
    protected int añoFabricacion;

    public Barco() {
    }
    

    public Barco(int matricula, int largoEslora, int añoFabricacion) {
        this.matricula = matricula;
        this.largoEslora = largoEslora;
        this.añoFabricacion = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getLargoEslora() {
        return largoEslora;
    }

    public void setLargoEslora(int largoEslora) {
        this.largoEslora = largoEslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    void crearBarco(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese matricula del barco");
        this.matricula=read.nextInt();
        System.out.println("ingrese el largo de la eslora");
        this.largoEslora=read.nextInt();
        System.out.println("ingrese año de fabricacion");
        this.añoFabricacion=read.nextInt();     
    }
     long modulo(){
    return 10*this.largoEslora;
    
    }
    void mostrarBarco(){
         System.out.println("DATOS BARCO A ALQUILAR:");
        System.out.println("Matricula del barco: "+this.matricula);
        System.out.println("Largo de eslora: "+this.largoEslora);
        System.out.println("Año de fabricacion: "+this.añoFabricacion);
    
    }
}
