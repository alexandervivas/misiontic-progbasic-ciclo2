/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.mintic.progbasic.entidades;

/**
 *
 * @author alexandervivas
 */
// Perro es un animal
// Perro extiende a Animal, o hereda de Animal
public class Perro extends Animal {
    
    // no es obligatorio
    // es una ayuda para que el compilador verifique que se está extendiendo algo
    @Override
    public void hacerRuido() {
        System.out.println("guau");
    }
    
}
