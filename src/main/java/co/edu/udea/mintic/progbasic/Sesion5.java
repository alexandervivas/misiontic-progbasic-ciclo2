/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.mintic.progbasic;

// import para poder hacer uso de la clase Persona
// no es necesario si la clase Persona esta dentro de este mismo paquete
import co.edu.udea.mintic.progbasic.entidades.Animal;
import co.edu.udea.mintic.progbasic.entidades.Chihuahua;
import co.edu.udea.mintic.progbasic.entidades.Gato;
import co.edu.udea.mintic.progbasic.entidades.Perro;
import co.edu.udea.mintic.progbasic.entidades.Persona;

/**
 *
 * @author alexandervivas
 */
public class Sesion5 {
    
    public static void main(String[] args) {
        
        // declaracion de un vector de caracteres
        char[] miVector;
        
        // instanciacion
        miVector = new char[9];
        // tiene 9 elementos
        // el indice llega hasta 8: {0, 1, 2, ..., 8} 
        // for(inicializacion; condicion; incremento)
        // length: longitud del vector
        System.out.println("Primera corrida");
        for(int indice = 0; indice < miVector.length; indice++) {
            System.out.println(miVector[indice]);
        }
        
        // asignacion de valor
        miVector[0] = 'A';
        miVector[1] = 'l';
        miVector[2] = 'e';
        miVector[3] = 'x';
        miVector[4] = 'a';
        miVector[5] = 'n';
        miVector[6] = 'd';
        miVector[7] = 'e';
        miVector[8] = 'r';
        
        // declaracion, instanciacion y asignacion
        char[] miVector2 = { 
            'A', 'l', 'e', 
            'x', 'a', 'n', 
            'd', 'e', 'r' 
        };
        
        Object[] vectorMuchosTipos;// NO!, mejor usar listas
        
        System.out.println("Segunda corrida");
        // for(inicializacion; condicion; incremento)
        // length: longitud del vector
        for(int indice = 0; indice < miVector.length; indice++) {
            System.out.println(miVector[indice]);
        }
        
        // java.lang.ArrayIndexOutOfBoundsException
        // se trato de acceder a una posicion que no esta dentro del vector
        
        
        // Matrices o vectores de 2 dimensiones o vectores 2D
        // declaracion e instanciacion
        int[][] miMatriz = new int[3][3];
        
        miMatriz[0][2] = 10;
        miMatriz[2][0] = 10;
        
        int[][] miMatriz2 = {
            { 0, 0, 10 },
            { 0, 0, 0 },
            { 10, 0, 0 }
        };
        
        
        // Clase: receta
        // Instanca / objeto: 
        
        String miString = "String";
        // String es la clase
        // miString es el objeto o la instancia de la clase String
        
        
        // declara un objeto
        Persona miPersona;
        
        // instancia: new
        miPersona = new Persona("caucasico", "Fulanito", "castaño");
        // miPersona es un objeto/instancia de la clase Persona
        
        // declarar e instanciar
        Persona otraPersona = new Persona("moreno", "Sutanito", "negro");
        
        System.out.println(miPersona.obtenerNombre());
        System.out.println(miPersona.colorCabello);
        System.out.println(otraPersona.obtenerNombre());
        
        //miPersona.nombre = "Petanito";
        miPersona.cambiarNombre("Petanito");
        
        System.out.println(miPersona.obtenerNombre());
        System.out.println(miPersona.colorCabello);
        
        miPersona.cambiarNombre("Petanito");
        
        
        // Animal es el tipo superior o mas general que define lo comun en las clases hijas
        // Perro y Gato extienden su comportamiento para hacerlo especifico
        // puedo tener clases Animal, con comportamiento especifico
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        
        animal1.hacerRuido();
        animal2.hacerRuido();
        
        
        Animal animal3 = new Chihuahua();
        
        animal3.hacerRuido();
    }
    
}
