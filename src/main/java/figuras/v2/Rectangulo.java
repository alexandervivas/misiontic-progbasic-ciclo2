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
public class Rectangulo implements FiguraGeometrica {
    
    private int base;
    private int altura;
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return (base + altura) * 2;
    }

    @Override
    public int getLados() {
        return 4;
    }

    @Override
    public float[] getAngulos() {
        float[] angulos = { 90, 90, 90, 90 };
        return angulos;
    }

    @Override
    public void imprimir() {
        System.out.println("Rectangulo con base " + 
                base + ", altura " + altura + ", area " + getArea() + 
                ", perimetro " + getPerimetro());
    }
    
}
