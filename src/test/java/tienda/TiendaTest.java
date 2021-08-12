/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author alexandervivas
 */
public class TiendaTest {
    
    @Test
    public void getTotalDineroGastadoTest() {
        
        Cliente a = new Cliente();
        Cliente b = new Cliente();
        Cliente c = new Cliente();
        
        a.setDineroGastado(1000);
        b.setDineroGastado(2500);
        c.setDineroGastado(45);
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(a);
        clientes.add(b);
        clientes.add(c);
        
        Tienda tienda = new Tienda(clientes);
        
        Assert.assertEquals("El calculo del total de dinero gastado en la tienda falló", 3545, tienda.getTotalDineroGastado());
        
    }
    
}
