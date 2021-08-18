/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletas;

/**
 *
 * @author alexandervivas
 */
class Bicicleta {
    
    /**
     * Atributos/Campos
     */
    private String marca;
    private String referencia;
    private String color;
    protected int velocidad;
    protected int velocidad23;
    
    // metodo especial para crear objetos de esta clase: metodo constructor
    // metodo constructor: public NombreClase
    public Bicicleta(String m, String r, String c, int v) {
        marca = m;
        referencia = r;
        color = c;
        velocidad = v;
        // new Bicicleta("marca", "referencia", "color", velocidad)
        // new Bicicleta()
        // new Bicicleta("referencia", "color")
    }
    
    public Bicicleta() {
        
    }
    
    public Bicicleta(String r, String c) {
        marca = "GIANT";
        referencia = r;
        color = c;
    }
    
    /**
     * Comportamiento/Metodos
     */
    // <visibilidad> <tipo de retorno> <nombre del metodo>(<parametros si hay alguno>) {}
    public void pedalear() {
        ++velocidad;
    }
    
    public void frenar() {
        --velocidad;
    }
    
    
    /**
     * getters: metodos para obtener el valor del estado
     * setters: metodos para modificar
     */
    
    /**
     * Obtiene el valor de velocidad
     * @return velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
    
}
