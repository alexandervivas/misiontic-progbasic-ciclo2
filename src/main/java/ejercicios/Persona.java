/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import org.joda.time.DateTime;
// paquete
// imports
// clase
// atributos (campos o variables globales)
// metodos constructores
// getters / setters
// todo lo demas

/**
 *
 * @author alexandervivas
 */
public class Persona {
    
    // atributos son privados
    private String nombre; // visibilidad tipo nombre
    private DateTime fechaNacimiento;
    private DateTime fechaMuerte;
    private String doctorDeclaraMuerte;
    private int cantidadHijos;
    private double herencia;
    private char sexo;
    
    // establece mecanismos de creacion a traves de metodos constructores
    public Persona(char sexo) {
        cantidadHijos = 0;// no es necesario, porque java asigna 0 por defecto cuando declaramos un variable int
        herencia = 0;//igual que el anterior
        if(sexo == 'f' || sexo == 'm') {
            this.sexo = sexo;
        }
        else {
            // lanzar una excepcion
            throw new RuntimeException("sexo no permite el valor " + sexo + ", solo permite f o m.");
        }
    }
    
    // visibilidad nombre(igual a la clase) (parametros)
    public Persona(String nombre, DateTime fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Persona(DateTime fechaMuerte, String doctorDeclaraMuerte) {
        this.fechaMuerte = fechaMuerte;
        this.doctorDeclaraMuerte = doctorDeclaraMuerte;
    }
    
    public Persona(DateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        nombre = "NN";
    }
    
    // metodos que permitan conocer el estado interno (saber cierta informacion de los atributos)
    // getters: obtencion de informacion
    // visibilidad [si tiene tipo retorno] nombreMetodo(parametros)
    public String getNombre() {
        return nombre;
    }
    
    public DateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public int getEdad() {
        return DateTime.now().getYear() - fechaNacimiento.getYear();
    }
    
    // setters: asignacion/actualizacion de informacion
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
