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
public class BicicletasMain {
    
    public static void main(String[] args) {
        
        Bicicleta miBicicleta = new Bicicleta("329847298347", "Rojo pasion");
        Bicicleta miOtraBicicleta = new Bicicleta("GIANT", "329847298347", "Rojo pasion", 0);
        Bicicleta esqueletoBicicleta = new Bicicleta();
        
        System.out.println(miOtraBicicleta.getVelocidad());
        miOtraBicicleta.pedalear();
        miOtraBicicleta.pedalear();
        miOtraBicicleta.pedalear();
        miOtraBicicleta.pedalear();
        miOtraBicicleta.pedalear();
        miOtraBicicleta.pedalear();
        miOtraBicicleta.pedalear();
        System.out.println(miOtraBicicleta.getVelocidad());
        
        miBicicleta.pedalear();
        
        System.out.println(miOtraBicicleta.getVelocidad());
        
        
        BicicletaPista miBicicletaPista = new BicicletaPista();
        miBicicletaPista.pedalear();
        System.out.println(miBicicletaPista.getVelocidad());
    }
    
}
