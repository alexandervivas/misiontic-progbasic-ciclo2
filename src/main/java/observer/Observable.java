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
// lo que se puede observar
// debe permitir saber quien esta observando
// debe permitir notificar un cambio a los observadores
public interface Observable {
    
    public void agregarObservador(Observador observador);
    
    public void notificarCambio(Noticia noticia);
    
}
