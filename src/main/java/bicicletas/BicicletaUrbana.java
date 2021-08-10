/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletas;

/**
 *
 * @author Sara Ochoa
 */
public class BicicletaUrbana extends Bicicleta {
    
    @Override
    public void pedalear(){
        velocidad += 5;
    }
    
    public void parar(){
        velocidad = 0;
    }
    
}
