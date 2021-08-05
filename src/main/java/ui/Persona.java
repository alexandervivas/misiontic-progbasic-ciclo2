/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author alexandervivas
 */
public class Persona {
    
    private String id;
    private String nombre;
    private int edad;
    private char sexo;
    
    public Persona(String id, String nombre, int edad, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Persona() {
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        return "Persona(" + id + ", " + nombre + ", " + edad + ", " + sexo + ")";
    }
    
}
