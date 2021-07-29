/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.v2;

/**
 *
 * @author alexandervivas
 */
public abstract class Vehiculo {
    
    protected float velocidad;
    private boolean tanqueLleno = true;
    
    public boolean isTanqueLleno() {
        return tanqueLleno;
    }
    
    // obliga a los hijos a realizar la implementacion
    public abstract float acelerar();
    
    public abstract float frenar();
    
}
