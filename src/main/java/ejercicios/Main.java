/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Date;
import org.joda.time.DateTime;

/**
 *
 * @author alexandervivas
 */
public class Main {
    
    // sirve para indicar el punto de arranque de la aplicacion/sistema
    public static void main(String[] args) {
        
        Persona persona = new Persona(
                "Nombre", 
                DateTime
                        .now()
                        .withYear(1989)
                        .withMonthOfYear(12)
                        .withDayOfMonth(12)
        );
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        
        persona.setNombre("Nuevo nombre");
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        
        
    }
    
}
