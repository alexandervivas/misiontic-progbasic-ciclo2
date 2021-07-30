/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.v1;

/**
 *
 * @author alexandervivas
 */
public class Circulo extends Figura {
    
    private long radio;
    
    public Circulo(long radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radio, 2));
    }

    @Override
    public double getPerimetro() {
        return 0.0;
    }

    @Override
    public void imprimir() {
        System.out.println("Soy un circulo con radio " + radio);
    }

    @Override
    public void basura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
