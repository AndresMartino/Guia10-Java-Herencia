/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2Extras;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        Barco velero = new Velero();
        Barco yate = new Yate();
        Barco barcoMotor = new BarcoMotor();
        Alquiler alquiler = new Alquiler();
        int opc;
        do {
            System.out.println("----ALQUILER DE BARCOS----");
            System.out.println("***ELIJA Y RELLENE LOS CAMPOS DEL BARCO A ALQUILAR***");
            System.out.println("1-VELERO");
            System.out.println("2-BARCO A MOTOR");
            System.out.println("3-YATE DE LUJO");
            System.out.println("4-SALIR");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    velero.crearBarco();
                    alquiler.setBarcoAlquiler(velero);
                    alquiler.setFechaFinAlquiler(LocalDate.of(2022, 06, 22));
                    alquiler.setDniCliente(36011654);
                    alquiler.setNombreCliiente("Albert Einstein");
                    alquiler.crearAlquiler();
                    
                break;
                case 2:
                    barcoMotor.crearBarco();
                    alquiler.setBarcoAlquiler(barcoMotor);
                    alquiler.setFechaFinAlquiler(LocalDate.of(2022, 06, 22));
                    alquiler.crearAlquiler();
                    
                break;
                case 3:
                    yate.crearBarco();
                    alquiler.setBarcoAlquiler(yate);
                    alquiler.setFechaFinAlquiler(LocalDate.of(2022, 06, 22));
                    alquiler.crearAlquiler();
                    
                break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        } while (opc != 4);
    }

}
