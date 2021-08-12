/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author alexandervivas
 */
public class Tienda {
    
    private ArrayList<Cliente> clientes;
    
    public Tienda(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public long getTotalDineroGastado() {
        return clientes.stream().mapToLong((cliente) -> {
            return cliente.getDineroGastado();
        }).sum();
    }
    
}
