/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.ArrayList;

/**
 *
 * @author alexandervivas
 */
public class FiguraMain {
    
    public static void main(String[] args) {
        
        // print(new Triangulo(10, 4));
        // print(new Circulo(20));
        // print(new Mano());
        
        // no se puede, no compila, las clases abstractas no se instancian
        //Figura figura = new Figura();
        
        // Liskov, los hijos pueden reemplazar al padre
        
        // declaracion
        ArrayList<Imprimible> miArrayList;
        // instaciacion
        // miArrayList = new ArrayList<Imprimible>();
        miArrayList = new ArrayList<>();
        
        miArrayList.add(new Triangulo(10, 4));
        
        print(miArrayList);
        miArrayList.add(new Circulo(20));
        miArrayList.add(new Mano());
        
        print(miArrayList);
        
        miArrayList.remove(1);
        print(miArrayList);
        
        
    }
    
    public static void print(ArrayList<Imprimible> misImprimibles) {
        System.out.println("------------------------------");
        /*for(int i = 0; i < misImprimibles.size(); i++) {
            misImprimibles.get(i).imprimir();
        }*/
        
        // para cada imprimible dentro de misImprimibles
        /*for(Imprimible imprimible : misImprimibles) {
            imprimible.imprimir();
        }*/
        
        // se crea un stream a partir de la coleccion
        // forEach: para cada elemento del stream haga:
        misImprimibles.stream().forEach(Imprimible::imprimir);
        System.out.println("------------------------------");
    }
    
}
