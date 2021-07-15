package co.edu.udea.mintic.progbasic;
// package default;
// Comentario de una linea

/* Este comentario
tiene
muchas
lineas
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandervivas
 */
public class Sesion2 {
    
    /**
     * visibilidad
     * private: el codigo es accesible solo en esta clase
     * public: el codigo es accesible en todas las demas clases
     * protected: el codigo es accesible en esta y las clases que hereden de esta
     */
    
    /**
     * retorno de metodos
     * void: no retorna nada
     * tipo: retorna el tipo especificado
     */
    
    // el punto de entrada a la aplicacion es el metodo main
    // java programa.java arg1 arg2 arg3
    // comandos { arg1, arg2, arg3 }
    
    public static void main(String[] args) {
        // Imprimir Hola Mundo!
        // Recordar el ; al final
        System.out.println("Hola Mundo!");
        
        // declaracion camel case
        int miVariable;
        
        // constantes en snake case
        final int MI_CONSTANTE = 2;
        
        // asignacion
        miVariable = 20;
        
        // declaracion y asignacion
        int otraVariable = 3;
        
        // Imprimir la suma de las dos variables
        System.out.println(miVariable + otraVariable);
        System.out.println(miVariable - otraVariable);
        
        // post-incremento: retorno valor y luego incremento
        System.out.println(miVariable++);
        // pre-incremento: incremento y luego retorno valor
        System.out.println(++miVariable);
        
        
    }
    
}
