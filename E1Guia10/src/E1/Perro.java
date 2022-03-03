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
public class Perro extends Animal{
    private String color;
    
    public Perro() {
        super();
    }
    
    public Perro(String nombre, String alimento, int edad, String raza,String color){
    super(nombre,alimento,edad, raza);
    this.color=color;
    }
    
    public Perro(String nombre, String alimento, int edad, String raza){
    super(nombre,alimento,edad, raza);
    }
    
    
}
