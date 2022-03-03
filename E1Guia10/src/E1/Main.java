/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author Andrelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro=new Perro("puflito","carne",6,"Doberman","azul");
        perro.alimentarse();
        Perro perro1=new Perro("puflito2","carne2",62,"Doberman2");
        perro1.alimentarse();
        Gato gato=new Gato("michi","ratas",3,"siames");
        gato.alimentarse();
        Animal caballo=new Caballo("carlos","pasto",34,"pura sangre");
        caballo.alimentarse();
    }
    
}
/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
    

*/