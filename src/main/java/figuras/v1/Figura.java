/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.v1;

import java.awt.Color;

/**
 *
 * @author alexandervivas
 */
// las clases abstractas no se pueden instanciar
public abstract class Figura implements Imprimible {
    
    private Color color;
    
    public abstract double getArea();
    
    public abstract double getPerimetro();
    
}
