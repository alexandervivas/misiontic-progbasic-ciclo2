/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author alexandervivas
 */
public class AgenciaNoticias implements Observable {
    
    private ArrayList<Observador> observadores = new ArrayList<>();

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void notificarCambio(Noticia noticia) {
        observadores.forEach((observador) -> {
            observador.recibirActualizacion(noticia);
        });
    }
    
}
