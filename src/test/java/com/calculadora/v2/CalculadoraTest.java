/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.v2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author alexandervivas
 */
public class CalculadoraTest {
    
    Calculadora calculadora = new Calculadora();
    
    @Test
    public void sumaTest() {
        int a = 2;
        int b = 4;
        
        assertEquals("La suma no es correcta", 6, calculadora.suma(a, b));
    }
    
    @Test
    public void restaTest() {
        int a = 3;
        int b = 5;
        
        assertEquals("La resta no es correcta", -2, calculadora.resta(a, b));
    }
    
    @Test
    public void multiplicacionTest() {
        int a = 2;
        int b = 6;
        
        assertEquals("La multiplicacion no es correcta", 12, calculadora.multiplicacion(a, b));
    }
    
    @Test
    public void multiplicacionConSumasTest() {
        int a = 2;
        int b = 6;
        
        assertEquals("La multiplicacion basada en sumas no es correcta", 12, calculadora.multiplicacionConSumas(a, b));
    }
    
}
