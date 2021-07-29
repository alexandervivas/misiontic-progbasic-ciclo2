/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author alexandervivas
 */
public class FiguraMain {
    
    public static void main(String[] args) {
        
        print(new Triangulo(10, 4));
        print(new Circulo(20));
        print(new Mano());
        
        // no se puede, no compila, las clases abstractas no se instancian
        //Figura figura = new Figura();
        
        // Liskov, los hijos pueden reemplazar al padre
        
    }
    
    public static void print(Imprimible imprimible) {
        imprimible.imprimir();
    }
    
}
