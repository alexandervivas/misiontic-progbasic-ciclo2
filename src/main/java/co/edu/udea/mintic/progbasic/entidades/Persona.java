/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.mintic.progbasic.entidades;

/**
 *
 * @author alexandervivas
 */
public class Persona {
    
    // caracteristicas
    // campos o variables globales: se recomienda llamarlos campos
    // campos deben especificar visibilidad: encapsulacion
    public String colorPiel;
    private String nombre;
    public String colorCabello;
    
    // metodo constructor, se llama igual que la clase
    public Persona(String cp, String n, String cc) {
        colorPiel = cp;
        nombre = n;
        colorCabello = cc;
    }
    
    // comportamiento, acciones que un objeto de esta clase puede ejecutar
    public String obtenerNombre() {
        // return: retorna el valor actual del campo nombre
        return nombre;
    }
    
    // regla de negocio: no permitir asignar el mismo nombre
    public void cambiarNombre(String nuevoNombre) {
        if(nuevoNombre.equals(nombre)){ 
            System.out.println("Ya tiene ese nombre");
        } else {
            nombre = nuevoNombre;
        }
    }
    
    public void levantarMano() {
        // variable
        boolean manoArriba = true;
    }
    
    public void caminar() {
        
    }
    
}
