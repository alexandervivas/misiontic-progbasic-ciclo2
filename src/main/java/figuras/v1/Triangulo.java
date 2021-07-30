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
// extends: extiende / hereda de
// solo puede extender otra clase o una clase abstracta
// puede implementar tantas interfaces como necesite
public class Triangulo extends Figura {
    
    private long base;
    private long cateto1;
    private long cateto2;
    private long altura;
    
    public Triangulo(long base, long altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override // sobreescribir
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return base + cateto1 + cateto2;
    }

    @Override
    public void imprimir() {
        System.out.println("Soy un triangulo con base " + base + " y altura " + altura);
    }

    @Override
    public void basura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
