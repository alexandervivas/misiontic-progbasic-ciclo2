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
public class Mano implements Imprimible {

    @Override
    public void imprimir() {
        System.out.println("Hey, soy una mano pero igual me imprimo");
    }

    @Override
    public void basura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
