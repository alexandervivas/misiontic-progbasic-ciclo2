/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.v1;

/**
 *
 * @author alexandervivas
 */
public class Aeropuerto {
    
    private String ciudad;

    public void setCiudad(String ciudad) {
        // this: hace referencia al objeto de la clase
        // en este contexto (apertura y cierre de llaves, o método)
        // ciudad es el parametro
        // para usar ciudad (campo) necesito usar this
        this.ciudad = ciudad;
    }
    
    public String getCiudad() {
        return this.ciudad;
    }
    
    // relacion de asociacion, relacion debil
    public void notificarPiloto(Avion avion) {
        String mensaje = "Ojo con la altitud";
        String receptor = avion.getNombrePiloto();
        // ...
        // ...
        // ...
        // ...
        // envio la notificacion al piloto
    }
    
}
