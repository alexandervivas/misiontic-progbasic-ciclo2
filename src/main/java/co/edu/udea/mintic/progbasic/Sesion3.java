/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.mintic.progbasic;

/**
 *
 * @author alexandervivas
 */
public class Sesion3 {
    
    public static void main(String[] args) {
        
        int myInt;
        float myFloat;
        double myDouble;
        
        char myChar; // 'a'
        char[] myName; // { 'a', 'l', 'e', 'x', '1' }
        char[] myApellido; // { 'v', 'i', 'v', 'a', 's' }
        
        String nombre = "alex";// declaracion y asignacion
        String nombreOtro = "alex";
        String apellido = "vivas";
        
        String otroNombre = new String("alex");// declaracion e instanciacion, referencia de memoria
        // 111101101010010101011 --> otroNombre
        
        System.out.println(nombre);
        System.out.println(otroNombre);
        System.out.println(nombre == nombreOtro);
        // expresion: nombre == nombreOtro --> true
        System.out.println(nombre == otroNombre);// compara por direccion de memoria
        System.out.println(nombre.equals(otroNombre));// compara por valor o contenido
        
        /**
         * Sentencias de control de flujo
         */
        if(nombre == otroNombre) {
            System.out.println("Son iguales!!!");
            System.out.println("WTF??");
        }
        
    }
    
}
