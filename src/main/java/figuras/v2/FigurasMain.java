/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.v2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author alexandervivas
 */
public class FigurasMain {
    
    static Scanner consola = new Scanner(System.in);
    static ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
    
    public static void main(String[] args) {
        
        int opcion = 0;

        do {
            imprimirMenu();
            opcion = consola.nextInt();
            limpiarConsola();
            switch (opcion) {
                case 1: {
                    crearRectangulo();
                }
                break;
                case 2: {
                    crearCirculo();
                }
                break;
                case 3: {
                    crearTrianguloRectangulo();
                }
                break;
                case 4: {
                    imprimirFiguras();
                }
                break;
            }
        } while (opcion != 5);
        
    }
    
    public static void imprimirMenu() {
        System.out.println("1. Crear rectangulo");
        System.out.println("2. Crear circulo");
        System.out.println("3. Crear triangulo rectangulo");
        System.out.println("4. Ver figuras creadas");
        System.out.println("5. Salir");
    }

    public static void limpiarConsola() {
        IntStream.range(0, 10).forEach((value) -> {
            System.out.println("");
        });
    }
    
    public static void crearRectangulo() {
        figuras.add(new Rectangulo(new Random().nextInt(10), new Random().nextInt(10)));
    }
    
    public static void crearCirculo() {
        figuras.add(new Circulo(new Random().nextInt(10)));
    }
    
    public static void crearTrianguloRectangulo() {
        figuras.add(new TrianguloRectangulo(new Random().nextInt(10), new Random().nextInt(10)));
    }
    
    public static void imprimirFiguras() {
        figuras.stream().forEach(FiguraGeometrica::imprimir);
    }
    
}
