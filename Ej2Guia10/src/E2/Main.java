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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico lavadora = new Lavadora();
        System.out.println("Lavadora");
        lavadora.crearElectrodomestico();
        System.out.println(lavadora);
       Electrodomestico televisor=new Televisor();
        System.out.println("Televisor");
        televisor.crearElectrodomestico();
        System.out.println(televisor);
    }

}
