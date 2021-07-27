/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author alexandervivas
 */
public class Auto extends Vehiculo {
    
    String placa;
    String modelo;
    
    // estos objetos son agregados de Auto
    private Llanta llanta1;
    private Llanta llanta2;
    private Llanta llanta3;
    private Llanta llanta4;
    
    // matricula compone a auto
    private Matricula matricula;
    
    public void bloquear() {
        
    }
    
    // relacion de agregacion
    // el objeto se crea por fuera
    public void setLlanta1(Llanta llanta) {
        llanta1 = llanta;
    }
    
    // relacion de composicion
    // el objeto se crea adentro
    public void setMatricula(String id) {
        matricula = new Matricula(id);
    }
    
}
