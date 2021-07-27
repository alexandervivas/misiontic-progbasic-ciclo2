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
public class Llanta {
    
    private int presion;
    
    public int inflar(int presionAdicional) {
        presion += presionAdicional;
        return presion;
    }
    
}
