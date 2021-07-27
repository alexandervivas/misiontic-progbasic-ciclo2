/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author alexandervivas
 */
public class Vehiculo {
    
    private float velocidad;
    
    public float acelerar(float diferenciaVelocidad) {
        // velocidad = velocidad + diferenciaVelocidad;
        velocidad += diferenciaVelocidad;
        return velocidad;
    }
    
    public float frenar(float diferenciaVelocidad) {
        velocidad -= diferenciaVelocidad;
        return velocidad;
    }
    
}
