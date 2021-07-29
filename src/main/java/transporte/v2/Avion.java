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
public class Avion extends Vehiculo {

    @Override
    public float acelerar() {
        velocidad+=100;
        return velocidad;
    }

    @Override
    public float frenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
