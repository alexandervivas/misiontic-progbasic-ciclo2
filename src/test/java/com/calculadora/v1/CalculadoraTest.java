/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.v1;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author alexandervivas
 */
public class CalculadoraTest {
    
    Calculadora calculadora = new Calculadora();
    
    @Test
    public void sumaTest() {
        
        // assert: pase la prueba si se cumple esta condicion
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        
        
        // verifique igualdad
        Assert.assertEquals("La suma de a y b no está correcta", a + b, calculadora.suma(a, b));
        Assert.assertTrue((a + b) == calculadora.suma(a, b));//assertFalse
        
        
    }
    
    @Test
    public void restaTest() {
        
        // assert: pase la prueba si se cumple esta condicion
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        
        
        // verifique igualdad
        Assert.assertEquals("La resta de a y b no está correcta", a - b, calculadora.resta(a, b));
        
    }
    
}
