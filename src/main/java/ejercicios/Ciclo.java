/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author alexandervivas
 */
public class Ciclo {
    // segregacion de responsabilidades    
    
    // unicamente para pedir datos al usuario
    // main solo para entrada y salida de datos
    public static void main(String[] args) {
        
        // crea un objeto de tipo Scanner para obtener datos por consola
        // new crea un nuevo objeto
        Scanner entrada = new Scanner(System.in);
        
        // se usa el objeto tipo Scanner para obtener el siguiente entero que ingrese el usuario
        int n = entrada.nextInt();// va a parar el programa a la espera de la entrada
        
        System.out.println(factorialWhile(n));
        
    }
    
    // implementacion del algoritmo factorial(n)
    // recursion
    // los metodos public static pueden ser invocados sin necesidad de crear un objeto
    public static long factorialFor(int n) {
        // factorial(n) = n * factorial(n - 1)
        // factorial(1) = 1
        
        // factorial(5) = 5 * factorial(4)
        // factorial(4) = 4 * factorial(3)
        // factorial(3) = 3 * factorial(2)
        // factorial(2) = 2 * factorial(1)
        // factorial(1) = 1
        long factorial = 1;
        
        for(int i = n; i >= 1; i--) {
            factorial *= i; // factorial = factorial * i;
            // factorial += i; --> factorial = factorial + i;
        }
        
        return factorial;
    }
    
    
    public static long factorialWhile(int n) {
        
        long factorial = 1;
        
        while(n > 1) {
            factorial *= n;
            n--; // importante para no caer en un ciclo infinito
        }
        
        return factorial;
    }
    
}
