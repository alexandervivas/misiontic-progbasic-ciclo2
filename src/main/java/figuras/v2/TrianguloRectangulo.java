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
public class TrianguloRectangulo extends Triangulo {
    
    private int base;
    private int altura;
    private double hipotenusa;
    
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        // usando pitagoras para hallar el valor de la hipotenusa
        return base + altura + hipotenusa;
    }

    @Override
    public float[] getAngulos() {
        float angulo1 = (float) Math.atan(altura / base);
        float angulo2 = 90 - angulo1;
        float[] angulos = { 90, angulo1, angulo2 };
        return angulos;
    }

    @Override
    public void imprimir() {
        System.out.println("Triangulo rectangulo con base " + 
                base + ", altura " + altura + ", hipotenusa " + hipotenusa + 
                ", area " + getArea() + 
                ", perimetro " + getPerimetro());
    }
    
}
