/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.v2;

/**
 *
 * @author alexandervivas
 */
public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }
    
    public int resta(int a, int b) {
        return a - b;
    }
    
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    
    public int multiplicacionConSumas(int a, int b) {
        int resultado = 0;
        for(int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }
    
}
