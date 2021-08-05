/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author alexandervivas
 */
public class CanalTV implements Observador {

    @Override
    public void recibirActualizacion(Noticia noticia) {
        System.out.println("CanalTV::Recibi una noticia: " + noticia);
    }
    
}
