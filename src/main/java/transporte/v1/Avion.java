/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.v1;

/**
 *
 * @author alexandervivas
 */
public class Avion extends Vehiculo {
    
    private double altitud;
    private String nombrePiloto;
    
    public double ascender() {
        altitud++;
        acelerar(10);
        return altitud;
    }
    
    public double descender() {
        altitud--;
        frenar(10);
        return altitud;
    }
    
    public String getNombrePiloto() {
        return nombrePiloto;
    }
    
}
