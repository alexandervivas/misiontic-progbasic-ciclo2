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
public class Circulo implements FiguraGeometrica {
    
    private int radio;
    
    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public int getLados() {
        return 1;
    }

    @Override
    public float[] getAngulos() {
        float[] angulos = { 360 };
        return angulos;
    }

    @Override
    public void imprimir() {
        System.out.println("Circulo con radio " + 
                radio + ", area " + getArea() + 
                ", perimetro " + getPerimetro());
    }
    
    
}
