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
public class Noticia {
    
    private String titulo;
    private String redaccion;
    
    // una noticia no se puede modificar despues de su creacion
    public Noticia(String titulo, String redaccion) {
        this.titulo = titulo;
        this.redaccion = redaccion;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the redaccion
     */
    public String getRedaccion() {
        return redaccion;
    }
    
    @Override
    public String toString() {
        return "Noticia( titulo = '" + titulo + "', redaccion = '" + redaccion + "' )";
    }
    
}
