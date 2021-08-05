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
// quien observa
// debe poder recibir actualizaciones/cambios de lo que observa
// clase abstracta: clase con metodos abstractos (que no tienen implementacion)
// interface: es lo mismo que una clase abstracta, no tiene ningun tipo de implementacion
// todos sus metodos son abstractos y no tiene ningun tipo de atributo
public interface Observador {
    
    public void recibirActualizacion(Noticia noticia);
    
}
