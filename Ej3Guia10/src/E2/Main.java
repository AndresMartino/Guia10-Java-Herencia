/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opc;
        double acu = 0,acuT,acuL;
        ArrayList<Electrodomestico> electrodomestico = new ArrayList();
        do {
            System.out.println("------Menu------");
            System.out.println("1-Agregar Lavadora");
            System.out.println("2-Agregar Televisor");
            System.out.println("3-Mostrar precio de lavadoras y televisores");
            System.out.println("4-Mostrar Precio total de todos los electrodomesticos");
            System.out.println("5-salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    Lavadora lavadora = new Lavadora();
                    lavadora.crearLavadora();
                    electrodomestico.add(lavadora);
                    break;
                case 2:
                    Televisor televisor = new Televisor();
                    televisor.crearTelevisor();
                    electrodomestico.add(televisor);
                    break;
                case 3:
                    acuT=0;
                    acuL=0;
                    for (Electrodomestico electrodomestico1 : electrodomestico) {
                        if (electrodomestico1 instanceof Lavadora) {
                            acuL+=electrodomestico1.precio;
                        }else{
                            acuT+=electrodomestico1.precio;
                        }
                    }
                    System.out.println("El total en televisores: "+acuT);
                    System.out.println("El total en lavadoras: "+acuL);
                    break;
                case 4:
                    acu=0;
                    for (Electrodomestico electrodomestico1 : electrodomestico) {
                        acu+=electrodomestico1.precio;
                    }
                    System.out.println("El precio de todos los electrodomesticos es: "+acu);
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 5);
       
        
    }

}
