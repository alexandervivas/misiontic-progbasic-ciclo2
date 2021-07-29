/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author alexandervivas
 */
public class EjercicioArrayList {

    static Scanner consola = new Scanner(System.in);
    static ArrayList<String> nombres = new ArrayList<>();

    public static void main(String[] args) {

        int opcion = 0;

        do {
            imprimirMenu();
            opcion = consola.nextInt();
            limpiarConsola();
            switch (opcion) {
                case 1: {
                    ingresarNombre();
                }
                break;
                case 2: {
                    borrarNombre();
                }
                break;
                case 3: {
                    imprimirNombres();
                }
                break;
            }
        } while (opcion != 4);

    }

    public static void imprimirMenu() {
        System.out.println("1. Ingresar nombre");
        System.out.println("2. Borrar nombre");
        System.out.println("3. Imprimir nombres");
        System.out.println("4. Salir");
    }

    public static void ingresarNombre() {
        System.out.println("Ingrese el nombre: ");
        String nombre = consola.nextLine();
        if (!nombre.isEmpty()) {// isEmpty: está vacío, !isEmpty: no está vacío
            nombres.add(nombre);
        }
    }

    public static void borrarNombre() {
        System.out.println("Ingrese la posicion del nombre [" + nombres.size() + "]: ");
        int posicionNombre = consola.nextInt();
        nombres.remove(posicionNombre);
    }

    public static void imprimirNombres() {
        if (nombres.isEmpty()) {
            System.out.println("Lista vacia");
        }
        nombres.stream().forEach(System.out::println);
    }

    public static void limpiarConsola() {
        IntStream.range(0, 10).forEach((value) -> {
            System.out.println("");
        });
    }

}
