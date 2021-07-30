/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.v2;

/**
 *
 * @author alexandervivas
 */
public interface FiguraGeometrica {
    
    public abstract double getArea();
    
    public abstract double getPerimetro();
    
    public abstract int getLados();
    
    public abstract float[] getAngulos();
    
    public void imprimir();
    
}
