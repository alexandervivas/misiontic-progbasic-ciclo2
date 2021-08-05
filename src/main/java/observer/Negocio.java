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
public class Negocio {
    
    public static void main(String[] args) {
        
        AgenciaNoticias agencia = new AgenciaNoticias();
        Suscriptor suscriptor = new Suscriptor();
        CanalTV canalTV = new CanalTV();
        
        Noticia noticiaUno = new Noticia("Titulo Uno", "Contenido de la noticia Uno");
        
        agencia.agregarObservador(canalTV);
        
        agencia.notificarCambio(noticiaUno);
        
        agencia.agregarObservador(suscriptor);
        
        Noticia noticiaDos = new Noticia("Titulo Dos", "Contenido de la noticia Dos");
        
        agencia.notificarCambio(noticiaDos);
        
        Noticia noticiaTres = new Noticia("Titulo Tres", "Contenido de la noticia Tres");
        
        agencia.notificarCambio(noticiaTres);
        
    }
    
}
